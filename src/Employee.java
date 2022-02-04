/**
 * Employee.java
 *
 * Employee class for the Employee Management System
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class Employee {
  String name;
  String title;
  int hourlyRate;
  int currentDay = 0;
  int dayMax = 7;
  int[] weeklyHours = new int[dayMax];

  Employee(String name, String title, int hourlyRate) {
    this.name = name;
    this.title = title;
    this.hourlyRate = hourlyRate;
  }

  public void addHours(int hours) {
    this.weeklyHours[this.currentDay++] += hours;
    if (this.currentDay == this.dayMax) {
      this.currentDay = 0;
    }
  }

  public int getAmount() {
    int total = 0;
    for (int i = 0; i < weeklyHours.length; ++i) {
      total += weeklyHours[i];
    }
    return total * hourlyRate;
  }
}