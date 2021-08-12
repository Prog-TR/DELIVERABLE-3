package deliverable.pkg3;

import tableGame.EffectsController;

/**
 * This class represents a Reverse Card.
 * @author nisha
 *
 */
public class ReverseCard extends EspecialCard{
	
	public ReverseCard(NormalCard.Color color){
		super(color, EspecialCard.Value.REVERSE);
	}
	
	/**
	 * Revert the direction of the game. If only two persons are playing, 
	 * then this effect is similar to the skip one.
	 */
	@Override
	public void applyEffect(EffectsController ctrl){
		ctrl.applyReverse();
	}

}
