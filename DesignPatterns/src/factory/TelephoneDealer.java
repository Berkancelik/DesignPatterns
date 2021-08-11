package factory;

public class TelephoneDealer {

	public static void main(String[] args) {

		Telephone s8 = TelephoneFactory.getTelephone("s8", "2600mah", 4, 7);

		Telephone note8 = TelephoneFactory.getTelephone("note8", "3600mah", 4, 7);

		System.out.println("s8 için telefon özellikleri:");
		System.out.println(s8);

		System.out.println("Note8 için telefon özellikleri");
		System.out.println(note8);

	}
}
