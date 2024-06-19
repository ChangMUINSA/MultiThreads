package PACKAGE_NAME.Runnable;

import PACKAGE_NAME.Threaad.TestThread;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestRunnable implements Runnable{
    String url;
    String name;

    public TestRunnable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url,name);
        System.out.println("下载了文件名为："+name);
    }

    public static void main(String[] args) {
        TestThread t1  = new TestThread("https://www.w3schools.com/react/screenshot_myfirstreact.png","1.jpg");
        TestThread t2 = new TestThread("https://www.w3schools.com/bootstrap/imgdefault.jpg","2.jpg");
        TestThread t3 = new TestThread("https://www.w3schools.com/dsa/img_array_removed_shifting.png","3.jpg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        /**
         * 下载了文件名为：1.jpg
         * 下载了文件名为：3.jpg
         * 下载了文件名为：2.jpg
         */
    }
}
class WebDownLoader{
    public void downLoader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }

    }
}