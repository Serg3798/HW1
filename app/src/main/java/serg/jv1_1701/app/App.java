package serg.jv1_1701.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import serg.jv1_1701.hw1_util.Util;
import serg.jv1_1701.service.Service;

public class App {

    static int maxNumberOfSentencesInSpeech = 50;
    static String regex = "Дорогие друзья";
    static String replace = "Уважаемые господа";

    public static void main(String[] args) {
        List<String> speech = new ArrayList<>();
        List<String> remadeSpeech = new ArrayList<>();
        int numberOfSentencesInSpeech = new Random().nextInt(maxNumberOfSentencesInSpeech);
        System.out.println("Количество предложение в Вашей речи будет равно: " + numberOfSentencesInSpeech);
        System.out.println("                ВАША РЕЧЬ:");
        for (int i = 0; i < numberOfSentencesInSpeech; i++) {
            speech.add(new Service().speechGeneration());
        }
        for (int i = 0; i < numberOfSentencesInSpeech; i++) {
            System.out.println(speech.get(i));
        }
        System.out.println("               Ваша речь пуста: " + new Util().сheckingForWordsInSpeech(speech));
        remadeSpeech = (new Util().remadeSpeech(speech, regex, replace));
        System.out.println("               ВАША РЕЧЬ С УЧЕТОМ ИЗМЕНЕНИЙ:");
        for (int i = 0; i < remadeSpeech.size(); i++) {
            System.out.println(remadeSpeech.get(i));
        }
    }
}
