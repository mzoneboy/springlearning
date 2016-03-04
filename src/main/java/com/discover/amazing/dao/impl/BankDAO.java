/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.dao.impl;

import com.discover.amazing.dao.IBankDAO;
import com.discover.amazing.model.BankDto;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月24日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.dao.impl <br>
 */

public class BankDAO extends BaseDAO implements IBankDAO {

    /**
     * Description: <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br>
     * @param dto
     * @return <br>
     */ 
    public int createBank(BankDto dto) {
        final String sql = String.format("insert into BANK (BANK_ID,PARENT_ID,BANK_NAME"
            + ",COMMENTS,STATE,STATE_DATE,DIRECT_DEBIT_FLAG,BANK_CODE,SP_ID) values (%s,%s,'%s',%s,'%s','%s','%s','%s',%s)"
            , dto.getBankId(), dto.getParentId(), dto.getBankName(), dto.getComments(), dto.getState(), dto.getStateDate()
            , dto.getDirectDebitFlag(), dto.getBankCode(), dto.getSpId());
        getMyJdbcTemplate().update(sql);
        return 0;
    }

}
