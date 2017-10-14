package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.mobileguard.R;

public class Setup3Activty extends BaseSetUpActivity {

    @Override
    public void showNext() {
        startActivityAndFinishSelf(Setup4Activty.class);
    }

    @Override
    public void showPre() {
        startActivityAndFinishSelf(Setup2Activty.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup3_activty);
        ((RadioButton)findViewById(R.id.rb_third)).setChecked(true);
    }
}
