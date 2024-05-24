package Activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileOutputStream;

public class Activity14 {

    public static void main(String[] args) {
        try{
        File file = new File("C:/FstTrainning/newfle.text");
        boolean fstatus  = file.createNewFile();

        File fileRef = FileUtils.getFile(file);
        File dest  = new File("C:\\Users\\NileshMane\\IdeaProjects\\M0-FstTranning\\src\\main\\resources");
        FileUtils.copyFileToDirectory(fileRef,dest);
            String text = "Hello World!";
            File outFile = FileUtils.getFile(dest, "newFile.txt");
            FileOutputStream out = new FileOutputStream(outFile);
            out.write(text.getBytes());
            out.close();
            System.out.println(FileUtils.readFileToString(outFile,"UTF8"));
    }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
