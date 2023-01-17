/**
 * 
 */
package com.groyyo.core.sqljpa.conveter;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.groyyo.core.base.utils.DateUtil;

/**
 * @author nipunaggarwal
 *
 * @date 17-May-2019
 */
@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalDate(dbData);
	}

}