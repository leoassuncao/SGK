package sgk.com.br.sgk.Others;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by f764542 on 08/06/2016.
 */
public class SgkApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}