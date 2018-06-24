package logismikou.texnologia.unipi_application;


import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class CommunicateFragment extends Fragment {

    Spinner spinner;
    Button send, new_send;
    EditText message;
    ConstraintLayout main_layout, secondary_layout;


    public CommunicateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_communicate, container, false);
        main_layout = (ConstraintLayout)v.findViewById(R.id.main_layout);
        secondary_layout = (ConstraintLayout)v.findViewById(R.id.secondary_layout);

        spinner = (Spinner)v.findViewById(R.id.spinner);
        send = (Button)v.findViewById(R.id.send_button);
        message = (EditText)v.findViewById(R.id.message);
        new_send = (Button)v.findViewById(R.id.new_send);

        send_request();
        new_request();

        return v;
    }

    private void send_request(){
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(message.getText().toString().equals(""))
                {
                    Toast.makeText(getActivity(),"Blank message field",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    main_layout.setVisibility(View.GONE);
                    secondary_layout.setVisibility(View.VISIBLE);

                    InputMethodManager inputManager = (InputMethodManager)
                            getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
                }
            }
        });
    }

    private void new_request(){
        new_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondary_layout.setVisibility(View.GONE);
                message.getText().clear();
                main_layout.setVisibility(View.VISIBLE);
            }
        });
    }



}
