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
		int sum = 0;

		for (int i = 0; i < n; i++) {
			cin >> arr[i];
			sum += arr[i];
		}

		if (sum % n != 0) {
			cout << "-1" << endl;
			continue;
		}

		if (n == 1) {
			cout << "0" << endl;
			continue;
		}

		int answer = 0;
		int avg = sum / n; // гарантируется что avg без нулей после запятой, так как это проверяется

		for (int el : arr) {
			if (avg < el) {
				answer++;
			}
		}

		cout << answer << endl << endl;
	}

	return 0;
}