package TestThread;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件，重命名文件，删除文件
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("Test.java");
        if (file.exists()) {
            System.out.println(file.isFile());
//            file.renameTo(new File("Test1.java"));
            file.delete();
        } else {
            System.out.println("文件不存在");

            try {
                file.createNewFile();
                System.out.println("文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("文件创建失败");
            }
        }
    }
}
