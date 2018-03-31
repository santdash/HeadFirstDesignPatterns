package headfirst.designpatterns.decoratorFileIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dashsan on 3/15/2017.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}
