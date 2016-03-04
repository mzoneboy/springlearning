/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.nosql.mongo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bson.BSONObject;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

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
public class MyMongoTemplate extends MongoDAO {
    public <T> List<T> findAll(final Class<T> clazz, String collectionName) {
        List<T> list = getMyMongoTemplate().find(new Query(), clazz, collectionName);
        return list;
    }
    
    /**
     * 
     * Criteria是标准查询的接口，可以引用静态的Criteria.where的把多个条件组合在一起 <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br>
     * @param key
     * @param value
     * @param clazz
     * @param collectionName
     * @return <br>
     */
    public <T> List<T> findByCondition(String key, Object value, final Class<T> clazz, String collectionName) {
        Query query = new Query(Criteria.where(key).is(value));
        List<T> list = getMyMongoTemplate().find(query, clazz, collectionName);
        return list;
    }
    
    public void save(String collectionName, Object objectToSave) {
        getMyMongoTemplate().save(objectToSave, collectionName);
    }
    
    public void remove(Object value, String collectionName) {
    	Query query = new Query(Criteria.where("_id").is(value));
		getMyMongoTemplate().remove(query, collectionName);
	}
}
