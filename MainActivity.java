package capstone.jobgrader;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleNameTxt;
    TextView salaryTxt;
    TextView satisfTxt;
    EditText satisf;
    EditText manageDirect;
    EditText manageLeader;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Paul's code
        titleNameTxt = (TextView) findViewById(R.id.titleNameTxt);
        salaryTxt = (TextView) findViewById(R.id.salaryTxt);
        satisfTxt = (TextView) findViewById(R.id.satisfTxt);
        satisf = (EditText) findViewById(R.id.satisf);
        manageDirect = (EditText) findViewById(R.id.manDirect);
        manageLeader = (EditText) findViewById(R.id.manLead);

        Button calcBtn =(Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float sat= Float.parseFloat(satisf.getText().toString());
                float dir= Float.parseFloat(manageDirect.getText().toString());
                float lead= Float.parseFloat(manageLeader.getText().toString());
                float grade= (dir/3+lead/3+sat/3);
                titleNameTxt.setText(Float.toString(grade));
            }
        });
        //End Pauls Code
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
