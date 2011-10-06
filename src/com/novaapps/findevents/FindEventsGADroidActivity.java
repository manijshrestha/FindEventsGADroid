//Copyright Novaapps
package com.novaapps.findevents;

import android.os.Bundle;

import com.phonegap.DroidGap;

public class FindEventsGADroidActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://findevents.cloudfoundry.com");
    }
}
