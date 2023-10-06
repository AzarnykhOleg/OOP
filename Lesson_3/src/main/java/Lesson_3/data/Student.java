package Lesson_3.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
            return String.format("\nСтудент: %d, %s %s %s, %s г.р.",
                    studentId, super.getFirstName(), super.getSecondName(), super.getPatronymic(), super.getDateOfBirth());
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
