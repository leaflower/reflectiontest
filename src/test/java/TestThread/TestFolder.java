package TestThread;

import java.io.File;

/**
 * 创建文件夹，重命名，删除
 */
public class TestFolder {
    public static void main(String[] args) {
//        File folder = new File("hello world/one/two/main");
//        if (folder.mkdirs()){
//            System.out.println("创建成功");
//       }else {
//            System.out.println("创建失败");
//        }

//        folder.renameTo(new File(("hello world/one/two/main")));
//        if (folder.delete()){
//            System.out.println("删除成功");
//        }else {
//            System.out.println("删除失败");
//        }

        File folder = new File("hello world");
        String[] files = folder.list();
        for (String string:files){
            System.out.println(string);
        }
    }
}
