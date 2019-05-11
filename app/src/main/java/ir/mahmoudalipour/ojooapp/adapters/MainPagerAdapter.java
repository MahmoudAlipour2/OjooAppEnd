package ir.mahmoudalipour.ojooapp.adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import ir.mahmoudalipour.ojooapp.fragments.CitiesFragment;
import ir.mahmoudalipour.ojooapp.fragments.CurrentWeatherFragment;

public class MainPagerAdapter extends FragmentPagerAdapter {

    Context context;
    public MainPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new CurrentWeatherFragment();
            case 1:
                return new CitiesFragment();
            default:
                return new CurrentWeatherFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Current Weather";
            case 1:
                return "Favorite Cities";
            default:
                return null;
        }
    }
}

