//package com.example.placementactivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.*;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//
//    ImageSwitcher imageSwitcher;
//    Button btnNextImage, btnSubmit;
//    EditText nameInput;
//    Switch placementSwitch;
//    RatingBar ratingBar;
//    String[] images = {"@drawable/image1", "@drawable/image2", "@drawable/image3"};
//    int currentIndex = 0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Initialize Views
//        imageSwitcher = findViewById(R.id.imageSwitcher);
//        btnNextImage = findViewById(R.id.btnNextImage);
//        btnSubmit = findViewById(R.id.btnSubmit);
//        nameInput = findViewById(R.id.nameInput);
//        placementSwitch = findViewById(R.id.placementSwitch);
//        ratingBar = findViewById(R.id.ratingBar);
//
//        // Set Factory for ImageSwitcher
//        imageSwitcher.setFactory(() -> new ImageView(getApplicationContext()));
//
//        // Handle Next Image Button Click
//        btnNextImage.setOnClickListener(v -> {
//            currentIndex = (currentIndex + 1) % images.length;
//            int imageId = getResources().getIdentifier(images[currentIndex], "drawable", getPackageName());
//            imageSwitcher.setImageResource(imageId);
//        });
//
//        // Handle Submit Button Click (Explicit Intent to SecondActivity)
//        btnSubmit.setOnClickListener(v -> {
//            String name = nameInput.getText().toString();
//            boolean isPlaced = placementSwitch.isChecked();
//            float rating = ratingBar.getRating();
//
//            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            intent.putExtra("name", name);
//            intent.putExtra("isPlaced", isPlaced);
//            intent.putExtra("rating", rating);
//            startActivity(intent);
//        });
//    }
//}
