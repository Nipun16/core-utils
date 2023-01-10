package com.groyyo.legal_v2.DTO.Document;

import com.groyyo.core.base.utils.GroyyoUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DocumentRequestEmailDTO {

    private String[] propertyCreatedBDEmail;
    
    private String from;

    private String documentType;

    private String documentName;

    private String description;
    
    private String propertyName;

    private String microMarket;

    private String city;

    public String[] getPropertyCreatedBDEmail() {
        return removeWhiteSpaces(propertyCreatedBDEmail);
    }

    private String[] removeWhiteSpaces(String[] arr) {

        if (ArrayUtils.isNotEmpty(arr)) {
            return Arrays.stream(arr).filter(StringUtils::isNotBlank).map(String::trim).filter(GroyyoUtils::isValidEmail).toArray(String[]::new);
        }

        return new String[] {};
    }


}
