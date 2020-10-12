package com.example.masterdflow2;

import android.app.Activity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.masterdflow2.dummy.DummyContent;

import java.util.zip.Inflater;

/**
 * A fragment representing a single website detail screen.
 * This fragment is either contained in a {@link websiteListActivity}
 * in two-pane mode (on tablets) or a {@link websiteDetailActivity}
 * on handsets.
 */
public class websiteDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public websiteDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_gallery, container, false);
        //WebView webView= rootView.findViewById(R.id.website_detail);
        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
           // ImageView image = rootView.findViewById(R.id.image);

            if (mItem.id.equals("1")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://uncutrecipes.com/Images-Recipes-Japanese/Matcha-Mille-Crepe-Cake-Recipe.jpg").into(image);


            }
            if (mItem.id.equals("2")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://c1.staticflickr.com/1/694/33375078895_b806a2d80b_o.jpg").into(image);
            }
            if (mItem.id.equals("3")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo2020-08-05_120311PM_1800x.jpg?v=1596645529").into(image);
            }
            if (mItem.id.equals("4")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://www.mastercook.com/app/Image/13835385/4001176.jpg").into(image);

            }
            if (mItem.id.equals("5")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo_2018-07-22_10_16_41_AM_1800x.jpg?v=1569318445").into(image);

            }
            if (mItem.id.equals("6")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://cdn.shopify.com/s/files/1/1981/5847/products/image_38883bd6-364c-4da4-9225-f1165ecb23a1_1800x.jpg?v=1590711011").into(image);

            }
            if (mItem.id.equals("7")) {
                rootView = inflater.inflate(R.layout.activity_gallery, container, false);
                ((TextView) rootView.findViewById(R.id.image_description)).setText(mItem.content);
                ImageView image = rootView.findViewById(R.id.image);
                Glide.with(this).load("https://cdn.shopify.com/s/files/1/1981/5847/products/Photo_2020-02-20_11_13_12_AM_1800x.jpg?v=1582223235").into(image);

            }

        }
        return rootView;
    }
}