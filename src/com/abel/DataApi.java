package com.abel;

import com.abel.model.MyTypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class DataApi {

    public <T> void setCallback(Type beanType,Class responseClass,DataListener<T> callback) {
        Type t = MyTypeToken.getSuperclassTypeParameter(callback.getClass());
        System.out.println("DataApi->getName:" + t);

        Type type = new ParameterizedTypeImpl(new Type[]{beanType},null,responseClass);

        Gson gson = new Gson();
        String d = "{\"code\":0,\"errmsg\":\"\",\"result\":{\"name\":\"abel\"}}";
        T data = (T) gson.fromJson(d, type);
        callback.onNext(data);
    }
}
