package com.bch.scrrble;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Scrabble {

	public static void main(String[] args) {
		CharacterCountWeight[] charachters = CharacterCountWeight.createPlainData();
		BufferedInputStream bis = new BufferedInputStream(System.in);
		Scanner sc = new Scanner(bis);
		String str = sc.next();
		char[] chars = str.toCharArray();
		for(char ch: chars) {
			CharacterCountWeight item;
			if(ch == '_') {
				item = charachters[26];
			}else {
				int index = ch - 'A';
				item = charachters[index];
			}
			if(item.getCount() == 0) {
				System.out.println("Invalid input. More " + ch + "'s have been taken from the bag than possible.");
				System.exit(0);
			}else {
				item.setCount(item.getCount() -1);
			}
		}
		Map<DescendingComp,List<CharacterCountWeight>> result = Arrays.asList(charachters).stream(). collect(Collectors.groupingBy(CharacterCountWeight::getReserveCount,TreeMap::new,  Collectors.toList()));
		print(result);
	}
private static void print(Map<DescendingComp,List<CharacterCountWeight>> result) {
	result.forEach((a,b)->{
		System.out.print(a);
		System.out.print(": ");
		print(b);
	});
}

private static void print(List<CharacterCountWeight> result) {
	int size = result.size();
	result.stream().sorted((a,b)->{
		if(a.getWeight() != b.getWeight()) {
			return  b.getWeight()-a.getWeight();
		}
		return  b.getCh()-a.getCh();
	});
	for(int i=0; i<size; i++) {
		System.out.print(result.get(i).getCh());
		if(i != size-1) {
			System.out.print(",");
		}else {
			System.out.println();
		}
	}
}

}
