package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag getFlag
	public interface Flag{
		List<Color> getColors();
	}
	
	public class DutchFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
		}
	}

	public class GermanFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
		}
	}
	
	public class BelgianFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
		}
	}
	
	public class FrenchFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
		}
	}
	
	public class ItalianFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
		}
	}
	
	public class RomaniaFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
		}
	}
	
	public class IrelandFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
		}
	}
	
	public class HungarianFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
		}
	}
	
	public class BulgarianFLag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
		}
	}
	
	public class RussianFlag implements Flag {
		public List<Color> getColors() {
			return Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
		}
	}
    // end getFlag

}