class Pattern
{

    public void DisplayA()             // Statement 1
    {
        synchronized(this)                                      // Statement 3
        {
            System.out.print("Statred " + "3" + "\n");
        }
    }

    public synchronized void DisplayB()             // Statement 2
    {
        System.out.print("Statred " + "1" + "\n");
    }

    public synchronized void DisplayC()
    {
//        synchronized(this)                                      // Statement 3
//        {
        System.out.print("Statred " + "2" + "\n");
//        }
    }
    public synchronized void DisplayE()
    {
//        synchronized(this)                                      // Statement 4
//        {
        System.out.print("Statred " + "4" + "\n");
//        }
    }
    public synchronized void DisplayF()
    {
//        synchronized(this)                                      // Statement 5
//        {
        System.out.print("Statred " + "5" + "\n");
//        }
    }
    public synchronized void DisplayD()
    {
//        synchronized(this)                                      // Statement 6
//        {
        System.out.print("Statred " + "6" + "\n");
//        }
    }
}

class ThreadA implements Runnable
{
    Pattern P;

    ThreadA(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayA();
    }
}

class ThreadB implements Runnable
{

    Pattern P;

    ThreadB(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayB();
    }
}

class ThreadC implements Runnable
{

    Pattern P;

    ThreadC(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayC();
    }
}

class ThreadE implements Runnable
{
    Pattern P;

    ThreadE(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayE();
    }
}

class ThreadF implements Runnable
{
    Pattern P;

    ThreadF(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayF();
    }
}

class ThreadD implements Runnable
{
    Pattern P;

    ThreadD(Pattern P)
    {
        this.P = P;
    }

    public void run()
    {
        P.DisplayD();
    }
}

class ThreadWithSynchronizationDemo
{
    public static void main(String arg[])
    {

        Pattern P = new Pattern();

        ThreadA A = new ThreadA(P);
        ThreadB B = new ThreadB(P);
        ThreadC C = new ThreadC(P);
        ThreadD D = new ThreadD(P);
        ThreadE E = new ThreadE(P);
        ThreadF F = new ThreadF(P);

        Thread t1 = new Thread(A);
        Thread t2 = new Thread(B);
        Thread t3 = new Thread(C);
        Thread t4 = new Thread(D);
        Thread t5 = new Thread(E);
        Thread t6 = new Thread(F);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}