package com.example.viewpager2_example_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.viewpager2_example_4.R;
import com.example.viewpager2_example_4.adapters.OrderPagerAdapter;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabLayoutMediator tabLayoutMediator;
    ViewPager2 viewPager2;
    public static final int COLOR_ACCENT = R.color.colorAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout___activity_main___top);
        viewPager2 = findViewById(R.id.viewPager2___activity_main___center);
        viewPager2.setAdapter(new OrderPagerAdapter(this));

        createTabLayout();
        cleanBadge();
    }

    /**
     * BadgeDrawable.setVisible(false)
     */
    public void createTabLayout() {
        tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Pending");
                        tab.setIcon(R.drawable.ic_pending);
                        BadgeDrawable badgeDrawable_0 = tab.getOrCreateBadge();
                        badgeDrawable_0.setBackgroundColor(
                                ContextCompat.getColor(getApplicationContext(), COLOR_ACCENT)
                        );
                        badgeDrawable_0.setVisible(true);
                        break;
                    case 1:
                        tab.setText("Confirmed");
                        tab.setIcon(R.drawable.ic_confirmed);
                        BadgeDrawable badgeDrawable_1 = tab.getOrCreateBadge();
                        badgeDrawable_1.setBackgroundColor(
                                ContextCompat.getColor(getApplicationContext(), COLOR_ACCENT)
                        );
                        badgeDrawable_1.setVisible(true);
                        badgeDrawable_1.setNumber(7);
                        break;
                    case 2:
                        tab.setText("Delivered");
                        tab.setIcon(R.drawable.ic_delivered);
                        BadgeDrawable badgeDrawable_2 = tab.getOrCreateBadge();
                        badgeDrawable_2.setBackgroundColor(
                                ContextCompat.getColor(getApplicationContext(), COLOR_ACCENT)
                        );
                        badgeDrawable_2.setVisible(true);
                        badgeDrawable_2.setNumber(100);
                        badgeDrawable_2.setMaxCharacterCount(3);
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }

    public void cleanBadge() {
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                BadgeDrawable badgeDrawable = tabLayout.getTabAt(position).getOrCreateBadge();
                badgeDrawable.setVisible(false);
            }
        });
    }
}
