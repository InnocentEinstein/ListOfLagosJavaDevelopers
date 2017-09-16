package com.innocent.listoflagosjavadevelopers.api;

import com.innocent.listoflagosjavadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Einstein on 9/16/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
