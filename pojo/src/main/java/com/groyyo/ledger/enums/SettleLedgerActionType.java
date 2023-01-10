package com.groyyo.ledger.enums;

import com.groyyo.commercialcard.enums.CriteriaCondition;
import com.groyyo.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@AllArgsConstructor
@Getter
public enum SettleLedgerActionType {
    REFUND("Refund" ),
    CARRY_FORWARD("Carryforward" ),
    RAISE_TO_NODAL("Raise to Nodal" ),
    INITIATE_EXHAUSION("Initiate Exhaustion" );

    private String name;
    public static Set<Object> ENUM_MAP = new HashSet<>();
    static {
        for (SettleLedgerActionType actionType: SettleLedgerActionType.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put("label" , actionType.name);
            map.put("value",actionType);
            ENUM_MAP.add(map);
        }
    }
}

