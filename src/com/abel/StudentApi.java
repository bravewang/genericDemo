package com.abel;

import com.abel.model.MyTypeToken;

import java.lang.reflect.Type;

public class StudentApi {

    public <T> void getName(Observer<T> p) {

        Type type = MyTypeToken.getSuperclassTypeParameter(p.getClass());
        System.out.println("getName:" + type);

        DataApi api = new DataApi();
        api.setCallback(type, Response.class, new DataListener<Response<T>>() {
            @Override
            public void onNext(Response<T> data) {
                p.onSuccecss(data.result);
            }
        });

    }
}
