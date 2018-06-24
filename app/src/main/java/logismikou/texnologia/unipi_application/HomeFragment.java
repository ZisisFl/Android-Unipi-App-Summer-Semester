package logismikou.texnologia.unipi_application;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    WebView home_web;
    TextView news1, news2, news3, news4;
    Button back_button;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        home_web = (WebView)v.findViewById(R.id.home_web);

        back_button = (Button)v.findViewById(R.id.back_button);

        news1 = (TextView)v.findViewById(R.id.news1);
        news2 = (TextView)v.findViewById(R.id.news2);
        news3 = (TextView)v.findViewById(R.id.news3);
        news4 = (TextView)v.findViewById(R.id.news4);

        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_web.setVisibility(View.VISIBLE);
                home_web.loadUrl("file:///android_asset/pages/home1.html");
                back_button.setVisibility(View.VISIBLE);
            }
        });

        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_web.setVisibility(View.VISIBLE);
                home_web.loadUrl("file:///android_asset/pages/home2.html");
                back_button.setVisibility(View.VISIBLE);
            }
        });

        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_web.setVisibility(View.VISIBLE);
                home_web.loadUrl("file:///android_asset/pages/home3.html");
                back_button.setVisibility(View.VISIBLE);
            }
        });

        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_web.setVisibility(View.VISIBLE);
                home_web.loadUrl("file:///android_asset/pages/home4.html");
                back_button.setVisibility(View.VISIBLE);
            }
        });

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_web.setVisibility(View.GONE);
                back_button.setVisibility(View.GONE);
            }
        });

        return v;
    }

}
