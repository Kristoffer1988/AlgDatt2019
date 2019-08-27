package Algdatt;

public class Ukesoppgaver {

    public static void main(String[] args) {




        System.out.println("Hei Algdatt!");

        int[] a = {56,4};
        a=min_maks(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        try {
            System.out.println(fakultet(0));
            System.out.println(fakultet(5));
            System.out.println(fakultet(10));
            System.out.println(fakultet(-1));
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }

        int[] b = {};

        //System.out.println(maks(b));

        int[] c = {1,2,3,4,5,6,7,8,9};

        System.out.println(maks(c));

        int[] d = {1,2,3,4,5,6};

        System.out.println(maks(d));


        int[] e = {1,2,3};

        System.out.println(maks(e));

        int[] f = {3,9,1,1};

        System.out.println(f[maks(f)]);



    }

    static int[] min_maks(int[] a){
        int[] b = new int[2];
        if(a[0]<a[1]){
            b[0]=a[0];
            b[1]=a[1];
        }
        else{
            b[0]=a[1];
            b[1]=a[0];
        }
        return b;
    }

    static int fakultet(int tall){
        int sum=tall;
      for(int i=tall-1;i>0;i--){
          sum=sum*i;
      }
      if(tall<0){
          throw new IllegalArgumentException("Ikke lov med negative tall");
      }
      if(tall==0){
          return 1;
      }
      else{
          return sum;
      }


    }

    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
}
