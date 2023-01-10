package com.groyyo.core.document.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.groyyo.core.base.common.dto.ResponseDto;
import com.groyyo.core.base.http.GroyyoRestClient;
import com.groyyo.core.document.dto.UserDocumentDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DocumentClientApi {

	private GroyyoRestClient restClient;

	public DocumentClientApi(GroyyoRestClient groyyoRestClient) {
		this.restClient = groyyoRestClient;
	}

	public ResponseDto<UserDocumentDto> getUserDocument(String uuid) {
		Object postBody = null;

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("uuid", uuid);

		String path = UriComponentsBuilder.fromPath("/internal/get/{uuid}").buildAndExpand(uriVariables).toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
		
		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);
		
		ParameterizedTypeReference<ResponseDto<UserDocumentDto>> returnType = new ParameterizedTypeReference<ResponseDto<UserDocumentDto>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, accept, returnType);
	}
}