// https://leetcode.com/problems/minimum-cost-to-hire-k-workers/
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length, currentTotalQuality = 0;
        double totalCost = Double.MAX_VALUE;
        List<Pair<Double, Integer>> wageToQualityRatio = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wageToQualityRatio.add(
                new Pair<>((double) wage[i] / quality[i], quality[i])
            );
        }
        Collections.sort(wageToQualityRatio, Comparator.comparingDouble(Pair::getKey));
        PriorityQueue<Integer> highestQualityWorkers = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            highestQualityWorkers.add(wageToQualityRatio.get(i).getValue());
            currentTotalQuality += wageToQualityRatio.get(i).getValue();
            int size = highestQualityWorkers.size();
            if (size > k) {
                currentTotalQuality -= highestQualityWorkers.poll();
                size -= 1;
            }
            if (size == k) {
                totalCost = Math.min(totalCost, currentTotalQuality * wageToQualityRatio.get(i).getKey());
            }
        }
        return totalCost;
    }
}
