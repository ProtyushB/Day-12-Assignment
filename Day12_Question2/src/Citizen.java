public class Citizen {
    private String name;
    private String aadharNumber;
    private String mobileNumber;

    public String getName() {
        return name;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Citizen(String name, String aadharNumber, String mobileNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
    }
}
