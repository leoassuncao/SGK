package sgk.com.br.sgk.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sgk.com.br.sgk.Adapter.ExpandableListAdapter;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class RedBeltActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellow_belt_activity);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Kihon Waza - Fundamentos ");
        listDataHeader.add("Gohon Kumite");
        listDataHeader.add("Kihon Ippon Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("Oi-zuki (Zenkutsu-Dachi)");
        top250.add("Sanbon Ren-zuki (Zenkutsu-Dachi)");
        top250.add("Gyaku Oi-zuki (Zenkutsu-Dachi)");
        top250.add("Gedan Barai (Zenkutsu-Dachi)");
        top250.add("Jodan Age-uke (Zenkutsu-Dachi)");
        top250.add("Chudan Soto-uke (Zenkutsu-Dachi)");
        top250.add("Chudan Uchi-uke (Zenkutsu-Dachi)");
        top250.add("Chudan Shuto-uke (Kokutsu-Dachi)");
        top250.add("Mae-geri (Zenkutsu-Dachi)");
        top250.add("Mawashi-geri (Zenkutsu-Dachi)");
        top250.add("Yoko-geri (Kiba-Dachi)");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("Oi-zuki (Jodan e Chudan)");
        nowShowing.add("Age-uke (contra-ataque - Gyaku-zuki)");
        nowShowing.add("Soto-uke (contra-ataque - Gyaku-zuki)");

        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki (Jodan e Chudan)");
        kihon.add("Jodan Age-uke (contra-ataque - Gyaku-zuki)");
        kihon.add("Chudan Soto-uke (contra-ataque - Gyaku-zuki)");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), kihon);
        listDataChild.put(listDataHeader.get(3), comingSoon);
    }
}
