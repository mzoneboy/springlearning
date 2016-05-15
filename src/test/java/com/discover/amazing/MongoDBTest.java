/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discover.amazing.model.SubsDto;
import com.discover.amazing.nosql.mongo.MongoDAO;
import com.discover.amazing.nosql.mongo.MyMongoTemplate;

/** 
 * <Description> <br> 
 *  
 * @author<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月26日 <br>
 * @see com.discover.amazing <br>
 */
@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoDBTest extends MongoDAO {
    @Autowired
    MyMongoTemplate myMongoTemplate;
    
    //@Test
    public void findAll() {
        List<SubsDto> list = myMongoTemplate.findAll(SubsDto.class, "Subs");
        String string = "";
        
    }
    
    //@Test
    public void findOne() {
        List<SubsDto> list = myMongoTemplate.findByCondition("accNbr", "13900002100", SubsDto.class, "Subs");
        SubsDto dto = list.get(0);
        System.out.println(dto.getSubsId()+","+dto.getPrefix()+","+dto.getAccNbr());
    }
    
    //@Test
    public void findOneBySubsId() {
        List<SubsDto> list = myMongoTemplate.findByCondition("subsId", 102, SubsDto.class, "Subs");
        SubsDto dto = list.get(0);
        System.out.println(dto.getSubsId()+","+dto.getPrefix()+","+dto.getAccNbr());
    }
    
    //@Test
    public void saveOne() {
        SubsDto dto = new SubsDto();
        dto.setSubsId(104L);
        dto.set_id(dto.getSubsId());
        dto.setPrefix("86");
        dto.setAccNbr("13901230035");
        dto.setAcctId(2L);
        dto.setCustId(2L);
        myMongoTemplate.save("Subs", dto);
    }
    
    //@Test
    public void saveList() {
    	
    	
    	
		List<SubsDto> subsList = new ArrayList<SubsDto>();
		for (int i = 0; i < 1000000; i++) {
			SubsDto dto = new SubsDto();
	        dto.setSubsId(1L+i);
	        dto.set_id(dto.getSubsId());
	        dto.setPrefix("86");
	        dto.setAccNbr("13901230036");
	        dto.setAcctId(2L);
	        dto.setCustId(2L);
	        subsList.add(dto);
	        //myMongoTemplate.save("Subs", dto);
		}
		
		Date currentTime = new Date();
    	long begin = currentTime.getTime();
    	
		myMongoTemplate.batchInsert("Subs", subsList);
		currentTime = new Date();
		Long addTime = currentTime.getTime()-begin;
		System.out.println("Insert hao shi:"+addTime+"............");
	}
    
    //@Test
    public void removeOne() {
		myMongoTemplate.remove(113, "Subs");
	}

}
