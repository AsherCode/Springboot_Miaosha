
package com.itmayiedu.app;

import com.itmayiedu.config.DBConfig1;
import com.itmayiedu.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.itmayiedu")
@EnableAutoConfiguration
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
