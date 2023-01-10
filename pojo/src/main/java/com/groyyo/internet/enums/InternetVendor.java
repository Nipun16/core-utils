package com.groyyo.internet.enums;

import com.groyyo.core.enums.helpers.EnumValue;

import lombok.Getter;

@Getter
public enum InternetVendor implements EnumValue {

	SPECTRA("SPECTRA"),
	JIO("Jio"),
	ION("Ion"),
	AIRTEL("Airtel"),
	OTHER("Other");

	private String vendor;

	public String getVendor() {
		return vendor;
	}

	private InternetVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String getValue() {
		return vendor;
	}

}