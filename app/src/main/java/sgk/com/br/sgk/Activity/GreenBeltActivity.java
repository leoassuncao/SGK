package sgk.com.br.sgk.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sgk.com.br.sgk.Adapter.ExpandableListAdapter;
import sgk.com.br.sgk.R;

/**
 * Created by f764542 on 30/05/2016.
 */
public class GreenBeltActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green_belt_activity);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Kihon Waza - Fundamentos ");
        listDataHeader.add("Sanbon Kumite");
        listDataHeader.add("Kihon Ippon Kumite");
        listDataHeader.add("Shiai Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki (Kamae - Base Livre)");
        kihon.add("Sanbon Ren-zuki (Kamae - Base Livre)");
        kihon.add("Gyaku Oi-zuki (Kamae - Base Livre)");
        kihon.add("Gedan Barai / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Jodan Age-uke / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Soto-uke / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Uchi-uke / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Shuto-uke / Nukite (Kamae - Base Livre");
        kihon.add("Mae-geri, Oi-zuki (Kamae - Base Livre)");
        kihon.add("Mawashi-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Yoko-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Fumikomi (Kamae - Kiba-Dachi)");

        List<String> sanbon = new ArrayList<String>();
        sanbon.add("Oi-zuki (Jodan, Chudan e Gedan)");
        sanbon.add("Mae-geri (Chudan)");
        sanbon.add("Yoko-geri (Chudan)");
        sanbon.add("Age-uke (contra-ataque - Gyaku-zuki)");
        sanbon.add("Soto-uke (contra-ataque - Gyaku-zuki)");
        sanbon.add("Gedan barai (contra-ataque - Gyaku-zuki)");
        sanbon.add("Uchi-uke (contra-ataque - Gyaku-zuki)");
        sanbon.add("Shuto-uke (contra-ataque - Gyaku-zuki)");

        List<String> kihonippon = new ArrayList<String>();
        kihonippon.add("Oi-zuki (Jodan e Chudan)");
        kihonippon.add("Mae-geri (Chudan)");
        kihonippon.add("Age-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Soto-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Uchi-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Gedan Barai (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Shuto-uke (contra-ataque - Gyaku-zuki)");

        List<String> kata = new ArrayList<String>();
        kata.add("Heian Yodan");
        kata.add("Kata escolhido pela banca");

        List<String> shiai = new ArrayList<String>();
        shiai.add("Técnicas apresentadas no Kihon");




        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), sanbon);
        listDataChild.put(listDataHeader.get(2), kihonippon);
        listDataChild.put(listDataHeader.get(3), shiai);
        listDataChild.put(listDataHeader.get(4), kata);
    }
}