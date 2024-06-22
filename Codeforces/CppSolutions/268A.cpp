#include <iostream>
#include <vector>
#include <cctype>

using namespace std;

int main() {
	int n;
	cin >> n;
	vector<int> h;
	vector<int> g;

	for (int i = 0; i < n; ++i) {
		int a, b;
		cin >> a >> b;

		h.push_back(a);
		g.push_back(b);
	}

	int answer = 0;

	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < n; ++j) {
			if (j != i && h[i] == g[j]) {
				answer++;
			}
		}
	}

	cout << answer;
	return 0;
}