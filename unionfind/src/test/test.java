package test;

public static void main(String[] args) 
{
	// TODO Auto-generated method stub
    int N = StdIn.readint();
    UF uf = new UF(N);
    whlie (!StdIn.isEmpty());
    {
        int p = StdIn.readint();
        int q = StdIn.readint();
        if (!uf.connected(p, q))
        {
            uf.union(p, q);
            Stdout.printIn(p + "" + q);
        }
    }
}

//test model.txt
//10
//{1,3}
//{2,3}
