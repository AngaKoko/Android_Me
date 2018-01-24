package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by ANGA on 1/24/2018.
 */

public class BodyPartFragmentLeg extends Fragment {

    public static final String TAG = "BodyPartFragmentLeg";

    //variables to hold List id's and list index of AndroidImage
    private List<Integer> mImageIds;
    private int mListIndex;

    //Mandatory empty constructor for the fragment manager to instantiate the fragment
    public BodyPartFragmentLeg(){}

    /**
     * inflates the fragment layout file and set the resources for the image ot display
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflates the legFragment
        View rootView = inflater.inflate(R.layout.fragment_body_part_leg, container, false);

        //Gets reference to the ImageView
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view_leg);

        //if statement to check if Image List is empty
        if(mImageIds != null){
            //sets imageView resource if list is not empty
            imageView.setImageResource(AndroidImageAssets.getLegs().get(mListIndex));
        }else{
            //log message if ImageList is empty
            Log.v(TAG, "Image list is null");
        }

        //Return rootView
        return rootView;
    }

    //Public method to set list of image id's
    public void setImageIds(List<Integer> imageIds){
        mImageIds = imageIds;
    }

    //public method to set ImageList index
    public void setListIndex(int listIndex){
        mListIndex = listIndex;
    }
}
