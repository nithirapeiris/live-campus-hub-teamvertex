package com.campushub.campus_hub.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class UtilityData {
    public static String generateBus_id(){
        return "bus_" + UUID.randomUUID();
    }
    public static String generateCheckIn_id(){
        return "checkin_" + UUID.randomUUID();
    }
    public static String generateClub_id(){
        return "club_" + UUID.randomUUID();
    }
    public static String generateDepartment_id(){
        return "department_" + UUID.randomUUID();
    }
    public static String generateEvent_id(){
        return "event_" + UUID.randomUUID();
    }
    public static String generateLocation_id(){
        return "location_" + UUID.randomUUID();
    }
    public static String generateReward_id() {
        return "reward_" + UUID.randomUUID();
    }
    public static LocalDate generateTodayDate(){
        return LocalDate.now();
    }
    public static LocalDateTime generateTodayDateTime(){
        return LocalDateTime.now();
    }
}
