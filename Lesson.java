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
        System.out.println("Requires Lab: " + (requiresLab ? "YES" : "NO"));
    }

    // CHAT GPT GETTERS AND SETTERS

    // Getter for lessonTitle
    public String getLessonTitle() {
        return lessonTitle;
    }

    // Setter for lessonTitle
    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    // Getter for durationMinutes
    public int getDurationMinutes() {
        return durationMinutes;
    }

    // Setter for durationMinutes
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    // Getter for requiresLab
    public boolean isRequiresLab() {
        return requiresLab;
    }

    // Setter for requiresLab
    public void setRequiresLab(boolean requiresLab) {
        this.requiresLab = requiresLab;
    }

    
}