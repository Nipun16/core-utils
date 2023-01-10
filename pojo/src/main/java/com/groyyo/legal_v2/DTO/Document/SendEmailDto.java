package com.groyyo.legal_v2.DTO.Document;

import com.groyyo.core.base.utils.GroyyoUtils;
import com.groyyo.core.pojo.AttachmentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SendEmailDto {

    private String from;
    private String fromName;

    @NotNull(message = "Receiver must not be null")
    private String[] to;

    private String[] cc;

    @NotNull(message = "Subject must not be null")
    private String subject;
    private String content;
    private String templateId;
    private Map<String, Object> emailData;
    private List<AttachmentDto> attachments;

    @NotNull(message = "PropertyId must not be null")
    private String propertyId;

    public String[] getTo() {
        return removeWhiteSpaces(to);
    }

    public String[] getCc() {
        return removeWhiteSpaces(cc);
    }

    private String[] removeWhiteSpaces(String[] arr) {

        if (ArrayUtils.isNotEmpty(arr)) {
            return Arrays.stream(arr).filter(StringUtils::isNotBlank).map(String::trim)
                    .filter(GroyyoUtils::isValidEmail).toArray(String[]::new);
        }

        return new String[] {};
    }
}
