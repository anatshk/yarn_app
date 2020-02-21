package com.android.yarn_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// The first fragment we see when opening app, sits in MainActivity

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}

// TODO: create separate fragments for all layouts?