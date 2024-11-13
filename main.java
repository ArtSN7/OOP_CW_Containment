public class main {
    public static void main(String[] args) {
        Course myCourse = new Course("OOP in CS", 10);
        
        myCourse.addAssessment(new Assessment("OOP prep", 10));

        myCourse.addLesson(new Lesson("OOP 1", 90, false));
        myCourse.addLesson(new Lesson("OOP 2", 120, false));
        myCourse.addLesson(new Lesson("OOP Final", 60, true));

        myCourse.outputCourseDetails();
    }
}