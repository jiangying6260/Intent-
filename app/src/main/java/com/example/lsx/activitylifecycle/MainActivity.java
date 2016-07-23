package com.example.lsx.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String BOOK_NAME_OF_CATEGORY_PHYSICAL="bookNameOfCategoryphysical";
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreat:");
        mButton=(Button) findViewById(R.id.activity_main_button);
        final EditText  editText=(EditText) findViewById(R.id.activity_main_edit_text);

        mButton.setOnClickListener(new View.OnClickListener() {
         @Override
        public void onClick(View v) {
        Log.d(TAG,"onClick:");
        Intent intent=new Intent(MainActivity.this,ActivitySecond.class);
        intent.putExtra(BOOK_NAME_OF_CATEGORY_PHYSICAL,editText.getText().toString());
        startActivityForResult(intent,0);
    }
});
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String name=data.getStringExtra("back");
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }
}
