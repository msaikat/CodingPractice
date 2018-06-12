package com.coding.practice.mycode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DijkstraAlgorithm {
    private int[][] graph = new int[][] {{0,6,0,1,0},
                                         {0,0,5,0,0},
                                         {10,0,0,0,0},
                                         {0,2,0,0,1},
                                         {0,2,5,0,0}};

    private char[] nodes = new char[]{'A','B','C','D','E'};
    private int[] unvisited = new int[]{0,1,2,3,4};
    private List<Integer> visited = new ArrayList<Integer>();
    private Map<Integer, Integer> heap = new HashMap<Integer, Integer>();

    private void initHeap() {
        for (int i = 0; i < unvisited.length; i++) {
            heap.put(i, 9999);
        }
    }

    public void start() {
        initHeap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available nodes in graph: " + nodes);
        System.out.println("Enter Start Node: ");
        
        int startVertex =  String.valueOf(nodes).indexOf(scanner.next());
        updateHeapEntry(startVertex, 0);
        
        while(!heap.isEmpty()) {
            Entry<Integer, Integer> entry = getHeapEntryHavingMinimumWeight();
            visited.add(entry.getKey());
            
            for (int adjacent = 0; adjacent < graph.length; adjacent++) {
                if (!visited.contains(adjacent) && graph[entry.getKey()][adjacent] != 0) {
                    updateHeapEntry(adjacent, graph[entry.getKey()][adjacent] + heap.get(entry.getKey()));
                }
            }
            
            heap.remove(entry.getKey());
        }

        for (int v : visited) {
            System.out.println(v);
        }
    }

    private void updateHeapEntry(int vertex, int pathFromStart) {
        if (heap.get(vertex) > pathFromStart) {
            heap.put(vertex, pathFromStart);
        }
    }

    private Entry<Integer, Integer> getHeapEntryHavingMinimumWeight() {
        int minWeight = 9999;
        Entry<Integer, Integer> entryHavingMinimumWeight = null;
        for (Entry<Integer, Integer> entry : heap.entrySet()) {
            if (entry.getValue() <= minWeight) {
                minWeight = entry.getValue();
                entryHavingMinimumWeight = entry;
            }
        }
        return entryHavingMinimumWeight;
    }
}
