package com.project.rns.luml;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by sw407 on 21/07/2016.
 */
public class GuiaFragment extends Fragment{
    View myView;
    private ImageButton button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = inflater.inflate(R.layout.first_layout, container, false);
        button = (ImageButton) myView.findViewById(R.id.caso_uso);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextActivity = new Intent(getActivity(), ScreenSlideActivity.class);
                startActivity(nextActivity);
              //  FragmentManager manager = getFragmentManager();
               // manager.beginTransaction().replace(R.id.content_frame, new ScreenSlidePageFragment()).addToBackStack(null).commit();
            }
        });

        return myView;

    }
}
