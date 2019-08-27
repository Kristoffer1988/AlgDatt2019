package Algdatt;

import static org.junit.jupiter.api.Assertions.*;

class Uke2Test {

    @org.junit.jupiter.api.Test
    void maximum() {
        int[] values = {5,7,9,2,1,11,13,8};

        assertEquals(13,Uke2.maximum(values,0,values.length));
        //assertEquals(11,Uke2.maximum(values,));
    }
}