#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n;
	cin >> n;

	for (int i = 0; i < n; i++) {
		int c;
		cin >> c;

		if (c % 4 != 0) {
			cout << "NO" << endl;
			continue;
		}

		int d = c / 4;

		vector<int> answer(c);

		int even = 2;
		int odd = 1;

		int ep = 0; // even pointer
		int op = c / 2; // odd pointer

		for (int j = 0; j < c; j++) {
			if (j == c-1) { // last element
				for (int k = 0; k < d; k++) {
					odd += 2;
				}

				answer[j] = odd;
				continue;
			}

			if (j % 2 == 0) {
				answer[ep] = even;
				ep++;
				even += 2;
			}
			else {
				answer[op] = odd;
				op++;
				odd += 2;
			}
		}

		cout << "YES" << endl;
		for (int el : answer) {
			cout << el << " ";
		}
		cout << endl;
	}

	return 0;
}