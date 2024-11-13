public class Course{

    private String courseTitle;
    private int maxStudents;
    private int numberOfLessons;
    private  Lesson[] courseLessons; // List of lessons (up to 50)
    private Assessment courseAssessment; // Single assessment

    public Course(String courseTitle, int maxStudents) {

        this.courseTitle = courseTitle;
        this.maxStudents = maxStudents;
        this.numberOfLessons = 0;
        this.courseLessons = new Lesson[50];

    }

    public void addLesson(Lesson lesson) {

        if (numberOfLessons < 50) {

            this.courseLessons[numberOfLessons] = lesson;
            this.numberOfLessons += 1;

        } else {

            System.out.println("Cannot add more lessons. Maximum limit reached.");

        }
    }


    public void addAssessment(Assessment assessment) {

        this.courseAssessment = assessment;

    }


    public void outputCourseDetails() {
        int i;
        
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Max Students: " + maxStudents);
        System.out.println("Number of Lessons: " + numberOfLessons);
        
        System.out.println("List of lessons:\n");

        for (i = 0; i < numberOfLessons; i++) {

            this.courseLessons[i].outputLessonDetails();
            System.out.println("\n");

        }

        if (courseAssessment == null) {

            System.out.println("No assessment added to this course.");

        } else {

            System.out.println("Assessment:");
            this.courseAssessment.outputAssessmentDetails();
            
        }
    }
}