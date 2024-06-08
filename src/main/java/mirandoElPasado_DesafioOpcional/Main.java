package ejercicioUno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		ArrayList<String> marcas = new ArrayList<>();
		marcas.add("Nike");
		marcas.add("Adidas");
		marcas.add("Asus");
		marcas.add("Sonny");
		marcas.add("Palmers");
		marcas.add("Rosen");
		marcas.add("RedDragon");
		marcas.add("Nokia");
		marcas.add("Entel");
		marcas.add("Lipton");
		//ToString nos permite imprimir la lista entera sin recorrerla
		System.out.println(marcas.toString());
		marcas.add("Blokbaster"); //10
		marcas.add("Carrefour");
		marcas.add("Jetix");
		System.out.println(marcas);
		//Set permite cambiar un valor, primero va el índice y luego el valor que reemplazará al otro.
		marcas.set(10, "Blockbuster");
		//Remove es para elimiar un valor dependiendo de su índice.
		marcas.remove(11);
		marcas.remove("Carrefour");
		System.out.println(marcas);
		//Definiendo la segunda lista de marcas
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Perruski");
		posiblesMarcas.add("Té Schulz");
		posiblesMarcas.add("Aobaniko");
		posiblesMarcas.add("Cuerda Cósmica");
		//Comando para agregar todos los elementos de una lista en otra lista.
		marcas.addAll(posiblesMarcas);
		System.out.println(marcas);
		//Size nos permite conocer el tamaño de una lista.
		System.out.println(marcas.size());

		//Set es una tabla que permite guardar elementos en función de la clase que le definamos.
		//HashSet No permite duplicados, se basa en tabla Hash, lo que permite operaciones básicas como eliminar, añadir
		// y comprobar la presencia de un elemento de forma muy rápida; además no garantiza orden de los elementos.

		//TreeSet nos permite ordenar los elementos según el orden natural de los elementos, o por un "Comparator"
		// especificado. Además, no permite duplicados, permite navegar y obtener subconjuntos(subsets) como "first(),
		// last(), headSet(), tailSet(), subSet(). Además, está basado en un TreeMap, árbol rojo-negro, que hace que las
		// operaciones se demoren más.

		Set<String> invitados = new TreeSet<>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");

		Set<String> posiblesInvitados = new TreeSet<>();
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		//Agregando el segundo listado de "Posibles invitados" al listado principal.
		invitados.addAll(posiblesInvitados);
		System.out.println(invitados);
		invitados.remove("Jorge");
		System.out.println(invitados);

		//Ejercicio 3
		//Map es una interfaz y TreeMap es su implementación. Esta implementación en específico nos permtie agregar
		// elementos ordenados por su orden natural.
		Map<String, Integer> golosinas = new TreeMap<>();
		//Agregando elementos al Map con el método put
		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);
		System.out.println(golosinas);

		//Creando un nuevo Map para filtrar golosinas (Método de filtro 1)
		Map<String, Integer> golosinasFiltradas = new TreeMap<>();
		//Se utiliza el bucle For para que recorra el Map. Se llama al Map.Entry, que permite verificar los elementos que
		// se ingresen al Map; se le entregan los parámetros del Map correspondiente, y se entrega una variable que la
		// representa, que será "entry". Luego se llama a la lista con la que se comparará, en este gaso "golosinas", y
		// se utiliza el método entrySet, que nos devuelve un conjunto de todas las entradas en el TreeMap "golosinas".
		for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
			//Se agrega una condicional al entry: Si el valor, o la clave de la derecha del Map es menor a 100, se agrega a
			// la lista nueva mediante los métodos mencionados a continuación.
			//El Map se compone de: Map<Key, Value> o Map<k, v>. Es por esto que se pueden ocupar los getter y setters de
			// key y value para operar.
			if(entry.getValue() < 100) {
				golosinasFiltradas.put(entry.getKey(), entry.getValue());
			}
		}

		System.out.println("Golosinas con valores menor a 100: " + golosinasFiltradas);

		//Queue es una interfaz que representa una estructura de datos que sigue el principio FIFO(Fist-in, First-out),
		// es decir, el primer elemento en ser agregado es el primero en ser removido.
		//Puede ser útil para el procesamiento de tareas, por ejemplo, una cola de impresión o una playlist.
		//Tiene diferentes formas de ser implementado, mediante LinkedList, PriorityQueue y ArrayDeque.
		//LinkedList se basa en listas enlazadas. Puede funcionar como una cola (FIFO) o una pila (LIFO).

		Queue<String> juegos = new LinkedList<>();
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachiripún");
		juegos.add("Pillarse");
		System.out.println(juegos);
		System.out.println(juegos.size());




	}

}
