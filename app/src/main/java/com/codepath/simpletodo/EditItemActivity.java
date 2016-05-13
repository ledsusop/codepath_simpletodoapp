package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class EditItemActivity extends AppCompatActivity {

    EditText mtEditText;
    long itemId;
    int itemIndex;
    String itemText;
    int code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        mtEditText = (EditText) findViewById(R.id.mtEditText);

        itemText = getIntent().getStringExtra("itemText");
        itemId = getIntent().getLongExtra("itemId",0);
        itemIndex = getIntent().getIntExtra("itemIndex",0);
        code = getIntent().getIntExtra("code", 0);

        mtEditText.setText(itemText);
    }

    public void onEditItem(View view) {
        itemText = mtEditText.getText().toString();
        Intent data = new Intent();
        data.putExtra("itemText", itemText);
        data.putExtra("itemIndex", itemIndex);
        data.putExtra("itemId", itemId);
        data.putExtra("code", 200);
        setResult(RESULT_OK, data);
        finish();
    }
}
