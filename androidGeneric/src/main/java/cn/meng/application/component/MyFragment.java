package cn.meng.application.component;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.meng.application.R;

public class MyFragment extends Fragment {
    /*
    This function is belong to fragment only
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    /*
    Call to do initial creation of fragment
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    /*
    This function is belong to fragment only

    The system calls this api when it is time for fragment to draw it's ui first time.
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_my, container, false);
    }


    /*
    This function is belong to fragment only

    tells the fragment that its activity has completed its own Activity#OnCreate
    */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    /*
    makes the fragment visible to the user.
     */
    @Override
    public void onStart() {
        super.onStart();
    }

    /**
     * makes the fragment begin interacting with the user.
     */
    @Override
    public void onResume() {
        super.onResume();
    }


    /*
    fragment is no longer interacting with user
     */
    @Override
    public void onPause() {
        super.onPause();
    }

    /*
    fragment is no longer visible to the user
     */
    @Override
    public void onStop() {
        super.onStop();
    }

    /* the function is fragment only
    to clean up resource associated with the view
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    /*
    to do final cleanup of the fragment's state
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /* the function is fragment only
    called immediately prior to fragment no longer being associated with it's activity
     */
    @Override
    public void onDetach() {
        super.onDetach();
    }


}
