package com.spring.pojo;

/**
 * @author When all else is lost the future still remains.
 * @date 2020/10/14 - 11:20
 **/
public class Hello {
    private String str;

    public Hello() {
    }

    public Hello(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
