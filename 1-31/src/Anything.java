
public class Anything extends AnyParent  implements IAnything,IAnything2,Comparable<Anything> {
	private int id = 0;
	private String name = "name";
	static int count = 0;
	public Anything() {
		this("this 调用有参数的构造方法！");
		count ++;
		System.out.println("无参构造方法！ "+count);
	}
	public Anything(String str) {
		System.out.print(str);
	}
	
	public Anything(int id,String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Anything a) {
		if(id > a.id)
		{
			return 1;
		}
		else if(id<a.id){
			return -1;
		}
		return 0;
	}
	
	public void fun1() {
		System.out.println("this is fun1 interface");
	}
	@Override
	public void Pfun1()
	{
		System.out.print("this is parent Pfun3(super): \t");
		super.Pfun3();
		int id = 1;
		System.out.println(" id of this is myself overrider function =="+id);
		System.out.println(" id of this is myself class  =="+this.id);
		System.out.println(" id of this is parent  =="+super.id);
		
		System.out.println("this myself and override parent function (public)fun1");
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("anything1" + "+ id +" + id);
		sb.append("anything1" + "+ name +" + name);	
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public void fun2() {
		System.out.println("this is fun2 interface");
	}
	
	public String getName() {
		int id = 0;
		setName("java");
		return this.name + "==id";
	}
	private void setName(String name) {
		this.name = name;
	}
	
	public boolean make(int _id,String _name) {
		if(_id == id && _name.equals(name))
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public class innerclass{
		int id = 4;
		public void innerfun()
		{
			System.out.println(this.id);
			System.out.println(Anything.this.id);
			System.out.println("the function(innerfun) of this innerclass");
		}
	}

}
