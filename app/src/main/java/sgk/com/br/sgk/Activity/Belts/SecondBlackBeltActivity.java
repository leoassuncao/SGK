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
public class SecondBlackBeltActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_black_belt_activity);

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
        listDataHeader.add("Jiyu Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Kizami-zuki, Sanbon-zuki (Zenkutsu-Dachi)");
        kihon.add("Mae-geri / Oi-zuki (Zenkutsu-Dachi)");
        kihon.add("Yoko-geri Keage / Yoko-geri Kekomi (Kiba-Dachi)");
        kihon.add("Jodan Age-uke (recuando) / Mawashi-geri (avançando) / Uraken-uchi / Oi-zuki (Zenkutsu-Dachi)");
        kihon.add("Mawashi-geri / Yoko-geri Kekomi / Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("GMae-geri / Yoko-geri Kekomi / Ushiro-geri / Mawashi-geri (mesma perna) (Zenkutsu-Dachi)");

        List<String> jyukumite = new ArrayList<String>();
        jyukumite.add("Livre (Demonstrando técnicas dominadas. Domínio da distância, defesa e contra-ataque) (COM CONTROLE)");

        List<String> kata = new ArrayList<String>();
        kata.add("Tokui Kata");



        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), jyukumite);
        listDataChild.put(listDataHeader.get(2), kata);
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