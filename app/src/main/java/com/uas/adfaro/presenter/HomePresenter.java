/*

Created     : 11/08/2019
Modified    : 16/08/2019
NIM         : 10116315
Nama        : Muhammad Adityo Fathur Rahim
Kelas       : AKB - 7 / IF - 7

*/

package com.uas.adfaro.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;

import com.uas.adfaro.data.model.User;
import com.uas.adfaro.data.repo.UserRepository;
import com.uas.adfaro.preference.UserPreference;
import com.uas.adfaro.view.HomeView;



public class HomePresenter {

    private HomeView view;
    private UserRepository repo;
    private UserPreference prefs;

    public HomePresenter(Context context, HomeView view) {
        this.view = view;
        repo = new UserRepository(context);
        prefs = new UserPreference(context);
    }

    public void getUserData(LifecycleOwner owner) {
        String username = prefs.userLogin();
        String password = prefs.passwordLogin();

        repo.selectUser(username, password).observe(owner, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                view.showUser(user);
            }
        });
    }

    public void signOut() {
        prefs.setIsLogin(null, null);
        view.onSignOut();
    }
}
