import java.util.*;

class mystack {

    int []a;
    int i,n,max;

    static Scanner sc=new Scanner(System.in);

        mystack(){
            n=-1;
            max=10;
			a=new int [max];
        }
        void push (){


            if(n==max-1){
            System.out.print("stack overflow :");
            }
            else {
				n++;
                System.out.print("enter element :");
                a[n]=sc.nextInt();
            }
        }
        void pop (){
            if(n==-1){
                System.out.print("stack underflow :");
            }
            else{
                System.out.print("pop element is :"+a[n]);
                n--;
            }
        }

        void peek(){
            if(n==-1){
                System.out.print("stack underflow :");
            }
            else{
                System.out.print("peek element is :"+a[n]);
            }
        }
        void travesel(){
            if(n==-1){
                System.out.print("stack overflow :");
            }
            else{
                System.out.print("stack element are :");
                for(i=n;i>=0;i--){
                    System.out.print("\n \t \t"+a[i]);
                }
            }
        }

        public static void main(String s[]){
            mystack stack= new mystack();

            int choice ;
                    while(true){
                        System.out.print("\n1.push");
                        System.out.print("\n2.pop");
                        System.out.print("\n3.peek");
                        System.out.print("\n4.travesel");
                        System.out.print("\n5.exit");
                        System.out.print("\nenter your choice :");


                        choice = sc.nextInt();

                        switch (choice){
                            case 1:
                                stack.push();
                                break;

                            case 2:
                                stack.pop();
                                break;

                            case 3:
                                stack.push();
                                break;

                            case 4:
                                stack.travesel();
                        break;

                            case 5:
                                System.exit(0);
                                break;
                        }
                    }


        }


}