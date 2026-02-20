public class TrafficLight {
    private LightColor color;

    public TrafficLight(LightColor startColor) {
        this.color = startColor;
    }

    public LightColor getColor() {
        return color;
    }

    public void next() {
        switch (color) {
            case RED -> color = LightColor.GREEN;
            case GREEN -> color = LightColor.YELLOW;
            case YELLOW -> color = LightColor.RED;
        }
    }
}