package com.codermast.spring;

import org.springframework.core.io.Resource;

public class ResourceBean {

    private Resource res;

    public void setRes(Resource res) {
        this.res = res;
    }
    public Resource getRes() {
        return res;
    }

    public void parse(){
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
    }
}