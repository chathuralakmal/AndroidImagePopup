# Android Image Popup [![](https://jitpack.io/v/chathuralakmal/AndroidImagePopup.svg)](https://jitpack.io/#chathuralakmal/AndroidImagePopup) ![](https://travis-ci.org/chathuralakmal/AndroidImagePopup.svg?branch=dev)

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
           compile 'com.github.chathuralakmal:AndroidImagePopup:1.0.1'
	}



# Implementation

### Create instance of the popup class and thats all !!

    ImagePopup imagePopup = new ImagePopup(this); 
    

### Example

     /** Set popup height, width & background color as you want **/

       final ImagePopup imagePopup = new ImagePopup(this);
        imagePopup.setBackgroundColor(Color.BLACK);
        imagePopup.setWindowWidth(800);
        imagePopup.setWindowHeight(800);

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

# Author
Chathura Lakmal

[Google +](https://plus.google.com/u/0/+ChathuraLakmalBest)

[Web Site](http://ceylonlabs.com)

# Contribute

Contributions are always welcome!
     
# License
The MIT License

Copyright (c) 2017 Chathura Lakmal
