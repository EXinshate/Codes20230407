import java.io.*;

public class App10_1 {
    public static void main(String[] args) {
        char ch;
        int data;
        try( FileInputStream fin = new FileInputStream(FileDescriptor.in);
            FileOutputStream fout = new FileOutputStream("F:/周政/学习资料/JAVA/myfile.txt");)
        {
            System.out.println("请输入一串字符，并以 # 结束");
            while ((ch = (char)fin.read()) != '#')
                fout.write(ch);
    }
        catch (FileNotFoundException e){
            System.out.println("文件没找到！");
        }
        catch (IOException e){}
    try( FileInputStream fin = new FileInputStream("F:/周政/学习资料/JAVA/myfile.txt");
    FileOutputStream fout = new FileOutputStream(FileDescriptor.out);)
        {
            while ((ch = (char) fin.read())!= '#')
                fout.write(ch);
        }
        catch (IOException e) {}
        try( FileInputStream fin = new FileInputStream("F:/周政/学习资料/JAVA/myfile.txt");
        FileOutputStream fout = new FileOutputStream(FileDescriptor.out);)
        {
            while(fin.available() > 0){
                data = fin.read();
                fout.write(data);
            }
        }
        catch (IOException e) { }
    }
}
