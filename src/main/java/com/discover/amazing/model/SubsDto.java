/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月22日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.model <br>
 */

public class SubsDto extends MongoDto implements RowMapper<SubsDto>, Serializable {
    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = 1L;

    /** subsId */
    private Long subsId;

    /** prefix */
    public String prefix;

    /** accNbr */
    private String accNbr;

    /** custId */
    private Long custId;

    /** acctId */
    private Long acctId;

    public Long getSubsId() {
        return subsId;
    }

    public void setSubsId(Long subsId) {
        this.subsId = subsId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getAccNbr() {
        return accNbr;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Description: <br> 
     *  
     * @author yang.xiao(0027008536)<br>
     * @taskId <br>
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException <br>
     */ 
    public SubsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        SubsDto subsDto = new SubsDto();
        subsDto.setSubsId(rs.getLong("SUBS_ID"));
        subsDto.setPrefix(rs.getString("PREFIX"));
        subsDto.setAccNbr(rs.getString("ACC_NBR"));
        subsDto.setCustId(rs.getLong("CUST_ID"));
        subsDto.setAcctId(rs.getLong("ACCT_ID"));
        return subsDto;
    }
} 
