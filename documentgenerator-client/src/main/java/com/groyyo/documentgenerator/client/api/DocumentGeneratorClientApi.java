package com.groyyo.documentgenerator.client.api;

import java.util.List;

import com.groyyo.documentgenerator.dto.PdfStampingDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.groyyo.core.base.common.dto.ResponseDto;
import com.groyyo.core.base.http.GroyyoRestClient;
import com.groyyo.documentgenerator.dto.DocumentGeneratorTemplateRequestDto;
import com.groyyo.documentgenerator.dto.PdfRequestDto;

import lombok.extern.log4j.Log4j2;


/**
 * Rest client for DocumentGenerator APIs
 * @since 13-Dec-2019
 * @author debendra.dhinda
 * */

@Log4j2
public class DocumentGeneratorClientApi {
	
	private GroyyoRestClient restClient;

	public DocumentGeneratorClientApi(GroyyoRestClient groyyoRestClient) {
		this.restClient = groyyoRestClient;
	}

	
	/**
	 * 
	 * FreemarkerTemplateProcessorController process template.
	 * */
	public ResponseDto<String> processTemplate(DocumentGeneratorTemplateRequestDto templateRequestDto) {
		
		log.info("DocumentGeneratorClientApi - processTemplate "+templateRequestDto);

		String path = UriComponentsBuilder.fromPath("/freemarker/process").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = {
				"*/*"
		};
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<String>> returnType = new ParameterizedTypeReference<ResponseDto<String>>() {
		};
		
		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, templateRequestDto, headerParams, accept, returnType);

	}
	
	
	
	/**
	 * 
	 * Api client to generate PDF document from the supplied data.
	 * **/
	public ResponseDto<PdfRequestDto> generatePdf(PdfRequestDto pdfRequestDto) {

		log.info("DocumentGeneratorClientApi - generatePdf " + pdfRequestDto);

		String path = UriComponentsBuilder.fromPath("/generate/pdf").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PdfRequestDto>> returnType = new ParameterizedTypeReference<ResponseDto<PdfRequestDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pdfRequestDto, headerParams, accept,
				returnType);
	}

	public ResponseDto<PdfStampingDto> pdfStamping(PdfStampingDto pdfStampingDto) {

		log.info("DocumentGeneratorClientApi - pdfStamping " + pdfStampingDto);

		String path = UriComponentsBuilder.fromPath("/internal/pdf/stamping").toUriString();

		final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();

		final HttpHeaders headerParams = new HttpHeaders();

		final String[] accepts = { "*/*" };
		final List<MediaType> accept = restClient.selectHeaderAccept(accepts);

		ParameterizedTypeReference<ResponseDto<PdfStampingDto>> returnType = new ParameterizedTypeReference<ResponseDto<PdfStampingDto>>() {
		};

		return restClient.invokeAPI(path, HttpMethod.POST, queryParams, pdfStampingDto, headerParams, accept,
				returnType);
	}

}
