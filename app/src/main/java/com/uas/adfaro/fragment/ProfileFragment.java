/*

Created     : 11/08/2019
Modified    : 16/08/2019
NIM         : 10116315
Nama        : Muhammad Adityo Fathur Rahim
Kelas       : AKB - 7 / IF - 7

*/

package com.uas.adfaro.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uas.adfaro.R;



public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
