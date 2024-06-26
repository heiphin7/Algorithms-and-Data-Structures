#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n;
	cin >> n;

	while (n--) {
		int a, b, c, d;
		cin >> a >> b >> c >> d;

		if (a > b && c < d) {
			cout << "NO" << endl;
		}
		else if (b > a && d < c) {
			cout << "NO" << endl;
		}
		else {
			cout << "YES" << endl;
		}
	}

	return 0;
}
