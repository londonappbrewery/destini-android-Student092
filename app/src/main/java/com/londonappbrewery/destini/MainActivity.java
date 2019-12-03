package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    TextView mStory;
    TextView mButtonTop;
    TextView mButtonBottom;
    // TODO: Steps 4 & 8 - Declare member variables here:
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (TextView) findViewById(R.id.buttonBottom);
        mButtonTop = (TextView) findViewById(R.id.buttonTop);

        if (mStoryIndex == 1) {
            // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mButtonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mStoryIndex == 1) {
                        mStory.setText(R.string.T3_Story);
                        mButtonBottom.setText((R.string.T3_Ans2));
                        mButtonTop.setText(R.string.T3_Ans1);
                        mStoryIndex = 3;

                    } else if (mStoryIndex == 2) {
                        mStory.setText(R.string.T3_Story);
                        mButtonBottom.setText((R.string.T3_Ans2));
                        mButtonTop.setText(R.string.T3_Ans1);
                        mStoryIndex = 3;

                    } else if (mStoryIndex == 3) {
                        mStory.setText(R.string.T5_End);
                        mButtonBottom.setVisibility(View.GONE);
                        mButtonTop.setVisibility(View.GONE);
                        mStoryIndex = 4;

                    }
                }
            });


            // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mButtonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mStoryIndex == 1) {
                        mStory.setText(R.string.T2_Story);
                        mButtonBottom.setText((R.string.T2_Ans2));
                        mButtonTop.setText(R.string.T2_Ans1);
                        mStoryIndex = 2;
                    } else if (mStoryIndex == 2) {
                        mStory.setText(R.string.T4_End);
                        mButtonBottom.setVisibility(View.GONE);
                        mButtonTop.setVisibility(View.GONE);
                        mStoryIndex = 4;

                    } else if (mStoryIndex == 3) {
                        mStory.setText(R.string.T6_End);
                        mButtonBottom.setVisibility(View.GONE);
                        mButtonTop.setVisibility(View.GONE);
                        mStoryIndex = 4;
                    }
                }

            });
        }

    }
}
