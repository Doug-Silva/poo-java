package Atividade01_T2;

public class TesteProdutos {

public static void main(String[] args) {
		
		Tv televisor1 = new Tv ("Smart TV 4k", "LG", 2200f, 48, "LCD");
		
		Radio radio1 = new Radio ("Mini System", "Panasonic", 1750f, 2350);
		
		VideoGame game1 = new VideoGame ("Xbox one", "Microsoft", 2900f, 4);
		
		System.out.println(televisor1);
		System.out.println();
		System.out.println(radio1);
		System.out.println();
		System.out.println(game1);

	}

}
