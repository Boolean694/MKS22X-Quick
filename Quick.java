import java.util.*;
public class Quick {
  public static int partition(int[] dat, int st, int en) {
    Random random = new Random();
    int pvind = random.nextInt(en - st) + st;
    int pv = dat[pvind];
    for(int q = st; q <= en; q++) {
      if(dat[q] >= pv && q < pvind) {
        int tesw = dat[q];
        dat[q] = dat[pvind - 1];
        dat[pvind - 1] = tesw;
        dat[pvind] = tesw;
        dat[pvind - 1] = pv;
        pvind--;
      }
      else if(dat[q] < pv && q > pvind) {
        int tesw = dat[q];
        dat[q] = dat[pvind + 1];
        dat[pvind + 1] = tesw;
        dat[pvind] = tesw;
        dat[pvind + 1] = pv;
        pvind++;
      }
      else {}
    }
    for(int q = 0; q < dat.length; q++) {
      if(dat[q] >= pv && q < pvind) {
        int tesw = dat[q];
        dat[q] = dat[pvind - 1];
        dat[pvind - 1] = tesw;
        dat[pvind] = tesw;
        dat[pvind - 1] = pv;
        pvind--;
      }
      else if(dat[q] < pv && q > pvind) {
        int tesw = dat[q];
        dat[q] = dat[pvind + 1];
        dat[pvind + 1] = tesw;
        dat[pvind] = tesw;
        dat[pvind + 1] = pv;
        pvind++;
      }
      else {}
    }
    return pvind;
  }
  public static int quickselect(int[] dat, int k) {
    quicksort(dat);
    return dat[k - 1];
  }
  public static void quicksort(int[] dat) {
    qsoh(dat, 0, dat.length - 1);
  }
  public static void qsoh(int[] dat, int l, int h) {
    if(l >= h) {return;}
    int pv = partition(dat, l, h);
    System.out.println(l + " " + pv + " " + h);
    qsoh(dat, l, pv - 1);
    qsoh(dat, pv + 1, h);
  }
  public static void insertionSort(int[] a) {
	    if(a.length == 0) {System.out.println("[]");}
	    int plh;
	    if(a.length != 0) {
	       for(int q = 1; q < a.length; q++)  {
	          plh = a[q];
	           int c = q - 1;
			       boolean bool = false;
			if(c >= 0 && plh < a[c]) {bool = true;}
	        while(c >= 0 && plh < a[c]) {
	            a[c + 1] = a[c];
	            c--;
	        }
			if(bool) {
				if(c == 0) {
					if(a[0] <= plh) {a[1] = plh;}
					else {a[1] = a[0]; a[0] = plh;}
				}
				else {a[c + 1] = plh;}
			   }
	     }
	    }
	}
  public static void main(String[] fsdf) {
  System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
  int[]MAX_LIST = {10,500,1000000};
  for(int MAX : MAX_LIST){
    for(int size = 5; size < 200001; size*=2){
      long qtime=0;
      long btime=0;
      //average of 5 sorts.
      for(int trial = 0 ; trial <=5; trial++){
        int []data1 = new int[size];
        int []data2 = new int[size];
        for(int i = 0; i < data1.length; i++){
          data1[i] = (int)(Math.random()*MAX);
          data2[i] = data1[i];
        }
        long t1,t2;
        t1 = System.currentTimeMillis();
        Quick.quicksort(data2);
        t2 = System.currentTimeMillis();
        qtime += t2 - t1;
        t1 = System.currentTimeMillis();
        Arrays.sort(data1);
        t2 = System.currentTimeMillis();
        btime+= t2 - t1;
        if(!Arrays.equals(data1,data2)){
          System.out.println("FAIL TO SORT!");
          System.out.println(Arrays.toString(data1));
          System.out.println(Arrays.toString(data2));
          System.exit(0);
        }
      }
      System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
    }
    System.out.println();
  }
}
  }
