package com.stanzaliving.core.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum Nationality {

	INDIAN("Indian", "India"),
	AFGHAN("Afghan", "Afghanistan"),
	ALBANIAN("Albanian", "Albania"),
	ALGERIAN("Algerian", "Algeria"),
	AMERICAN("American", "American Samoa"),
	ANDORRAN("Andorran", "Andorra"),
	ANGOLAN("Angolan", "Angola"),
	ANGUILLAN("Anguillan", "Anguilla"),
	ARGENTINE("Argentine", "Argentina"),
	ARMENIAN("Armenian", "Armenia"),
	AUSTRALIAN("Australian", "Australia"),
	AUSTRIAN("Austrian", "Austria"),
	AZERBAIJANI("Azerbaijani", "Azerbaijan"),
	BAHAMIAN("Bahamian", "Bahamas"),
	BAHRAINI("Bahraini", "Bahrain"),
	BANGLADESHI("Bangladeshi", "Bangladesh"),
	BARBADIAN("Barbadian", "Barbados"),
	BELARUSIAN("Belarusian", "Belarus"),
	BELGIAN("Belgian", "Belgium"),
	BELIZEAN("Belizean", "Belize"),
	BENINESE("Beninese", "Benin"),
	BERMUDIAN("Bermudian", "Bermuda"),
	BHUTANESE("Bhutanese", "Bhutan"),
	BOLIVIAN("Bolivian", "Bolivia"),
	BOTSWANAN("Botswanan", "Botswana"),
	BRAZILIAN("Brazilian", "Brazil"),
	BRITISH("British", "British Indian Ocean Territory"),
	BRITISH_VIRGIN_ISLANDER("British Virgin Islander", "Virgin Islands, British"),
	BRUNEIAN("Bruneian", "Brunei Darussalam"),
	BULGARIAN("Bulgarian", "Bulgaria"),
	BURKINAN("Burkinan", "Burkina Faso"),
	BURMESE("Burmese", "Burma"),
	BURUNDIAN("Burundian", "Burundi"),
	CAMBODIAN("Cambodian", "Cambodia"),
	CAMEROONIAN("Cameroonian", "Cameroon"),
	CANADIAN("Canadian", "Canada"),
	CAPE_VERDEAN("Cape Verdean", "Cape Verde"),
	CAYMAN_ISLANDER("Cayman Islander", "Cayman Islands"),
	CENTRAL_AFRICAN("Central African", "Central African Republic"),
	CHADIAN("Chadian", "Chad"),
	CHILEAN("Chilean", "Chile"),
	CHINESE("Chinese", "China"),
	CITIZEN_OF_ANTIGUA_AND_BARBUDA("Citizen of Antigua and Barbuda", "Antigua And Barbuda"),
	CITIZEN_OF_BOSNIA_AND_HERZEGOVINA("Citizen of Bosnia and Herzegovina", "Bosnia And Herzegovina"),
	CITIZEN_OF_GUINEA_BISSAU("Citizen of Guinea-Bissau", "Guinea-bissau"),
	CITIZEN_OF_KIRIBATI("Citizen of Kiribati", "Kiribati"),
	CITIZEN_OF_SEYCHELLES("Citizen of Seychelles", "Seychelles"),
	CITIZEN_OF_THE_DOMINICAN_REPUBLIC("Citizen of the Dominican Republic", "Dominican Republic"),
	CITIZEN_OF_VANUATU("Citizen of Vanuatu", "Vanuatu"),
	COLOMBIAN("Colombian", "Colombia"),
	COMORAN("Comoran", "Comoros"),
	CONGOLESE_CONGO("Congolese (Congo)", "Congo"),
	CONGOLESE_DRC("Congolese (DRC)", "Congo, The Democratic Republic Of The"),
	COOK_ISLANDER("Cook Islander", "Cook Islands"),
	COSTA_RICAN("Costa Rican", "Costa Rica"),
	CROATIAN("Croatian", "Croatia"),
	CUBAN("Cuban", "Cuba"),
	CYMRAES("Cymraes", "Cymraes"),
	CYMRO("Cymro", "Cymro"),
	CYPRIOT("Cypriot", "Cyprus"),
	CZECH("Czech", "Czech Republic"),
	DANISH("Danish", "Danish"),
	DJIBOUTIAN("Djiboutian", "Djibouti"),
	DOMINICAN("Dominican", "Dominica"),
	DUTCH("Dutch", "Dutch"),
	EAST_TIMORESE("East Timorese", "East Timor"),
	ECUADOREAN("Ecuadorean", "Ecuador"),
	EGYPTIAN("Egyptian", "Egypt"),
	EMIRATI("Emirati", "United Arab Emirates"),
	ENGLISH("English", "England"),
	EQUATORIAL_GUINEAN("Equatorial Guinean", "Equatorial Guinea"),
	ERITREAN("Eritrean", "Eritrea"),
	ESTONIAN("Estonian", "Estonia"),
	ETHIOPIAN("Ethiopian", "Ethiopia"),
	FAROESE("Faroese", "Faroe Islands"),
	FIJIAN("Fijian", "Fiji"),
	FILIPINO("Filipino", "Filipino"),
	FINNISH("Finnish", "Finland"),
	FRENCH("French", "France"),
	GABONESE("Gabonese", "Gabon"),
	GAMBIAN("Gambian", "Gambia"),
	GEORGIAN("Georgian", "Georgia"),
	GERMAN("German", "Germany"),
	GHANAIAN("Ghanaian", "Ghana"),
	GIBRALTARIAN("Gibraltarian", "Gibraltar"),
	GREEK("Greek", "Greece"),
	GREENLANDIC("Greenlandic", "Greenland"),
	GRENADIAN("Grenadian", "Grenada"),
	GUAMANIAN("Guamanian", "Guam"),
	GUATEMALAN("Guatemalan", "Guatemala"),
	GUINEAN("Papua New Guinean", "Papua New Guinea"),
	GUYANESE("Guyanese", "Guyana"),
	HAITIAN("Haitian", "Haiti"),
	HONDURAN("Honduran", "Honduras"),
	HONG_KONGER("Hong Konger", "Hong Kong"),
	HUNGARIAN("Hungarian", "Hungary"),
	ICELANDIC("Icelandic", "Iceland"),
	INDONESIAN("Indonesian", "Indonesia"),
	IRANIAN("Iranian", "Iran, Islamic Republic Of"),
	IRAQI("Iraqi", "Iraq"),
	IRISH("Irish", "Ireland"),
	ISRAELI("Israeli", "Israel"),
	ITALIAN("Italian", "Italy"),
	IVORIAN("Ivorian", "Cote D'ivoire"),
	JAMAICAN("Jamaican", "Jamaica"),
	JAPANESE("Japanese", "Japan"),
	JORDANIAN("Jordanian", "Jordan"),
	KAZAKH("Kazakh", "Kazakstan"),
	KENYAN("Kenyan", "Kenya"),
	KITTITIAN("Kittitian", "Saint Kitts And Nevis"),
	KOSOVAN("Kosovan", "Kosovo"),
	KUWAITI("Kuwaiti", "Kuwait"),
	KYRGYZ("Kyrgyz", "Kyrgyzstan"),
	LAO("Lao", "Lao People's Democratic Republic"),
	LATVIAN("Latvian", "Latvia"),
	LEBANESE("Lebanese", "Lebanon"),
	LIBERIAN("Liberian", "Liberia"),
	LIBYAN("Libyan", "Libyan Arab Jamahiriya"),
	LIECHTENSTEIN_CITIZEN("Liechtenstein citizen", "Liechtenstein"),
	LITHUANIAN("Lithuanian", "Lithuania"),
	LUXEMBOURGER("Luxembourger", "Luxembourg"),
	MACANESE("Macanese", "Macau"),
	MACEDONIAN("Macedonian", "Macedonia, The Former Yugoslav Republic Of"),
	MALAGASY("Malagasy", "Malagasy"),
	MALAWIAN("Malawian", "Malawi"),
	MALAYSIAN("Malaysian", "Malaysia"),
	MALDIVIAN("Maldivian", "Maldives"),
	MALIAN("Malian", "Mali"),
	MALTESE("Maltese", "Malta"),
	MARSHALLESE("Marshallese", "Marshall Islands"),
	MARTINIQUAIS("Martiniquais", "Martinique"),
	MAURITANIAN("Mauritanian", "Mauritania"),
	MAURITIAN("Mauritian", "Mauritius"),
	MEXICAN("Mexican", "Mexico"),
	MICRONESIAN("Micronesian", "Micronesia, Federated States Of"),
	MOLDOVAN("Moldovan", "Moldova, Republic Of"),
	MONEGASQUE("Monegasque", "Monegasque"),
	MONGOLIAN("Mongolian", "Mongolia"),
	MONTENEGRIN("Montenegrin", "Montenegro"),
	MONTSERRATIAN("Montserratian", "Montserrat"),
	MOROCCAN("Moroccan", "Morocco"),
	MOSOTHO("Mosotho", "Mosotho"),
	MOZAMBICAN("Mozambican", "Mozambique"),
	NAMIBIAN("Namibian", "Namibia"),
	NAURUAN("Nauruan", "Nauru"),
	NEPALESE("Nepalese", "Nepal"),
	NEW_ZEALANDER("New Zealander", "New Zealand"),
	NICARAGUAN("Nicaraguan", "Nicaragua"),
	NIGERIAN("Nigerian", "Nigeria"),
	NIGERIEN("Nigerien", "Nigeria"),
	NIUEAN("Niuean", "Niue"),
	NORTH_KOREAN("North Korean", "Korea, Republic Of"),
	NORTHERN_IRISH("Northern Irish", "Northern Irish"),
	NORWEGIAN("Norwegian", "Norway"),
	OMANI("Omani", "Oman"),
	PAKISTANI("Pakistani", "Pakistan"),
	PALAUAN("Palauan", "Palau"),
	PALESTINIAN("Palestinian", "Palestinian Territory, Occupied"),
	PANAMANIAN("Panamanian", "Panama"),
	PAPUA_NEW_GUINEAN("Papua New Guinean", "Papua New Guinea"),
	PARAGUAYAN("Paraguayan", "Paraguay"),
	PERUVIAN("Peruvian", "Peru"),
	PITCAIRN_ISLANDER("Pitcairn Islander", "Pitcairn"),
	POLISH("Polish", "Poland"),
	PORTUGUESE("Portuguese", "Portugal"),
	PRYDEINIG("Prydeinig", "Prydeinig"),
	PUERTO_RICAN("Puerto Rican", "Puerto Rico"),
	QATARI("Qatari", "Qatar"),
	ROMANIAN("Romanian", "Romania"),
	RUSSIAN("Russian", "Russian Federation"),
	RWANDAN("Rwandan", "Rwanda"),
	SALVADOREAN("Salvadorean", "El Salvador"),
	SAMMARINESE("Sammarinese", "Sammarinese"),
	SAMOAN("Samoan", "Samoa"),
	SAO_TOMEAN("Sao Tomean", "Sao Tome And Principe"),
	SAUDI_ARABIAN("Saudi Arabian", "Saudi Arabia"),
	SCOTTISH("Scottish", "Scotland"),
	SENEGALESE("Senegalese", "Senegal"),
	SERBIAN("Serbian", "Serbia"),
	SIERRA_LEONEAN("Sierra Leonean", "Sierra Leone"),
	SINGAPOREAN("Singaporean", "Singapore"),
	SLOVAK("Slovak", "Slovakia"),
	SLOVENIAN("Slovenian", "Slovenia"),
	SOLOMON_ISLANDER("Solomon Islander", "Solomon Islands"),
	SOMALI("Somali", "Somalia"),
	SOUTH_AFRICAN("South African", "South Africa"),
	SOUTH_KOREAN("South Korean", "Korea, Democratic People's Republic Of"),
	SOUTH_SUDANESE("South Sudanese", "Sudan"),
	SPANISH("Spanish", "Spain"),
	SRI_LANKAN("Sri Lankan", "Sri Lanka"),
	ST_HELENIAN("St Helenian", "Saint Helena"),
	ST_LUCIAN("St Lucian", "Saint Lucia"),
	STATELESS("Stateless", "Stateless"),
	SUDANESE("Sudanese", "Sudan"),
	SURINAMESE("Surinamese", "Suriname"),
	SWAZI("Swazi", "Swaziland"),
	SWEDISH("Swedish", "Sweden"),
	SWISS("Swiss", "Switzerland"),
	SYRIAN("Syrian", "Syrian Arab Republic"),
	TAIWANESE("Taiwanese", "Taiwan, Province Of China"),
	TAJIK("Tajik", "Tajikistan"),
	TANZANIAN("Tanzanian", "Tanzania, United Republic Of"),
	THAI("Thai", "Thailand"),
	TIBETAN("Tibetan","Tibet"),
	TOGOLESE("Togolese", "Togo"),
	TONGAN("Tongan", "Tonga"),
	TRINIDADIAN("Trinidadian", "Trinidad And Tobago"),
	TRISTANIAN("Tristanian", "Tristanian"),
	TUNISIAN("Tunisian", "Tunisia"),
	TURKISH("Turkish", "Turkey"),
	TURKMEN("Turkmen", "Turkmenistan"),
	TURKS_AND_CAICOS_ISLANDER("Turks and Caicos Islander", "Turks And Caicos Islands"),
	TUVALUAN("Tuvaluan", "Tuvalu"),
	UGANDAN("Ugandan", "Uganda"),
	UKRAINIAN("Ukrainian", "Ukraine"),
	URUGUAYAN("Uruguayan", "Uruguay"),
	UZBEK("Uzbek", "Uzbekistan"),
	VATICAN_CITIZEN("Vatican citizen", "Holy See (vatican City State)"),
	VENEZUELAN("Venezuelan", "Venezuela"),
	VIETNAMESE("Vietnamese", "Viet Nam"),
	VINCENTIAN("Vincentian", "Saint Vincent And The Grenadines"),
	WALLISIAN("Wallisian", "Wallis And Futuna"),
	WELSH("Welsh", "Welsh"),
	YEMENI("Yemeni", "Yemen"),
	ZAMBIAN("Zambian", "Zambia"),
	ZIMBABWEAN("Zimbabwean", "Zimbabwe");

	private String name;
	private String countryName;

	private static List<EnumListing<Nationality>> nationalities = new ArrayList<>();
	private static List<EnumListing<Nationality>> nationalityCountryMappings = new ArrayList<>();

	static {
		for (Nationality nationality : Nationality.values()) {
			nationalities.add(EnumListing.of(nationality, nationality.getName()));
		}
		for (Nationality nationality : Nationality.values()) {
			nationalityCountryMappings.add(EnumListing.of(nationality, nationality.getCountryName()));
		}
	}

	public static List<EnumListing<Nationality>> getNationalities() {
		return nationalities;
	}

	public static List<EnumListing<Nationality>> getNationalityCountryMappings() {
		return nationalityCountryMappings;
	}

	public static Nationality getByCountryName(String countryName) {
		for (EnumListing<Nationality> enumListing : nationalityCountryMappings) {
			if (enumListing.getValue().contains(countryName)) {
				return enumListing.getKey();
			}
		}
		return INDIAN;
	}

}
