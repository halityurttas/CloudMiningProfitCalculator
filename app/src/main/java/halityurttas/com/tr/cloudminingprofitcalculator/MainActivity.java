package halityurttas.com.tr.cloudminingprofitcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.greenrobot.greendao.query.Query;

import halityurttas.com.tr.cloudminingprofitcalculator.entities.Contracts;
import halityurttas.com.tr.cloudminingprofitcalculator.entities.ContractsDao;

public class MainActivity extends AppCompatActivity {

    private ContractsDao contractsDao;
    private Query<Contracts> contractsQuery;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
