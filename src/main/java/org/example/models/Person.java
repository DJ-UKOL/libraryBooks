package org.example.models;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

public class Person {

    private int person_id;
    @Pattern(regexp = "[A-ZА-Я]\\D+ [A-ZА-Я]\\D+ [A-ZА-Я]\\D+",
            message = "Введите ФИО в правильном формате (Иванов Иван Иванович)")
    private String person_name;

    @Range(min = 1900, max = 2022, message = "Год рождения должен быть в формате (2022)")
    private int person_year_birthday;

    public Person() {}

    public Person(int person_id, String person_name, int person_year_birthday) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_year_birthday = person_year_birthday;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getPerson_year_birthday() {
        return person_year_birthday;
    }

    public void setPerson_year_birthday(int person_year_birthday) {
        this.person_year_birthday = person_year_birthday;
    }
}
