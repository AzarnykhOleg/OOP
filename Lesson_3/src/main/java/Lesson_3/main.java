package Lesson_3;

import Lesson_3.data.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        // Создаём экземпляры класса "Студент"
        Student student1 = new Student("Васильев", "Даниль", "Арсенович", LocalDate.of(2000, 1, 1), 1111L);
        Student student2 = new Student("Иванова", "Милана", "Глебовна", LocalDate.of(2001, 2, 2), 2222L);
        Student student3 = new Student("Селиванова", "Мария", "Данииловна", LocalDate.of(2002, 3, 3), 3333L);
        Student student4 = new Student("Сычев", "Леон", "Романович", LocalDate.of(2000, 4, 4), 4444L);
        Student student5 = new Student("Павлова", "Мария", "Фёдоровна", LocalDate.of(2001, 5, 5), 5555L);
        Student student6 = new Student("Чистякова", "Софья", "Денисовна", LocalDate.of(2002, 6, 6), 6666L);
        Student student7 = new Student("Кудрявцева", "Аделина", "Давидовна", LocalDate.of(2000, 7, 7), 7777L);
        Student student8 = new Student("Игнатьева", "Маргарита", "Никитична", LocalDate.of(2001, 8, 8), 8888L);
        Student student9 = new Student("Лукьянова", "Мирослава", "Тиграновна", LocalDate.of(2002, 9, 9), 9999L);
        Student student10 = new Student("Румянцева", "Дарья", "Давидовна", LocalDate.of(2000, 10, 10), 11111L);
        Student student11 = new Student("Нестеров", "Никита", "Дмитриевич", LocalDate.of(2001, 11, 11), 22222L);
        Student student12 = new Student("Третьякова", "Елена", "Артуровна", LocalDate.of(2002, 12, 12), 33333L);
        Student student13 = new Student("Пугачев", "Никита", "Львович", LocalDate.of(2000, 1, 13), 44444L);
        Student student14 = new Student("Рогова", "Анастасия", "Святославовна", LocalDate.of(2001, 2, 14), 55555L);
        Student student15 = new Student("Аникин", "Георгий", "Романович", LocalDate.of(2002, 3, 15), 66666L);
        Student student16 = new Student("Литвинов", "Максим", "Маркович", LocalDate.of(2000, 4, 16), 77777L);
        // Создаём экземпляры класса "Учитель"
        Teacher teacher1 = new Teacher("Васильев", "Даниль", "Арсенович", LocalDate.of(1971, 1, 1));
        Teacher teacher2 = new Teacher("Селиванова", "Мария", "Данииловна", LocalDate.of(1972, 2, 2));
        Teacher teacher3 = new Teacher("Лукьянова", "Мирослава", "Тиграновна", LocalDate.of(1973, 3, 3));
        Teacher teacher4 = new Teacher("Рогова", "Анастасия", "Святославовна", LocalDate.of(1974, 4, 4));
        Teacher teacher5 = new Teacher("Иванова", "Анастасия", "Святославовна", LocalDate.of(1975, 5, 5));
        Teacher teacher6 = new Teacher("Иванова", "Наталья", "Святославовна", LocalDate.of(1976, 6, 6));
        // Создаём экземпляры класса "Группы студентов" и наполняем группы студентами
        List<Student> studentList1 = new ArrayList<> (List.of(new Student[]{student1, student2}));
        StudentGroup studentGroup1 = new StudentGroup("Группа № 1", teacher1, studentList1);
        List<Student> studentList2 = new ArrayList<> (List.of(new Student[]{student3, student4}));
        StudentGroup studentGroup2 = new StudentGroup("Группа № 2", teacher2, studentList2);
        List<Student> studentList3 = new ArrayList<> (List.of(new Student[]{student5, student6, student7}));
        StudentGroup studentGroup3 = new StudentGroup("Группа № 3", teacher3, studentList3);
        List<Student> studentList4 = new ArrayList<> (List.of(new Student[]{student8, student9, student10, student11}));
        StudentGroup studentGroup4 = new StudentGroup("Группа № 4", teacher4, studentList4);
        List<Student> studentList5 = new ArrayList<> (List.of(new Student[]{student12, student13}));
        StudentGroup studentGroup5 = new StudentGroup("Группа № 5", teacher5, studentList5);
        List<Student> studentList6 = new ArrayList<> (List.of(new Student[]{student14, student15, student16}));
        StudentGroup studentGroup6 = new StudentGroup("Группа № 6", teacher6, studentList6);
        // Проверка работы методов
        System.out.println("---------------------------------Вывод группы студентов № 3---------------------------------");
        System.out.println(studentGroup3);
        System.out.println("---------------------------------Вывод студентов из группы студентов № 3---------------------------------");
        System.out.println(studentGroup3.getStudents());
        System.out.println("---------------------------------Вывод Фамилии студента № 6---------------------------------");
        System.out.println(student6.getFirstName());
        // Создаём экземпляры класса "Поток" и наполняем их группами студентов
        List<StudentGroup> studentGroupsList1 = new ArrayList<>(List.of(new StudentGroup[]{studentGroup1, studentGroup2}));
        Stream stream1 = new Stream(1, studentGroupsList1);
        List<StudentGroup> studentGroupsList2 = new ArrayList<>(List.of(new StudentGroup[]{studentGroup3, studentGroup4, studentGroup5}));
        Stream stream2 = new Stream(2, studentGroupsList2);
        List<StudentGroup> studentGroupsList3 = new ArrayList<>(List.of(new StudentGroup[]{studentGroup6}));
        Stream stream3 = new Stream(3, studentGroupsList3);
        // Проверяем работу метода
        System.out.println("--------------------------------- Вывод потока № 1---------------------------------");
        System.out.println(stream1);
        System.out.println("---------------------------------Узнаём количество групп в потоке № 1---------------------------------");
        System.out.println(stream1.getnumberOfGroups());
        System.out.println("--------------------------------- Добавление в поток № 1 новой группы (№ 3) и вывод на экран---------------------------------");
        stream1.addGroup(studentGroup3);
        System.out.println(stream1);
        System.out.println("--------------------------------- Удаление из потока № 1 группы № 2 и вывод на экран---------------------------------");
        stream1.delGroup(studentGroup2);
        System.out.println(stream1);
        System.out.println("---------------------------------Вывод потока № 2---------------------------------");
        System.out.println(stream2);
        System.out.println("---------------------------------Узнаём количество групп в потоке № 2---------------------------------");
        System.out.println(stream2.getnumberOfGroups());
        System.out.println("---------------------------------Вывод 1-й группы потока № 1---------------------------------");
        System.out.println(stream1.getGroups().get(0));
        System.out.println("---------------------------------Вывод 2-й группы потока № 2---------------------------------");
        System.out.println(stream2.getGroups().get(1));
        System.out.println("---------------------------------Вывод имени 3-го студента 2-й группы потока № 2---------------------------------");
        System.out.println(stream2.getGroups().get(1).getStudents().get(2).getSecondName());
        System.out.println("---------------------------------Сравнение потоков по количеству входящих групп---------------------------------");
        System.out.println(stream3.compareTo(stream1));
        System.out.println(stream1.compareTo(stream3));
        System.out.println(stream1.compareTo(stream2));
        System.out.println("---------------------------------Сравнение потоков по количеству входящих групп---------------------------------");
        System.out.println(StreamComparator.compare(stream3, stream1));
        System.out.println(StreamComparator.compare(stream1, stream3));
        System.out.println(StreamComparator.compare(stream1, stream2));
        System.out.println("---------------------------------Список потоков---------------------------------");
        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream2);
        streamList.add(stream3);
        streamList.add(stream1);
        System.out.println(streamList);
        System.out.println("---------------------------------Cортировка списка потоков---------------------------------");
//        System.out.println(StreamService.sortingStreams(stream1));
    }
}
