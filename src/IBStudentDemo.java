/**
 * IBStudentDemo.java
 *
 * description
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class IBStudentDemo {
  public static void main(String[] _args) {
    var axu = new IBStudent("Aleksanteri Aho");

    System.out.println(axu);

    int[] weeklyCAS = { 100, 5000, 0, 0, 200, 400, 30, 100 };
    axu.setWeeklyMinCAS(weeklyCAS);
    System.out.println(axu);

    int[] weeklyCAS2 = { 100, 0, 0, 0, 200, 400, 30, 100 };
    axu.setWeeklyMinCAS(weeklyCAS2);
    System.out.println(axu);

    axu.setPredictedGrade(25);
    System.out.println(axu);
  }
}