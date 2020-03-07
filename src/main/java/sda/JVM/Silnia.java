package sda.JVM;

 class  Silnia  {


    public int silnia(int i)
    {
        if (i == 0)
            return 1;
        else
            return i * silnia(i - 1);
    }

    static public void main(String argv[])
    {

        Silnia s = new Silnia();

        System.out.println(s.silnia(20));
    }
}
