package com.groyyo.core.fileutil.util;

import lombok.experimental.UtilityClass;

import static com.groyyo.core.fileutil.util.Constants.*;

@UtilityClass
public class CVSUtil {

    public static boolean hasCSVFormat(String contentType) {

        if (!CSV_CONTENT_TYPE.equals(contentType)) {
            return false;
        }
        return true;
    }

}
