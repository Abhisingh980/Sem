import java.io.*;
class video{
    public static void main(String[] args) throws IOException {
      FileInputStream fin=new FileInputStream("new.mp4"); 
        FileOutputStream fout=new FileOutputStream("new1.mp4");
        int i;
         while((i=fin.read())!='\0'){
            fout.write(i+1);
         }
            fin.close();
    }
}