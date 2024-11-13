public class Lesson {

    private String lessonTitle;
    private int durationMinutes;
    private boolean requiresLab;

    public Lesson(String lessonTitle, int durationMinutes, boolean requiresLab) {
        this.lessonTitle = lessonTitle;
        this.durationMinutes = durationMinutes;
        this.requiresLab = requiresLab;
    }

    public void outputLessonDetails() {
        System.out.println("Lesson Title: " + lessonTitle);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Requires Lab: " + (requiresLab ? "Yes" : "No"));
    }

    
}