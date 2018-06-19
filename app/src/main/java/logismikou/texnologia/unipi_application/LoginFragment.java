package logismikou.texnologia.unipi_application;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    Button login_button;
    EditText email_text,password_text;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //initDatabaseHelper();
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        email_text = (EditText)v.findViewById(R.id.email_text);
        password_text = (EditText)v.findViewById(R.id.password_text);
        login_button = (Button)v.findViewById(R.id.login_button);


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instance of database access
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getActivity().getApplicationContext());
                databaseAccess.open();

                String email = email_text.getText().toString();
                String password = password_text.getText().toString();
                String password_db = databaseAccess.get_pass(email);

                Toast.makeText(getActivity(),"Database pass"+password_db,Toast.LENGTH_SHORT).show();
                databaseAccess.close();
            }
        });
        return v;
    }

}
