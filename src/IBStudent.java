/**
 * IBStudent.java
 *
 * This is the super class for all IB Students
 *
 * @author axu5 <github.com/axu5>
 * @version 04.02.2022
 */
public class IBStudent {
  String[] courses;
  String name;
  String id;

  IBStudent(String name) {
    this.name = name;
  }

  IBStudent(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public String[] getCourses() {
    return courses;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public void setCourses(String[] courses) {
    // do not do following code:
    // this.courses = courses;
    // instead, use the following code:
    String[] newCourses = new String[courses.length];
    for (int i = 0; i < courses.length; ++i)
      newCourses[i] = courses[i];
    this.courses = newCourses;
    // this is because you do not want to copy the memory address but instead want
    // to make a completely new array and not accidentally mutate the original
    // array.
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void addCourse(String course) {
    String[] newCourses = new String[this.courses.length + 1];
    for (int i = 0; i < newCourses.length; ++i) {
      if (i < this.courses.length) {
        newCourses[i] = this.courses[i];
      } else {
        newCourses[i] = course;
      }
    }

    this.courses = newCourses;
  }

  public void removeCourse(String course) {
    String[] newCourses = new String[this.courses.length - 1];
    for (int i = 0; i < newCourses.length; ++i) {
      if (this.courses[i] != course) {
        newCourses[i] = this.courses[i];
      }
    }

    this.courses = newCourses;
  }

  public void removeCourse(int index) {
    String[] newCourses = new String[this.courses.length - 1];
    for (int i = 0; i < newCourses.length; ++i) {
      if (i != index) {
        newCourses[i] = this.courses[i];
      }
    }

    this.courses = newCourses;
  }
}