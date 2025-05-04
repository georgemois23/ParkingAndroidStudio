package com.example.parkinggapp.ui.wallet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WalletViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WalletViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Προσθέστε χρήματα στο πορτοφόλι σας");
    }

    public LiveData<String> getText() {
        return mText;
    }
}