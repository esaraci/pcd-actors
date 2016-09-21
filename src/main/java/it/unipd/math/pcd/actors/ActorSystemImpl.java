package it.unipd.math.pcd.actors;

/**
 * 
 * @author Eugen
 * 
 * implementazione della classe astratta AbsActorSystem
 *
 */
public final class ActorSystemImpl extends AbsActorSystem {

	protected ActorRef createActorReference(ActorMode mode) {
		if (mode == ActorMode.LOCAL)
			return new LocalActorRef(this);
		else
			throw new IllegalArgumentException();
	}
	
}
