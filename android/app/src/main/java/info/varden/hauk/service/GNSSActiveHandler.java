package info.varden.hauk.service;

/**
 * Interface template for handling UI updates when location data is received.
 *
 * @author Marius Lindvall
 */
public interface GNSSActiveHandler {
    /**
     * Called when the initial low-accuracy GNSS fix has been obtained.
     */
    void onCoarseLocationReceived();

    /**
     * Called when the initial high-accuracy GNSS fix has been obtained.
     */
    void onAccurateLocationReceived();

    /**
     * Called when a list of shares the client is contributing to has been received from the server.
     *
     * @param linkFormat A format-able string used as a template to get view links.
     * @param shareIDs   A list of shares the client is contributing to. May be null.
     */
    void onShareListReceived(String linkFormat, String[] shareIDs);
}
