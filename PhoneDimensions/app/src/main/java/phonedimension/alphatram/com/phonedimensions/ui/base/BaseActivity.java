package phonedimension.alphatram.com.phonedimensions.ui.base;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import phonedimension.alphatram.com.phonedimensions.R;

public abstract class BaseActivity extends AppCompatActivity {

    /*********************************************/
    // Protected Variables
    /*********************************************/

    protected Activity mActivity;
    protected Context mContext;

    /*********************************************/
    // Activity Lifecycle
    /*********************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mActivity = this;
        mContext = mActivity.getBaseContext();
    }

    /*********************************************/
    // Abstract Methods Declaration
    /*********************************************/

    /**
     * @return The current layout resource
     */
    protected abstract int getLayoutId();
}
