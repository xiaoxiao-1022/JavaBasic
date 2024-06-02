package NIO.file;

import com.sun.deploy.util.StringUtils;

import java.io.File;

/**
 * @NAME:FileRecursion
 * @Desc:
 * @author: wupei
 * @date: 2023/8/23
 */
public class FileRecursion {

    public static void main(String[] args) {
                function("E:\\person\\JavaBasic");
    }

    public static void function(String fileDir){
        if (fileDir == null){
            return;
        }
        File[] files = new File(fileDir).listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.println("文件："+file.getName());
            }else if (file.isDirectory()){
                System.out.println("目录："+file.getName());
                function(file.getPath());
            }else {
                System.out.println("文件读取有误");
            }
        }
    }
}
