package sgk.com.br.sgk.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import sgk.com.br.sgk.Activity.BeltExamActivity;
import sgk.com.br.sgk.Activity.InstructorsActivity;
import sgk.com.br.sgk.Activity.MainActivity;
import sgk.com.br.sgk.Adapter.InstructorAdapter;
import sgk.com.br.sgk.Adapter.WhereTrainAdapter;
import sgk.com.br.sgk.Provider.InstructorProvider;
import sgk.com.br.sgk.Provider.LocationProvider;
import sgk.com.br.sgk.R;


/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class WhereTrainActivity extends AppCompatActivity   implements NavigationView.OnNavigationItemSelectedListener {

    private View mRootView;
    private Activity myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_train);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        loadLocation();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_instrutors) {
            Intent i = new Intent(getApplicationContext(), InstructorsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_belt_exam) {
            Intent i = new Intent(getApplicationContext(), BeltExamActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_send) {
            Intent i = new Intent(getApplicationContext(), ContactActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void loadLocation() {
        RecyclerView location = (RecyclerView) findViewById(R.id.location_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.myActivity);
        location.setLayoutManager(linearLayoutManager);
        WhereTrainAdapter adapter = new WhereTrainAdapter(LocationProvider.provideLocationList(), this.myActivity);
        location.setAdapter(adapter);
    }

}

