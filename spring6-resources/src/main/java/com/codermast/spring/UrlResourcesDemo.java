package com.codermast.spring;

import org.springframework.core.io.UrlResource;

public class UrlResourcesDemo {
    public static void loadAndReadUrlResource(String path){
        // 创建一个 Resource 对象
        UrlResource url = null;
        try {
            url = new UrlResource(path);
            // 获取资源名
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            // 获取资源描述
            System.out.println(url.getDescription());
            //获取资源内容
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //public static void main(String[] args) {
    //    //访问网络资源
    //    loadAndReadUrlResource("https://www.codermast.com");
    //}

    public static void main(String[] args) {
        //1 访问网络资源
        //loadAndReadUrlResource("http://www.codermast.com");

        //2 访问文件系统资源
        loadAndReadUrlResource("file:codermast.txt");
    }
}
