package com.sm.friendlyfriendreminder;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.ziggeo.androidsdk.VideoPlayer;
import com.ziggeo.androidsdk.Ziggeo;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/

        Ziggeo.initialize("37feba3f1f057be2ca8e2e7426ad6936");

        getFragmentManager().
                beginTransaction().
                add(R.id.container,
                        VideoPlayer.newInstance("989766a9b983c3c6215ea5508d38f417"),
                        "VideoPlayer"
                ).commit();

        
    }


    /**
     * A placeholder fragment containing a simple view.

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }     */
}
