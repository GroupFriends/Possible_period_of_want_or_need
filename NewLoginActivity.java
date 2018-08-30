package mall.zhiyuan.com.Base;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import mall.zhiyuan.com.BaseMvp.Base.BaseActivity;
import mall.zhiyuan.com.share.R;

/**
 * Created by Administrator on 2018/8/30.
 * user: Administrator
 * date: 2018/8/30
 * time; 18:23
 * name: mall.zhiyuan.com.Base
 * <p>
 * ----------Dragon be here!----------/
 * 　　 へ　　　　　／|
 * 　　/＼7　　∠＿/
 * 　 /　│　　 ／　／
 * 　│　Z ＿,＜　／　　 /`ヽ
 * 　│　　　　　ヽ　　 /　　〉
 * 　 Y　　　　　`　 /　　/
 * 　ｲ●　､　●　　⊂⊃〈　　/
 * 　()　 へ　　　　|　＼〈
 * 　　>ｰ ､_　 ィ　 │ ／／
 * 　 / へ　　 /　ﾉ＜| ＼＼
 * 　 ヽ_ﾉ　　(_／　 │／／
 * 　　7　　　　　　　|／
 * 　　＞―r￣￣`ｰ―＿
 * ━━━━━━━━━━━皮卡出没,BUG退散━━━━━━━━━━━━━━
 */

public class NewLoginActivity extends AppCompatActivity {
    CardView card_login;
    CardView card_register;
    TextView tv_login;
    TextView tv_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutlogin);
        initView();
    }
    public void initView() {
        card_login = findViewById(R.id.card_login);
        card_register = findViewById(R.id.card_register);
        tv_login=findViewById(R.id.tv_login);
        tv_register=findViewById(R.id.tv_register);
        card_login.bringToFront();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(card_register, "alpha", 0.8f);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(card_register, "translationY", -210f);
        objectAnimator.setDuration(1);
        objectAnimator1.setDuration(1);
        objectAnimator.start();
        objectAnimator1.start();
        card_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation(card_register,card_login);
                tv_login.setTextColor(Color.BLACK);
                tv_register.setTextColor(ContextCompat.getColor(NewLoginActivity.this, R.color.colorAccent));
            }
        });

        card_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation(card_login,card_register);
                tv_register.setTextColor(Color.BLACK);
                tv_login.setTextColor(ContextCompat.getColor(NewLoginActivity.this, R.color.colorAccent));
            }
        });
    }

    private void animation(View card_register,View card_login) {
        card_register.bringToFront();
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(card_register, "scaleX", 1f);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(card_register, "scaleY", 1f);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(card_register, "alpha", 1f);
        ObjectAnimator objectAnimator7 = ObjectAnimator.ofFloat(card_register, "translationY", 0f);
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(card_login, "scaleX", 0.9f);
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(card_login, "scaleY", 0.9f);
        ObjectAnimator objectAnimator6 = ObjectAnimator.ofFloat(card_login, "alpha", 0.8f);
        ObjectAnimator objectAnimator8 = ObjectAnimator.ofFloat(card_login, "translationY", -210f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(300);
        set.play(objectAnimator1).with(objectAnimator2).with(objectAnimator3).with(objectAnimator4)
                .with(objectAnimator5).with(objectAnimator6)
                .with(objectAnimator7).with(objectAnimator8);
        set.start();
    }
}
