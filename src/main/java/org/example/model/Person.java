package org.example.model;

import jakarta.validation.constraints.Pattern;

public class Person {
    @Pattern(regexp = "[A-Z|А-Я]\\w+, [A-Z|А-Я]\\w+, [A-Z|А-Я]\\w+",
            message = "Введите ФИО в правильном формате (Иванов Иван Иванович)")
    private String name;
    @Pattern(regexp = "[1,2][0|9][0-9][0-9]", message = "Год рождения должен быть в правильном формате (2022")
    private int yearBirthday;

    public Person(String name, int yearBirthday) {
        this.name = name;
        this.yearBirthday = yearBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }
}
