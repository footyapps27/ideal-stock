package phonedimension.alphatram.com.phonedimensions.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import phonedimension.alphatram.com.phonedimensions.R;
import phonedimension.alphatram.com.phonedimensions.adapter.PhoneListAdapter;
import phonedimension.alphatram.com.phonedimensions.models.Phone;

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

        updateUI();

        return view;
    }

    /******************************/
    // Private Methods
    /******************************/
    private void updateUI() {
        List<Phone> phones = new ArrayList<>();
        Phone phone1 = new Phone();
        phone1.setBrand("Apple");
        phone1.setModel("iPhone 5SE");
        phone1.setLength(5);
        phone1.setWidth(4);
        phone1.setThickness(2.13);

        Phone phone2 = new Phone();
        phone2.setBrand("Nokia");
        phone2.setModel("Mozart 23");
        phone2.setLength(6.14);
        phone2.setWidth(5);
        phone2.setThickness(2.3);


        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone1);
        phones.add(phone2);


        PhoneListAdapter phoneListAdapter = new PhoneListAdapter(getActivity(), phones);
        mRecyclerView.setAdapter(phoneListAdapter);
    }

}
