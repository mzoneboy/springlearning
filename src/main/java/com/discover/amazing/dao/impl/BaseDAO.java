/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.ContextConfiguration;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月19日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.dao.impl <br>
 */
//@ContextConfiguration({"/META-INF/spring/amazing-base.xml"})
public class BaseDAO extends JdbcDaoSupport{
    private JdbcTemplate jdbcTemplate;
    
    @Override
    protected void initTemplateConfig() {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/amazing-jdbc.xml");
        this.jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);*/
    }
    
    public JdbcTemplate getMyJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/amazing-jdbc.xml");
        this.jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
 
        return this.jdbcTemplate;
    }
}
