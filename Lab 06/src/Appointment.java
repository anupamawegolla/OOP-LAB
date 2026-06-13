public class Appointment {

    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;

    // Constructor
    public Appointment(String patientName,
                       String appointmentType,
                       String patientCategory,
                       double baseFee) {

        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }

    // Getter methods
    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }

    // Calculate final fee
    public double calculateFinalFee() {

        double finalFee = baseFee;

        // Appointment type
        if (appointmentType.equals("Specialist")) {
            finalFee = finalFee + 1500;

        } else if (appointmentType.equals("Online")) {
            finalFee = finalFee - 500;
        }

        // Patient category
        if (patientCategory.equals("Child")) {
            finalFee = finalFee - 300;

        } else if (patientCategory.equals("Senior")) {
            finalFee = finalFee - 500;
        }

        return finalFee;
    }

    // Message
    public String getAppointmentMessage() {

        return appointmentType + " appointment selected";

    }
}
