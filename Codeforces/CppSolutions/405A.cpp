#include <iostream>
#include <vector>
#include <cctype>

using namespace std;

int main() {
	int n;
	cin >> n;

	vector<int> arr(n);

	for (int i = 0; i < n; ++i) {
		cin >> arr[i];
	}

	bool isSorted = false;

	while (!isSorted) {
		isSorted = true;

		for (int i = 0; i < arr.size() - 1; ++i) {
			if (arr[i] > arr[i+1]) {
				isSorted = false;
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

	for (int el: arr) {
		cout << el << " ";
	}
	return 0;
}