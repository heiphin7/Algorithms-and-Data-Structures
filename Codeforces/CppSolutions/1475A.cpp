#include <iostream>
#include <unordered_set>
#include <vector>
#include <algorithm>

using namespace std;

bool hasOddDivisior(long long num) {
	return (num & (num - 1)) != 0;
}


int main() {
	int n;
	cin >> n;

	vector<long long> arr(n);

	for (int i = 0; i < n; ++i) {
		cin >> arr[i];
	}

	for (long long num : arr) {
		if (hasOddDivisior(num)) {
			cout << "YES" << endl;
		}
		else {
			cout << "NO" << endl;
		}
	}

	return 0;
}
