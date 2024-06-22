#include <iostream>
#include <vector>

using namespace std;

/*
    by @heiphin7

    Нахождение индекса нужного элемента в массиве за O(n), то есть линейное время
    Цикл, который заполняет массив, не считается, так как это ввод данных
*/

int main() {
	int n, target;
	cin >> n >> target;

	vector<int> arr(n);

	for (int i = 0; i < n; ++i) {
		cin >> arr[i];
	}

	for (int i = 0; i < n; ++i) {
		if (arr[i] == target) {
			cout << "index of target in array: " << i << endl;
			return 0;
		}
	}

	cout << "target not founded";
	return 0;
}