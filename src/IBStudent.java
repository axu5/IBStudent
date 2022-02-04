/**
 * IBStudent.java
 *
 * This is the super class for all IB Students
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class IBStudent {
  private String name = "";
  private int predictedGrade = 0;
  private int[] weeklyMinCAS;
  private int weekN = 0;
  private int nWeeks = 33;

  IBStudent(String name) {
    this.name = name;
    this.weeklyMinCAS = new int[nWeeks];
  }

  public String getName() {
    return this.name;
  }

  public int getPredictedGrade() {
    return this.predictedGrade;
  }

  public void setPredictedGrade(int predictedGrade) {
    this.predictedGrade = predictedGrade;
  }

  public int[] getWeeklyMinCAS() {
    return this.weeklyMinCAS;
  }

  public void setWeeklyMinCAS(int[] weeklyMinCAS) {
    for (int i = 0; i < weeklyMinCAS.length; ++i) {
      this.weeklyMinCAS[weekN + i] = weeklyMinCAS[i];
    }
    weekN += weeklyMinCAS.length;
  }

  public boolean onTrack() {
    int totalMinutes = 0;
    for (int i = 0; i < this.weeklyMinCAS.length; ++i) {
      totalMinutes += this.weeklyMinCAS[i];
    }

    int avgMinutes = totalMinutes / this.weeklyMinCAS.length;

    return this.predictedGrade >= 24 && avgMinutes > 90;
  }

  public String toString() {
    return this.name + " (" + this.predictedGrade + ") on track: " + this.onTrack();
  }
}