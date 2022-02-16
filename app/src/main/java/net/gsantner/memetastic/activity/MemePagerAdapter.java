/*#######################################################
 *
 *   Maintained by Gregor Santner, 2016-
 *   https://gsantner.net/
 *
 *   License of this file: GNU GPLv3 (Commercial upon request)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
#########################################################*/
package net.gsantner.memetastic.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

public class MemePagerAdapter extends FragmentPagerAdapter {
    int _totalCount;
    String[] _pageTitles;


    public MemePagerAdapter(FragmentManager fm, int totalCount, String[] pageTitles) {
        super(fm);
        _totalCount = totalCount;
        _pageTitles = pageTitles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return _pageTitles[position];
    }

    @Override
    public Fragment getItem(int i) {
        return MemeFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return _totalCount;
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
