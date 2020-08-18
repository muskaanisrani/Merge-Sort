class Main {

  public static void mergearray(int a[],int low,int mid, int high) {
    int mergedarray[]=new int[a.length];
    int i=low;
    int j=mid+1;
    int n=low;

    while(i<=mid && j<=high) {
      if (a[i]<a[j]) {
        mergedarray[n]=a[i];
        i++;
      } else {
        mergedarray[n]=a[j];
        j++;
      }
      n++;
    }
 
    while(j<=high) {
      mergedarray[n]=a[j];
      n++;
      j++;
    }
     
      while(i<=mid) {
      mergedarray[n]=a[i];
      n++;
      i++;
    }
     
      for (int x=low;x<=high;x++) {
      a[x]=mergedarray[x];
    }
  }

  public static void mergesort(int arr[],int low,int high) {

    if (low<high) {
      int mid=(low+high)/2;
      mergesort(arr,low,mid);
      mergesort(arr,mid+1,high);
      mergearray(arr,low,mid,high);
    }
  }

  public static void main(String[] args) {
    int arrayone[]={9,6,3,2,1};
    mergesort(arrayone,0,4);
    for (int i=0;i<arrayone.length;i++) {
      System.out.print(arrayone[i]+",");
    }
  }
}
