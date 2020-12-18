package net.chrisrichardson.ftgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FtgoApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(FtgoApplicationMain.class, args);
	}

}
