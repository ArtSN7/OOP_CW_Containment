public class Assessment {

    private String assessmentTitle;
    private int maxMarks;

    public Assessment(String assessmentTitle, int maxMarks) {
        this.assessmentTitle = assessmentTitle;
        this.maxMarks = maxMarks;
    }

    public void outputAssessmentDetails() {
        System.out.println("Assessment Title: " + assessmentTitle);
        System.out.println("Max Marks: " + maxMarks);
    }

    // CHAT GPT GETTERS AND SETTERS

    // Getter for assessmentTitle
    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    // Setter for assessmentTitle
    public void setAssessmentTitle(String assessmentTitle) {
        this.assessmentTitle = assessmentTitle;
    }

    // Getter for maxMarks
    public int getMaxMarks() {
        return maxMarks;
    }

    // Setter for maxMarks
    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

}