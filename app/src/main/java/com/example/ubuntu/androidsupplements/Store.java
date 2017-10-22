package com.example.ubuntu.androidsupplements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Store extends AppCompatActivity {
    private View selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        selected = subCategories.selected;

    }
    class item {
        String name;
        int image;
        public  item (int image){
            this.name = "max";
            this.image = image;
        }
    }
}
