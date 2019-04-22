package com.example.fragmentruntime;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public Button button;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        button = view.findViewById(R.id.b2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer, new SecondFragment(), null).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
