package tamukmobileapp.exercise8;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View v){
        Fragment fr = null;
        if(v == findViewById(R.id.button1)){
            fr = new FragmentOne();
        }
        else if (v == findViewById(R.id.button2)){
            fr = new FragmentTwo();
        }
        else if(v == findViewById(R.id.button3)) {
            fr = new Fragmentthree();
        }
            else if(v == findViewById(R.id.button4)){
                fr = new Fragmentfour();
            }




        getFragmentManager().beginTransaction().replace(R.id.frameLayout,fr).commit();
    }
}
