#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int t;
	cin >> t;

	while (t--) {
		int n, a, b;
		cin >> n >> a >> b;

		string s = "abcdefghijklmnopqrstuvwxyz";

		if (a == b) {
			string answer = "";
			int pointer = 0;

			while (n--) {
				if (pointer == s.size()) {
					pointer = 0;
				}

				answer += s[pointer];
				pointer++;
			}
			cout << answer << endl;
			continue;
		}

		if (b == 1) {
			string answer1 = "";

			for (int i = 0; i < n; i++) {
				answer1 += s[0];
			}

			cout << answer1 << endl;
			continue;
		}


		string sub = "";
		string ans = "";

		for (int i = 0; i < b; i++) {
			sub += s[i];
		}

		int pointer = 0;

		while (n--) {
			if (pointer == b) {
				pointer = 0;
			}

			ans += sub[pointer];
			pointer++;
		}

		cout << ans << endl;

	}

	return 0;
}