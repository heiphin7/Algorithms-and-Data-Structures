#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
	int t;
	cin >> t;

	while (t--) {
		int n;
		cin >> n;

		vector<int> arr(n);
		vector<string> sarr(n);
		vector<int> len(n);

		for (int i = 0; i < n; i++) {
			cin >> arr[i];
		}

		for (int i = 0; i < n; i++) {
			cin >> len[i];
			cin >> sarr[i];
		}

		for (int i = 0; i < n; i++) {
			string curr = sarr[i];

			for (int j = 0; j < curr.size(); j++) {
				if (curr[j] == 'U') {
					if (arr[i] == 0) {
						arr[i] = 9;
					}
					else {
						arr[i]--;
					}
				}
				else {
					if (arr[i] == 9) {
						arr[i] = 0;
					}
					else {
						arr[i]++;
					}
				}
			}
		}

		for (int el : arr) {
			cout << el << " ";
		}

		cout << endl;
	}
	return 0;
}