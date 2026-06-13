import javax.swing.JFrame;

public class MainApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Appointment System");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new AppointmentForm());

        frame.pack();

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}