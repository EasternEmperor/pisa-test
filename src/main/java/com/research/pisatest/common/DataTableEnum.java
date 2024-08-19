package com.research.pisatest.common;

import com.research.pisatest.exception.PisaTestException;

/**
 * @author zhongqilong
 * @date 2024/8/20 00:02
 * @description
 */
public enum DataTableEnum {
    AIR_CONDITIONER_DATA("p_pt_air_controller_data", 1),
    TICKETS_SALE_DATA("p_pt_tickets_sale_data", 2);

    private final String tableName;
    private final int index;

    DataTableEnum(String tableName, int index) {
        this.tableName = tableName;
        this.index = index;
    }

    public String getTableName() {
        return tableName;
    }
    public int getIndex() {
        return index;
    }

    public static DataTableEnum getEnumByTableName(String tableName) {
        for (DataTableEnum dataTableEnum : DataTableEnum.values()) {
            if (dataTableEnum.getTableName().equals(tableName)) {
                return dataTableEnum;
            }
        }
        throw new PisaTestException("No such data table: " + tableName);
    }

}
