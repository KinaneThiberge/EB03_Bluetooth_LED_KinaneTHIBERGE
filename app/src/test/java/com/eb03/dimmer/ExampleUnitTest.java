package com.eb03.dimmer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    ByteRingBuffer bcb =new ByteRingBuffer(25);
    @Test
    public void putandget() throws Exception {
        for (int i=0;i<10;i++){
            bcb.put((byte)i);
            //System.out.println(bcb);
        }
        byte b;
        byte[] by=new byte[9];
        for (int i=0;i<=8;i++){
            by[i]=(byte)i;
        }
        bcb.put(by);

        /*System.out.println(bcb);
        for (int i=0;i<15;i++){
            b=bcb.get();
        }


        System.out.println(bcb);
        bcb.put(by);


        System.out.println(bcb);
        byte[] byarray=bcb.getAll();
        System.out.println(Arrays.toString(byarray));

*/
        FrameProcessor mframe = new FrameProcessor();
        byte[] test={(byte)0x0A,(byte)(0.5*100)};
        System.out.println(Arrays.toString(test));
        bcb.put(mframe.toFrame(test));

        System.out.println(Arrays.toString(bcb.getAll()));


        /*System.out.println(by);
        //byte[] byarray=bcb.getAll();
        //byte[] byarray=bcb.getAll();
        System.out.println(bcb);
        System.out.println(bcb.getAll());
        System.out.println(bcb);
        bcb.put((byte)8);
        System.out.println(bcb);
        bcb.get();
        System.out.println(bcb);*/





    }
}

