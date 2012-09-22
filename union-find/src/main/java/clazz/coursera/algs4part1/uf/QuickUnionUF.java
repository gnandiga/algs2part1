package clazz.coursera.algs4part1.uf;

public class QuickUnionUF implements UF
{


    private int[] id;

    public QuickUnionUF(int N)
    {
        id = new int[N];
        for(int i = 0; i< N; i++)
        {
            id[i] = i;
        }
    }

    private int root(int i)
    {
        while(i != id[i]) i = id[i];
        return i;
    }
    @Override
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q)
    {
        int rootp = root(p);
        int rootq = root(q);

        id[rootp] = rootq;
    }
}
