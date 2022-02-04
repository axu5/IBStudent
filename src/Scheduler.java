/**
 * Scheduler.java
 *
 * Scheduler class for appointments
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class Scheduler {
  public Scheduler() {
    Date app1 = new Appointment(2013, 12, 22, "Christmas Party - 7:00 PM");
    System.out.println(app1);
    System.out.println();

    Date app2 = new Appointment(2014, 1, 27, "Dentist - 9:00 AM");
    System.out.println(app2);
    System.out.println();

    Date app3 = new Appointment(2014, 3, 27, "Job Interview - 8:30 AM");
    System.out.println(app3);
    System.out.println();
  }

  public static void main(String[] _args) {
    var app = new Scheduler();
  }
}