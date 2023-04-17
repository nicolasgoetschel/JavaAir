public class CabinCrewMember {
    private String name;
    private String rank;

    public CabinCrewMember(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String relayMessage() {
        return "My Brother Is Using Worms.";
    }
}

