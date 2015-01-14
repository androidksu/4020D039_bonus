package com.example.a001;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
	  Button button1;
	TextView textView1 , textView2, textView3, textView4;
	EditText editText1,editText2,editText3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
		textView3 = (TextView) findViewById(R.id.textView3);
		textView4 = (TextView) findViewById(R.id.textView4);
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
		button1 = (Button) findViewById(R.id.button1);
	}

	public void onClick(View v) {
		String a = editText1.getText().toString();
		String b = editText2.getText().toString();
		String c = editText3.getText().toString();
		double height = Double.parseDouble(editText2.getText().toString()) / 100;
		double width = Double.parseDouble(editText3.getText().toString());
		double BMI = width / (height * height);
		textView4.setText("名字"+a+"\n"+"身高"+b+"\n"+"體重"+c+"\n"+"BMI"+BMI+"");
		
	}

}
