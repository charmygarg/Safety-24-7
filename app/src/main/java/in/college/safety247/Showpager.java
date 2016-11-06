package in.college.safety247;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Charmy Garg on 18-Sep-16.
 */
public class Showpager extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        ViewPager viewPager = (ViewPager)findViewById(R.id.my_pager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));

    }
}
