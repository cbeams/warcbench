package io.webgraph.warc;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class WarcWriterSpec {

    @Test
    @Ignore
    public void copyEntireWarcFile() throws IOException {
        File oldFile = new File("/Users/cbeams/Work/webgraph/data/commoncrawl/crawl-data/CC-MAIN-2017-13/segments/1490218186353.38/wat/CC-MAIN-20170322212946-00003-ip-10-233-31-227.ec2.internal.warc.wat.gz");
        File newFile = new File("/tmp/00003.warc.gz");

        // 42864 (before parallel)
        // 18797 (after parallel)
        // 68630 (after segmentable)

        try (Warc.Reader reader = new Warc.Reader(oldFile);
             Warc.Writer writer = new Warc.Writer(newFile)) {

            reader.stream().forEach(writer::write);
        }

        //assertThat(newFile).hasSameContentAs(originalFile);
    }
}
