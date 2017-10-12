package by.tc.task01.entity;


public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private String freqencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, String freqencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.freqencyRange = freqencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFreqencyRange() {
        return freqencyRange;
    }

    public void setFreqencyRange(String freqencyRange) {
        this.freqencyRange = freqencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
