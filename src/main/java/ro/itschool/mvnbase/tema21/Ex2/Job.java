package ro.itschool.mvnbase.tema21.Ex2;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Job {
    private String documentId;
    private LocalDateTime startDate;
    private LocalDateTime deadLine;
    private Urgency urgency;
    private Random random = new Random();

    public Job(String documentId, Urgency urgency) {
        this.documentId = documentId;
        this.startDate = LocalDateTime.now();
        this.deadLine = LocalDateTime.now().plusDays(random.nextInt(9) + 1);
        this.urgency = urgency;
    }

    public String getDocumentId() {
        return documentId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(documentId, job.documentId) &&
                Objects.equals(startDate, job.startDate) &&
                Objects.equals(deadLine, job.deadLine) &&
                urgency == job.urgency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, startDate, deadLine, urgency);
    }

    @Override
    public String toString() {
        return "Job{" +
                "documentId='" + documentId + '\'' +
                ", startDate=" + startDate +
                ", deadLine=" + deadLine +
                ", urgency=" + urgency +
                '}';
    }
}
