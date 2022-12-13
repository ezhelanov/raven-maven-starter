package raven.maven.starter.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Getter
@Setter
@ConfigurationProperties(prefix = "raven")
public class RavenProperties {

    private List<String> where;

    private boolean enabled;

    private String name = "DefaultRaven";

}
