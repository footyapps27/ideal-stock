package phonedimension.alphatram.com.phonedimensions.ui.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import phonedimension.alphatram.com.phonedimensions.R;
import phonedimension.alphatram.com.phonedimensions.ui.base.BaseActivity;
import phonedimension.alphatram.com.phonedimensions.ui.fragments.AboutUsFragment;

public class MainActivity extends BaseActivity {

    /*********************************************/
    // Properties
    /*********************************************/
    @BindView(R.id.main_view_pager)
    ViewPager mViewPager;

    /*********************************************/
    // Activity Lifecycle
    /*********************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpViewPager();
        // Setup the view pager
    }

    /*********************************************/
    // Abstract Method Implementation
    /*********************************************/
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /*********************************************/
    // Private Methods
    /*********************************************/

    /**
     * Method to setup the view pager.
     */
    private void setUpViewPager() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    // TODO: - Add the correct instances of the fragments
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                return new AboutUsFragment();
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }
}
