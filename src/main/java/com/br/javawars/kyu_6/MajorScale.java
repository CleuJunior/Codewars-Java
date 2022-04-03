package com.br.javawars.kyu_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MajorScale {


    private static final Map<String, String> scalesMapping = new HashMap<>();

    public static void setMapValues() {
        scalesMapping.put("ABCDEFG", "C");
        scalesMapping.put("A#CC#D#FF#G#", "C#");
        scalesMapping.put("ABC#DEF#G", "D");
        scalesMapping.put("A#CDD#FGG#", "D#");
        scalesMapping.put("ABC#D#EF#G#", "E");
        scalesMapping.put("AA#CDEFG", "F");
        scalesMapping.put("A#BC#D#FF#G#", "F#");
        scalesMapping.put("ABCDEF#G", "G");
        scalesMapping.put("A#CC#D#FGG#", "G#");
        scalesMapping.put("ABC#DEF#G#", "A");
        scalesMapping.put("AA#CDD#FG", "A#");
        scalesMapping.put("A#BC#D#EF#G#", "B");
    }

    private static boolean checkNomScalePattern(String melody) {
        return (melody.equals("") ||
                melody.charAt(0) == '#' ||
                melody.contains("##") ||
                melody.contains("E#") ||
                melody.contains("B#"));

    }
    public static String majorScale(String melody) {
        if (checkNomScalePattern(melody)) return "No major scale";
        setMapValues();


        Set<String> settingNotes = new HashSet<>();
        String notes;

        int i = 0;
        while (i < melody.length()) {
            if (i < melody.length() - 1) {
                if (melody.charAt(i + 1) == '#') {
                    settingNotes.add(melody.substring(i, i + 2));
                    i++;
                    i++;
                    continue;
                }
            }
            settingNotes.add(melody.substring(i, i + 1));
            i++;
        }

        notes = settingNotes
                .stream()
                .sorted()
                .collect(Collectors.joining());

        String key = scalesMapping.get(notes);

        return (key != null) ? (key + " major scale") : "No major scale";
    }
}
