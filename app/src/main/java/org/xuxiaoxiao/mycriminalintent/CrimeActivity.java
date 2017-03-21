package org.xuxiaoxiao.mycriminalintent;

/**
 * Created by WuQiang on 2017/3/20.
 */

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
