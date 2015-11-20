package ericwu.notes;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * Tests Path behavior different on different operating systems.
 */
public class PathOsTest {

    @Test ( expected = InvalidPathException.class )
    public void testGetSpaceAsPathWindows() {
        if ( SystemUtils.IS_OS_WINDOWS ) {
            Paths.get( " " );
        }
    }

    @Test
    public void testGetSpaceAsPathLinux() {
        if ( SystemUtils.IS_OS_LINUX) {
            Paths.get( " " );
        }
    }
}
