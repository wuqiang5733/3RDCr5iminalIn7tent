package org.xuxiaoxiao.mycriminalintent;

import android.support.v4.app.Fragment;


/**
 * Created by WuQiang on 2017/3/21.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

