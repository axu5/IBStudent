/**
 * Appointment.java
 *
 * Appointment sub class for appointment
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class Appointment extends Date {
  private String purpose = "";

  public Appointment() {
    super();

    this.purpose = "";
  }

  public Appointment(int y, int m, int d, String purpose) {
    super(y, m, d);

    this.purpose = purpose;
  }

  public String getPurpose() {
    return purpose;
  }

  public String toString() {
    return "Appointment for " + purpose + " on " + super.toString();
  }
}