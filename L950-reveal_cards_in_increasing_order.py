# https://leetcode.com/problems/reveal-cards-in-increasing-order/
class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        length = len(deck)
        que = [i for i in range(length)]
        res = [0] * length
        idx = 0
        deck.sort()
        while (que):
            i = que.pop(0)
            res[i] = deck[idx]
            idx += 1
            if (que):
                que.append(que.pop(0))
        return res
