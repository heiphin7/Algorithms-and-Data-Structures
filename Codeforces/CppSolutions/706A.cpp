#include <iostream>
#include <unordered_set>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n;
	cin >> n;

	vector<int> stores(n);

	for (int i = 0; i < n; ++i) {
		cin >> stores[i];
	}

	int q;
	cin >> q;

	vector<int> moneys(q);

	for (int i = 0; i < q; ++i) {
		cin >> moneys[i];
	}

	sort(stores.begin(), stores.end());

	for (int num : moneys) {
		auto it = upper_bound(stores.begin(), stores.end(), num);
		int count = it - stores.begin();
		cout << count << endl;
	}

	return 0;
}
