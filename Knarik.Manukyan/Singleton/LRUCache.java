import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache {
	private static final LRUCache uniqueInstance;
	private static final int LIMIT = 5000000;

	static {
		uniqueInstance = new LRUCache();
	}

	private LRUCache() {
	}

	public static LRUCache getInstance() {
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
			Optional<CacheItem> minimumUsedCacheItemOptional = map.values().stream().min(Comparator.comparing(a -> a.hits));
			minimumUsedCacheItemOptional.ifPresent(minimumUsedCacheItem -> map.remove(minimumUsedCacheItem.key));
		}
		return cacheItem;
	}
}
