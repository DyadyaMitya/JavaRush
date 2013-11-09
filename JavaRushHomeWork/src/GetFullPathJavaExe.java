import java.io.File;

public class GetFullPathJavaExe
{

    public static void main(String[] args) {
        String javaHome = System.getProperty("java.home");
        File f = new File(javaHome);
        f = new File(f, "bin");
        f = new File(f, "java.exe");
        System.out.println(f);


    }



}