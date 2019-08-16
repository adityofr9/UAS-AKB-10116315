package com.uas.adfaro.view;

import com.uas.adfaro.data.model.User;



public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
