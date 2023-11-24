package clase8;

public class MiClase {

	public void metodo() throws MiException{
		boolean condicion = false;
		if(!condicion) {
			throw new MiException("No se cumplio con la condicion pa");
		}
		
	}
	
	public static void main(String[] args){
		MiClase c = new MiClase();
		try {
			c.metodo();
		} catch (MiException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
