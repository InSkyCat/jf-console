package com.atguigu.jf.console.zyt;

public class SingleDcl {

    private static SingleDcl instance;

    private SingleDcl()
    {}
    public static SingleDcl getInstance(){
        if(null== instance){
            synchronized (SingleDcl.class){
                if(instance==null){
                    instance=new SingleDcl();
                }
            }
        }
        return instance;
    }
}
