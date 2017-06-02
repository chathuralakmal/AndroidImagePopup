package com.fexcon.imgpopup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ceylonlabs.imageviewpopup.ImagePopup;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Set Image Height, Width & Background Color as you want **/
       final ImagePopup imagePopup = new ImagePopup(this);
        //imagePopup.setBackgroundColor(Color.BLACK);
        imagePopup.setWindowHeight(200);
        imagePopup.setWindowWidth(200);
        imagePopup.setHideCloseIcon(true);
        imagePopup.setImageOnClickClose(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /** Initiate Popup view **/
                imagePopup.initiatePopup(imageView.getDrawable());
                //imagePopup.setBackgroundColor(R.color.colorAccent);
            }
        });
    }


}
