package com.abel;

import com.abel.model.NameBean;

public class Main {


    public static void main(String[] args) {

        StudentApi st = new StudentApi();
        st.getName(new Observer<NameBean>() {
            @Override
            void onSuccecss(NameBean response) {
                System.out.println("response:" + response);

            }
        });
    }
}
