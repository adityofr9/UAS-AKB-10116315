package com.uas.adfaro.view;

import android.widget.EditText;

import com.uas.adfaro.data.model.Friends;



public interface AddEditFriendsView {
    void showData();
    void onFriendAdded();
    void onFriendUpdated(Friends friend);
    void showError(EditText et);
    void showFailed(String msg);
}
