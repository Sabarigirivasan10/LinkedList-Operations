import java.util.*;
class LinkedList
{
     
   Node head;
   static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static void create(LinkedList list)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your value to create the node:");
        int x=sc.nextInt();
        Node temp=list.head;
        Node n=new Node(x);
        if(temp==null)
        {
            list.head=n;
           list.head.next=null;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }   
    }
    public static LinkedList traverse(LinkedList list)
    {
        Node temp=list.head;
        if(temp==null)
        {
            System.out.println("The List is Empty");
            return list;
        }
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    
       return list;
    }
    public static LinkedList insert_at_b(LinkedList list)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your value to insert in the Beginning:");
        int x=sc.nextInt();
        Node temp=list.head;
        Node n=new Node(x);
        if(temp==null)
        {
            list.head=n;
        }
        else
        {
            n.next=list.head;
            list.head=n;
        }
        return list;
    }
    public static LinkedList insert_at_e(LinkedList list)
    {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter your value to insert in the End:");
        int x=sc.nextInt();
        Node temp=list.head;
        Node n=new Node(x);
        if(temp==null)
        {
            list.head=n;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
        return list;

    }
    public static LinkedList insert_at_m(LinkedList list)
    {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter your value to insert in the Middle:");
        int x=sc.nextInt();
        System.out.print("Enter your value to Position:");
        int x1=sc.nextInt();
        Node n=new Node(x);
        Node temp=list.head;
        if(temp==null)
        {
            list.head=n;
        }
        else
        {
            int i=2;
            while(i<x1)
            {
                temp=temp.next;
                i++;
            }
            n.next=temp.next;
            temp.next=n;
            
        }
        return list;
    }
    public static LinkedList delete_at_b(LinkedList list)
    {
        Node temp=list.head;
        if(temp==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            list.head=temp.next;
            temp=null;
        }
        return list;
    }
     public static LinkedList delete_at_e(LinkedList list)
     {
        Node prev=null;
        Node temp=list.head;
        if(temp==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
        return list;
     }
      public static LinkedList delete_at_m(LinkedList list)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Element to be Delete:");
        int x=sc.nextInt();
        Node prev=null;
        Node temp=list.head;
        if(temp==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            while(temp.data!=x)
            {
                prev=temp;
                temp=temp.next;
                if(temp==null)
                {
                    System.out.println("Element is not found in the List");
                    return list;
                }
            }
            prev.next=temp.next;
            temp.next=null; 
        }
        return list;
     }
      public static LinkedList search (LinkedList list)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Element to be search:");
        int x=sc.nextInt();
        int i=1;

        Node temp=list.head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                System.out.println(x+" is found in Position "+i);
                return list;
            }
            temp=temp.next;
            i++;
        }
        if(temp==null)
        {
            System.out.println(x+" is not found in the List");
        }
        return list;

     }
     public static LinkedList find (LinkedList list)
     {
        Node temp=list.head;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(temp!=null)
        {
            if(temp.data>max)
            {
                max=temp.data;
            }
            if(temp.data<min)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("The Maximum Element is "+max);
        System.out.println("The Minimum Element is "+min);
        return list;
     }
     public static LinkedList sort (LinkedList list)
     {
        Node temp=list.head;
        Node i,j;
        for(i=temp; i!=null; i=i.next)
        {
            for(j=i.next; j!=null; j=j.next)
            {
                if(i.data>j.data)
                {
                    int temp1=i.data;
                    i.data=j.data;
                    j.data=temp1;
                }
            }
        }
        return list;
     }
     public static LinkedList reverse (LinkedList list)
     {
        Node temp=list.head;
        Node prev=null;
        Node Next=null;
        while(temp!=null)
        {
            Next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=Next;
        }
        list.head=prev;
        return list;
     }

     public static LinkedList sum (LinkedList list)
     {
        Node temp=list.head;
        int sum=0;
        while(temp!=null)
        {
            sum=sum+temp.data;
            temp=temp.next;
        }
             System.out.println("The sum of All the Elements is "+sum);
        return list;
     }
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in );
        LinkedList list=new LinkedList();
        //System.out.println("Choose the operarion to Perform");
        System.out.println("        1.Creation of node");
        System.out.println("        2.Traversing the linked list");
        System.out.println("        3.Insertion at the beginning");
        System.out.println("        4.Insertion at the end");
        System.out.println("        5.Insertion at the middle");
        System.out.println("        6.Deletion at the beginning");
        System.out.println("        7.Deletion at the end");
        System.out.println("        8.Deletion at the middle");
        System.out.println("        9.Searching an element ");
        System.out.println("        10.Find max and Min");
        System.out.println("        11.Sorting");
        System.out.println("        12.Reversing the linked list");
        System.out.println("        13.Print sum of all elements");

        while(true){
        System.out.print("Choose the operarion Number to Perform:");
        int number=sc.nextInt();
        if(number>14)
        {
            System.out.println("Enter a Valid Operation Number");
        }
        else{
        switch (number)
        {
            case 1:
               create(list);
               break;
            case 2:
                list=traverse(list);
                break;
             case 3:
                 list=insert_at_b(list);
                 break;
             case 4:
                 list=insert_at_e(list);
                 break;
             case 5:
                 list=insert_at_m(list);
                 break;
            case 6:
                list=delete_at_b(list);
                break;
            case 7:
                list=delete_at_e(list);
                break;
            case 8:
                list=delete_at_m(list);
                break;
             case 9:
                 list=search(list);
                 break;
            case 10:
                list=find(list);
                break;
            case 11:
                list=sort(list);
                break;
            case 12:
                list=reverse(list);
                break;
             case 13:
                 list=sum(list);                
        }
        }
        }

    }
}
