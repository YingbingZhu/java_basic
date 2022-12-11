package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("a", "aa");
        m.put("b", "ab");
        m.put("c", "abc");
        String output = m.put("a", "abc"); // previous value

        m.remove("c");
        boolean ab = m.containsValue("ab");
        System.out.println(ab);

        System.out.println(output);
        System.out.println(m);

        Set<String> keys = m.keySet();
        for (String key : keys) {
            String s = m.get(key);
            System.out.println(s);
        }

        Set<Map.Entry<String, String>> entries = m.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });
    }

}
