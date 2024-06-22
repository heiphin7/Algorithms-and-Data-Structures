#include <iostream>
#include <vector>


using namespace std;

void solve() {
	string s;
	cin >> s;

	int pointer = 1;

	for (int i = 0; i < s.size(); ++i) {
		if (s[i]=='W' && s[i+1]=='U' && s[i+2]=='B') {
			i += 2;
			if (!pointer) {
				cout << " ";
			}
			continue;
		} else {
			pointer = 0;
			cout << s[i];
		}
	}
}

int main() {
	solve();
	return 0;
}