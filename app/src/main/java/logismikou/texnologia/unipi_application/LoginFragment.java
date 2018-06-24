package logismikou.texnologia.unipi_application;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    Button login_button,logout_button;
    EditText email_text,password_text;
    TextView show_email;
    ConstraintLayout main_layout, secondary_layout;
    static Boolean logged = false;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        main_layout = (ConstraintLayout)v.findViewById(R.id.main_layout);
        secondary_layout = (ConstraintLayout)v.findViewById(R.id.secondary_layout);

        email_text = (EditText)v.findViewById(R.id.email_text);
        password_text = (EditText)v.findViewById(R.id.password_text);
        login_button = (Button)v.findViewById(R.id.login_button);
        logout_button = (Button)v.findViewById(R.id.logout_button);
        show_email = (TextView)v.findViewById(R.id.show_email);

        login();
        check_logged();
        logout();


        return v;
    }

    public void login(){
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //instance of database access
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getActivity().getApplicationContext());
                databaseAccess.open();

                String email = email_text.getText().toString();
                String password = password_text.getText().toString();
                String password_db = databaseAccess.get_pass(email);

                if(email.equals(""))
                {
                    Toast.makeText(getActivity(),"Blank email field",Toast.LENGTH_SHORT).show();
                }
                else if (password.equals(""))
                {
                    Toast.makeText(getActivity(),"Blank password field",Toast.LENGTH_SHORT).show();
                }
                else{
                    if (password.equals(password_db))
                    {
                        Toast.makeText(getActivity(),"Successful Login",Toast.LENGTH_SHORT).show();
                        logged = true;
                        //HomeFragment nextFrag= new HomeFragment();
                        //getActivity().getSupportFragmentManager().beginTransaction()
                        //       .replace(R.id.flMain, nextFrag,"HomeFragment")
                        //        .addToBackStack(null)
                        //        .commit();
                        check_logged();
                    }
                    else
                        Toast.makeText(getActivity(),"Wrong email or password",Toast.LENGTH_SHORT).show();
                    databaseAccess.close();

                    //withdraw keyboard
                    InputMethodManager inputManager = (InputMethodManager)
                            getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);

                    //Intent intent = new Intent(getActivity().getBaseContext(),
                    //            MainActivity.class);
                    //intent.putExtra("sender_key", "login_frag");
                    //intent.putExtra("email", email);
                    //getActivity().startActivity(intent);
                }
            }
        });
    }

    public void logout(){
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logged = false;
                main_layout.setVisibility(View.VISIBLE);
                secondary_layout.setVisibility(View.GONE);

                InputMethodManager inputManager = (InputMethodManager)
                        getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);

                email_text.setText("");
                password_text.setText("");
            }
        });
    }

    public void check_logged(){
        if (logged==true) {
            main_layout.setVisibility(View.GONE);
            secondary_layout.setVisibility(View.VISIBLE);
        }
        else{
            main_layout.setVisibility(View.VISIBLE);
            secondary_layout.setVisibility(View.GONE);
        }
    }
}
