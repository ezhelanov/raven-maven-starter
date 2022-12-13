package raven.maven.starter.listeners;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import raven.maven.starter.properties.RavenProperties;

@Slf4j
@RequiredArgsConstructor
public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    private final RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getWhere().forEach(
                where -> log.info("Отправляем ворона c именем {} - {}", ravenProperties.getName(), where)
        );
    }

}
