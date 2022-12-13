package raven.maven.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@Slf4j
public class RavenApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        String[] profiles = applicationContext.getEnvironment().getActiveProfiles();
        log.info("Active profiles: {}", Arrays.toString(profiles));
        if (profiles.length == 0) {
            throw new RuntimeException("без профиля нельзя!");
        }
    }
}
