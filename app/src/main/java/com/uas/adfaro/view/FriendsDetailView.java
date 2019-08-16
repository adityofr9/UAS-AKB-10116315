package com.uas.adfaro.view;

import com.uas.adfaro.data.model.Friends;



public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
