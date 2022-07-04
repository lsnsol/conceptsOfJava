import static java.security.AccessController.doPrivileged;
 
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
 
import sun.security.action.GetPropertyAction;
 
public class FileLockEg {
 
    public static void main(String[] args) throws IOException,
            InterruptedException {
        // create a file in the temp directory
        Path tempDir = Paths.get(doPrivileged(new GetPropertyAction(
                "java.io.tmpdir")));
        File file = new File(tempDir.toAbsolutePath() + File.separator
                + "testLocking.txt");
        if (file.exists())
            file.delete();
        file.createNewFile();
        // now lets try to acquire an exclusive lock on the file
        // get a file channel
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        // get an exclusive lock on this channel
        FileLock lock = fileChannel.lock();
        // write a character and then sleep
        fileChannel
                .write(Charset.defaultCharset().encode(CharBuffer.wrap("a")));
        fileChannel.force(false);
        // hold the lock for 20 secs
        Thread.sleep(20000);
        lock.release();
 
    }
}