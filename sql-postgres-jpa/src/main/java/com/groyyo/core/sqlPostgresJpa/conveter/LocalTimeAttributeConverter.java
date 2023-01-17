/**
 * 
 */
package com.groyyo.core.sqlPostgresJpa.conveter;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.groyyo.core.base.utils.DateUtil;

/**
 * 
 * @author nipunaggarwal
 *
 *
 *
 */
@Converter(autoApply = true)
public class LocalTimeAttributeConverter implements AttributeConverter<LocalTime, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalTime attribute) {
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalTime convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalTime(dbData);
	}

}