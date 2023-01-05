package card2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    // prepare cards
    static {
        //          ♠️ ♦️ ♣️ ♥️
        //         "3", "4", "5", "6", "7", "9", "10", "J", "Q", "K", "A", "2"
        String[] color = {"peach", "square", "flower", "heart"};
        String[] number = {"3", "4", "5", "6", "7", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;
        for (String c : color) {
            for (String n : number) {
                hm.put(serialNumber, c+n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "king");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "queen");
        list.add(serialNumber);

        System.out.println(hm);

    }
    public PokerGame() {

        //shuffle
        Collections.shuffle(list);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> p1 = new TreeSet<>();
        TreeSet<Integer> p2 = new TreeSet<>();
        TreeSet<Integer> p3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer serialnumber = list.get(i);
            if (i <= 2){
                lord.add(serialnumber);
                continue;
            }

            if (i % 3 == 0){
                p1.add(serialnumber);
            } else if (i % 3 == 1) {
                p2.add(serialnumber);
            } else {
                p3.add(serialnumber);
            }
        }
        lookPoker("lord", lord);


    }


    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        for (int serialNumber : ts) {
            String card = hm.get(serialNumber);
            System.out.print(card + ": ");
        }
        System.out.println();

    }
}
