package com.groyyo.transformations.projections;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GroyyoGstView {
    private String gstin;
    private String gstStateId;
    private String gstState;
    private String address;
}
