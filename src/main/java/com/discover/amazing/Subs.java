/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing;

import org.springframework.beans.factory.annotation.Autowired;

import com.discover.amazing.model.SubsDto;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月18日 <br>
 * @since V7.3<br>
 * @see cn.javass.spring.chapter2 <br>
 */

public class Subs {
    @Autowired
    private SubsOper subsOper;
    
    /*public SubsOper getSubsOper() {
        return subsOper;
    }*/

    public void changePsw() {
        subsOper.changePsw();
    }
    
    public void updateAccNbr(SubsDto dto){
        try {
            subsOper.updateSubsAccNbr(dto);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createSub() {
        System.out.println("begin to create sub...");
    }
}
