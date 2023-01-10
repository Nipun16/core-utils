package com.groyyo.core.generic.validation.utility;

import com.groyyo.core.base.enums.Department;
import com.groyyo.core.generic.validation.dtos.ApprovalMetaInfo;
import com.groyyo.core.generic.validation.dtos.ErrorInfo;
import com.groyyo.core.generic.validation.dtos.UiParentField;

import java.util.Objects;

public class CommonUtilities {
    public static boolean canApprove(Department queryDepartment, Integer currentUserApprovedLevel, ApprovalMetaInfo vendorApprovalMetaInfo){
        if(Objects.isNull(vendorApprovalMetaInfo))
            return false;

        int index = 0;
        for(Department dept: vendorApprovalMetaInfo.getApprovalDepts()){
            if(dept.equals(queryDepartment))
                if(currentUserApprovedLevel == (index+1))
                    return true;

            index+=1;
        }

        return false;
    }
    public static void setErrorMsg(String msg, ErrorInfo errorInfo, UiParentField uiField){
        uiField.setErrorMsg(msg);
        uiField.setErrorOccurred(true);
        errorInfo.setErrorOccurred(true);
        errorInfo.setNumErrors(errorInfo.getNumErrors()+1);
    }
}
