#include <iostream>
#include <vector>

using namespace std;

int main() {
	int n, f;
	cin >> n >> f;

	int answer = 0;
	int min = f;
	int max = f;


	for (int i = 1; i < n; i++) {
		int k;
		cin >> k;

		if (k > max) {
			max = k;
			answer++;
		}

		if (k < min) {
			min = k;
			answer++;
		}
	}

	cout << answer;
	return 0;
}