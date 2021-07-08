package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.student.StudentData;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentData stud;
	
	public void run(String... args) throws Exception {
		System.out.println(stud);
		System.out.println("We are inside student runner...");
	}
}
