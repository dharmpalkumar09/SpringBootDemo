package com.dharmpal.student.demo;

import com.dharmpal.student.demo.appcontext.NavinBharatAppContext;
import com.dharmpal.student.demo.enums.LogLevels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class NavinBharatApplication {

	private static Logger logger = LoggerFactory.getLogger(NavinBharatApplication.class);
	public static void main(String[] args) {

		try {

			ConfigurableApplicationContext app = SpringApplication.run(NavinBharatApplication.class,args);
			logger.info(LogLevels.INFO.getStatus() +"*******************NavinBharat Application Started**********");
			NavinBharatAppContext.setApplicationContext(app);

//			SpringApplication.run(NavinBharatApplication.class, args);

		}catch (Exception e){
			logger.info(LogLevels.ERROR.getStatus(),"*******************NavinBharat Application Starting failed**********");
			e.printStackTrace();
		}
	}

}
