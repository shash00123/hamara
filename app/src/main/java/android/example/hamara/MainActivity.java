package android.example.hamara;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vp = (ViewPager) findViewById(R.id.vpPager);
        customFragmentPagerAdapter adapter = new customFragmentPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        TabLayout tab = (TabLayout) findViewById(R.id.sliding_tabs);
        tab.setupWithViewPager(vp);
        //added  3

        //added this in experiment branch
    }


}