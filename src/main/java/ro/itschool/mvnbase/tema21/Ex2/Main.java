package ro.itschool.mvnbase.tema21.Ex2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import static ro.itschool.mvnbase.tema21.Ex2.Status.*;
import static ro.itschool.mvnbase.tema21.Ex2.Urgency.*;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new Document("1", "doc1", IN_PROGRESS),
                new Document("2", "doc2", IN_PROGRESS),
                new Document("3", "doc3", IN_PROGRESS),
                new Document("4", "doc4", IN_PROGRESS),
                new Document("5", "doc5", SUCCESS)
        );

        List<String> docsIds = documents.stream()
                .filter(document -> document.getStatus() == SUCCESS)
                .map(document -> document.getDocumentId())
                .collect(Collectors.toList());
        System.out.println("Succeed ids : " + docsIds);

        List<Job> jobs = List.of(
                new Job("1", LOW),
                new Job("2", LOW),
                new Job("3", LOW),
                new Job("4", LOW),
                new Job("5", LOW)
        );

        List<String> jobsIds = jobs.stream()
                .filter(job -> job.getDeadLine().isBefore(LocalDateTime.now().plusDays(1)))
                .map(job -> job.getDocumentId())
                .collect(Collectors.toList());
        System.out.println("Deadline 1 day : " + jobsIds);

        List<String> jobsIds2 = jobs.stream()
                .filter(job -> job.getDeadLine().isBefore(LocalDateTime.now().plusDays(7)))
                .map(job -> job.getDocumentId())
                .collect(Collectors.toList());
        System.out.println("Deadline less than a week : " + jobsIds2);


        jobs.stream()
                .filter(job -> job.getDeadLine().isBefore(LocalDateTime.now().plusDays(1)))
                .forEach(job -> job.setUrgency(HIGH));

        jobs.stream()
                .filter(job -> job.getDeadLine().isBefore(LocalDateTime.now().plusDays(7)))
                .forEach(job -> job.setUrgency(MEDIUM));


        List<LocalDateTime> deadlines = jobs.stream()
                .filter(job -> job.getUrgency() == HIGH)
                .map(job -> job.getDeadLine())
                .collect(Collectors.toList());
        System.out.println("Urgency high : " + deadlines);



        List<String> docsIds2 = documents.stream()
                .filter(document -> document.getStatus() == IN_PROGRESS)
                .map(document -> document.getDocumentId())
                .collect(Collectors.toList());
        List<Long> until = jobs.stream()
                .filter(job -> docsIds2.contains(job.getDocumentId()))
                .map(job -> LocalDateTime.now().until(job.getDeadLine(), ChronoUnit.DAYS))
                .collect(Collectors.toList());
        System.out.println(until);
    }
}
