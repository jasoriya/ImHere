package fr.launcher.ImHere.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import fr.launcher.ImHere.BuildConfig;
import fr.launcher.ImHere.DataHandler;
import fr.launcher.ImHere.ImHereApplication;
import fr.launcher.ImHere.MainActivity;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
    DataHandler mockDataHandler;

    @Before
    public void setUp() {
        mockDataHandler = mock(DataHandler.class);
        ImHereApplication.setDataHandler(mockDataHandler);
    }

    @Test
    public void testSomething() throws Exception {
        // TODO-add more tests...
        assertTrue(Robolectric.setupActivity(MainActivity.class) != null);
    }
}
