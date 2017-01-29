package phonedimension.alphatram.com.phonedimensions.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import phonedimension.alphatram.com.phonedimensions.R;


public class AddPhoneDimensionFragment extends Fragment {

    public AddPhoneDimensionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_phone_dimension, container, false);
    }

}
