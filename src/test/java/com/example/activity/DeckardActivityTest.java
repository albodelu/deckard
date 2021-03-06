package com.example.activity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertNotNull(shadowOf(RuntimeEnvironment.application));
        assertTrue(Robolectric.setupActivity(DeckardActivity.class) != null);
    }
}
