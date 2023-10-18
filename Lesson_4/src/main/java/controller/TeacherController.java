// Создать класс УчительКонтроллер и реализовать возможность создания,
// редактирования конкретного учителя и отображения списка учителей,
// имеющихся в системе

package controller;

import data.Teacher;
import service.TeacherServise;
import view.TeacherView;


import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherServise teacherService = new TeacherServise();
    private final TeacherView teacherView = new TeacherView();

    public void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }



    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }


}
