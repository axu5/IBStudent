/**
 * Date.java
 *
 * Date super class for appointment
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class Date {
  // instance variables
  private int year;
  private int month;
  private int day;

  public Date() {
    this.year = 0;
    this.month = 0;
    this.day = 0;
  }

  public Date(int y, int m, int d) {
    this.year = y;
    this.month = m;
    this.day = d;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public String toString() {
    return year + "/" + month + "/" + day;
  }
}