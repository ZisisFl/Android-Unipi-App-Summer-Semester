package logismikou.texnologia.unipi_application;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class ServicesFragment extends Fragment {

    WebView web;

    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_services, container, false);
        web = (WebView)v.findViewById(R.id.web);
        show_page();
        return v;
    }

    private void show_page(){
        web.loadUrl("file:///android_asset/pages/Γενικές Πληροφορίες για τις Ηλεκτρονικές Υπηρεσίες του Πανεπιστημίου Πειραιώς στους Φοιτητές.html");
    }

}
