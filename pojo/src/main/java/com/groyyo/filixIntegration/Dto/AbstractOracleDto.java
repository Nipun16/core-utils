package com.groyyo.filixIntegration.Dto;
import lombok.*;
import com.groyyo.filixIntegration.Enum.EventType;
import com.groyyo.filixIntegration.Enum.OracleServiceOwner;
import java.util.HashMap;
import java.util.Map;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AbstractOracleDto {
    private OracleServiceOwner serviceOwner;
    private EventType eventType;
    private Map<String,Object> contextArgs;
}