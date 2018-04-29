package halityurttas.com.tr.cloudminingprofitcalculator;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

import halityurttas.com.tr.cloudminingprofitcalculator.entities.DaoMaster;
import halityurttas.com.tr.cloudminingprofitcalculator.entities.DaoSession;

/**
 * Created by halit on 29.04.2018.
 */

public class App extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "profit-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
