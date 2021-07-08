package in.practice.ajinkya.profile;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.student")
@Profile("dev")
public class ProfileAnnotation {
	private Integer sid;
	private String sname;
	private String sloc;
}
