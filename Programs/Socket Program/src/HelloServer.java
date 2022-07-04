
import java.net.*;
import java.io.*;

public class HelloServer extends Thread
{
   private ServerSocket server_obj;
   private int req_num;
   
   public HelloServer(int port) throws IOException
   {
     //Create ServerSocket and bind to port
      server_obj = new ServerSocket(port);
      req_num = 0;
      //waits for 65000 milliseconds to receive request from client
      //If no request is received from client within 65000, SocketTimeoutException is thrown
      server_obj.setSoTimeout(65000);
   }

   public void run()
   {
    for(;;) //infinite for loop
    {
    try
    {
       System.out.println("Server: ..Waiting for client request on port number " +
       server_obj.getLocalPort() );
       Socket server = server_obj.accept();
       System.out.println("Server: Connecting to client with IP addr "
             + server.getRemoteSocketAddress());
       DataInputStream in =
             new DataInputStream(server.getInputStream());
       System.out.println(in.readUTF());
       req_num++;
       DataOutputStream out =
            new DataOutputStream(server.getOutputStream());
       out.writeUTF("[From Server] This message is from server "
         + server.getLocalSocketAddress() + " Put anything hereeeeeeeeeee");
       System.out.println("--------------Reg no."+req_num+" served--------------");
       server.close();
    }
    catch(SocketTimeoutException s)
    {
       System.out.println("Server: SocketTimeoutException occurred");
       s.printStackTrace();
       break;
    }
    catch(Exception ep)
    {
       System.out.println("Server: Exception occurred");
       ep.printStackTrace();
       break; 
    }
    }
   }
   public static void main(String [] args)
   {
       //port number on which server is listening
       //clients need to send request to this port number
      int port_number = 6066; 
      try
      {
         Thread t = new HelloServer(port_number);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
