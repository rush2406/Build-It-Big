package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import org.junit.Test;

/**
 * Created by rusha on 7/8/2017.
 */

public class InstrumentedTest extends AndroidTestCase {

    @Test
    public void NonEmptyTest() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();

        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}
