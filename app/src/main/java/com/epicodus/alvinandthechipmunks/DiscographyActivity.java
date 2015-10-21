package com.epicodus.alvinandthechipmunks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DiscographyActivity extends AppCompatActivity {

    private TextView mUrbanChipmunkLabel;
    private TextView mChipmunkChristmasLabel;
    private TextView mAlvinAndTheChipmunksSoundtrackLabel;
    private TextView mChipmunksInLowPlacesLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discography);

        mUrbanChipmunkLabel = (TextView) findViewById(R.id.urbanChipmunks);
        mChipmunkChristmasLabel = (TextView) findViewById(R.id.chipmunkChristmas);
        mAlvinAndTheChipmunksSoundtrackLabel = (TextView) findViewById(R.id.movieSoundtrack);
        mChipmunksInLowPlacesLabel = (TextView) findViewById(R.id.chipmunksInLowPlaces);

        mUrbanChipmunkLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Urban_Chipmunk"));
                startActivity(intent);
            }
        });
        mChipmunkChristmasLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Christmas_with_The_Chipmunks"));
                startActivity(intent);
            }
        });
        mAlvinAndTheChipmunksSoundtrackLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://alvin.wikia.com/wiki/Alvin_and_the_Chipmunks:_Original_Motion_Picture_Soundtrack"));
                startActivity(intent);
            }
        });    mChipmunksInLowPlacesLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Chipmunks_in_Low_Places"));
                startActivity(intent);
            }
        });
    }
}
