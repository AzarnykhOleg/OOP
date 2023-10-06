package Lesson_3.data;

import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private String nameOfGroup;
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(String nameOfGroup, Teacher teacher, List<Student> students) {
        this.nameOfGroup = nameOfGroup;
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getNameOfGroup() { return nameOfGroup; }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", nameOfGroup, students, teacher);
    }
    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
