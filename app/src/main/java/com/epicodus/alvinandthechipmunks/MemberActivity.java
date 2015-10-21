package com.epicodus.alvinandthechipmunks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberActivity extends AppCompatActivity {

    private Band mBand;
    private Member mCurrentMember;

    private TextView mMemberName;
    private ImageView mMemberImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        Intent i = getIntent();

        mBand = (Band) i.getSerializableExtra("band");
        int memberIndex = i.getExtras().getInt("member");
        mCurrentMember = mBand.getMembers().get(memberIndex);

        mMemberName = (TextView) findViewById(R.id.memberName);
        mMemberImage = (ImageView) findViewById(R.id.memberImage);

        mMemberName.setText(mCurrentMember.getName());
        mMemberImage.setImageResource(mCurrentMember.getImage());
    }
}
