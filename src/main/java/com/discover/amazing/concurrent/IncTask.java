package com.discover.amazing.concurrent;

import org.python.core.exceptions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.discover.amazing.model.SubsDto;

public class IncTask  implements Runnable {
	
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("hello_____________"+thread.getId()+":"+thread.getName());

		try{
			Query query = new Query(Criteria.where("subsId").is(1));
			Update update = new Update();
			update.inc("custId", 1);
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/META-INF/spring/amazing-mongodb.xml");
			MongoTemplate mongoTemplate = applicationContext.getBean("mongoTemplate", MongoTemplate.class);
			SubsDto subsDto = mongoTemplate.findOne(query, SubsDto.class);
			System.out.println("haha_______");
			mongoTemplate.findAndModify(query, update, SubsDto.class, "Subs");
			//Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
