package clazz.coursera.algs4part1.uf;

import junit.framework.Assert;
import org.junit.Test;

public class QuickFindUFTest
{

    @Test
    public void q1()
    {
        QuickFindUF uut = new QuickFindUF(10);

        uut.union(7, 8);
        Assert.assertTrue(uut.connected(7, 8));
        uut.union(1, 6);
        Assert.assertTrue(uut.connected(1, 6));
        uut.union(2, 6);
        Assert.assertTrue(uut.connected(2, 6));
        uut.union(4, 7);
        Assert.assertTrue(uut.connected(4, 7));
        uut.union(3, 9);
        Assert.assertTrue(uut.connected(3, 9));
        uut.union(4, 3);
        Assert.assertTrue(uut.connected(4, 3));

        int[] id = uut.getId();

        for(int i=0; i< id.length; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i=0; i< id.length; i++)
        {
            System.out.print(id[i] + " ");
        }

    }

    @Test
    public void quickUnionFindTest()
    {
        QuickUnionUF uut = new QuickUnionUF(10);

        uut.union(6, 7);
        Assert.assertTrue(uut.connected(6, 7));
        uut.union(0, 9);
        Assert.assertTrue(uut.connected(0, 9));
        uut.union(1, 4);
        Assert.assertTrue(uut.connected(1, 4));
        uut.union(0, 8);
        Assert.assertTrue(uut.connected(0, 8));
        uut.union(3, 9);
        Assert.assertTrue(uut.connected(3, 9));
        uut.union(2, 8);
        Assert.assertTrue(uut.connected(2, 8));
        uut.union(6, 1);
        Assert.assertTrue(uut.connected(6, 1));
        uut.union(6, 2);
        Assert.assertTrue(uut.connected(6, 2));
        uut.union(0, 5);
        Assert.assertTrue(uut.connected(0, 5));
    }

    @Test
    public void q2()
    {
        WeightedQuickUnionUF uut = new WeightedQuickUnionUF(10);

        uut.union(6, 7);
        Assert.assertTrue(uut.connected(6, 7));
        uut.union(0, 9);
        Assert.assertTrue(uut.connected(0, 9));
        uut.union(1, 4);
        Assert.assertTrue(uut.connected(1, 4));
        uut.union(0, 8);
        Assert.assertTrue(uut.connected(0, 8));
        uut.union(3, 9);
        Assert.assertTrue(uut.connected(3, 9));
        uut.union(2, 8);
        Assert.assertTrue(uut.connected(2, 8));
        uut.union(6, 1);
        Assert.assertTrue(uut.connected(6, 1));
        uut.union(6, 2);
        Assert.assertTrue(uut.connected(6, 2));
        uut.union(0, 5);
        Assert.assertTrue(uut.connected(0, 5));

        int[] id = uut.getId();
        for(int i=0; i< id.length; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for(int i=0; i< id.length; i++)
        {
            System.out.print(id[i] + " ");
        }

    }
}
