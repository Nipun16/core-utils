package com.groyyo.core.far.dto.response;

import com.groyyo.core.far.enums.CartStatus;
import com.groyyo.core.far.enums.CartType;
import com.groyyo.core.far.enums.TransferScanStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * @author nipunaggarwal
 * 
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddAssetToCartDto {
    private String cartUuid;
    private CartType cartType;
    private BigDecimal numberOfItemCodes;
    private CartStatus cartStatus;
    private TransferScanStatus message;
}
