import java.util.*;

public class RRCache {
	private volatile static RRCache uniqueInstance;
	private static final int LIMIT = 5000000;

	private RRCache() {
	}

	public static RRCache getInstance() {
		if (uniqueInstance == null) {
			synchronized (Mars.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new RRCache();
				}
			}
		}
		return uniqueInstance;
	}

	static Map<Object, CacheItem> map = new HashMap<>();

	public void put(Object key, Object value) {
		map.put(key, new CacheItem(key, value));
	}

	public Object get(Object key) {
		CacheItem cacheItem = map.get(key);
		if (cacheItem != null) {
			cacheItem.hits++;
		}
		if (map.size() == LIMIT) {
			Random r = new Random();
			List<Object> keysAsArray = new ArrayList<>(map.keySet());
			map.remove(keysAsArray.get(r.nextInt(keysAsArray.size())));
		}
		return cacheItem;
	}
}
