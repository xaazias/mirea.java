package ru.mirea.java.task20;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class getTopWords {

    private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue());

        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> a : list) {
            temp.put(a.getKey(), a.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> words = new HashMap<>();

        try {
            File file = new File("War&Peace.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();

                String[] lineWords = line.split("[^a-zA-Z0-9А-Яа-я?']+");
                lineWords = Arrays.stream(lineWords).filter(s -> !s.isEmpty()).toArray(String[]::new);

                if (lineWords.length > 0) {
                    for (String i : lineWords)
                        words.merge(i, 1, Integer::sum);
                }
            }
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения!");
            e.printStackTrace();
        }

        words = sortByValue(words);

        for (int i = 0; i < 10; i++) {
            int reiterations = (int) words.values().toArray()[words.size() - (i + 1)];
            String word = (String) words.keySet().toArray()[words.size() - (i + 1)];
            System.out.println((i + 1) + ". «" + word + "» повторяется в тексте: " + reiterations + " раз.");
        }
    }
}
