package in.college.safety247;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Charmy Garg on 18-Sep-16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new Locations();
        }else
            return  new Alert();

           // return new Chat();
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return "LOCATION";
        }else
            return "ALERT";

       // return "CHAT";

    }

}
