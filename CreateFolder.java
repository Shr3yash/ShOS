import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File nameVar = new File("Hierarchical/demo");
        if(nameVar.mkdir()){
            System.out.println("Folder created");
        }else{
            System.out.println("Folder/File cannot be created!");
        }
    }
}
