# Android Image Popup

This class was created to use in Android projects.
Shows a DialogFragment with Camera or Gallery options. The user can choose from where provider wants to pick an image.

# Screenshot
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
           
	}

# Samples
 You can take a look at the sample by downloading this repository.


# Implementation

### Step #1 - Create instance of the Popup Class

    ImagePopup imagePopup = new ImagePopup(this); 
    

### Step #2 - Examples

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
        

## Credits
[Stack Overflow](http://stackoverflow.com)
     
# License
Available under MIT.
