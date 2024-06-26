#include <iostream>
#include <vector>

using namespace std;

int main() {
	int n;
	cin >> n;

	for (int i = 0; i < n; i++) {
		int k;
		cin >> k;

		int counter = 0;

		for (int i = 0; ; i++) {
			if (i % 3 != 0 && i % 10 != 3) {
				counter++;

				if (counter == k) {
					cout << i << endl;
					break;
				}
			}
		}
	}

	return 0;
}