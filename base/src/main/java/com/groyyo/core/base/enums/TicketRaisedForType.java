package com.groyyo.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
public enum TicketRaisedForType {

  RESIDENT("Resident"),

  SELF("Self"),

  SL_STAFF("Sl Staff");

  String name;
}
