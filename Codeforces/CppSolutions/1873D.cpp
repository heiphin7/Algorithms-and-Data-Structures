#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
	int t;
	cin >> t;

	while(t--) {
		int n, k;
		cin >> n >> k;

		string s;
		cin >> s;

		int answer = 0;

		for (int i = 0; i < s.size(); i++) {
			if (s[i] == 'B') {
				answer++;
				i += k - 1; // Так как ластик сотрёт следующие k - 1 элементы
			}
		}

		cout << answer << endl;
	}

	return 0;
}