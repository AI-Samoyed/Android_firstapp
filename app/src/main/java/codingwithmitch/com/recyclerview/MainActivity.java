package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String>  mDescription = new ArrayList<>();
    private ArrayList<String>  mDetailedDescription = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mDetailedDescription.add("1 ¾ cup whole milk.\n" +
                "3 Tbsp sugar\n" +
                "3 large eggs (50 g each w/o shell)\n" +
                "1 ½ Tbsp melted unsalted butter (25 g)\n" +
                "1 cup cake flour (120-136 g\n" +
                "2 Tbsp matcha (green tea powder) (12 g)\n" +
                "½ tsp baking powder\n" +
                "neutral-flavored oil (vegetable, canola, etc) (for cooking crepes)\n" +
                "Fresh whipped cream\n" +
                "1 cup heavy (whipping) cream (240 ml)\n" +
                "3 Tbsp sugar\n" +
                "To serve\n" +
                "2 tsp matcha (green tea powder) (for dusting)\n" +
                "Fresh whipped cream (optional: please double the recipe above but make the second batch right before you serve)");
        mNames.add("Matcha Mille Crepe Cake");
        mDescription.add("Matcha Mille Crepe Cake is made of thin layers of green tea crepes stacked together with fresh whipped cream in-between");
        mImageUrls.add("https://uncutrecipes.com/Images-Recipes-Japanese/Matcha-Mille-Crepe-Cake-Recipe.jpg");

        mDetailedDescription.add("250 ml water\n" +
                "1 slice ginger, optional\n" +
                "100 grams dark brown sugar \n" +
                "400 grams sweet potato, about 1 large\n" +
                "70 grams tapioca flour, plus extra for dusting\n" +
                "70 grams glutinous rice flour");
        mNames.add("Taiwanese Taro Balls");
        mDescription.add("A dessert originated from a small town Jiu Fen in Taiwan.");
        mImageUrls.add("https://c1.staticflickr.com/1/694/33375078895_b806a2d80b_o.jpg");

        mDetailedDescription.add("1/2 cup white sugar\n" +
                "2 ¼ cups all-purpose flour \n" +
               "4 teaspoons baking powder  \n" +
                "2 tablespoons white sugar\n" +
               "1/4 teaspoon salt\n" +
               "1/3cup shortening\n" +
                "1 egg\n" +
                "1/3 cup milk\n" +
                "2 cups whipped heavy cream");
        mNames.add("Japanese Strawberry Shortcake");
        mDescription.add("A fresh choice of cake for Summer.");
        mImageUrls.add("https://v1.nitrocdn.com/KQYMGOLIdXGmoAcyJsPOrQDKktgCbwtG/assets/static/optimized/rev-e80bad3/wp-content/uploads/2020/02/Japanese-Strawberry-Shortcake-0483-IV.jpg");

        mDetailedDescription.add("2 cups mango, in chunks, fresh or frozen\n" +
                "1 to 2 limes, juiced\n" +
                "1 tablespoon gelatin \n" +
                "1/2 cup water, divided\n" +
                "3/4 cup sugar\n" +
                "2 egg whites\n" +
                "1 1/2 cups whipping cream\n" +
                "Garnish: mango slices and raspberries");
        mNames.add("Mango Mousse Cake");
        mDescription.add("Delicate layers of sponge cake filled with sweet-tart mango mousse ");
        mImageUrls.add("https://www.mastercook.com/app/Image/13835385/4001176.jpg");

        mDetailedDescription.add("250 ml water\n" +
                "1 slice ginger, optional\n" +
                "100 grams dark brown sugar \n" +
                "400 grams sweet potato, about 1 large\n" +
                "70 grams tapioca flour, plus extra for dusting\n" +
                "70 grams glutinous rice flour");
        mNames.add("Matchamisu");
        mDescription.add("A perfect Japanese Italian fusion dessert.");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo_2018-07-22_10_16_41_AM_1800x.jpg?v=1569318445");

        mDetailedDescription.add("2 cups mango, in chunks, fresh or frozen\n" +
                "1 to 2 limes, juiced\n" +
                "1 tablespoon gelatin \n" +
                "1/2 cup water, divided\n" +
                "3/4 cup sugar\n" +
                "2 egg whites\n" +
                "1 1/2 cups whipping cream\n" +
                "Garnish: mango slices and raspberries");
        mNames.add("Dalgona Coffee Cake");
        mDescription.add("Dalgona coffee Macarpone cheese crème,dark chocolate chiffon cakes.");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/image_38883bd6-364c-4da4-9225-f1165ecb23a1_1800x.jpg?v=1590711011");

        mDetailedDescription.add("This berry pistachio cake is made with layers of fresh raspberry crème, Madagascar vanilla chiffon cake, fresh pistachio chantilly crème, house made raspberry jam, masked with more pistachio chantilly + white chocolate icing! It is THE perfect cake to share!\n" +
                "Recipe will be available soon!");
        mNames.add("R & P (raspberry & pistachio)");
        mDescription.add("Fruity and Nutty chiffon cake ");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo_2020-02-20_11_13_12_AM_1800x.jpg?v=1582223235");

        mDetailedDescription.add("Delicious butter cream made with fresh blueberries, lemon chiffon cake made with fresh lemon juice and lemon zest, cover with more blueberry crème, white chocolate frosting and topped with fresh berries!");
        mNames.add("Blueberry Lemon Dream");
        mDescription.add("Best cake for blueberry-lovers!");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo2020-08-05_120311PM_1800x.jpg?v=1596645529");

        mDetailedDescription.add("This special edition cake is made with Madagascar vanilla frosting and vanilla birthday sponge cake, cover with pink or blue glaze! It’s the perfect choice for her or for his birthday!");
        mNames.add("Baker's Birthday Cake!");
        mDescription.add("Classic Birthday Cake");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo_2018-08-25_10_11_50_AM_1800x.jpg?v=1569331160");

        mDetailedDescription.add("This holiday special pumpkin pie is made with fresh pumpkin custard with caramel and mixed spices, filled in a flaky pie crust, and finished with a layer of torched caramelized brown sugar! It is the perfect pie for the holiday season!");
        mNames.add("Pumpkin Crème Brûlée Pie");
        mDescription.add("Holiday season cake");
        mImageUrls.add("https://cdn.shopify.com/s/files/1/1981/5847/products/image_296775f4-3cbd-4658-976e-ba1ed7ab6e37_1800x.jpg?v=1570107986");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDescription,mDetailedDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















