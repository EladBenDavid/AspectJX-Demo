package com.hujiang.library.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends Activity {
    private static final String TAG = MainActivity2.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickListener(R.id.aop_ability, "aop_ability");
        setOnClickListener(R.id.aop_activity, "aop_activity");
        setOnClickListener(R.id.aop_fragment, "aop_ability");
        setOnClickListener(R.id.aop_kotlin, "aop_ability");
        setOnClickListener(R.id.aop_normal_class, "aop_normal_class");

    }

    private void setOnClickListener(int id, final String message){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, message);


            }
        });
    }
}
