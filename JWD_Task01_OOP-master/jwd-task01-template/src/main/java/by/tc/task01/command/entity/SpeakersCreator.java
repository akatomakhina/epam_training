package by.tc.task01.command.entity;

import by.tc.task01.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

public class SpeakersCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt((String)applianceLine.get("POWER_CAPACITY")));
        speakers.setNumberOfSpeakers(Integer.parseInt((String)applianceLine.get("NUMBER_OF_SPEAKERS")));
        speakers.setFreqencyRange((String)applianceLine.get("FREQENCY_RANGE"));
        speakers.setCordLength(Integer.parseInt((String)applianceLine.get("CORD_LENGHT")));
        return speakers;
    }
}
