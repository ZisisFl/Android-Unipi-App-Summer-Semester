package logismikou.texnologia.unipi_application;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

public class DepartmentsFragment extends Fragment {

    Button main_1, main_2, main_3, main_4, first_1,
        first_2, first_3, first_4, sec_1, sec_2,
    third_1, third_2, forth_1, forth_2;
    ConstraintLayout main_layout, first_sub, second_sub, third_sub, forth_sub;
    WebView page;

    public DepartmentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_departments, container, false);

        main_layout = (ConstraintLayout)v.findViewById(R.id.main_layout);
        first_sub = (ConstraintLayout)v.findViewById(R.id.first_sub);
        second_sub = (ConstraintLayout)v.findViewById(R.id.second_sub);
        third_sub = (ConstraintLayout)v.findViewById(R.id.third_sub);
        forth_sub = (ConstraintLayout)v.findViewById(R.id.forth_sub);

        page = (WebView)v.findViewById(R.id.page);

        main_1 = (Button)v.findViewById(R.id.main_1);
        main_2 = (Button)v.findViewById(R.id.main_2);
        main_3 = (Button)v.findViewById(R.id.main_3);
        main_4 = (Button)v.findViewById(R.id.main_4);
        first_1 = (Button)v.findViewById(R.id.first_1);
        first_2 = (Button)v.findViewById(R.id.first_2);
        first_3 = (Button)v.findViewById(R.id.first_3);
        first_4 = (Button)v.findViewById(R.id.first_4);
        sec_1 = (Button)v.findViewById(R.id.sec_1);
        sec_2 = (Button)v.findViewById(R.id.sec_2);
        third_1 = (Button)v.findViewById(R.id.third_1);
        third_2 = (Button)v.findViewById(R.id.third_2);
        forth_1 = (Button)v.findViewById(R.id.forth_1);
        forth_2 = (Button)v.findViewById(R.id.forth_2);

        main_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                first_sub.setVisibility(View.VISIBLE);
            }
        });

        main_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                second_sub.setVisibility(View.VISIBLE);
            }
        });

        main_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                third_sub.setVisibility(View.VISIBLE);
            }
        });

        main_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                forth_sub.setVisibility(View.VISIBLE);
            }
        });

        first_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Οικονομικής Επιστήμης.html");
            }
        });

        first_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Οργάνωσης & Διοίκησης Επιχειρήσεων.html");
            }
        });

        first_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Διεθνών & Ευρωπαϊκών Σπουδών.html");
            }
        });

        first_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Τουριστικών Σπουδών.html");
            }
        });

        sec_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Ναυτιλιακών Σπουδών.html");
            }
        });

        sec_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Tμήμα Βιομηχανικής Διοίκησης & Tεχνολογίας.html");
            }
        });

        third_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Χρηματοοικονομικής και Τραπεζικής Διοικητικής.html");
            }
        });

        third_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Στατιστικής & Ασφαλιστικής Επιστήμης.html");
            }
        });

        forth_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forth_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Πληροφορικής.html");
            }
        });

        forth_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forth_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Ψηφιακών Συστημάτων.html");
            }
        });
        return v;
    }

}
