package com.dhankher.easybubble;

import android.content.Context;
import android.view.WindowManager;
import android.widget.FrameLayout;

import static com.dhankher.easybubble.BubbleService.screenWidth_percent;
import static com.dhankher.easybubble.BubbleService.screenheight_percent;

/**
 * Created by hippo on 31/1/17.
 */

public class GenerateViews extends Adapter {
    public static final String TAG = GenerateViews.class.getCanonicalName();
    BubbleService bubbleService;

    public GenerateViews(Context context) {
        super(context);
    }

    @Override
    public void onBindView(FrameLayout layout, WindowManager.LayoutParams layoutParams, int position, int pointerX, int pointerY) {
        switch (position) {
            case 0:
                layoutParams.x = 2 * (screenWidth_percent);
                layoutParams.y=pointerY - (18 * screenheight_percent);
                bubbleService.windowManager.addView(layout, layoutParams);
                break;

            case 1:
                layoutParams.x = 23 * (screenWidth_percent);
                layoutParams.y=pointerY - (13 * screenheight_percent);
                bubbleService.windowManager.addView(layout, layoutParams);
                break;
            case 2:
                layoutParams.x = 30 * (screenWidth_percent);
                layoutParams.y=pointerY;
                bubbleService.windowManager.addView(layout, layoutParams);
                break;
            case 3:
                layoutParams.x = 23 * (screenWidth_percent);
                layoutParams.y=pointerY + (13 * screenheight_percent);
                bubbleService.windowManager.addView(layout, layoutParams);
                break;


        }

    }

    @Override
    public void onUnbind(FrameLayout frameLayout) {

    }
}
