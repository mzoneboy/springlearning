/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.dao.impl;

import java.util.List;

import com.discover.amazing.dao.ISubsDAO;
import com.discover.amazing.model.SubsDto;


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
public class SubsDAO extends BaseDAO implements ISubsDAO {
    /**
     * Description: <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br>
     * @return <br>
     */ 
    public int createSubs(SubsDto dto) {
        final String sql = String.format("insert into SUBS(SUBS_ID,PREFIX,ACC_NBR,CUST_ID,ACCT_ID) values(%d,'%s','%s',%d,%d)"
            , dto.getSubsId(), dto.getPrefix(), dto.getAccNbr(), dto.getCustId(), dto.getAcctId());  
        getMyJdbcTemplate().update(sql);  
        return 0;
    }
    
    public String updateSubs(Long subsId, String accNbr) {
        final String sql = String.format("update SUBS set ACC_NBR = %s where SUBS_ID = %d", accNbr, subsId);  
        getMyJdbcTemplate().update(sql);
        SubsDto dto = querySubsById(subsId);
        return dto.getAccNbr();
    }
    
    public SubsDto querySubsById(Long subsId) {
        final String sql = String.format("select SUBS_ID,PREFIX,ACC_NBR,CUST_ID,ACCT_ID from SUBS where SUBS_ID = %d", subsId);
        List<SubsDto> list = getMyJdbcTemplate().query(sql, new SubsDto());
        if(list.size()>0) {
            return list.get(0);
        }
        
        return null;
    }
    
    public List<SubsDto> querySubs() {
        final String sql = String.format("select SUBS_ID,PREFIX,ACC_NBR,CUST_ID,ACCT_ID from SUBS");
        List<SubsDto> list = getMyJdbcTemplate().query(sql, new SubsDto());
        return list;
    }

}
