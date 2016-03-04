/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;

import java.math.BigDecimal;
import java.sql.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.discover.amazing.dao.IBankDAO;
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
 * @CreateDate 2016年2月18日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing <br>
 */
@Transactional
public class SubsOper {
   // @Autowired(required=true)
    private String name;

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    /** 
     *  
     */
    public SubsOper() {
        System.out.println("this is the SubsOper constructor...");
    }
    
    public void changePsw() {
        System.out.println(" begin to change password...");
    }
    
    public void updateSubsAccNbr(SubsDto dto) throws Exception  {
        SubsDAO subsDAO = new SubsDAO();
        subsDAO.createSubs(dto);
        String s = "";
        BankDto bankDto = new BankDto();
        bankDto.setBankId(new BigDecimal("5"));
        bankDto.setBankName("aoc");
        bankDto.setState("A");
        bankDto.setStateDate(new Date(116, 2, 24));
        bankDto.setDirectDebitFlag("Y");
        bankDto.setBankCode("aoc");
        bankDto.setSpId(new BigDecimal("0"));
        IBankDAO bankDAO = new BankDAO();
        bankDAO.createBank(bankDto);
        throw new Exception("roll back...");
    }
    
    public void beforeCreateSub() {
        System.out.println("verify sub info before create sub...");
    }

    public void afterCreateSub() {
        System.out.println("create card after create sub...");
    }
}
