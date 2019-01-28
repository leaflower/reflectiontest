package TestSocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000);
            while (true){
                Socket s = ss.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.print("你好，我是服务器！");
                ps.close();
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
