#include <iostream>
#include <vector>

using namespace std;

/*
    by @heiphin7

    Нахождение максимальной суммы элементов за O(n^2)
*/


int main() {
	int n;
	cin >> n;

	vector<int> arr(n);

	for (int i = 0; i < n; ++i) {
		cin >> arr[i];
	}

	vector<int> answer = {-1, -1};
	int maxValue = INT_MIN;

	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < n; ++j) {
			if (arr[i] + arr[j] > maxValue && i != j) {
				maxValue = arr[i] + arr[j];
				answer[0] = i;
				answer[1] = j;
			}
		}
 	}

	cout << answer[0] << endl << answer[1];
	return 0;
}