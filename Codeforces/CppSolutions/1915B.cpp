#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int t;
	cin >> t;

	while (t--) {
		string s1, s2, s3;
		cin >> s1 >> s2 >> s3;

		int a = 0, b = 0, c = 0;

		for (int i = 0; i < 3; i++) {
			if (s1[i] == 'A') {
				a++;
			}
			else if (s1[i] == 'B') {
				b++;
			}
			else {
				c++;
			}

			if (s2[i] == 'A') {
				a++;
			}
			else if (s2[i] == 'B') {
				b++;
			}
			else {
				c++;
			}

			if (s3[i] == 'A') {
				a++;
			}
			else if (s3[i] == 'B') {
				b++;
			}
			else {
				c++;
			}
		}

		if (a == 2) {
			cout << "A" << endl;
		}
		else if (b == 2) {
			cout << "B" << endl;
		}
		else {
			cout << "C" << endl;
		}
	}
	return 0;
}