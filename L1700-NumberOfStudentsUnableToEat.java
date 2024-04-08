// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<Integer>();
        Stack<Integer> sandwichesStack = new Stack<Integer>();
        int length = students.length, taken = 1;
        for (int i = 0; i < length; i++) {
            studentsQueue.add(students[i]);
            sandwichesStack.push(sandwiches[length - i - 1]);
        }
        while (taken > 0 && !studentsQueue.isEmpty()) {
            taken = 0;
            for (int i = 0; i < length; i++) {
                if (studentsQueue.isEmpty()) {
                    break;
                }
                int student = studentsQueue.poll();
                if (!sandwichesStack.isEmpty() && student == sandwichesStack.peek()) {
                    taken += 1;
                    sandwichesStack.pop();
                } else {
                    studentsQueue.add(student);
                }
            }
            length -= taken;
        }
        return length;
    }
}
