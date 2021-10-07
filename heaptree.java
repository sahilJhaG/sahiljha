class HeapTree{

  int arr[]=new int[100];

  int index=0;

 

  int parent(int position){

   

    else{

      return (position/2)-1;

    }

  }

 

  void insertion(int data){

    arr[index]=data;

    int current=index;

    while(current!=0 && arr[current]>arr[parent(current)]){

      int temp = arr[current];

      arr[current] = arr[parent(current)];

      arr[parent(current)] = temp;

      current=parent(current);

    }

    index++;

  }

  void print(){

    for(int i=0;i<10;i++){

      System.out.println(arr[i]);

    }

  }

}

 

public class Main

{

              public static void main(String[] args) {

                HeapTree obj = new HeapTree();

                obj.insertion(44);

    obj.insertion(32);

    obj.insertion(40);

    obj.insertion(17);

    obj.insertion(20);

    obj.insertion(30);

    obj.insertion(40);

    obj.insertion(10);

    obj.insertion(42);

    obj.print();

              }

}
