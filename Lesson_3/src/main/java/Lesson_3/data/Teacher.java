package Lesson_3.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return String.format("\nУчитель: %d, %s %s %s, %s г.р.",
                teacherId, super.getFirstName(), super.getSecondName(), super.getPatronymic(), super.getDateOfBirth());
    }
}
