
public class LinkedList {
	Node head;
	Node reverse(Node head)
	{
		
	Node prev= null;
	Node curr=head;
	Node next= head;
	while(curr!=null)
	{
		next=curr.nextNodeRef;
		curr.nextNodeRef=prev;
		prev=curr;
		curr=next;
	}
	head=prev;
	return head;
	}
	void addNode(Node newNode)
	{
		if(head==null)
		{
			head=newNode;
		}
		Node temp=head;
		while(temp.nextNodeRef!=null)
		{
			temp=temp.nextNodeRef;
		}
		temp.nextNodeRef=newNode;
	}
	
	public static void main(String args[])
	{
		LinkedList list= new LinkedList();
		Node n;
	}

}
