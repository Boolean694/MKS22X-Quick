import java.util.*;
public class Quick {
  public static int partition(int[] dat, int st, int en) {
    Random random = new Random();
    int pvind = random.nextInt(en - st) + st;
    int pv = dat[pvind];
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
    return 1;
  }
  public static void quicksort(int[] dat) {
    qsoh(dat, 0, dat.length - 1);
  }
  public static void qsoh(int[] dat, int l, int h) {
    if(l >= h) {return;}
    int pv = partition(dat, l, h);
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
    int[] da = {8,4,6,5,2,7,3,10,1,0,-1,9,12,11,-2,5};
    Quick.quicksort(da);
    for(int q = 0; q < da.length; q++) {
      System.out.print(da[q] + " ");
    }
  }
}
