package com.xianyu.yixian_client.Model.RPC;

import com.google.gson.annotations.Expose;

public class Error {
    @Expose
    int Code;
    @Expose
    String Message;
    @Expose
    String Data;

    @Override
    public String toString() {
        return "Error{" +
                "Code=" + Code +
                ", Message='" + Message + '\'' +
                ", Data='" + Data + '\'' +
                '}';
    }
}
