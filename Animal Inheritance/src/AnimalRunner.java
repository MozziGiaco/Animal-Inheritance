
public class AnimalRunner
	{

		public static void main(String[] args)
			{
				Animal [] zoo = new Animal [1];
				zoo[0] = new Bat();
				
				
				for (Animal z : zoo)
					{
						z.bearYoung();
						z.makeNoise();
						z.eat();
						
						System.out.println();
					}

			}

	}
