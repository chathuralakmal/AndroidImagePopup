# Android Image Popup [![](https://jitpack.io/v/chathuralakmal/AndroidImagePopup.svg)](https://jitpack.io/#chathuralakmal/AndroidImagePopup) [![Droid Controls](https://img.shields.io/badge/Available%20On-Droid%20Controls-blue.svg?style=flat)](http://www.droidcontrols.com/image-views/android-image-popup/) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Android%20Image%20Popup-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5261)

Show image as a popup on a click event or any event. Simply set the image as drawable and thats it!!!. And also you can set width, height & background color as you want.


# Preview
![Demo Preview](preview.gif? "Demo Preview")

# Usage

#### Step 1. Add the JitPack repository to your build file:

    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

#### Step 2. Add the dependency

    dependencies {
           compile 'com.github.chathuralakmal:AndroidImagePopup:1.0.5'
	}



# Implementation

### Create instance of the popup class and thats all !!

    ImagePopup imagePopup = new ImagePopup(this); 
    

### Example

     /** Set popup height, width & background color as you need or just leave default settings **/

       final ImagePopup imagePopup = new ImagePopup(this);
        imagePopup.setBackgroundColor(Color.BLACK);
        imagePopup.setWindowWidth(800);
        imagePopup.setWindowHeight(800);
        imagePopup.setHideCloseIcon(true);
        imagePopup.setImageOnClickClose(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /** Initiate Popup view **/
                imagePopup.initiatePopup(imageView.getDrawable());
            }
        });
        

# Credits
[Stack Overflow](http://stackoverflow.com)

# Contribute

Contributions are always welcome!
     
# License
The MIT License

Copyright (c) 2017 [Chathura Lakmal](https://www.linkedin.com/in/cmac90)
