package deliverable.pkg3;

import tableGame.EffectsController;;

/**
 * This class represents a Skip Card.
 * @author nisha
 *
 */
public class SkipCard extends EspecialCard{

	public SkipCard(NormalCard.Color color){
		super(color, EspecialCard.Value.SKIP);
	}
	
	/**
	 * Rotates the game in order to produce the result of skipping a player
	 * in the end of the turn.
	 */
	@Override
	public void applyEffect(EffectsController ctrl){
		ctrl.applySkip();
	}
}
