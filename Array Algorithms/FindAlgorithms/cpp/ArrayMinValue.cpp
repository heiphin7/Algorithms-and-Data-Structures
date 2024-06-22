	#include <iostream>
	#include <vector>

	using namespace std;

	/*
	    by @heiphin7

	    Ќахождение минимальное значени€ за линейное врем€ O(n)
	*/

        int findMinValue() {
            int n, target;
            cin >> n >> target;

            vector<int> arr(n);

            for (int i = 0; i < n; ++i) {
                cin >> arr[i];
            }

            int min = arr[0];

            for (int i = 1; i < n; ++i) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            return min;
        }
    };