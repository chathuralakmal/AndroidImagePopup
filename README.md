# PickImage

This class was created to use in Android projects.

# Porpouse
Shows a DialogFragment with Camera or Gallery options. The user can choose from where provider wants to pick an image.

# Screenshot
![Demo Preview](screenshot/img.gif? "Demo Preview")

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
           compile 'com.github.test:PickImage:v2.0.0'
	}

# Samples
 You can take a look at the sample app [located on this project](/app/).


# Implementation

### Step #1 - Show the dialog.
    PickImageDialog.on(MainActivity.this, new PickSetup());
    
    //or 
    
    PickImageDialog.on(getSupportFragmentManager(), new PickSetup());

### Step #2 - Applying the listeners.

    @Override
        public void onPickResult(PickResult r) {
            if (r.getError() == null) {
                ImageView imageView = ((ImageView) findViewById(R.id.result_image));
    
                //If you want the Bitmap.
                imageView.setImageBitmap(r.getBitmap());
    
                //If you want the Uri.
                //Mandatory to refresh image from Uri.
                imageView.setImageURI(null);
    
                //Setting the real returned image.
                imageView.setImageURI(r.getUri());
            } else {
                //Handle possible errors
                //TODO: do what you have to do with r.getError();
            }
        }
        


# Additionals

### Own click implementations.
 If you want to write your own pick images functionalities, your class have to implements IPickClick like in the example below.
 You may want to take a look at the sample app.
 
     @Override
     public void onGalleryClick() {
         //TODO: Your onw implementation
     }
 
     @Override
     public void onCameraClick() {
         //TODO: Your onw implementation
     }
     
## How to dismiss the dialog.
     PickImageDialog dialog = PickImageDialog.on(...);
     dialog.dismiss();
     
# License
Available under MIT.
