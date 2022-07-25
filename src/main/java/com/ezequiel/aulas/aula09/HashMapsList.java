package com.ezequiel.aulas.aula09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapsList {

	public static void main(String[] args) {
		HashMap<String, Long> telefones = new HashMap<>();
		telefones.put("Ezequiel", 9598883922l);
		telefones.put("Ariane", 1199998888l);
		telefones.put("Eliana", 1200001111l);
		
		System.out.println(telefones);
		System.out.println(telefones.get("Ezequiel"));
		telefones.remove("Eliana");
		System.out.println(telefones);
		telefones.replace("Ezequiel", 1111111111l);
		System.out.println(telefones);
		telefones.replace("Jose", 1111111111l);
		System.out.println(telefones);
		telefones.remove("Maria");
		System.out.println(telefones);
		
		HashMap<Integer, Integer> Integer_Integer = new HashMap<>();
		
		HashMap<String, List<Integer>> String_ListInteger = new HashMap<>();
		List<Integer> values = Arrays.asList(1,2,5,7);
		
		String_ListInteger.put("10", values  );
		
		for(String key : telefones.keySet() ) {
			System.out.println("Usuario: " + key + " - telefone: "+telefones.get(key));
			
		}
		
		for(Long value : telefones.values()) {
			System.out.println("value:"+ value);
		}
		
	}
}
