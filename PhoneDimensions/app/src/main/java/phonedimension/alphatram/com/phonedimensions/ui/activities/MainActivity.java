package phonedimension.alphatram.com.phonedimensions.ui.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import butterknife.BindView;
import phonedimension.alphatram.com.phonedimensions.R;
import phonedimension.alphatram.com.phonedimensions.ui.base.BaseActivity;
import phonedimension.alphatram.com.phonedimensions.ui.fragments.AboutUsFragment;
import phonedimension.alphatram.com.phonedimensions.ui.fragments.AddPhoneDimensionFragment;
import phonedimension.alphatram.com.phonedimensions.ui.fragments.PhoneDimensionsListFragment;

public class MainActivity extends BaseActivity {

    /*********************************************/
    // Properties
    /*********************************************/
    @BindView(R.id.main_view_pager)
    ViewPager mViewPager;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    /*********************************************/
    // Activity Lifecycle
    /*********************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add toolbar
        setSupportActionBar(mToolbar);
        // Setup the tab layout
        setupTabLayout();
        // Setup view pager
        setupViewPager();
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
    private void setupViewPager() {
        // Setup Pager
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position) {
                    // TODO: - Add the correct instances of the fragments
                    case 0:
                        fragment = new PhoneDimensionsListFragment();
                        break;
                    case 1:
                        fragment = new AddPhoneDimensionFragment();
                        break;
                    case 2:
                        fragment = new AboutUsFragment();
                        break;
                    default:
                        fragment = new PhoneDimensionsListFragment();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return mTabLayout.getTabCount();
            }
        });
        // Attach the listeners to the tab layout
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    /**
     * Method to setup the tab layout
     */
    private void setupTabLayout() {
        // Add the tabs
        // TODO: - Replace this with icons
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.mipmap.ic_dimension));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.mipmap.ic_add));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.mipmap.ic_info));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Add the listener
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
