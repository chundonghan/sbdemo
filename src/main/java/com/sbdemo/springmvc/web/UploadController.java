package com.sbdemo.springmvc.web;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController
{
    @RequestMapping(value = "/uploadFile", method = { RequestMethod.POST })
    public String uploadFile(MultipartFile file) throws Exception
    {
        try
        {
            FileUtils.writeByteArrayToFile(new File("e:/upload/" + file.getOriginalFilename()), file.getBytes());
            return "succ";
        }
        catch (Exception e)
        {

            return "error";
        }
    }
}
