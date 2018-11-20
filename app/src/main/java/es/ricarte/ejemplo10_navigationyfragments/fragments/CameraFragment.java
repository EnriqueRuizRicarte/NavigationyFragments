package es.ricarte.ejemplo10_navigationyfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import es.ricarte.ejemplo10_navigationyfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {
    private EditText etUser, etPass;
    private Button btnRegistrar, btnLogin;
    private final String user = "admin";
    private final String pass = "admin";
    public CameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View rootView =  inflater.inflate(R.layout.fragment_camera, container, false);
        etUser = rootView.findViewById(R.id.etUsuario);
        etPass = rootView.findViewById(R.id.etPass);
        btnLogin = rootView.findViewById(R.id.btnLogin);
        btnRegistrar = rootView.findViewById(R.id.btnRegistrar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUser.getText().toString().equals(user) && etPass.getText().toString().equals(pass)){

                    ManageFragment manageFragment = new ManageFragment();
                    //PASO 2: Colocar el nuevo fragment en su zona visible.
                    //rootView.getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,manageFragment).commit();
                }
            }
        });

        return rootView;
    }

}
