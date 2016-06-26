package com.bch.scrrble;

public class CharacterCountWeight {
	private char ch;
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public DescendingComp getReserveCount() {
		return new DescendingComp(count);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private int count,weight;
	
	private CharacterCountWeight(char ch, int count,int weight) {
		setCh(ch);
		setCount(count);
		setWeight(weight);
	}
	final public static CharacterCountWeight[] createPlainData() {
		return new CharacterCountWeight[]{
				new CharacterCountWeight('A',9, 1),
				new CharacterCountWeight('B',2, 3),
				new CharacterCountWeight('C',2, 3),
				new CharacterCountWeight('D',4, 2),
				new CharacterCountWeight('E',12, 1),
				new CharacterCountWeight('F',2, 4),
				new CharacterCountWeight('G',3, 2),
				new CharacterCountWeight('H',2, 4),
				new CharacterCountWeight('I',9, 1),
				new CharacterCountWeight('J',1, 8),
				new CharacterCountWeight('K',1, 5),
				new CharacterCountWeight('L',4, 1),
				new CharacterCountWeight('M',2, 3),
				new CharacterCountWeight('N',6, 1),
				new CharacterCountWeight('O',8, 1),
				new CharacterCountWeight('P',2, 3),
				new CharacterCountWeight('Q',1, 10),
				new CharacterCountWeight('R',6, 1),
				new CharacterCountWeight('S',4, 1),
				new CharacterCountWeight('T',6, 1),
				new CharacterCountWeight('U',4, 1),
				new CharacterCountWeight('V',2, 4),
				new CharacterCountWeight('W',2, 4),
				new CharacterCountWeight('X',1, 8),
				new CharacterCountWeight('Y',2, 4),
				new CharacterCountWeight('Z',1, 10),
				new CharacterCountWeight('_',2, 0)
		};
		
	}
 }
