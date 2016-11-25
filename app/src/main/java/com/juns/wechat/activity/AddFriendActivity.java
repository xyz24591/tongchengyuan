package com.juns.wechat.activity;


import android.os.Bundle;
import android.view.View;

import com.juns.wechat.R;
import com.style.base.BaseToolbarActivity;

/**
 * Created by 王宗文 on 2016/6/20.
 */
public class AddFriendActivity extends BaseToolbarActivity {

    @Override
    public void initData() {
        setListener();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mLayoutResID = R.layout.activity_add_friend;
        super.onCreate(savedInstanceState);

    }

    private void setListener(){
        findViewById(R.id.rl_search_container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skip(SearchActivity.class);
            }
        });
    }
}
