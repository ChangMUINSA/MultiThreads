package PACKAGE_NAME.Threaad;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread, 实现多线程同步下载图片
public class TestThread extends Thread{

    private String url; //网络图片地址
    private String name; //保存的文件名

    public TestThread(String url, String name){
        this.url = url;
        this.name = name;
    }
    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url, name);
        System.out.println("下载了文件名为："+name);
    }

    public static void main(String[] args) {
        TestThread t1  = new TestThread("https://www.w3schools.com/react/screenshot_myfirstreact.png","1.jpg");
        TestThread t2 = new TestThread("https://www.w3schools.com/bootstrap/imgdefault.jpg","2.jpg");
        TestThread t3 = new TestThread("https://www.w3schools.com/dsa/img_array_removed_shifting.png","3.jpg");
        t1.start();
        t2.start();
        t3.start();
        /**
         * 下载了文件名为：1.jpg
         * 下载了文件名为：3.jpg
         * 下载了文件名为：2.jpg
         * 同时执行的，每次结果不一定相同
         */
    }
}

//下载器
class WebDownLoader{
    //下载方法
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}

