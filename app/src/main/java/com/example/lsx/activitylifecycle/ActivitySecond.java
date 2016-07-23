package com.example.lsx.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/23.
 */
public class ActivitySecond extends AppCompatActivity{
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inforContent=getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        textView=(TextView) findViewById(R.id.second_activity_Text_view) ;
        textView.setText(inforContent);
        Toast.makeText(ActivitySecond.this,inforContent,Toast.LENGTH_SHORT).show();
    }
}
