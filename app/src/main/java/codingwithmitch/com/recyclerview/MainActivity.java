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






















