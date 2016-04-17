package fragments;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kf.qf.com.fingpingfragments.R;

/**
 * Created by 84903 on 2016/4/17.
 */
public class MRecofragment extends BaseFragment {
    private Button mButtonone,mButtontwo,mButtontre ;
    private TextView mTextViewone ,mTextViewtwo,mTextViewtre;
    @Override
    protected int contantViewGetId() {
        return R.layout.fragment_recont_item;

    }

    @Override
    protected void init(View view) {
        super.init(view);
        mButtonone  = (Button) view.findViewById(R.id.bt_dis_one);
        mButtontwo  = (Button) view.findViewById(R.id.bt_dis_two);
        mButtontre  = (Button) view.findViewById(R.id.bt_dis_three);

        mTextViewone = (TextView) view.findViewById(R.id.tv_dis_one);
        mTextViewtwo = (TextView) view.findViewById(R.id.tv_dis_two);
        mTextViewtre = (TextView) view.findViewById(R.id.tv_dis_three);
        initClick();

    }
    private void initClick() {
        mButtonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewone.setText("您点击了发现一按钮");
            }
        });
        mButtontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewtwo.setText("您点击了发现二按钮");
            }
        }); mButtontre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewtre.setText("您点击了发现三按钮");
            }
        });
    }
}
