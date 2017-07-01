import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileOutputStream in = null;
	int number;
      try {
         in = new FileOutputStream("input.txt");
	for(String i=0;i<10;i++)
	{
	number=Integer.parseInt(i);
	in.write(i);
	number=0;
	}
}
finally {
         if (in != null) {
            in.close();
         }
      }
   }
}