package raven.maven.starter.conditions;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class OnRavenCondition extends AllNestedConditions {

    public OnRavenCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty(value = "raven.enabled", havingValue = "true")
    public static class Enabled {}

    @ConditionalOnProperty(value = "raven.where")
    public static class Where {}
}
