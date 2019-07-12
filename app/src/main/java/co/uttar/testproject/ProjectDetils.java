package co.uttar.testproject;

public class ProjectDetils {
    private String projTitle;
    private String projPartner1;
    private  String projPartner2;
    private String grade;
    private String year;
    private  String time;

    public ProjectDetils(String projTitle, String projPartner1, String projPartner2, String grade, String year , String time) {
        this.projTitle = projTitle;
        this.projPartner1 = projPartner1;
        this.projPartner2 = projPartner2;
        this.grade = grade;
        this.year = year;
        this.time = time;
    }

    public String getProjTitle() {
        return projTitle;
    }

    public void setProjTitle(String projTitle) {
        this.projTitle = projTitle;
    }

    public String getProjPartner1() {
        return projPartner1;
    }

    public void setProjPartner1(String projPartner1) {
        this.projPartner1 = projPartner1;
    }

    public String getProjPartner2() {
        return projPartner2;
    }

    public void setProjPartner2(String projPartner2) {
        this.projPartner2 = projPartner2;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
