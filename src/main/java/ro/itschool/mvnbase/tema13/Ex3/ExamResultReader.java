package ro.itschool.mvnbase.tema13.Ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ExamResultReader {
    private final List<ExamResult> exams;

    public ExamResultReader(String path) throws IOException {
        this.exams = fetchExams(path);
    }

    public List<ExamResult> getExams() {
        return exams;
    }

    private List<ExamResult> fetchExams(String path) throws IOException {
        List<ExamResult> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = breader.readLine()) != null) {
            String[] exam = line.split(Pattern.quote("|"));
            result.add(new ExamResult(exam[0], exam[1]));
        }

        return result;
    }
}
