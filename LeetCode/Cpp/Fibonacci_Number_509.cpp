class Solution {
public:
    unordered_map<int, int> map;
    int fib(int n) {
        if (n <= 1) return n;
        if (map.find(n) != map.end()) return map[n];
        map[n] = fib(n-1) + fib(n-2);
        return map[n];
    }
};