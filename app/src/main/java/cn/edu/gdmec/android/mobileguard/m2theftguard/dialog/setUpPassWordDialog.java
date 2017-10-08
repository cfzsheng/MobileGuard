package cn.edu.gdmec.android.mobileguard.m2theftguard.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cn.edu.gdmec.android.mobileguard.R;

/**
 * Created by pc on 2017/10/8.
 */

public class setUpPassWordDialog extends Dialog implements View.OnClickListener {
    private TextView mTitleTv;

    public EditText mFirstPWDET;

    public EditText mAffirmET;

    private MyCallBack myCallBack;
    public setUpPassWordDialog(@NonNull Context context) {
        super(context,R.style.dialog_custom);
    }

    private void initView(){
        mTitleTv = (TextView) findViewById(R.id.tv_setuppwd_title);
        mFirstPWDET = (EditText)findViewById(R.id.et_firstpwd);
        mAffirmET = (EditText)findViewById(R.id.et_affirm_password);
        findViewById(R.id.btn_ok).setOnClickListener(this);
        findViewById(R.id.btn_cancel).setOnClickListener(this);
    }

    public void setTitle(String title){
        if (!TextUtils.isEmpty(title)){
            mTitleTv.setText(title);
        }
    }

    public void setCallBack(MyCallBack myCallBack){
        this.myCallBack = myCallBack;
    }
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        setContentView(R.layout.setup_password_dialog);
        initView();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_ok:
            System.out.print("SetupPasswordDialog");
            myCallBack.ok();
            break;
            case R.id.btn_cancel:
                myCallBack.cancel();
                break;
        }
    }
    public interface  MyCallBack{
        void ok();
        void cancel();
    }
}
