package phonedimension.alphatram.com.phonedimensions.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import phonedimension.alphatram.com.phonedimensions.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhoneDimensionsListFragment extends Fragment {

    /******************************/
    // Properties
    /******************************/
    @BindView(R.id.phone_dimension_list_recycler_view)
    RecyclerView mRecyclerView;

    /******************************/
    // Constructor
    /******************************/
    public PhoneDimensionsListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_phone_dimensions_list, container, false);
        ButterKnife.bind(this, view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}
