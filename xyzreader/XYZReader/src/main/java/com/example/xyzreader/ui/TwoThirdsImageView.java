package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Greg on 02-09-2016.
 */
public class TwoThirdsImageView extends ImageView {
    public TwoThirdsImageView(Context context) {
        super(context);

    }

    public TwoThirdsImageView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    public TwoThirdsImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure (int widthSpec, int heightSpec) {
        int threeTwoHeight = View.MeasureSpec.getSize(widthSpec)*2/3;
        int threeTwoHeightSpec = View.MeasureSpec.makeMeasureSpec(threeTwoHeight, View.MeasureSpec.EXACTLY);

        super.onMeasure(widthSpec, threeTwoHeightSpec);

    }
}
