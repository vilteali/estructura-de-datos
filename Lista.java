public class Lista {

	private Nodo cabeza;
	private int contadorNodo = 0;

	public int getContadorNodo() {
		return contadorNodo;
	}

	public void addNodo(Nodo nodo) {

		Nodo k = cabeza;

		if(k == null) {
			cabeza = nodo;
			cabeza.setSiguiente(null);

		} else {
			for(k = cabeza; k.getSiguiente() != null; k = k.getSiguiente()) {

			}

			k.setSiguiente(nodo)
		
		}

	}	

	public void printNodo() {

		Nodo i = cabeza;

		while(i != null) {
			System.out.println(l.getEstudiante());
			l = l.getSiguiente();
		}

	}

}

