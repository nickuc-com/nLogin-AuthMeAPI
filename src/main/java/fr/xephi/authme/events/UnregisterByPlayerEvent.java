package fr.xephi.authme.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Event fired after a player has unregistered himself.
 */
public class UnregisterByPlayerEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;

    /**
     * Constructor.
     *
     * @param player the player (never null)
     */
    public UnregisterByPlayerEvent(Player player, boolean async) {
        super(async);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    /**
     * Return the list of handlers, equivalent to {@link #getHandlers()} and required by {@link org.bukkit.event.Event}.
     *
     * @return The list of handlers
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}