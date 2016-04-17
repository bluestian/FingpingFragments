package kf.qf.com.fingpingfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import fragments.MDisFragment;
import fragments.MRecofragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup mRadioGroup ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();


    }

    private void initview() {
             mRadioGroup = (RadioGroup) findViewById(R.id.btn_rg_ia);
             mRadioGroup.setOnCheckedChangeListener(this);
             mRadioGroup.getChildAt(0).performClick();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
          switch (checkedId){
            case   R.id.btn_recomment:
              getSupportFragmentManager().beginTransaction()
                      .replace(R.id.fg,new MDisFragment()).commit();
              break;
              case R.id.btn_discover:
                  getSupportFragmentManager().beginTransaction()
                          .replace(R.id.fg, new MRecofragment()).commit();
                  break;
              case R.id.btn_shop:
                  break;
              case R.id.btn_toic:
                  break;
              case R.id.btn_wode:
                  break;
          }
    }
}
//nisfi