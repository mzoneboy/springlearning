/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.nosql.mongo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月29日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.nosql.mongo <br>
 */

public class MongoDAO {
    private MongoTemplate mongoTemplate;
    public MongoTemplate getMyMongoTemplate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/META-INF/spring/amazing-mongodb.xml");
        mongoTemplate = applicationContext.getBean("mongoTemplate", MongoTemplate.class);
        return mongoTemplate;
    }
    
        
}
