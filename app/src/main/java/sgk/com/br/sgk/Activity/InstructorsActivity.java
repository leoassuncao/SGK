package sgk.com.br.sgk.Activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.Toast;

import sgk.com.br.sgk.Adapter.InstructorAdapter;
import sgk.com.br.sgk.Provider.InstructorProvider;
import sgk.com.br.sgk.R;


/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class InstructorsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private View mRootView;
    private Activity myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.loadInstructors();
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
            finish();
        } else if (id == R.id.nav_where_train) {
            Intent i = new Intent(getApplicationContext(), WhereTrainActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_belt_exam) {
            Intent i = new Intent(getApplicationContext(), BeltExamActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_great_trains) {
            Intent i = new Intent(getApplicationContext(), GreatTrainsActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_send) {
            Intent i = new Intent(getApplicationContext(), ContactActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_facebook) {
        Toast.makeText(this, "Redirecionando... ", Toast.LENGTH_SHORT).show();
        openFacebook();
        } else if (id == R.id.nav_instagram) {
        Toast.makeText(this, "Redirecionando...", Toast.LENGTH_SHORT).show();
        openInstagram();
    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadInstructors() {
        RecyclerView instructor = (RecyclerView) findViewById(R.id.instructor_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.myActivity);
        instructor.setLayoutManager(linearLayoutManager);
        InstructorAdapter adapter = new InstructorAdapter(InstructorProvider.provideInstructorsList(), this.myActivity);
        instructor.setAdapter(adapter);
    }

    public void openFacebook()  {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=" + "https://www.facebook.com/ShingetsuKan-Karate-Do-Dojo-185814311516817/?fref=ts"));
            startActivity(intent);
        }catch(Exception e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/appetizerandroid")));
        }
    }

    public void openInstagram() {
        Uri uri = Uri.parse("http://instagram.com/_u/shingetsukan");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/shingetsukan")));
        }
    }
}

