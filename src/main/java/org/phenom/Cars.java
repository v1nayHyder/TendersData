package org.phenom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cars implements Comparable<Cars> {
    private String type;
    private String engineType;

    public Cars(String type, String engineType) {
        this.type = type;
        this.engineType = engineType;
    }

    public String getType() {
        return type;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public int compareTo(Cars otherCar) {
        return this.engineType .compareTo(otherCar.getEngineType());
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Engine: " + engineType;
    }
}
