public class Student {

    private Integer stdId;
    private String name;
    private String dateOfBirth;
    private Integer totalmarks;

    public Student() {
        super();
    }

    public Student(Integer stdId, String name, String dateOfBirth, Integer totalmarks) {
        super();
        this.stdId = stdId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.totalmarks = totalmarks;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(Integer totalmarks) {
        this.totalmarks = totalmarks;
    }

    @Override
    public String toString() {
        return "Student [stdId=" + stdId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", totalmarks="
                + totalmarks + "]";
    }

}
