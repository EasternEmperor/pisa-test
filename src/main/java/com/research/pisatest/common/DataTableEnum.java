package com.research.pisatest.common;

import com.research.pisatest.exception.PisaTestException;

/**
 * @author zhongqilong
 * @date 2024/8/20 00:02
 * @description 每个问题对应的数据表
 */
public enum DataTableEnum {
    UNKNOWN_TABLE("unknown_table", -1),
    AIR_CONDITIONER_DATA("p_pt_air_controller_data", 1),
    TICKETS_SALE_DATA("p_pt_tickets_sale_data", 2),
    CAT_FEED_DATA("p_pt_cat_feed_data", 3),
    PERFUME_MAKER_DATA("p_pt_perfume_maker_data", 4),
    PROJECTION_CONTROLLER_DATA("p_pt_projection_controller_data", 5),
    WATER_DISPENSER_DATA("p_pt_water_dispenser_data", 6),
    VIDEO_PLAYER_DATA("p_pt_video_player_data", 7),
    BIG_AIR_DATA("p_pt_big_air_controller_data", 8),
    FLOWER_GARDEN_DATA("p_pt_flower_garden_data", 9),
    FLASHLIGHT_DATA("p_pt_flashlight_data", 10),
    RICE_COOKER_DATA("p_pt_rice_cooker_data", 11),
    COFFEE_MACHINE_DATA("p_pt_coffee_machine_data", 12),
    FRUIT_TEA_DATA("p_pt_fruit_tea_data", 13),
    CAMERA_CONTROLLER_DATA("p_pt_camera_controller_data", 14),
    SEATS_SCHEDULE_DATA("p_pt_seats_schedule_data", 15),
    SUNLIGHT_CONTROLLER_DATA("p_pt_sunlight_controller_data", 16),
    SAUNA_CONTROLLER_DATA("p_pt_sauna_controller_data", 17),
    ;

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
        return UNKNOWN_TABLE;
    }

}
