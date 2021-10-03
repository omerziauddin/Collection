
public class Employee implements Comparable {

	
	String name;
	int eid;
	int count=0;
	public Employee(String name, int eid) {
		
		this.name = name;
		this.eid = eid;
	}
	public String toString()
	{
		return name+" "+eid;
		
	}
	public int compareTo(Object o)
	{   count++;
	 System.out.println("call "+count);
		Employee see=(Employee)o;
	    System.out.println(see);
		int eid1=this.eid;
		System.out.println("eid1= "+eid1);
		int eid2=((Employee)o).eid;
		System.out.println("eid2 "+eid2);
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
			return 0;
		
	}
	
}
