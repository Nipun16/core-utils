package com.groyyo.core.generic.validation.fieldProcessors;

import com.groyyo.core.generic.validation.dtos.ErrorInfo;
import com.groyyo.core.generic.validation.dtos.TemplateField;
import com.groyyo.core.generic.validation.dtos.UiBaseField;
import com.groyyo.core.generic.validation.dtos.UiField;

import java.util.Map;

public interface AdaptableProcessor {
    Object updateApprovalData(UiBaseField uiBaseField, TemplateField field, Object val, Map<String, Object> additionalData, ErrorInfo errorInfo);
    Object convertToUIValue(TemplateField field, UiField uiField, Object val, Map<String, Object> additionalData);
    void convertFromUIValue(TemplateField field, UiField uiField, Object val, Map<String, Object> additionalData, ErrorInfo errorInfo);
}
