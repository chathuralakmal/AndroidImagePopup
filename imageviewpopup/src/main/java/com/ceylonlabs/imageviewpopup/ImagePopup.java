package com.ceylonlabs.imageviewpopup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;

/**
 * Created by Chathura Lakmal on 1/7/17.
 */

public class ImagePopup extends ImageView {
        private Context context;
        private PopupWindow popupWindow;

        private int windowHeight = 800;
        private int windowWidth = 800;

        private int backgroundColor = Color.parseColor("#FFFFFF");


        public ImagePopup(Context context) {
            super(context);
            this.context = context;
        }

        public ImagePopup(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public int getWindowHeight() {
            return windowHeight;
        }

        public void setWindowHeight(int windowHeight) {
            this.windowHeight = windowHeight;
        }

        public int getWindowWidth() {
            return windowWidth;
        }

        public void setWindowWidth(int windowWidth) {
            this.windowWidth = windowWidth;
        }

        public int getBackgroundColor() {
            return backgroundColor;
        }

        @Override
        public void setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        public void initiatePopup(Drawable drawable){
            try{
                LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

                View layout = inflater.inflate(R.layout.popup,(ViewGroup)findViewById(R.id.popup));
                layout.setBackgroundColor(getBackgroundColor());

                ImageView imageView = (ImageView)layout.findViewById(R.id.imageView);
                imageView.setImageDrawable(drawable);

                popupWindow = new PopupWindow(layout, getWindowWidth(), getWindowHeight(), true);

                popupWindow.showAtLocation(layout, Gravity.CENTER, 0,0);

                /** Background dim part **/
                View container = (View) popupWindow.getContentView().getParent();
                WindowManager wm = (WindowManager) context.getSystemService(context.WINDOW_SERVICE);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) container.getLayoutParams();
                layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
                layoutParams.dimAmount = 0.3f;
                wm.updateViewLayout(container, layoutParams);


            }catch (Exception e){
                e.printStackTrace();
            }
        }

}
