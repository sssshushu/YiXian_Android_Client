package com.xianyu.yixian_client.PersonalInformation;

import androidx.lifecycle.ViewModel;

import com.xianyu.yixian_client.Model.Repository.Repository;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

public class PersonalInformationViewModel extends ViewModel {

    public Repository repository;
    @Inject
    public PersonalInformationViewModel(Repository repository){
        this.repository = repository;
    }

}
