package com.example.viewpager2_example_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.viewpager2_example_1.adapters.OrderPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2___activity_main___center);
        viewPager2.setAdapter(new OrderPagerAdapter(this));
    }
}
