#include <iostream>
#include <unordered_set>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int s, n;
	cin >> s >> n;

	vector<pair<int, int>> dr(n);

	for (int i = 0; i < n; ++i) {
		cin >> dr[i].first >> dr[i].second;
	}

	sort(dr.begin(), dr.end());

	for (const auto& dragon: dr) {
		if (s > dragon.first) {
			s += dragon.second;
		} else {
			cout << "NO";
			return 0;
		}
	}

	cout << "YES";
	return 0;

}
