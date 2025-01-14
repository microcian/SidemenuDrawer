package com.mobiledev.pushmenu.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.mobiledev.pushmenu.MainActivity;
import com.mobiledev.pushmenu.R;


/**
 * Created by Manu on 9/24/2016.
 */
public class FragmentNotification extends Fragment {
    MainActivity mActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_notification, container, false);
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mActivity.updateTitle(getString(R.string.title_messages));
    }
}
