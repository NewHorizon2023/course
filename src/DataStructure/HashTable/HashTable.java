package DataStructure.HashTable;

import java.util.LinkedList;

/**
 * HashTable
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-30
 */
public class HashTable {

    private static class Entry {
        private final int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] listArr = new LinkedList[5];

    public void put(int key, String value) {
        int i = key % 5;
        if (listArr[i] == null) {
            LinkedList<Entry> list = new LinkedList<>();
            list.add(new Entry(key, value));
            listArr[i] = list;
            return;
        }

        for (Entry e : listArr[i]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }

        listArr[i].add(new Entry(key, value));
    }

    public String get(int key) {
        int i = key % 5;
        if (listArr[i] == null) {
            return null;
        }

        for (Entry entry : listArr[i]) {
            if (key == entry.key) {
                return entry.value;
            }
        }

        return null;
    }

    public void remove(int key) {
        int i = key % 5;
        if (listArr[i] == null) {
            return;
        }
        for (Entry entry : listArr[i]) {
            if (key == entry.key) {
                listArr[i].remove(entry);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (LinkedList<Entry> list : listArr) {
            if (list == null) {
                continue;
            }
            for (Entry entry : list) {
                sb.append(entry.key).append('=').append(entry.value).append(',');
            }
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(']');

        return sb.toString();
    }

}
