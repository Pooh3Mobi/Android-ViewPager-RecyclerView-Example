package mobi.pooh3.viewpagerlistexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
      super(fm);
    }

  @Override
  public CharSequence getPageTitle(int position) {
    return "sec " + position;
  }

  @Override
    public Fragment getItem(int position) {
      return ItemFragment.newInstance();
    }

    @Override
    public int getCount() {
      // Show 3 total pages.
      return 10;
    }
  }