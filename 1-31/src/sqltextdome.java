import java.util.*;
public class sqltextdome {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		sqlserver ss = new sqlserver();
		String SQL_Str = "SELECT * FROM USERS";
		List<User> user_l = ss.SQL_executeQuery(SQL_Str);
		System.out.println("success");
		for(User item: user_l) {
			System.out.print(item.getNum()+"---"+item.getAccounNum()+"---"
						+item.getPassword()+"---"+item.getUser_name()+"---"+
						item.getQxid()+"---"+item.getFatherID()+"---"+
						item.getUnit_id());
			System.out.println();
		}
		String SQL_Str_Update = "UPDATE USERS SET USER_NAME = '�޸ĺ�Ľ����Ա' WHERE NUM = '1'";
		int count = ss.SQL_executeUpdate(SQL_Str_Update);
		System.out.println("update:"+count);
		String SQL_Insert = "INSERT INTO USERS(ACCOUNTNUMBER,PASSWARD,USER_NAME,QXID,FATHERID,UNIT_ID) VALUES('1111111','1111111','ѧ��111','11','10000111','11111')";
		int count2 = ss.SQL_executeUpdate(SQL_Insert);
		System.out.println("Insert:"+count2);
		String SQL_Str1 = "SELECT * FROM USERS WHERE ACCOUNTNUMBER = '1111111'";
		List<User> user_l1 = ss.SQL_executeQuery(SQL_Str1);
		System.out.println("success");
		for(User item: user_l1) {
			System.out.println("--------------UPDATEED-------------------");
			System.out.print(item.getNum()+"---"+item.getAccounNum()+"---"
						+item.getPassword()+"---"+item.getUser_name()+"---"+
						item.getQxid()+"---"+item.getFatherID()+"---"+
						item.getUnit_id());
			System.out.println();
		}
		String SQL_Delete = "DELETE FROM USERS WHERE ACCOUNTNUMBER = '1111111'";
		int count3 = ss.SQL_executeUpdate(SQL_Delete);
		System.out.println("Delete:"+count2);
		
	}

}
