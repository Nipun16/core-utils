package com.groyyo.booking.dto;

import com.groyyo.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetailsDto extends UIKeyValue {

    private List<UIKeyValue> lineItems;
}
