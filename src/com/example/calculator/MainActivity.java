package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
	Button b1,b2,b3,b4;
	Button e;
	Button d;
	Button c;
	TextView t;
	String cache;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.result);
        //找到那些按钮对应的ID
        n0=(Button) findViewById(R.id.btn_0);
        n1=(Button) findViewById(R.id.btn_1);
        n2=(Button) findViewById(R.id.btn_2);
        n3=(Button) findViewById(R.id.btn_3);
        n4=(Button) findViewById(R.id.btn_4);
        n5=(Button) findViewById(R.id.btn_5);
        n6=(Button) findViewById(R.id.btn_6);
        n7=(Button) findViewById(R.id.btn_7);
        n8=(Button) findViewById(R.id.btn_8);
        n9=(Button) findViewById(R.id.btn_9);
        //加减乘除
        b1=(Button) findViewById(R.id.btn_add);
        b2=(Button) findViewById(R.id.btn_sub);
        b3=(Button) findViewById(R.id.btn_mul);
        b4=(Button) findViewById(R.id.btn_div);
        //等号，清除，小数点
        e=(Button) findViewById(R.id.btn_eq);
        c=(Button) findViewById(R.id.btn_clear);
        d=(Button) findViewById(R.id.btn_dot);
        
        n0.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				t.append(n0.getText());
			}
		});
        
        n1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				t.append(n1.getText());
			}
		});
        
        n2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n2.getText());
			}
		});
        
        n3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n3.getText());
			}
		});
        
        n4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n4.getText());
			}
		});
        
        n5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n5.getText());
			}
		});
        
        n6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n6.getText());
			}
		});
        
        n7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n7.getText());
			}
		});
        
        n8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n8.getText());
			}
		});
        
        n9.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				t.append(n9.getText());
			}
		});
        
        b1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				cache = t.getText().toString();
				t.clearComposingText();
			}
		});
        
        b2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				cache = t.getText().toString();
				t.clearComposingText();
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
