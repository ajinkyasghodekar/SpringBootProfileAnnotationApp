package in.practice.ajinkya.student;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.student")
public class StudentData {
	private Integer sid;
	private Integer smark;
	private String sname;
	private String sloc;
}
