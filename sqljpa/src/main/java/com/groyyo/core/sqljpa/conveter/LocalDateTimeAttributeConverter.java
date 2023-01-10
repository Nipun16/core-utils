/**
 * 
 */
package com.groyyo.core.sqljpa.conveter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

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
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDateTime attribute) {
		if(Objects.isNull(attribute))
			return null;
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalDateTime(dbData);
	}

}