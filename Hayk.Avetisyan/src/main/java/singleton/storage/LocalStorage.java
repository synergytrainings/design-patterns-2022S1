package singleton.storage;

/**
 * Local Storage
 * Implementation of {@link DataStorage}
 * Used when the user has no access to the internet
 */
public class LocalStorage extends BaseStorage {

	public LocalStorage() {
		System.out.println("Local Storage used.");
	}
}
