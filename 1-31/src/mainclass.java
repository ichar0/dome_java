
public class mainclass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		IAnything any = new Anything();
		any.fun1();
		
		Anything any1 = new Anything();
		any1.toString();
		any1.Pfun1();
		any1.Pfun3();
		Anything.innerclass inner = any1.new innerclass();
		inner.innerfun();
		Class classtype = any1.getClass();
		System.out.println(classtype.getMethods().toString());
		//List list = new List();
		Anything any2 = new Anything(3,"3");
		Anything any3 = new Anything(2,"2");
		Anything any4 = new Anything(7,"7");
	}

}
