package com.example.lsx.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

/**
 * Created by lsx on 2016/7/23.
 */
public class ActivitySecond extends AppCompatActivity{
    private TextView mTextView;
    private Button mSendBackButton;
    private EditText mNameEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String inforContent=getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        mTextView =(TextView) findViewById(R.id.second_activity_Text_view) ;
        mTextView.setText(inforContent);
        Toast.makeText(ActivitySecond.this,inforContent,Toast.LENGTH_SHORT).show();

        mNameEditText=(EditText) findViewById(R.id.second_activity_edit_text);
        mSendBackButton=(Button) findViewById(R.id.second_activity_button);

        mSendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mNameEditText.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("back",name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
