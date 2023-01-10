package com.groyyo.core.projectservice.tiles;

public interface TileStatusDecider {
    TileStatusDto getTileStatus(TileDeciderDto tileDeciderDto);
    PropertyReportsTile getReportTile();
}
