package com.groyyo.core.far.dto.response;

import com.groyyo.core.far.enums.CartStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 * 
 */
@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HotoCart {
    HotoSection accepted;
    HotoSection rejected;
    CartStatus cartStatus;
    Long totalAssets;
    Long scannedAssets;

}
