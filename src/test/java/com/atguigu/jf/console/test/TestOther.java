package com.atguigu.jf.console.test;

import com.atguigu.jf.console.zyt.TypeDemo;
import org.junit.Test;

public class TestOther {

    @Test public void test1(){

        try {
            TypeDemo.wildcardType();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
