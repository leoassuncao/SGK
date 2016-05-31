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
        listDataHeader.add("Jiyu Ippon Kumite");
        listDataHeader.add("Jiyu Kumite");
        listDataHeader.add("Kata");

        // Adding child data
        List<String> kihon = new ArrayList<String>();
        kihon.add("Oi-zuki Jodan, Gyaku-zuki Chudan (Zenkutsu-Dachi)");
        kihon.add("Sanbon Ren-zuki (Zenkutsu-Dachi)");
        kihon.add("Jodan Age-uke / Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("Chudan Soto-uke / Yoko-enpi, Uraken-uchi, Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("Chudan Uchi-uke / Kizami-zuki, Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("Gedan Barai / Gyaku-zuki (Zenkutsu-Dachi)");
        kihon.add("Mae-geri (Zenkutsu-Dachi)");
        kihon.add("Yoko-geri Keage(Kiba-Dachi)");
        kihon.add("Yoko-geri Kekomi(Kiba-Dachi)");
        kihon.add("Yoko-geri Kekomi(Zenkutsu-Dachi)");
        kihon.add("Ushiro-geri (Zenkutsu-Dachi)");
        kihon.add("Chudan Shuto-uke / Kizami Mae-geri, Nukite (Kokutsu/Zenkutsu-Dachi)");

        List<String> jyuippon = new ArrayList<String>();
        jyuippon.add("Oi-zuki (Jodan)");
        jyuippon.add("Oi-zuki (Chudan)");
        jyuippon.add("Mae-geri (Kekomi)");
        jyuippon.add("Mawashi-geri (Jodan)");
        jyuippon.add("Yoko-geri (Kekomi)");
        jyuippon.add("Ushiro-geri (Chudan)");
        jyuippon.add("Livre (contra-ataque - Livre) (Domínio da distância e defesa e contra-ataque)");

        List<String> jyukumite = new ArrayList<String>();
        jyukumite.add("Livre (Demonstrando técnicas dominadas. Domínio da distância, defesa e contra-ataque) (COM CONTROLE)");

        List<String> kata = new ArrayList<String>();
        kata.add("Sentei Kata");



        listDataChild.put(listDataHeader.get(0), kihon); // Header, Child data
        listDataChild.put(listDataHeader.get(1), jyuippon);
        listDataChild.put(listDataHeader.get(2), jyukumite);
        listDataChild.put(listDataHeader.get(3), kata);
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