#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int t;
	cin >> t;

	while (t--) {
		int n;
		cin >> n;

		vector<int> arr(n);
		int fmax = INT_MIN;
		int smax = INT_MIN;


		for (int i = 0; i < n; i++) {
			cin >> arr[i];

			if (arr[i] > fmax) {
				smax = fmax;
				fmax = arr[i];
			}
			else if (arr[i] > smax) {
				smax = arr[i];
			}
		}


		for (int i = 0; i < n; i++) {
			if (arr[i] != fmax) {
				cout << arr[i] - fmax << " ";
			}
			else {
				cout << arr[i] - smax << " ";
			}
		}

		cout << endl;
	}

	return 0;
}