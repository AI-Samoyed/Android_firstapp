package com.example.masterdflow2.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

   // private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1", "Matcha Mille Crepe", "Matcha Mille Crepe Cake is made of thin layers of green tea crepes stacked together with fresh whipped cream in-between"));
        addItem(new DummyItem("2","Taiwanese Taro Balls","A dessert originated from a small town Jiu Fen in Taiwan."));
        addItem(new DummyItem("3","Japanese Strawberry Shortcake","A fresh choice of cake for Summer."));
        addItem(new DummyItem("4","Mango Mousse Cake","Delicate layers of sponge cake filled with sweet-tart mango mousse"));
        addItem(new DummyItem("5","Matchamisu","A perfect Japanese Italian fusion dessert"));
        addItem(new DummyItem("6","Dalgona Coffee Cake","\"Delicious butter cream made with fresh blueberries, lemon chiffon cake made with fresh lemon juice and lemon zest, cover with more blueberry crème, white chocolate frosting and topped with fresh berries!"));
        addItem(new DummyItem("7","R & P (raspberry & pistachio)","This berry pistachio cake is made with layers of fresh raspberry crème, Madagascar vanilla chiffon cake, fresh pistachio chantilly crème, house made raspberry jam, masked with more pistachio chantilly + white chocolate icing! It is THE perfect cake to share!\n" +
                "Recipe will be available soon!"));
        // Add some sample items.
      //  for (int i = 1; i <= COUNT; i++) {
       //     addItem(createDummyItem(i));
       // }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

   // private static DummyItem createDummyItem(int position) {
   //     return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position), website_url);
   // }

   // private static String makeDetails(int position) {
    //    StringBuilder builder = new StringBuilder();
    //    builder.append("Details about Item: ").append(position);
    //    for (int i = 0; i < position; i++) {
    //        builder.append("\nMore details information here.");
    //    }
    //    return builder.toString();
   // }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public  String id;
        public  String content;
        public  String name;


        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }
        public DummyItem(String id, String name, String content) {
            this.id = id;
            this.content = content;
            this.name = name;

        }


        @Override
        public String toString() {
            return content;
        }
    }
}