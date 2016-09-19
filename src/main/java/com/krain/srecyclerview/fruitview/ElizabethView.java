package com.krain.srecyclerview.fruitview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.krain.srecyclerview.R;

/**
 * Created by dafuShao on 2016/9/9 0009.
 *
 */
public class ElizabethView extends FrameLayout {

    private ImageView imageView;
    private  AnimationDrawable animationDrawable;

    public ElizabethView(Context context) {
        super(context);
        initview(context);
    }
    public ElizabethView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initview(context);
    }
    public ElizabethView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initview(context);
    }
    private void initview(Context context){
        View view= LayoutInflater.from(context).inflate(R.layout.elizabeth_item,null);
        imageView=(ImageView) view.findViewById(R.id.elizabeth_im);
        animationDrawable= (AnimationDrawable) imageView.getBackground();
        addView(view);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    //开始动画
    public  void startAnim(){
        animationDrawable.start();
    }
    //停止动画
    public   void  stopAnim(){
        animationDrawable.stop();
    }
}
