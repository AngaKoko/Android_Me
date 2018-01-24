package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by ANGA on 1/24/2018.
 */

public class BodyPartFragmentBody extends Fragment {

    public static final String TAG = "BodyPartFragmentBody";

    //private variables to help dynamically change image resource id
    private List<Integer> mImageIds;
    private int mListIndex;

    /**
     * Mandatory empty constructor for for the fragment manager to instantiate the fragment
     */
    public BodyPartFragmentBody(){

    }

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the fragment_body_part_body.xml fragment
        View rootView = inflater.inflate(R.layout.fragment_body_part_body, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view_body);

        //if statement to check if mImageIds is null
        if(mImageIds != null){
            //set Image using mListIndex if Image list is not null
            imageView.setImageResource(AndroidImageAssets.getBodies().get(mListIndex));
        }else{
            //Log message if Image list is null
            Log.v(TAG, "Body image list is null");
        }

        //return the view
        return rootView;
    }

    //public method to set List of ImageIds
    public void setImageIds(List<Integer> imageIds){
        mImageIds = imageIds;
    }

    //public method to set ImageId list index
    public void setListIndex(int listIndex){
        mListIndex = listIndex;
    }
}
