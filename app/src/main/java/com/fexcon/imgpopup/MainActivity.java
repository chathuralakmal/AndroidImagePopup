package com.fexcon.imgpopup;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Set Image Height, Width & Background Color as you want **/

        Picasso.setSingletonInstance(new Picasso.Builder(this).build());

        Log.e("Width",""+Resources.getSystem().getDisplayMetrics().widthPixels);
        final ImagePopup imagePopup = new ImagePopup(this);
        imagePopup.setBackgroundColor(Color.BLACK);
        imagePopup.setFullScreen(false);
        imagePopup.setHideCloseIcon(true);
        imagePopup.setImageOnClickClose(true);


        final String photoUrl = "http://pngriver.com/wp-content/uploads/2017/12/download-Android-Technology-logo-PNG-transparent-images-transparent-backgrounds-PNGRIVER-COM-Android-Mobile-App-Development-Company-In-India-brillmindztech-39975001-800-799.png";
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.get().load(photoUrl).into(imageView);
        // to use it when the same photo are in the image
        // imagePopup.initiatePopup(imageView.getDrawable());

        // to download the image from url if you want different resolution or different image
        imagePopup.initiatePopupWithPicasso(photoUrl);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /** Initiate Popup view **/
                imagePopup.viewPopup();
            }
        });
    }


}
