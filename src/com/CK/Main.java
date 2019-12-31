package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int connectSticks(int[] sticks) {
        if (sticks.length < 2)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stick : sticks) {
            pq.offer(stick);
        }
        int res = 0;
        while (pq.size() > 1) {
            int cost = pq.poll();
            cost += pq.poll();
            res += cost;
            pq.offer(cost);
        }
        return res;
    }
}