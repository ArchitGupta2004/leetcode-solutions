class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peekLast() > 0) {
                if (stack.peekLast() < -a) {
                    stack.pollLast();
                } else if (stack.peekLast() == -a) {
                    stack.pollLast();
                    a = 0;
                    break;
                } else {
                    a = 0;
                    break;
                }
            }
            if (a != 0) {
                stack.addLast(a);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;
        for (int val : stack) {
            result[index++] = val;
        }
        return result;
    }
}