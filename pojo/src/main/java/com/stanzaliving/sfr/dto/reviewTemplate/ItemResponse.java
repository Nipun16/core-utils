package com.stanzaliving.sfr.dto.reviewTemplate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemResponse {
    private String label;
    private List<String> answers;
    private List<AnswerDetailsDto> answerDetails;
    private String bgColor;
}
