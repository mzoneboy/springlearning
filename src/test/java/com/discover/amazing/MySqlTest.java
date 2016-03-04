/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.discover.amazing.dao.IBankDAO;
import com.discover.amazing.dao.ISubsDAO;
import com.discover.amazing.dao.impl.BankDAO;
import com.discover.amazing.dao.impl.SubsDAO;
import com.discover.amazing.model.BankDto;
import com.discover.amazing.model.SubsDto;


/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月22日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing <br>
 */
@ContextConfiguration({"/META-INF/spring/amazing-base.xml","/META-INF/spring/amazing-jdbc.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class MySqlTest {
    @Autowired
    Subs subs;
    /**
     * Description: <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br>
     * @param args <br>
     */
    //@Test
    public void testInsert() {
        SubsDto dto = new SubsDto();
        dto.setSubsId(125L);
        dto.setPrefix("86");
        dto.setAccNbr("1390090009");
        dto.setCustId(1L);
        dto.setAcctId(1L);
        SubsDAO dao = new SubsDAO();
        dao.createSubs(dto);
    }
    
    //@Test
    public void testUpdate() {
        
        SubsDAO dao = new SubsDAO();
        String accNbr = dao.updateSubs(105L, "1392000006");
  
        Assert.assertEquals("1392000006", accNbr);
        
    }
    
    //@Test
    public void testQuery_01() {
        SubsDAO dao = new SubsDAO();
        dao.querySubsById(105L);
    }
    
    //@Test
    public void testQuery_02() {
        ISubsDAO dao = new SubsDAO();
        List<SubsDto> list = dao.querySubs();
        Assert.assertEquals(15, list.size());
    }
    
    //@Test
    public void testTransaction() {
        SubsDto dto = new SubsDto();
        dto.setSubsId(129L);
        dto.setPrefix("86");
        dto.setAccNbr("1360050009");
        dto.setCustId(1L);
        dto.setAcctId(1L);
        subs.updateAccNbr(dto);
    }
    
    //@Test 
    public void testCreateBank() {
        BankDto dto = new BankDto();
        dto.setBankId(new BigDecimal("5"));
        dto.setBankName("boc");
        dto.setState("A");
        dto.setStateDate(new Date(116, 2, 24));
        dto.setDirectDebitFlag("Y");
        dto.setBankCode("boc");
        dto.setSpId(new BigDecimal("0"));
        IBankDAO dao = new BankDAO();
        dao.createBank(dto);
    }
}
