package javase.chap06;

import org.junit.Test;


/**
 * Created by Kuexun on 2018/4/25.
 */
public class DataRWTest {

    @Test
    public void testRandomAccessFile()
    {
        DataRW dataRW = new DataRW();
        dataRW.writeByRandomAccessFile();
        dataRW.readByRandomAccessFile();
    }

    @Test
    public void testDataStream()
    {
        DataRW dataRW = new DataRW();
        dataRW.writeByDataOutputStream();
        dataRW.readByDataInputStream();
    }
}