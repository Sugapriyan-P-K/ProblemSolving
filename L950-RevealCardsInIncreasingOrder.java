// https://leetcode.com/problems/reveal-cards-in-increasing-order/
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> deckCards = new LinkedList<Integer>();
        int length = deck.length, i = 0, idx= 0;
        int[] res = new int[length];
        for (i = 0; i < length; i++) {
            deckCards.add(i);
        }
        i = 0;
        Arrays.sort(deck);
        while (!deckCards.isEmpty()) {
            i = deckCards.poll();
            res[i] = deck[idx++];
            if (!deckCards.isEmpty()) {
                deckCards.add(deckCards.poll());
            }
        }
        return res;
    }
}
