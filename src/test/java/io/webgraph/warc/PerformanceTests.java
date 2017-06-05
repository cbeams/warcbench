package io.webgraph.warc;

import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class PerformanceTests {

    @Test
    public void test() {
        assertThat(new File(getClass().getResource("/foo.warc").getFile())).exists();
        assertThat(new File(getClass().getResource("/foo.warc.gz").getFile())).exists();
        assertThat(new File(getClass().getResource("/bogus.warc").getFile())).exists(); // should fail
    }
}
