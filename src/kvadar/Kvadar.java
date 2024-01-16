package kvadar;

public class Kvadar {
	int dolzina;
	int visina;
	int sirina;
	public int getVolumen() {
		return ( dolzina*visina*sirina);
	}
	Kvadar(){
		dolzina = 2;
		visina = 3;
		sirina = 4;
	}
	Kvadar(int d, int v, int s){
		dolzina = d;
		visina = v;
		sirina = s;
	}
	/////////////////////////////////////////////
	public class Glavna{
		public static void main(String [] args) {
			Kvadar kv = new Kvadar();
			System.out.println("Volumen" + kv.getVolumen());
			Kvadar kv2 = new Kvadar(2, 2, 2);
			System.out.println("Volumen_2" + kv2.getVolumen());
		}


	}

}

