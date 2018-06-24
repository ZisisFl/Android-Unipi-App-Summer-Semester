package logismikou.texnologia.unipi_application;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class HistoryFragment extends Fragment {

    WebView web;


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_history, container, false);

        web = (WebView)v.findViewById(R.id.web);
        web.loadUrl("file:///android_asset/pages/history.html");
        return v;
    }

}
