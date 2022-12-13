package raven.maven.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class RavenEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            environment.setActiveProfiles(isOnlyDogs() ? "dogs" : "whitelist");
        }
    }

    private boolean isOnlyDogs() {
        return true;
    }

}
