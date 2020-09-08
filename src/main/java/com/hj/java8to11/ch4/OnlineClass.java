package com.hj.java8to11.ch4;

public class OnlineClass {
    private Integer id;
    private String  title;
    private boolean close;

    public OnlineClass(Integer id, String title, boolean close) {
        this.id = id;
        this.title = title;
        this.close = close;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isClose() {
        return close;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
}
