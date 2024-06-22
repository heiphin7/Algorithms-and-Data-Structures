#include <iostream>
#include <vector>

using namespace std;

int main() {
	int n;
	cin >> n;
	vector<int> e; // even
	vector<int> o; // odd
	int i = 1; // index

	while (n--) {
		int curr;
		cin >> curr;

		if (curr % 2 == 0)
			e.push_back(i);
		else
			o.push_back(i);

		i++;
	}
	int ans = e.size() == 1 ? e[0] : o[0];
	cout << ans;

	return 0;
}