import java.io.File;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        File nameVar = new File("FolderName");
        if(nameVar.mkdir()){
            System.out.println("Folder created");
        }else{
            System.out.println("Folder/File cannot be created!");
        }
    }
}
