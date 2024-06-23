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

	for (int i = 0; i < arr.size() / 2; ++i) {
		if (arr[i] != arr[n - 1 - i]) {
			cout << "array not palindrome";
			return 0;
		}
	}

	cout << "array is palindrome";
	return 0;
}