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
public class FirstBlackBeltActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_black_belt_activity);

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
        listDataHeader.add("Shiai Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki (Kamae - Base Livre)");
        kihon.add("Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Gyaku Oi-zuki (Kamae - Base Livre)");
        kihon.add("Kizami-zuki, Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Gedan Barai / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Jodan Age-uke / Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Soto-uke / Yoko-Enpi, Ukaren-Uchi, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Uchi-uke / Kizami-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Chudan Shuto-uke / Kizami-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Mae-geri, Oi-zuki, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Mawashi-geri, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Yoko-geri, Uraken-uchi, Gyaku-zuki (Kamae - Base Livre)");
        kihon.add("Fumikomi, Gyaku-zuki (Kamae - Zenkutsu-Dachi)");
        kihon.add("Ura Kakato-geri, Gyaku-zuki (Kamae - Base Livre)");

        List<String> jyuippon = new ArrayList<String>();
        jyuippon.add("Oi-zuki (Chudan)");
        jyuippon.add("Mae-geri (Kekomi)");
        jyuippon.add("Mawashi-geri (Jodan)");
        jyuippon.add("Yoko-geri (Kekomi)");
        jyuippon.add("Livre (Gedan Barai, Chudan Soto-uke, Chudan Uchi-uke, Jodan e Chudan Shuto-uke) (contra-ataque - Livre)");

        List<String> kihonippon = new ArrayList<String>();
        kihonippon.add("Oi-zuki (Jodan e Chudan)");
        kihonippon.add("Mae-geri (Chudan)");
        kihonippon.add("Mawashi-geri (Jodan)");
        kihonippon.add("Yoko-geri (Kekomi)");
        kihonippon.add("Livre (Esquivar com a defesa e contra atacar) (contra-ataque - Livre)");

        List<String> kata = new ArrayList<String>();
        kata.add("Heian Godan");
        kata.add("Kata escolhido pela banca");

        List<String> shiai = new ArrayList<String>();
        shiai.add("Ataque/Defesa - Técnicas apresentadas no Kihon");

        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), jyuippon);
        listDataChild.put(listDataHeader.get(2), kihonippon);
        listDataChild.put(listDataHeader.get(3), shiai);
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