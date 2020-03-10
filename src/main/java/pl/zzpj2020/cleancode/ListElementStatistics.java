package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListElementStatistics {
	Map<Integer, Integer> hashMap = new HashMap<>();
	private int minIntValue = Integer.MAX_VALUE;
	private int maxIntValue = Integer.MIN_VALUE;

	public void countOccurrenceKeysInList(List<Integer> list) {
		for (Integer key : list) {
			if (hashMap.containsKey(key)) {
				Integer value = hashMap.get(key);
				hashMap.put(key, value + 1);
			} else {
				hashMap.put(key, 1);
			}

			setMinValueIfLesser(key);
			setMaxValueIfGreater(key);
		}
	}

	private void setMinValueIfLesser(int key) {
		if (key < minIntValue) {
			minIntValue = key;
		}
	}

	private void setMaxValueIfGreater(int key) {
		if (key > maxIntValue) {
			minIntValue = key;
		}
	}

	public int getMinIntValue() {
		return minIntValue;
	}

	public int getMaxIntValue() {
		return maxIntValue;
	}

	public int getValueFromHashMap(int key) {
		return hashMap.getOrDefault(key, 0);
	}
}