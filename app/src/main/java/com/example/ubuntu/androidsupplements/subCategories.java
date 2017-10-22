package com.example.ubuntu.androidsupplements;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class subCategories extends AppCompatActivity {
    int x = 0;
    private LayoutInflater inflater;
    LinearLayout cont;
    public static View selected;
    cat[] cats ={
        new cat(R.drawable.protien),
                new cat(R.drawable.recovery),
                new cat(R.drawable.tablets),
                new cat(R.drawable.snacks),
                new cat(R.drawable.power),
                new cat(R.drawable.clothes),
                new cat(R.drawable.others)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_categories);
        cont = (LinearLayout) findViewById(R.id.container);
        getData();

    }

    private void getData() {
        if(cats != null) {
            for (cat ca: cats) {
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.cust_adap, null);

                //for the fragments.

//                LinearLayout layout = (LinearLayout) (R.layout.cust_adap);
//                View inflatedView = inflater.inflate(R.layout.cust_adap, cont, false);
//                LinearLayout layout = inflatedView.findViewById(R.id.cust_cat);
//                setListeners(layout);

                ((TextView) layout.findViewById(R.id.catName)).setText(ca.name);
                ((TextView) layout.findViewById(R.id.catItem)).setText(ca.items + "+ items");
                ((LinearLayout) layout.findViewById(R.id.father)).setBackgroundResource(ca.image);
                layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // edit this to save instance
                        selected= v;
                        startActivity(new Intent(subCategories.this,Store.class));
                    }
                });
//                layout.setBackgroundResource(ca.image);
                cont.addView(layout);
            }
        }
    }

    class cat {
        String name;
        int items;
        int image;
        public  cat(int image){
            this.name = "name" +x;
            this.items = 100+x;
            this.image= image;
            x++;
        }
    }
}
