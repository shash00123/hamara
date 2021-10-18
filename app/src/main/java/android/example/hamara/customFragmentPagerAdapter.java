package android.example.hamara;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class customFragmentPagerAdapter extends FragmentPagerAdapter {

    private int count=3;
    private String tabTitles[] = new String[] { "Colors", "Numbers","Phrases" };
    public  customFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return count;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new colorsfragment();
        }else if(position==1){
            return new NumbersFragment();
        }else{
            return new PhrasesFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return tabTitles[position];


    }
}
