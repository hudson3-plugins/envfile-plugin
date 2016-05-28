package hudson.plugins.envfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * This class is responsible to create appropriate InputStream instance
 * according to path
 * 
 * @author Ricardo M. Augusto
 *
 */
public final class InputStreamFactory {

    public static InputStream createInputStream(String path)
            throws IOException {
        InputStream is = null;

        if (path.toLowerCase().startsWith("http")) {
            is = new URL(path).openStream();
        } else {
            is = new FileInputStream(path);
        }

        return is;
    }

}
