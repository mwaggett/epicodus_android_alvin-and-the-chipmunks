package com.epicodus.alvinandthechipmunks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Band mBand;

    private ImageButton mAlvinButton;
    private ImageButton mSimonButton;
    private ImageButton mTheodoreButton;
    private ImageView mDiscographyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBand = new Band("Alvin and the Chipmunks");
        mBand.addMember(new Member("Alvin", R.drawable.alvin));
        mBand.addMember(new Member("Simon", R.drawable.simon));
        mBand.addMember(new Member("Theodore", R.drawable.theodore));
        mBand.addAlbum("Urban Chipmunk");
        mBand.addAlbum("A Chipmunk Christmas");
        mBand.addAlbum("Chipmunks in Low Places");
        mBand.addAlbum("Alvin and the Chipmunks: Original Motion Picture Soundtrack");

        mAlvinButton = (ImageButton) findViewById(R.id.alvinButton);
        mSimonButton = (ImageButton) findViewById(R.id.simonButton);
        mTheodoreButton = (ImageButton) findViewById(R.id.theodoreButton);
        mDiscographyButton = (ImageView) findViewById(R.id.bandImage);

        mAlvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                intent.putExtra("band", mBand);
                intent.putExtra("member", 0);
                startActivity(intent);
            }
        });

        mSimonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                intent.putExtra("band", mBand);
                intent.putExtra("member", 1);
                startActivity(intent);
            }
        });

        mTheodoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberActivity.class);
                intent.putExtra("band", mBand);
                intent.putExtra("member", 2);
                startActivity(intent);
            }
        });

        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiscographyActivity.class);
                intent.putExtra("band", mBand);
                startActivity(intent);
            }
        });
    }
}
