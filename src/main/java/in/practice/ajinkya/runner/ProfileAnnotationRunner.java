package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.profile.ProfileAnnotation;

@Component
public class ProfileAnnotationRunner implements CommandLineRunner {

	@Autowired
	private ProfileAnnotation profileAno;
	public void run(String... args) throws Exception {
		System.out.println(profileAno);
		System.out.println("We are inside profile runner...");
	

	}

}
