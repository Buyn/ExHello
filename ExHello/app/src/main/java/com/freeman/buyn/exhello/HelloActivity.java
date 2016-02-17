package com.freeman.buyn.exhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    private int counterHello = 0;
    //text labels from view
    private TextView counterHelloLabel;
    private TextView textSayLogLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        System.out.println("HelloActivity.onCreate");
        counterHelloLabel = (TextView)findViewById(R.id.helloCounter);
        textSayLogLabel = (TextView)findViewById(R.id.sayTextView);
    }

    /**
     * Handle press "Saybye" button
     * add goodbye text to "saylogLabel"
     * @param view
     */
    public void handleSayBye(View view){
        System.out.println("click saybye");
        textSayLogLabel.append("\n Goodbye World");
    }
    /**
     * Handle press "Hello" button
     * add Hello text to "saylogLabel" and increase counter label
     * @param view
     */
    public void  handleSayHello(View view){
        textSayLogLabel.append("\n Hello World");
        counterHelloLabel.setText(Integer.toString(++counterHello));
        System.out.println("click sayhello");
    }
}
