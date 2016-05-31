package sgk.com.br.sgk.Activity.Belts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sgk.com.br.sgk.Adapter.ExpandableListAdapter;
import sgk.com.br.sgk.R;
/**
 * Created by f764542 on 30/05/2016.
 */
public class SecondBrownBeltActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_brown_belt_activity);

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
        listDataHeader.add("Jyu Ippon Kumite");
        listDataHeader.add("Kihon Ippon Kumite");
        listDataHeader.add("Jiyu Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Gyaku Oi-zuki (Kamae - Base Livre)");
        kihon.add("Kizami-zuki, Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Gedan Barai / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Jodan Age-uke / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Soto-uke / Kizami-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Uchi-uke / Yoko-enpi, Uraken-uchi, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Shuto-uke / Kizami Mawashi-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Mae-geri, Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Mawashi-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Yoko-geri, Yoko-enpi, Uraken-uchi, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Fumikomi, Uraken-uchi, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Ura Kakato-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Ushiro-geri, Gyaku-zuki (Kamae - Base Livre)");

        List<String> jyuippon = new ArrayList<String>();
        jyuippon.add("Livre (Demonstrando técnicas dominadas)");

        List<String> kihonippon = new ArrayList<String>();
        kihonippon.add("Ataque livre (Demonstrando técnicas dominadas)");
        kihonippon.add("Defesa livre (Demonstrando técnicas dominadas) (contra-ataque - Livre) ");

        List<String> kata = new ArrayList<String>();
        kata.add("Kanku Dai");
        kata.add("Kata escolhido pela banca");

        List<String> jiyu = new ArrayList<String>();
        jiyu.add("Livre (Demonstrando técnicas dominadas) (COM CONTROLE)");

        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), jyuippon);
        listDataChild.put(listDataHeader.get(2), kihonippon);
        listDataChild.put(listDataHeader.get(3), jiyu);
        listDataChild.put(listDataHeader.get(4), kata);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        finish();

        return super.onOptionsItemSelected(item);

    }
}