class Participant {
    private static int counter;
    static {
        counter = 1001;
    }
    private String registrationId, name, branch;
    private long contactNumber;

    Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        registrationId = "D" + counter;
        counter++;
        System.out.println("Hi " +this.name+ "! Your Registration ID is " +this.registrationId+ " and branch is " +this.branch);
    }

    String getRegistrationId() {
        return registrationId;
    }

    int getCounter() {
        return counter;
    }

    String getName() {
        return name;
    }

    long getContactNumber() {
        return contactNumber;
    }

    String getBranch() {
        return branch;
    }

    void setCounter(int counter) {
        Participant.counter = counter;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}

class Tester {
    public static void main(String args[]) {
        Participant p1 = new Participant("Rohit", 1234565789L, "Computer");
        Participant p2 = new Participant("Sayli", 9999999999L, "Mechanical");
        Participant p3 = new Participant("Alice", 9999888877L, "Production");
        Participant p4 = new Participant("Bob", 8888888888L, "Chemical");
    }
}
