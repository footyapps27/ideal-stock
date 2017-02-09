package phonedimension.alphatram.com.phonedimensions.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import phonedimension.alphatram.com.phonedimensions.R;
import phonedimension.alphatram.com.phonedimensions.models.Phone;
import phonedimension.alphatram.com.phonedimensions.ui.viewholders.PhoneListViewHolder;

/**
 * Created by Samrat on 9/2/17.
 */

public class PhoneListAdapter extends RecyclerView.Adapter<PhoneListViewHolder> {

    private List<Phone> mPhoneList;
    private Context mContext;

    public PhoneListAdapter(Context context, List<Phone> phoneList) {
        this.mContext = context;
        this.mPhoneList = phoneList;
    }

    /*********************************/
    // Abstract Method Implementation
    /*********************************/

    @Override
    public PhoneListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.list_item_phone_dimension, parent, false);
        return new PhoneListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PhoneListViewHolder holder, int position) {
        Phone phone = mPhoneList.get(position);
        holder.bindHolder(phone);
    }
    @Override
    public int getItemCount() {
        return mPhoneList.size();
    }
}
