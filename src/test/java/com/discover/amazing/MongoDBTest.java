/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;

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
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月26日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing <br>
 */
@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoDBTest extends MongoDAO {
    @Autowired
    MyMongoTemplate myMongoTemplate;
    
    @Test
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
    
    
    public void saveOne() {
        SubsDto dto = new SubsDto();
        dto.setSubsId(115L);
        dto.set_id(dto.getSubsId());
        dto.setPrefix("86");
        dto.setAccNbr("13901230035");
        dto.setAcctId(1L);
        dto.setCustId(1L);
        myMongoTemplate.save("Subs", dto);
    }
    
    //@Test
    public void removeOne() {
		myMongoTemplate.remove(113, "Subs");
	}

}
