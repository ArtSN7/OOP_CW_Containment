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

}