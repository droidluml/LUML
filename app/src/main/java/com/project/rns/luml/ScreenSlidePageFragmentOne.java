package com.project.rns.luml;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sw407 on 13/10/2016.
 */
public class ScreenSlidePageFragmentOne extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragmentOne() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /** A variável mPageNumber começa com o valor 0.
         * A primeira página do View será a Introdução. **/

        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.title_template_step, mPageNumber + 1));

        // Mostra o conteúdo referente a introdução
        ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                getString(R.string.história));

        if (mPageNumber == 1){
            // Set the title view to show the page number.
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getString(R.string.title_template_step_2, mPageNumber + 1));

            // Mostra o conteúdo referente
            ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                    getString(R.string.modelar));

        }else if (mPageNumber == 2){
            // Set the title view to show the page number.
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getString(R.string.title_template_step_3, mPageNumber + 1));

            ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                    getString(R.string.levantar_requisitos));

        }else if (mPageNumber == 3){
            // Set the title view to show the page number.
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getString(R.string.title_template_step_4, mPageNumber + 1));

            ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                    getString(R.string.analisar_requisitos));

        }else if (mPageNumber == 4){
            // Set the title view to show the page number.
            ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                    getString(R.string.title_template_step_5, mPageNumber + 1));

            ((TextView) rootView.findViewById(android.R.id.text2)).setText(
                    getString(R.string.prazo_custo_manter));
        }
        return rootView;
    }
    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}

