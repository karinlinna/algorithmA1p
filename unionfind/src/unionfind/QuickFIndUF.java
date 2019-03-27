package unionfind;
/*Data structure 
Integer id[] of size N
p and q connected when they have same id value 数组的标记符号变成了⭕️里的符号
是否连通是用相同的数字进行表示。
选择把（5，0）的所有位置变成0 */

public class QuickFIndUF 
{
    private  int id[];

    public QuickFindUF(int N)
    {
        id = new int[N];
        for (int i = 0 ; i < N ; i++)
            id[i] = i;
    }
    public boolean connected(int p,int q)
    {
        return id[p] == id[q];
    }//快速查找算法
    public void union(int p,int q)
    {
        int pid = id[p];
        int qid = id[q];
        for(int i = 0 ; i < id.length ; i++)
            if (id[i] == pid) id[i] = qid;
    }
}
/*defect:the union is too expensive */