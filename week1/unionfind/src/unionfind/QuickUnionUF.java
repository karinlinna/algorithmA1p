package unionfind;

/*data structure 数组的每一项包含他在树中的父节点，根节点则指向自己
Find 找到两个点（p q）是否具有相同的父节点 
Union 把p的根节点放在q的根节点下
demo：union（4，3） 3是根节点
deface : tree is too tall find is too expensive*/

/*improvement1:weigh
keep track of each tree and make the small root under the large root 
算法效率：
为什么任意节点x的深度最多是以二为底N的对数呢

improvement2: path compression
将树完全展平，让所遍历的节点的父节点全变成祖先节点，实际操作是让遍历的节点变成爷爷节点，其实二者效率差不多*/


public class QuickUnionUF
{
    private int[] id;
    
    public QuickUnionUF(int N)
    {
        id = new int[N];
        for (int i = 0 ; i < N ; i++) id[i] = i;
    }
    
    private int root (int i)
    {
        while ( i != id[i]) 
        {
            /*improvement2让父节点变成爷爷节点: id[i] = id[id[i]] */
            i = id[i];
        }
        return i;
    }// chase parent roots

    public boolean connected(int p , int q)
    {
        return root(p) == root(q);
    }

    public void union (int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
        /* Im1:
        if (i == j) return ;
        if (sz[i] < sz[j])
        {id[i] = j;    sz[j] += sz[i];}
        else
        {id[j] = i;    sz[i] += sz[j];}*/
    }
}