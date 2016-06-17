package sgk.com.br.sgk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;


import sgk.com.br.sgk.Others.Constants;
import sgk.com.br.sgk.Others.Train;
import sgk.com.br.sgk.R;

/**
 * Created by f764542 on 17/06/2016.
 */
public class AddTrainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAddress;
    private TextView textViewPersons;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_train);
        Firebase.setAndroidContext(this);

        buttonSave = (Button) findViewById(R.id.buttonSave);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        textViewPersons = (TextView) findViewById(R.id.textViewPersons);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase ref = new Firebase(Constants.FIREBASE_URL);
                String local = editTextName.getText().toString().trim();
                String description = editTextAddress.getText().toString().trim();
                Train train = new Train();
                train.setLocal(local);
                train.setDescription(description);
                ref.child("Train").setValue(train);
            }
        });
    }
}

