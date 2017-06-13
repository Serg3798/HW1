package serg.jv1_1701.hw1_util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public List<String> remadeSpeech(List<String> speech, String regex, String replace) {
        List<String> remadeSpeech = new ArrayList<>();

        for (int i = 0; i < speech.size(); i++) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(speech.get(i));
            remadeSpeech.add(m.replaceAll(replace));
        }
        return remadeSpeech;
    }

    public boolean сheckingForWordsInSpeech(List<String> speech) {
        return speech == null;
    }
}
