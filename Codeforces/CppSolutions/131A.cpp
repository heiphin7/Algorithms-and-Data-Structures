#include <iostream>
#include <vector>
#include <cctype>

using namespace std;

int main() {
	string s;
	cin >> s;

	bool isFullUpper = true;
	bool isFullLower = true;
	bool isNormal = true;

	for (int i = 0; i < s.size(); ++i) {
		if (!isupper(s[i]) && isFullUpper) {
			isFullUpper = false;
		}

		if (!islower(s[i]) && isFullLower ) {
			isFullLower = false;
		}

		if (i == 0 && isNormal) {
			if (isupper(s[i])) {
				isNormal = false;
			}
		} else if (i != 0 && isNormal) {
			if (!isupper(s[i])) {
				isNormal = false;
			}
		}
	}

	if (isFullUpper) {
		for (int i = 0; i < s.size(); ++i) {
			char c = tolower(s[i]);
			s[i] = c;
		}
	} else if (isNormal) {
		for (int i = 0; i < s.size(); ++i) {
			char c;
			if (i == 0) {
				c = toupper(s[i]);
			}
			else {
				c = tolower(s[i]);
			}
			s[i] = c;
		}
	}

	cout << s;
	return 0;
}