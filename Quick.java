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
  public static void main(String[] fsdf) {
    int[] da = {8,4,6,5,2,7,3};
    Quick.partition(da, 2, 6);
  }
}
