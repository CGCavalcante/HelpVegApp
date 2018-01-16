package mpoo.bsi.ufrpe.helpvegapp.infra;

import android.app.Application;
import android.content.Context;

/**
 * Created by Junior on 16/01/2018.
 */

public class MyApp extends Application {

    private static Context mContext;


    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext() {
        return mContext;
    }

}
