package clazz.coursera.algs4part1.uf;

public class WeightedQuickUnionUF implements UF
{
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionUF(int N)
    {
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i< N; i++)
        {
            id[i] = i;
            sz[i] = 1;
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
        int i = root(p);
        int j = root(q);

        if(sz[i]  < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
        }else
        {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public int[] getId()
    {
        return id;
    }
}
