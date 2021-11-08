import java.io.File;
public class FolderReader{
    public static void main(String[] args) {
        String path = "/home/safe/VS Code Workspace/k";
        FolderReader reader = new FolderReader(path);
    }
    public FolderReader(String path) {
        File file = new File(path);
        display(path,0);
    }
    public void display(String Path,int indent) {
        File f = new File(Path);
        File[] files = f.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                String INDENT = "";
                for (int j = 0; j < indent; j++) {
                    INDENT += "   ";
                }
                System.out.print(INDENT);
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    display(file.getAbsolutePath(),indent + 1);
                }
            }
        }
    }
}