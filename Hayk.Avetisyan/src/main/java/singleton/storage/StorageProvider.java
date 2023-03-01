package singleton.storage;

import java.net.URL;
import java.net.URLConnection;

/**
 * Another implementation of singleton design pattern.
 */
public class StorageProvider {

	private static DataStorage STORAGE;

	public static DataStorage provide() {
		if(STORAGE == null) {
			if(hasInternetAccess()) {
				STORAGE = new RemoteStorage();
			}
			else {
				STORAGE = new LocalStorage();
			}
		}
		return STORAGE;
	}

	private static boolean hasInternetAccess() {
		try {
			URL url = new URL("https://google.com/");
			URLConnection connection = url.openConnection();
			connection.connect();

			return true;
		}
		catch (Exception ignore) {}

		return false;
	}
}
