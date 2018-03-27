package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    boolean cookie = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void beforecookie(){
        ImageView imagecookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        imagecookie.setImageResource(R.mipmap.beforecookie);

        TextView textcookie = (TextView) findViewById(R.id.status_text_view);
        textcookie.setText("I'm so hungry");

    }

    public void aftercookie(){
        ImageView imagecookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        imagecookie.setImageResource(R.mipmap.aftercookie);

        TextView textcookie = (TextView) findViewById(R.id.status_text_view);
        textcookie.setText("I'm so full");

    }



    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {



        if(cookie) {
            aftercookie();
        }

        else {
            beforecookie();
        }
        cookie = !cookie;

    }
}
