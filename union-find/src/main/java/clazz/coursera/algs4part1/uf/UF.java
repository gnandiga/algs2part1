package clazz.coursera.algs4part1.uf;

public interface UF
{

    boolean connected(int p, int q);

    void union(int p, int q);
}
