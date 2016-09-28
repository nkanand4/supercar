import org.hibernate.cfg.Configuration;

public class Test {

	//private static final ServiceRegistry serviceRegistry;
	
	public static void main(String[] args){
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.buildSessionFactory();
	}
}
