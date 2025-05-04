package com.example.parkinggapp.ui.park;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ParkViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ParkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Πραγματοποιήστε κράτηση θέσης πάρκινγκ για το αυτοκίνητό σας");
    }

    public LiveData<String> getText() {
        return mText;
    }
}