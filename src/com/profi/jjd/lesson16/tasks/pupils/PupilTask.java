package com.profi.jjd.lesson16.tasks.pupils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {

        // Используя Stream API:

        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>
        Pupil pupil1=new Pupil("Алена", Pupil.Gender.FEMALE, LocalDate.of(2000,10,1));
        Pupil pupil2=new Pupil("Евгений", Pupil.Gender.MALE, LocalDate.of(1998,1,2));
        Pupil pupil3=new Pupil("Ольга", Pupil.Gender.FEMALE, LocalDate.of(2000,6,4));
        Pupil pupil4=new Pupil("Игорь", Pupil.Gender.MALE, LocalDate.of(2000,5,12));
        Pupil pupil5=new Pupil("Олег", Pupil.Gender.MALE, LocalDate.of(2001,2,10));
        Pupil pupil6=new Pupil("Мария", Pupil.Gender.FEMALE, LocalDate.of(2002,7,21));
        Pupil pupil7=new Pupil("Алена", Pupil.Gender.FEMALE, LocalDate.of(2005,9,30));


        Pupil[] allPupils= {pupil1,pupil2,pupil3,pupil4,pupil5,pupil6,pupil7};

        Map<Pupil.Gender, List<Pupil>> genderArrayListMap = Arrays.stream(allPupils).collect(Collectors.groupingBy(Pupil::getGender));
        List<Pupil> femaleList = genderArrayListMap.get(Pupil.Gender.FEMALE);
        List<Pupil> maleList = genderArrayListMap.get(Pupil.Gender.MALE);
        for (Pupil el: femaleList ) {
            System.out.println(el.getName());
        }
        System.out.println();
        for (Pupil el: maleList ) {
            System.out.println(el.getName());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 2. Найти средний возраст учеников

        // 3. Найти самого младшего ученика

        // 4. Найти самого взрослого ученика

        // 5. Собрать учеников в группы по году рождения

        // 6. Оставить учеников с неповторяющимися именами,
        // имена и дату рождения оставшихся вывести в консоль.
        // Например, [Иван, Александра, Ольга, Иван, Ольга] -> [Иван, Александра, Ольга]

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет

        // 9. Собрать в список всех учеников с именем=someName

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола
    }
}