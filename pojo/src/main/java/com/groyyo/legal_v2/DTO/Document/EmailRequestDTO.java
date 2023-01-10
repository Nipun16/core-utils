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
import java.util.Map;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequestDTO {

    private String[] to;
    
    private String from;

    private String templateId;

    private String subject;

    private Map<String,Object> emailData;

}
