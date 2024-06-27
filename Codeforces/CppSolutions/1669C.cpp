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

		vector<int> nums(n);

		bool od1 = true;
		bool od2 = true;

		bool ev1 = true;
		bool ev2 = true;

		for (int i = 0; i < n; i++) {
			cin >> nums[i];

			if (i % 2 == 0) {
				if (nums[i] % 2 == 0) {
					ev1 = false;
				}
				else {
					ev2 = false;
				}
			}
			else {
				if (nums[i] % 2 == 0) {
					od1 = false;
				}
				else {
					od2 = false;
				}
			}
		}

		if ((!ev1 && !ev2) || (!od1 && !od2)) {
			cout << "NO" << endl;
		}
		else {
			cout << "YES" << endl;
		}

	}

	return 0;
}