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
        setContentView(R.layout.red_belt_activity);

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
        listDataHeader.add("Gohon Kumite");
        listDataHeader.add("Kihon Ippon Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki (Zenkutsu-Dachi)");
        kihon.add("Sanbon Ren-zuki (Zenkutsu-Dachi)");
        kihon.add("Gyaku Oi-zuki (Zenkutsu-Dachi)");
        kihon.add("Gedan Barai / Ren-zuki (dois socos)(Zenkutsu-Dachi)");
        kihon.add("Jodan Age-uke / Ren-zuki (Zenkutsu-Dachi)");
        kihon.add("Chudan Soto-uke / Ren-zuki (Zenkutsu-Dachi)");
        kihon.add("Chudan Uchi-uke / Ren-zuki (Zenkutsu-Dachi)");
        kihon.add("Chudan Shuto-uke / Gyaku-zuki (Kokutsu-Dachi / Zenkutsu-Dachi)");
        kihon.add("Mae-geri, Oi-zuki (Zenkutsu-Dachi)");
        kihon.add("Mawashi-geri, Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("Yoko-geri (Keage e Kekomi) (Kiba-Dachi)");

        List<String> gohon = new ArrayList<String>();
        gohon.add("Oi-zuki (Jodan, Chudan e Gedan)");
        gohon.add("Age-uke (contra-ataque - Gyaku-zuki)");
        gohon.add("Soto-uke (contra-ataque - Gyaku-zuki)");
        gohon.add("Gedan barai (contra-ataque - Gyaku-zuki)");
        gohon.add("Uchi-uke (contra-ataque - Gyaku-zuki)");

        List<String> kihonippon = new ArrayList<String>();
        kihonippon.add("Oi-zuki (Jodan e Chudan)");
        kihonippon.add("Jodan Age-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Chudan Soto-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Chudan Uchi-uke (contra-ataque - Gyaku-zuki)");
        kihonippon.add("Gedan Barai (contra-ataque - Gyaku-zuki)");

        List<String> kata = new ArrayList<String>();
        kata.add("Heian Shodan");
        kata.add("Heian Nidan");

        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), gohon);
        listDataChild.put(listDataHeader.get(2), kihonippon);
        listDataChild.put(listDataHeader.get(3), kata);
    }
}