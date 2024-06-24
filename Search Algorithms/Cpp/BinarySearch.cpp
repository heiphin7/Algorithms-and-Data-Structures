#include <iostream>
#include <vector>

using namespace std;

int binarySearch(vector<int> arr, int target) {
	if (arr.size() == 0) {
		return -1;
	}

	int low = 0;
	int high = arr.size() - 1;

	while (low <= high) {
		int mid = low + ((high - low) / 2);

		if (arr[mid] == target) {
			return mid;
		}

		if (target > arr[mid]) {
			low = mid + 1;
		}
		else {
			high = mid - 1;
		}
	}

	return -1;
}

