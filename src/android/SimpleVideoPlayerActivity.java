package com.phonegap.plugins.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Roc Lee on 14-3-27.
 */
public class SimpleVideoPlayerActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(getResources().getIdentifier("simple_video_player","layout",getPackageName()));
        Uri uri =Uri.parse( getIntent().getStringExtra("url"));
        VideoView videoView = (VideoView)this.findViewById(getResources().getIdentifier("video_view","id",getPackageName()));
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
//videoView.start()
        videoView.requestFocus();
        videoView.start();
    }
}