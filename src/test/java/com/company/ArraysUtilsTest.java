package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArraysUtilsTest {

    private ArraysUtils arraysUtils;

    @Before
    public void setUp(){
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void binarySearch_elementExist(){
        int[] array = {1,3,5,7,9,10};
        int n = 7;
        int result = arraysUtils().binarySearch(array,n);
        Assert.assertEquals(3,result);

    }

    @Test
    public void binarySearch_elementNotExist(){
        int[] array = {1,3,5,7,9,10};
        int n = 2;
        int result = new ArraysUtils().binarySearch(array,n);
        Assert.assertEquals(-2,result);

    }

    @Test
    public void bubbleSort(){
        int[] array = {1,5,7,3,9,10};
        new ArraysUtils().bubbleSort(array);
        arraysUtils.bubbleSort(array);
        Assert.assertArrayEquals(new int[]{1,3,5,7,9,10},array);

    }

}
