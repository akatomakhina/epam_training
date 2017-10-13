package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {

        String type = criteria.getApplianceType();

        Set<E> ovenKey = criteria.getCriteria().keySet();

        if (type.contains("Laptop")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.Laptop.BATTERY_CAPACITY) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Laptop.OS) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Laptop.MEMORY_ROM) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Laptop.SYSTEM_MEMORY) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Laptop.CPU) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Laptop.DISPLAY_INCHS) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
            }
        }

        if (type.contains("Oven")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.Oven.POWER_CONSUMPTION) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Oven.WEIGHT) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Oven.CAPACITY) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Oven.DEPTH) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Oven.HEIGHT) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Oven.WIDTH) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
            }
        }

        if (type.contains("Refrigerator")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Refrigerator.WEIGHT) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY) && !(CriteriaValid.isDoubleValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Refrigerator.HEIGHT) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Refrigerator.WIDTH) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
            }
        }

        if (type.contains("Speakers")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.Speakers.POWER_CONSUMPTION) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Speakers.FREQUENCY_RANGE) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.Speakers.CORD_LENGTH) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
            }
        }

        if (type.contains("TabletPC")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.TabletPC.BATTERY_CAPACITY) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.TabletPC.DISPLAY_INCHES) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.TabletPC.MEMORY_ROM) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.TabletPC.COLOR) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
            }
        }

        if (type.contains("VacuumCleaner")) {
            for (Object keys : ovenKey) {
                if (keys.equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.VacuumCleaner.FILTER_TYPE) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.VacuumCleaner.BAG_TYPE) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.VacuumCleaner.WAND_TYPE) && !(CriteriaValid.isStringValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
                if (keys.equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH) && !(CriteriaValid.isIntValid(ovenKey))) {
                    return false;
                }
            }
        }
        return true;
    }
}