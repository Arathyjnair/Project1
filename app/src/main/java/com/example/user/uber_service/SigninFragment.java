package com.example.user.uber_service;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SigninFragment extends Fragment {
Button user1,service_provider;

    public SigninFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View vs= inflater.inflate(R.layout.sparechoosecatagory, container, false);
            user1=vs.findViewById(R.id.usr);
            service_provider=vs.findViewById(R.id.srvepro);


            return vs;

    }

}
