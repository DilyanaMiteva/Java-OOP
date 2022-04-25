package TrafficLights_04;

public enum TrafficState {
    RED, YELLOW, GREEN;

    public static TrafficState update(TrafficState state) {
        switch (state) {
            case RED:    return GREEN;
            case YELLOW: return RED;
            case GREEN:  return YELLOW;
        }
        return null;
    }
}
