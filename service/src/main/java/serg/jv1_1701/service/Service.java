package serg.jv1_1701.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

    List<String> columnGenerator1 = new ArrayList<>();
    List<String> columnGenerator2 = new ArrayList<>();
    List<String> columnGenerator3 = new ArrayList<>();
    List<String> columnGenerator4 = new ArrayList<>();

    public String speechGeneration() {
        columnGenerator1.add("Дорогие друзья,");
        columnGenerator1.add("С другой стороны,");
        columnGenerator1.add("Равным образом");
        columnGenerator1.add("Не следует, однако, забывать о том, что");
        columnGenerator1.add("Таким образом,");
        columnGenerator1.add("Повседневная практика показывает, что");
        columnGenerator1.add("Значимость этих проблем настолько очевидна, что");
        columnGenerator1.add("Разнообразный и богатый опыт");
        columnGenerator1.add("Задача организации, в особенности же");
        columnGenerator1.add("Соображения высшего порядка, а также");

        columnGenerator2.add(" реализация намеченных плановых заданий");
        columnGenerator2.add(" рамки и место обучения кадров");
        columnGenerator2.add(" постоянный количественный рост и сфера нашей активности сложившаяся структура организации");
        columnGenerator2.add(" новая модель");
        columnGenerator2.add(" организационной деятельности");
        columnGenerator2.add(" дальнейшее развитие различных форм деятельности");
        columnGenerator2.add(" постоянное информационно-пропагандистское обеспечение нашей деятельности");
        columnGenerator2.add(" укрепления и развития структуры");
        columnGenerator2.add(" консультация с широким активом");
        columnGenerator2.add(" начало повседневной работы по формированию позиции");

        columnGenerator3.add(" играет важную роль в формировании");
        columnGenerator3.add(" требуют от нас анализа");
        columnGenerator3.add(" требуют определения и уточнения");
        columnGenerator3.add(" способствует подготовке и реализации");
        columnGenerator3.add(" обеспечивает широкому кругу специалистов участие в формировании");
        columnGenerator3.add(" позволяет выполнить важнейшие задания по разработке");
        columnGenerator3.add(" в значительной степени обуславливает создание");
        columnGenerator3.add(" позволяет оценить значение");
        columnGenerator3.add(" представляет собой интересный эксперимент проверки");
        columnGenerator3.add(" влечет за собой процесс внедрения и модернизации");

        columnGenerator4.add(" существующих финансовых и административных условий.");
        columnGenerator4.add(" дальнейших направлений развитая.");
        columnGenerator4.add(" системы массового участия.");
        columnGenerator4.add(" позиций, занимаемых участниками в отношении поставленных задач.");
        columnGenerator4.add(" новых предложений.");
        columnGenerator4.add(" направлений прогрессивного развития.");
        columnGenerator4.add(" системы обучения кадров соответствующей насущным потребностям.");
        columnGenerator4.add(" соответствующих условий активизации.");
        columnGenerator4.add(" модели развития.");
        columnGenerator4.add(" форм воздействия.");

        int partSentence1 = new Random().nextInt(columnGenerator1.size());
        int partSentence2 = new Random().nextInt(columnGenerator2.size());
        int partSentence3 = new Random().nextInt(columnGenerator3.size());
        int partSentence4 = new Random().nextInt(columnGenerator4.size());

        String sentence = (columnGenerator1.get(partSentence1) + columnGenerator2.get(partSentence2) + columnGenerator3.get(partSentence3) + columnGenerator4.get(partSentence4));
        return sentence;
    }
}
