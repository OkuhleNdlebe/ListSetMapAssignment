package za.ac.cput.okuhle;

import java.util.Objects;

public class Software {
    private String name;
    private String type;
    private int deviceID;

    public Software(String name, int deviceID) {
        this.name = name;
        this.deviceID = deviceID;
    }

    public Software(String name) {

    }

    public Software(int deviceID) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Software software = (Software) o;
        return deviceID == software.deviceID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", deviceID=" + deviceID +
                '}';
    }
}

