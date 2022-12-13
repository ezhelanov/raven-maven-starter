package raven.maven.starter.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import raven.maven.starter.conditions.ConditionalOnProduction;
import raven.maven.starter.conditions.ConditionalOnRaven;
import raven.maven.starter.listeners.RavenListener;
import raven.maven.starter.properties.RavenProperties;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class RavenConfig {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnRaven
    public RavenListener ravenListener(RavenProperties ravenProperties) {
        return new RavenListener(ravenProperties);
    }

}
