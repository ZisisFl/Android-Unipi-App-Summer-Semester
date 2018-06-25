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
    third_1, third_2, forth_1, forth_2, back_button2;
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
        back_button2 = (Button)v.findViewById(R.id.back_button2);

        pick_category();
        go_back();

        return v;
    }

    private void pick_category(){
        main_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                first_sub.setVisibility(View.VISIBLE);
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        main_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                second_sub.setVisibility(View.VISIBLE);
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        main_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                third_sub.setVisibility(View.VISIBLE);
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        main_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layout.setVisibility(View.GONE);
                forth_sub.setVisibility(View.VISIBLE);
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        first_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Οικονομικής Επιστήμης.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        first_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Οργάνωσης & Διοίκησης Επιχειρήσεων.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        first_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Διεθνών & Ευρωπαϊκών Σπουδών.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        first_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Τουριστικών Σπουδών.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        sec_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Ναυτιλιακών Σπουδών.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        sec_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Tμήμα Βιομηχανικής Διοίκησης & Tεχνολογίας.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        third_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Χρηματοοικονομικής και Τραπεζικής Διοικητικής.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        third_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                third_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Στατιστικής & Ασφαλιστικής Επιστήμης.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        forth_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forth_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Πληροφορικής.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });

        forth_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forth_sub.setVisibility(View.GONE);
                //OPEN PAGE
                page.setVisibility(View.VISIBLE);
                page.loadUrl("file:///android_asset/pages/Τμήμα Ψηφιακών Συστημάτων.html");
                back_button2.setVisibility(View.VISIBLE);
            }
        });
    }

    private void go_back(){
        back_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page.setVisibility(View.GONE);
                back_button2.setVisibility(View.GONE);
                main_layout.setVisibility(View.VISIBLE);
                first_sub.setVisibility(View.GONE);
                second_sub.setVisibility(View.GONE);
                third_sub.setVisibility(View.GONE);
                forth_sub.setVisibility(View.GONE);
            }
        });
    }

}
