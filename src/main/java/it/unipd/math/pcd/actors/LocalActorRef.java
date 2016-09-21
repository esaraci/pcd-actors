package it.unipd.math.pcd.actors;

/**
 * Created by Eugen on 21/09/2016.
 */
public class LocalActorRef<T extends Message> implements ActorRef<T> {

    private final AbsActorSystem actorSystem;

    /**
     *
     * @param as un ref al ActorSystem che gestisce l'attore
     */
    public LocalActorRef(AbsActorSystem as) {
        this.actorSystem = as;
    }

    @Override
    public void send(T msg, ActorRef to) {
        Actor<?> Destinatario = actorSystem.getActorFromRef(to);
        ((AbsActor)Destinatario).addToMailBox(msg, this);
    }

    @Override
    public int compareTo(ActorRef o) {
        if (this.equals(o))
            return 0;
        else
            return -1;
    }
}
