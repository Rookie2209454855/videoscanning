package com.video.scanning.controller;

import com.video.scanning.entity.MultipartFileParam;
import com.video.scanning.service.StorageService;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
@CrossOrigin("*")
public class DownloadController {

    private Logger logger = LoggerFactory.getLogger(DownloadController.class);

    @Autowired
    private StorageService storageService;



    @RequestMapping(value = "/up/files",method = RequestMethod.POST)
    @ResponseBody
    public void uploadFiles(MultipartFile[] multipartFiles){
        BufferedOutputStream bufferedOutputStream=null;
        try {
            if(multipartFiles.length>0){
                for(MultipartFile multipartFile1:multipartFiles){
                    bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(new File("F:\\")+multipartFile1.getOriginalFilename()));
                    if(!multipartFile1.isEmpty()){
                        int length=0;
                       InputStream inputStream=multipartFile1.getInputStream();
                        byte[] buffer=new byte[2048];
                        while ((length = inputStream.read(buffer)) != -1){
                            bufferedOutputStream.write(buffer);
                        }
                        bufferedOutputStream.flush();
                    }
                }
            }
        }catch (IOException io){
            io.printStackTrace();
        }finally {
            try {
                if(bufferedOutputStream!=null){
                    bufferedOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 上传文件
     *
     * @param param
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity fileUpload(MultipartFileParam param, HttpServletRequest request) {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            logger.info("上传文件start。");
            try {
                // 方法1
                //storageService.uploadFileRandomAccessFile(param);
                // 方法2 这个更快点
                storageService.uploadFileByMappedByteBuffer(param);
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("文件上传失败。{}", param.toString());
            }
            logger.info("上传文件end。");
        }
        return ResponseEntity.ok().body("上传成功。");
    }

}
