public enum PlaneType {
    BOEING747("Boeing 747", 200, 500),
    CESSNA172("Cessna 172", 150, 800),
    AIRBUSA320("AirBus A320", 5, 1000);

    private final String name;
    private final int capacity;
    private final int totalWeight;

    PlaneType(String name, int capacity, int totalWeight) {
        this.name = name;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}