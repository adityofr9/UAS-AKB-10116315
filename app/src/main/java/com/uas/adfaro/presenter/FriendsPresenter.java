/*

Created     : 04/08/2019
Modified    : 16/08/2019
NIM         : 10116315
Nama        : Muhammad Adityo Fathur Rahim
Kelas       : AKB - 7 / IF - 7

*/

package com.uas.adfaro.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;

import com.uas.adfaro.data.model.Friends;
import com.uas.adfaro.data.repo.FriendsRepository;
import com.uas.adfaro.view.FriendsView;

import java.util.List;



public class FriendsPresenter {

    private FriendsRepository repo;
    private FriendsView view;
    private LiveData<List<Friends>> allFriends;

    public FriendsPresenter(Context context, FriendsView view) {
        this.view = view;
        repo = new FriendsRepository(context);
        allFriends = repo.getAllFriends();
    }

    public void setFriendsList(LifecycleOwner owner) {
        allFriends.observe(owner, new Observer<List<Friends>>() {
            @Override
            public void onChanged(@Nullable List<Friends> friends) {
                view.showFriendsList(friends);
            }
        });
    }
}
