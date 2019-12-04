
public class Bat extends Mammal
	{

		@Override
		public void makeNoise()
			{
				System.out.println("The " + name + " makes an Ultrasonic pulse sound.");
			}

		public Bat()
			{
				name = "Bat";
				food = "Insects";
			}

	}
