//Assignment 1 of Session 3 ,date= July 20 2021
//Topic => Using Unicode for printing Name in native language
//https://github.com/tanuj1811/Summer-Tranning-Java-2021.git
public class Session2Assignment1 {

	public static void main(String[] args) {
		
		
		//using unicode for printing my name in punjabi language ;)
		char nameCh1 = '\u0A24';
		char nameCh2 = '\u0A28';
		char nameCh3 = '\u0A41';
		char nameCh4 = '\u0A1C';
		
//		System.out.println(nameCh1 + nameCh2 + nameCh3 + nameCh4 );
		System.out.print(nameCh1);
		System.out.print(nameCh2);
		System.out.print(nameCh3);
		System.out.print(nameCh4);
		System.out.println("");
		
		//using unicode for printing my name in hindi language ;)
		char nameCh01 = '\u0924';
		char nameCh02 = '\u0928';
		char nameCh03 = '\u0941';
		char nameCh04 = '\u091C';
		
		System.out.println(nameCh01 + nameCh02 + nameCh03 + nameCh04 );
		System.out.print(nameCh01);
		System.out.print(nameCh02);
		System.out.print(nameCh03);
		System.out.print(nameCh04);
		System.out.println("");
	}

}
