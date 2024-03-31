package com.example.simplecount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CountViewModel extends ViewModel {

    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public CountViewModel(){
        count.setValue(0); //초기값 설정
    }

    LiveData<Integer> getCount(){
        return count;
    }
    void plus(){
        count.setValue(count.getValue() + 1);
    }

    void minus(){
        count.setValue(count.getValue() - 1);
    }
    void reset(){
        count.setValue(0);
    }
}
