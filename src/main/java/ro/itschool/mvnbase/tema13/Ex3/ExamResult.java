package ro.itschool.mvnbase.tema13.Ex3;

public class ExamResult {
    private final String name;
    private final String status;

    public ExamResult(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
