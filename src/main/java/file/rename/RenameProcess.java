package file.rename;

import java.io.File;
import java.io.IOException;

public class RenameProcess {
    public Process process;

    public void rename() throws IOException {
        process = Runtime.getRuntime()
                .exec(new String[]{"cmd", "/c start ..\\src\\main\\resources\\rename.bat"},
                        null, new File("C:\\Users\\wryme\\Repos\\TP\\TP_filerename\\dummy"));
    }

    public void rename(final String directory) throws IOException {
        process = Runtime.getRuntime()
                .exec(new String[]{"cmd", "/c start ..\\src\\main\\resources\\rename.bat"},
                        null, new File(directory));
    }

    public java.io.InputStream getInput() {
        return process.getInputStream();
    }
    public java.io.InputStream getError() {
        return process.getErrorStream();
    }
}
