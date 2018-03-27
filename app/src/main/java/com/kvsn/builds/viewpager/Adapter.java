package com.kvsn.builds.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by KVSN on 3/21/2018.
 */

public class Adapter extends FragmentStatePagerAdapter
{
    public Adapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position)
    {
        Fragment f = null;
        switch(position)
        {
            case 0:
                f = new Fragment1();
                break;
            case 1:
                f = new Fragment2();
                break;
            case 2:
                f = new BlankFragment();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
