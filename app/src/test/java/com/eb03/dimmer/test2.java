package com.eb03.dimmer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class test2 {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void putandget() throws Exception {
        FrameProcessor fp = new FrameProcessor();
        byte[] frameArray = {(byte)10,(byte)78};
        byte[] test = fp.toFrame(frameArray);
        for (int i=0;i<test.length;i++){
            String hex = Integer.toString(test[i]);
            //System.out.print("0x"+hex+",");
        }
        System.out.println(Arrays.toString(test));
        ByteRingBuffer bcb =new ByteRingBuffer(25);
        bcb.put(test);
        bcb.put(test);
        System.out.println(bcb.bytesToRead());
        System.out.println((bcb.getAll()));
//[5, 0, 2, 10, 78, -90, 4]





    }
}

