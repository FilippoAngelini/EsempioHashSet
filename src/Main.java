import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Set <Impiegato> impiegati = new HashSet <Impiegato> ();
		
		Impiegato i1 = new Impiegato (27,"Andrea","Marcelli");
		Impiegato i2 = new Impiegato (45,"Fulvio","Corno");
		Impiegato i3 = new Impiegato (45,"Giovanni","Squillero");
		
		impiegati.add(i1);
		impiegati.add(i2);
		impiegati.add(i3);

		Iterator<Impiegato> it = impiegati.iterator(); //non ho la certezza che vengano restituiti nell'ordine di inserimento

		while(it.hasNext())
			System.out.println(it.next());
		*/
		
		
		
		List <String> arrayList = new ArrayList<String>();
		List <String> linkedList = new LinkedList <String>();
		HashSet <String> set = new HashSet <String>();
		
		Long t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			arrayList.add("tag_" + i);
		
		Long t2 = System.nanoTime();
		
		System.out.println("Add\nArrayList: " + (t2-t1)/1e9);
		
		t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			linkedList.add("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("LinkedList: " + (t2-t1)/1e9);
		
		t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			set.add("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("HashSet: " + (t2-t1)/1e9);
		
		System.out.println("");
		
		t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			arrayList.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("Remove\nArrayList: " + (t2-t1)/1e9);
		
		t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			linkedList.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("LinkedList: " + (t2-t1)/1e9); //sarà veloce perche deve rimuovere sempre il primo
		
		t1 = System.nanoTime();
		
		for(int i=0 ; i<100000 ; i++)
			set.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("HashSet: " + (t2-t1)/1e9);
		
		/*
		t1 = System.nanoTime();
		
		for(int i=99999 ; i>0 ; i--)
			arrayList.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("ArrayList: " + (t2-t1)/1e9);
		
		t1 = System.nanoTime();
		
		for(int i=99999 ; i>0 ; i--)
			linkedList.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("LinkedList: " + (t2-t1)/1e9);
		
		t1 = System.nanoTime();
		
		for(int i=99999 ; i>0 ; i--)
			set.remove("tag_" + i);
		
		t2 = System.nanoTime();
		
		System.out.println("Set: " + (t2-t1)/1e9);
		*/
	}

}
