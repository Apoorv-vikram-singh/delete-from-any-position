import java.util.*;
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
public class dlelefrpos
{
    node head;
    public void insertAtEnd(int data)
    {
        node n=new node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void printm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
             temp=temp.next;
        }
    }
    public void deletepos(int pos)
    {
        node n=new node(pos);
        if(head==null)
        {
            return;
        }
        else
        {
            if(pos==1)
            {
            head=head.next;
            }
            else if(pos>count())
            {
                System.out.println("invalid out put");
            }
            else
                 {
                    node temp=head;
                    int c=1;
                    while(temp!=null)
                    {
                        if(pos-1==c)
                        {
                        break;
                        }
                        c++;
                        temp=temp.next;
                    }
                    temp.next=temp.next.next;
                    
                 }
        }
    }
    public int count()
    {
        node temp=head;
        int c=0;
        {
           while (temp!=null)
           {
               c++;
               temp=temp.next;
           } 
           return c;
        }
    }
    public static void main(String args[])
    {
        dlelefrpos obj=new dlelefrpos();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=sc.nextInt();
            obj.insertAtEnd(number);
        }
        int postion=sc.nextInt();
        obj.deletepos(postion);
        obj.printm();
        

    }
}