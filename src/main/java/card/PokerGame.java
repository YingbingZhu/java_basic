package card;

import java.util.*;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> hm = new HashMap<>();

    // prepare cards
    static {
        //          ♠️ ♦️ ♣️ ♥️
        //         "3", "4", "5", "6", "7", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"p", "s", "f", "h"};
        String[] number = {"3", "4", "5", "6", "7", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" g");
        list.add(" q");

        // assign value to cards
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("q", 16);
        hm.put("g", 17);
    }
    public PokerGame() {

        //shuffle
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        // allocate cards
        for (int i = 0; i < list.size(); i++) {
            String card = list.get(i);
            if (i <= 2){
                lord.add(card);
                continue;
            }

            if (i % 3 == 0){
                p1.add(card);
            } else if (i % 3 == 1) {
                p2.add(card);
            } else {
                p3.add(card);
            }
        }
        order(lord);
        order(p1);
        order(p2);
        order(p3);

        lookPoker("lord", lord);
        lookPoker("p1", p1);
        lookPoker("p2", p2);
        lookPoker("p3", p3);




    }


    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            // insertion + bisect
            @Override
            public int compare(String o1, String o2) {
                // o2: already sorted
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);

                int i = value1 - value2;

                return i == 0? color1.compareTo(color2) : i;
            }
        });

    }

    public int getValue(String s) {
        String number = s.substring(1);
        if (hm.containsKey(number)) {
            return hm.get(number);
        }
        return Integer.parseInt(number);
    }
}
