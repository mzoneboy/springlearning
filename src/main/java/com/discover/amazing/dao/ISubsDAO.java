/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.discover.amazing.dao;

import java.util.List;

import com.discover.amazing.model.SubsDto;

/** 
 * <Description> <br> 
 *  
 * @author yang.xiao(0027008536)<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016年2月19日 <br>
 * @since V7.3<br>
 * @see com.discover.amazing.dao <br>
 */

public interface ISubsDAO {
    int createSubs(SubsDto dto);
    
    SubsDto querySubsById(Long subsId);
    
    String updateSubs(Long subsId, String accNbr);
    
    List<SubsDto> querySubs();
}
