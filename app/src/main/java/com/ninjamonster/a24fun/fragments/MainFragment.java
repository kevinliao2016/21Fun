package com.ninjamonster.a24fun.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ninjamonster.a24fun.R;

/**
 * Created by kevin2016 on 6/15/17.
 */

public class MainFragment extends Fragment{


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_main, null);
        TextView tip = (TextView) view.findViewById(R.id.content_text_view);
        tip.setText(savedInstanceState.getString("title"));
        return view;
    }


}
