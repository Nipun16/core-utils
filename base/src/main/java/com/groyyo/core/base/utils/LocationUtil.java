/**
 * 
 */
package com.groyyo.core.base.utils;

import org.apache.lucene.util.SloppyMath;

import lombok.experimental.UtilityClass;

/**
 * @author nipunaggarwal
 *
 *
 *
 **/
@UtilityClass
public class LocationUtil {

	public double calculateDistanceMeters(double userLat, double userLng, double venueLat, double venueLng) {
		return Math.abs(SloppyMath.haversinMeters(userLat, userLng, venueLat, venueLng));
	}
}