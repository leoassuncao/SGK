package sgk.com.br.sgk.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import sgk.com.br.sgk.Activity.Belts.FirstBlackBeltActivity;
import sgk.com.br.sgk.Activity.Belts.FirstBrownBeltActivity;
import sgk.com.br.sgk.Activity.Belts.GreenBeltActivity;
import sgk.com.br.sgk.Activity.Belts.OrangeBeltActivity;
import sgk.com.br.sgk.Activity.Belts.PurpleBeltActivity;
import sgk.com.br.sgk.Activity.Belts.RedBeltActivity;
import sgk.com.br.sgk.Activity.Belts.SecondBlackBeltActivity;
import sgk.com.br.sgk.Activity.Belts.SecondBrownBeltActivity;
import sgk.com.br.sgk.Activity.Belts.ThirdBrownBeltActivity;
import sgk.com.br.sgk.Activity.Belts.YellowBeltActivity;
import sgk.com.br.sgk.List.BeltExamKyus;
import sgk.com.br.sgk.Adapter.BeltExamKyusAdapter;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class BeltExamActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private List<BeltExamKyus> kyusList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BeltExamKyusAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belt_exam);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        prepareKyuData();

        recyclerView = (RecyclerView) findViewById(R.id.kyu_recycler_view);

        mAdapter = new BeltExamKyusAdapter(kyusList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                BeltExamKyus kyu = kyusList.get(position);

                if (position == 0) {
                    Intent newIntent = new Intent(BeltExamActivity.this, YellowBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 1){
                    Intent newIntent = new Intent(BeltExamActivity.this, RedBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 2){
                    Intent newIntent = new Intent(BeltExamActivity.this, OrangeBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 3) {
                    Intent newIntent = new Intent(BeltExamActivity.this, GreenBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 4) {
                    Intent newIntent = new Intent(BeltExamActivity.this, PurpleBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 5) {
                    Intent newIntent = new Intent(BeltExamActivity.this, ThirdBrownBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 6) {
                    Intent newIntent = new Intent(BeltExamActivity.this, SecondBrownBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 7) {
                    Intent newIntent = new Intent(BeltExamActivity.this, FirstBrownBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 8) {
                    Intent newIntent = new Intent(BeltExamActivity.this, FirstBlackBeltActivity.class);
                    startActivity(newIntent);
                } else if (position == 9) {
                    Intent newIntent = new Intent(BeltExamActivity.this, SecondBlackBeltActivity.class);
                    startActivity(newIntent);
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
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
        } else if (id == R.id.nav_instrutors) {
            Intent i = new Intent(getApplicationContext(), InstructorsActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_send) {
            Intent i = new Intent(getApplicationContext(), ContactActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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

    private void prepareKyuData() {
        BeltExamKyus kyu = new BeltExamKyus(R.string.yellow_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.red_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.orange_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.green_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.purple_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.third_brown_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.second_brown_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.first_brown_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.first_black_belt);
        kyusList.add(kyu);

        kyu = new BeltExamKyus(R.string.second_black_belt);
        kyusList.add(kyu);

    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private BeltExamActivity.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final BeltExamActivity.ClickListener clickListener) {
            this.clickListener = clickListener;
            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && clickListener != null) {
                        clickListener.onLongClick(child, recyclerView.getChildLayoutPosition(child));
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

            View child = rv.findChildViewUnder(e.getX(), e.getY());
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildLayoutPosition(child));
            }
            return false;
        }

        @Override
        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        }

        @Override
        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

        }
    }
}

