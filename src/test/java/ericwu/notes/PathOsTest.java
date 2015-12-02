package ericwu.notes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * Tests that Path behavior can be different on different operating systems.
 */
public class PathOsTest {

    @Test
    public void testGetSpaceAsPathOnWindows() {
        final String msg = "Expected InvalidPathException on Windows.";
        if (SystemUtils.IS_OS_WINDOWS) {
            try {
                getSpaceAsPath();
                fail(msg);
            } catch (InvalidPathException e) {
                assertTrue(msg, true);
            }
        }
    }

    @Test
    public void testGetSpaceAsPathOnLinux() {
        if (SystemUtils.IS_OS_LINUX) {
            getSpaceAsPath();
        }
    }

    private Path getSpaceAsPath() {
        return Paths.get(" ");
    }
}
