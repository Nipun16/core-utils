package com.groyyo.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class GroyyoParseUtilsTest {

	@Test
	public void testGetIntValue() {
		int expected = GroyyoParseUtils.getIntValue("4");
		assertThat(expected).isEqualTo(4);
	}
	
	@Test
	public void testGetIntValueIf() {
		int expected = GroyyoParseUtils.getIntValue("A");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetLongValue() {
		long expected = GroyyoParseUtils.getLongValue("400000000");
		assertThat(expected).isEqualTo(400000000);
	}
	
	@Test
	public void testGetLongValueIf() {
		long expected = GroyyoParseUtils.getLongValue("40000000A");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetFloatValue() {
		float expected = GroyyoParseUtils.getFloatValue("4.00");
		assertThat(expected).isEqualTo(4.0f);
	}
	
	@Test
	public void testGetFloatValueIf() {
		float expected = GroyyoParseUtils.getFloatValue("4.00AS");
		assertThat(expected).isEqualTo(0);
	}

	@Test
	public void testGetDoubleValue() {
		double expected = GroyyoParseUtils.getDoubleValue("4.00");
		assertThat(expected).isEqualTo(4.0d);
	}
	
	@Test
	public void testGetDoubleValueIf() {
		double expected = GroyyoParseUtils.getDoubleValue("4.00DF");
		assertThat(expected).isEqualTo(0);
	}
}
