package com.groyyo.core.mail.client.api;

import com.groyyo.core.base.common.dto.ResponseDto;
import com.groyyo.core.base.http.GroyyoRestClient;
import com.groyyo.core.mail.OutboundMailInfoDto;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
public class MailClient {

    private GroyyoRestClient restClient;

    public MailClient(GroyyoRestClient groyyoRestClient) {
        this.restClient = groyyoRestClient;
    }


    public ResponseDto<String> sendEmail(OutboundMailInfoDto outboundMailInfoDto) {

        try {
            // create path and map variables
            final Map<String, Object> uriVariables = new HashMap<>();

            String path = UriComponentsBuilder.fromPath("/internal/api/v1/send-mail").buildAndExpand().toUriString();

            final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

            final HttpHeaders headerParams = new HttpHeaders();

            final String[] accepts = {
                    "*/*"
            };
            final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

            ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
            };

            return restClient.invokeAPI(path, HttpMethod.POST, queryParams, outboundMailInfoDto, headerParams, accept, returnType);

        } catch (Exception e) {

            log.error("Exception Occurred while sending email : ", e);
            return ResponseDto.failure(StringUtils.EMPTY);
        }
    }
}
