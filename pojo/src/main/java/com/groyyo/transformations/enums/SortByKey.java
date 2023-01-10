package com.groyyo.transformations.enums;

import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
public enum SortByKey {

	geographicalCityName("c.city_name"),
	zoneName("z.zone_name"),
	groyyoCityName("sc.groyyo_city_name"),
	groyyoClusterName("scl.groyyo_cluster_name"),
	geographicalClusterName("m.micromarket_name"),
	groyyoCluster("groyyo_clusters"),
	groyyoCity("groyyo_cities"),
	geographicalCluster("micromarkets"),
	residences("residencies"),
	lastUpdated("updated_at"),
	status("status");


	private String label;

	SortByKey(String s) {
		this.label = s;
	}
}
