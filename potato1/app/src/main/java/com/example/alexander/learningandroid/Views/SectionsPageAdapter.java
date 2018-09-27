package com.example.alexander.learningandroid.Views;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/** SectionsPageAdapter:
 * Keeps track of Fragments and their respective titles.
 */
public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>(); // Keep track of fragments
    private final List<String> mFragmentTitleList = new ArrayList<>(); // Keep track of the name of the fragments

    /** addFragment:
     * Stores fragment and title for that Fragment.
     * @param fragment
     * @param title
     */
    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }


    /** getPageTitle:
     * A simple getter.
     * @param position
     * @return title of Fragment
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    /** getItem:
     * A simple getter.
     * @param i
     * @return Fragment at i
     */
    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    /** getCount:
     * A simple getter.
     * @return amount of Fragments
     */
    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
