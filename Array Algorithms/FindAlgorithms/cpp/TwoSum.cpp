#include <iostream>
#include <vector>
#include <unordered_map>


using namespace std;

int main() {
	int n, target;
	cin >> n >> target;

	vector<int> arr(n);

	for (int i = 0; i < n; ++i) {
		cin >> arr[i];
	}

	// HashMap<Integer, Integer>
	unordered_map<int, int> map;

	for (int i = 0; i < arr.size(); ++i) {
		try {
			int current = map.at(arr[i]);

			// Если мы находим элемент
			cout << i << " " << current;
			return 0;
		}
		catch (const out_of_range& e) {
			map.insert({target - arr[i], i});
		}
	}

	cout << "-1 -1" << endl;
	return 0;
}