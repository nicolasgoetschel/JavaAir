public class Pilot extends CabinCrewMember {

    private String pilotLicenceNumber;

    public Pilot(String name, String rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String pilotCanFly() {
        return "I’m normally not a praying man, but if you’re up there, please save me Superman.";
    }
}