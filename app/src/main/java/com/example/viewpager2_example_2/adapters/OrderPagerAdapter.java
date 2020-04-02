package com.example.viewpager2_example_2.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.viewpager2_example_2.fragments.ConfirmedOrdersFragment;
import com.example.viewpager2_example_2.fragments.DeliveredOrdersFragment;
import com.example.viewpager2_example_2.fragments.PendingOrdersFragment;

public class OrderPagerAdapter extends FragmentStateAdapter {

    public OrderPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new PendingOrdersFragment();
                break;
            case 1:
                fragment = new ConfirmedOrdersFragment();
                break;
            case 2:
                fragment = new DeliveredOrdersFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
