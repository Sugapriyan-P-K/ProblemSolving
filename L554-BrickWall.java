// https://leetcode.com/problems/brick-wall/
public class BrickWall {
    public static int leastBricks(List<List<Integer>> wall) {
        int count = -1;
        long wallLength = 0;
        Map<Long, Integer> map = new HashMap<>();
        int size = wall.size();
        for (int i = 0; i < size; i++) {
            wallLength = 0;
            for (int brick : wall.get(i)) {
                wallLength += brick;
                map.put(wallLength, map.getOrDefault(wallLength, 0) + 1);
            }
        }
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int temp = entry.getValue();
            if (entry.getKey() != wallLength && temp > count) {
                count = temp;
            }
        }
        if (count == -1)
            return size;
        return (size - count);
    }

    public static void main(String[] args) {
        // wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
        // Output: 2
        // Input: wall = [[1],[1],[1]]
        // Output: 3
    }
}
