package TestSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 3000);
            s.setSoTimeout(10000);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line = br.readLine();
            System.out.println("来自服务器的消息：" + line);
            br.close();
            s.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
