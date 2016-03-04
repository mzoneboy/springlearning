/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月24日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.model <br>
 */

public class BankDto implements Serializable {
    /**
     * serialVersionUID <br>
     */
    private static final long serialVersionUID = -1599197538617527352L;
    
    private BigDecimal bankId;
    private BigDecimal parentId;
    private String bankName;
    private String comments;
    private String state;
    private Date stateDate;
    private String directDebitFlag;
    private String bankCode;
    private BigDecimal spId;
    public BigDecimal getBankId() {
        return bankId;
    }
    public void setBankId(BigDecimal bankId) {
        this.bankId = bankId;
    }
    public BigDecimal getParentId() {
        return parentId;
    }
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Date getStateDate() {
        return stateDate;
    }
    public void setStateDate(Date stateDate) {
        this.stateDate = stateDate;
    }
    public String getDirectDebitFlag() {
        return directDebitFlag;
    }
    public void setDirectDebitFlag(String directDebitFlag) {
        this.directDebitFlag = directDebitFlag;
    }
    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    public BigDecimal getSpId() {
        return spId;
    }
    public void setSpId(BigDecimal spId) {
        this.spId = spId;
    }
}
