package edu.umd.cs.findbugs.ba;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import edu.umd.cs.findbugs.AbstractIntegrationTest;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/408">#408</a>
 * @since 3.1
 */
public class Issue408Test extends AbstractIntegrationTest {

    @Test
    public void test() {
        performAnalysis("../java9/module-info.class");
        assertThat(getBugCollection().getCollection(), is(empty()));
    }

}