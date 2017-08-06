package com.fexcon.imgpopup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        final ImagePopup imagePopup = new ImagePopup(this);
        //imagePopup.setBackgroundColor(Color.BLACK);
        imagePopup.setWindowHeight(800);
        imagePopup.setWindowWidth(800);
        imagePopup.setHideCloseIcon(true);
        imagePopup.setImageOnClickClose(true);

        final String photoUrl = "http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg";
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this).load(photoUrl).into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /** Initiate Popup view **/
                // to use it when the same photo are in the image
//                imagePopup.initiatePopup(imageView.getDrawable());

                // to download the image from url if you want different resolution or different image
                imagePopup.initiatePopupWithPicasso(photoUrl);
                //imagePopup.setBackgroundColor(R.color.colorAccent);
            }
        });
    }


}
