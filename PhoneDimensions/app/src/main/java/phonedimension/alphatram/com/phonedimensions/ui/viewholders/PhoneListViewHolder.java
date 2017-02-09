package phonedimension.alphatram.com.phonedimensions.ui.viewholders;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import phonedimension.alphatram.com.phonedimensions.R;
import phonedimension.alphatram.com.phonedimensions.models.Phone;

/**
 * Created by Samrat on 9/2/17.
 */

public class PhoneListViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.phone_brand_and_model)
    TextView mTextViewPhoneBrandAndModel;

    @BindView(R.id.phone_dimensions)
    TextView mTextViewPhoneDimensions;

    public PhoneListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindHolder(Phone phone) {
        String phoneBrandAndModel = phone.getBrand() + " " + phone.getModel();
        mTextViewPhoneBrandAndModel.setText(phoneBrandAndModel);

        String phoneDimensions = "Length: " + phone.getLength() + " Width: "
                + phone.getWidth() + " Thickness: " + phone.getThickness();
        mTextViewPhoneDimensions.setText(phoneDimensions);
    }
}