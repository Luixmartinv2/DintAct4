package com.example.luixmartinv2.dintact4;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.example.luixmartinv2.dintact4.R.layout.fragment_firebase;


/**
 * @author luixmartinv2
 */
public class firebase extends Fragment {


    public EditText etUserName ;
    public EditText etPasword ;
    public Button btnLogin;
    public Button btnregistro;
    public LoginFragmentEvent events;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(fragment_firebase, container, false);

        etUserName= v.findViewById(R.id.etUserName);
        etPasword= v.findViewById(R.id.etPasword);
        btnLogin=(Button) v.findViewById(R.id.btnLogin);
        btnregistro= v.findViewById(R.id.btnregistro);
        events= new  LoginFragmentEvent(this);
        btnLogin.setOnClickListener(events);
        btnregistro.setOnClickListener(events);
    }
}




class LoginFragmentEvent implements View.OnClickListener{

    private firebase fb;

    public LoginFragmentEvent(firebase fb ){
        this.fb = fragment_firebase;
    }

    @Override
    public void onClick(View v) {

    }
}