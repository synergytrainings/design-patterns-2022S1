package singleton.storage;

/**
 * Remote Storage
 * Implementation of {@link DataStorage}
 * Used when the user has access to the internet
 */
public class RemoteStorage extends BaseStorage {

	public RemoteStorage() {
		System.out.println("Remote Storage used.");
	}
}
