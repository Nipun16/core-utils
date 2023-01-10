package com.groyyo.core.base.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GroyyoUtilsTest {

	@Test
	public void testGenerateOtp() {

		int otp = GroyyoUtils.generateOTP();

		assertTrue(otp >= 100000);
		assertTrue(otp < 1000000);
	}

	@Test
	public void testGenerateOtpOfLength4() {

		int otp = GroyyoUtils.generateOTPOfLength(4);

		System.out.println("4 digit otp: " + otp);

		assertTrue(otp >= 1000);
		assertTrue(otp < 10000);
	}

	@Test
	public void testGenerateOtpOfLength6() {

		int otp = GroyyoUtils.generateOTPOfLength(6);

		System.out.println("6 digit otp: " + otp);

		assertTrue(otp >= 100000);
		assertTrue(otp < 1000000);
	}

	@Test
	public void testGenerateDefaultOtpOfLength4() {

		int otp = GroyyoUtils.generateDefaultOtpOfLength(4);

		System.out.println("4 digit default otp: " + otp);

		assertTrue(otp == 4567);
	}

	@Test
	public void testGenerateDefaultOtpOfLength6() {

		int otp = GroyyoUtils.generateDefaultOtpOfLength(6);

		System.out.println("6 digit default otp: " + otp);

		assertTrue(otp == 456789);
	}
}