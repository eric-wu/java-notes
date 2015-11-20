package ericwu.notes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * Tests Path behavior different on different operating systems.
 */
public class PathOsTest {

    @Test
    public void testGetSpaceAsPathWindows() {
        if ( SystemUtils.IS_OS_WINDOWS ) {
            try {
                Paths.get( " " );
                fail();
            } catch ( InvalidPathException e ) {
                assertTrue( "Expected exception", true );
            }
        }
    }

    @Test
    public void testGetSpaceAsPathLinux() {
        if ( SystemUtils.IS_OS_LINUX ) {
            Paths.get( " " );
        }
    }
}
