#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int k;
	cin >> k;

	vector<int> arr(12);

	for (int i = 0; i < 12; i++) {
		cin >> arr[i];
	}

	if (k == 0) {
		cout << 0 << endl;
		return 0;
	}

	sort(arr.begin(), arr.end(), greater<int>());

	int sum = 0;
	int answer = 0;

	bool possible = true;

	while (sum < k && possible) {
		if (answer + 1 >= 13) {
			cout << -1;
			possible = false;
			break;
		}
		else {
			sum += arr[answer];
			answer++;
		}
	}

	if (possible) {
		cout << answer;
	}

	return 0;
}
