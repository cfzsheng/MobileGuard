package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.mobileguard.R;

public class Setup2Activty extends BaseSetUpActivity {

    @Override
    public void showNext() {
        startActivityAndFinishSelf(Setup3Activty.class);
    }

    @Override
    public void showPre() {
startActivityAndFinishSelf(Setup1Activty.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup2_activty);
        ((RadioButton)findViewById(R.id.rb_second)).setChecked(true);
    }
}
