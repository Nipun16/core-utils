package com.stanzaliving.core.fileutil.util;

import lombok.experimental.UtilityClass;

import static com.stanzaliving.core.fileutil.util.Constants.EXCEL_CONTENT_TYPE;

/**
 * @author nipunaggarwal
 * @package_name com.stanzaliving.core.fileutil.util
 * 
 **/
@UtilityClass
public class ExcelUtil {
    public static boolean hasExcelFormat(String contentType) {
        return EXCEL_CONTENT_TYPE.equals(contentType);
    }
}