package com.example.parkinggapp.ui.park;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.parkinggapp.databinding.FragmentParkBinding;

public class ParkFragment extends Fragment {

    private FragmentParkBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ParkViewModel parkViewModel =
                new ViewModelProvider(this).get(ParkViewModel.class);

        binding = FragmentParkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPark;
        parkViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}