package com.video.scanning;

import conf.Contants;
import org.junit.Test;
import utils.ConverVideoUtils;

public class test {
    Contants contants=new Contants();
    @Test
    public void test(){
        Contants contants=new Contants();
    }


    @Test
    public void run() {
        try {
            contants.setFfmpegpath("D:\\ffmpeg-20170724-03a9e6f-win64-static\\bin\\ffmpeg.exe");
            contants.setImageRealPath("d:\\");
            // 转换并截图
            String filePath = "F:\\move\\744427195.mp4";
            ConverVideoUtils cv = new ConverVideoUtils(filePath);
            /*String targetExtension = ".mp4";
            boolean isDelSourseFile = false;*/
            boolean beginConver = cv.processImg(filePath);
            System.out.println(beginConver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
