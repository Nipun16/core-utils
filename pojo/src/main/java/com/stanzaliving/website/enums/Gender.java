package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

	MALE("Male", "male"), FEMALE("Female", "female"), CO_ED("Co_Ed", "co_ed"),ALL("All","all");

	public String genderName;
	public String genderslug;

}
