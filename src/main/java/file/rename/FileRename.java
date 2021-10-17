package file.rename;

import java.io.*;

public class FileRename {
    public static void main(final String[] args) {
            RenameProcess process = new RenameProcess();
            ResultReader reader = new ResultReader();
        try {
            process.rename();
            reader.print(process.getInput());
            reader.print(process.getError());
        } catch (IOException e) { }
        System.out.println("Goodbye");
    }
}
