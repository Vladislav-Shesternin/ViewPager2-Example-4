package com.example.viewpager2_example_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.viewpager2_example_2.R;
import com.example.viewpager2_example_2.adapters.OrderPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabLayoutMediator tabLayoutMediator;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout___activity_main___top);
        viewPager2 = findViewById(R.id.viewPager2___activity_main___center);
        viewPager2.setAdapter(new OrderPagerAdapter(this));

        tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Pending");
                        tab.setIcon(R.drawable.ic_pending);
                        break;
                    case 1:
                        tab.setText("Confirmed");
                        tab.setIcon(R.drawable.ic_confirmed);
                        break;
                    case 2:
                        tab.setText("Delivered");
                        tab.setIcon(R.drawable.ic_delivered);
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}
