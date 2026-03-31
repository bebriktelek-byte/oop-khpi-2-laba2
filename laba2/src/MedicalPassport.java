public class MedicalPassport {
    private final String passportId;

    public MedicalPassport(String petId) {
        this.passportId = "MED-" + petId;
    }

    @Override
    public String toString() {
        return "MedPassport[" + passportId + "]";
    }
}