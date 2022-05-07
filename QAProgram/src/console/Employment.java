package console;

public class Employment {
	public void employ() {
		Trainer myTrainer = new Trainer("600-T1", 7500.00, true, "Abramham", "Jacob", 46, Gender.Male);
		Trainer myTrainer1 = new Trainer("600-T2", 8900.00, true, "Sara", "Rachel", 38, Gender.Female);
		System.out.println(myTrainer);
		System.out.println(myTrainer1);
	}
}
