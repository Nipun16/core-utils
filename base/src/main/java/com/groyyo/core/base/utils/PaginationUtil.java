package com.groyyo.core.base.utils;

import lombok.experimental.UtilityClass;

/**
 * @author nipunaggarwal 
 *
 * 
 *
 *       migrated the code from sqljpa module to here to make these func independent
 */

@UtilityClass
public class PaginationUtil {

	public int correctLimit(int limit) {
		limit = Math.max(1, limit);
		limit = Math.min(1000, limit);
		return limit;
	}

	public int correctPageNo(int pageNo) {
		pageNo = Math.max(1, pageNo);
		return pageNo;
	}

}