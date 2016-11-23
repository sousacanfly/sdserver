/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha_6;
import java.io.*;
import java.net.*;
/**
 *
 * @author Windows 10
 */
public class Ficha_6 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(9999);
        Socket cs = null;
        cs = ss.accept(); 
        
        PrintWriter out;
        out = new PrintWriter(cs.getOutputStream(),true);
        BufferedReader in = new BufferedReader( new InputStreamReader(cs.getInputStream()));
        
        String current;
        
        while((current = in.readLine())!=null){
            //assert current != null
            //Apenas é null quando a conecao desliga, parecido com EOF
            out.println(current);
            System.out.println("Echo: "+current);
        }
        
        in.close();
        out.close();
        cs.close();
        ss.close();    
    }
    
}

