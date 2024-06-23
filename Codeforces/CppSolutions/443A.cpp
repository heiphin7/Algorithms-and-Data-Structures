#include<bits/stdc++.h>
#include <iostream>
#include <unordered_set>

using namespace std;

int main() {
    string s;
    getline(cin, s);

    unordered_set<char> set;

    for (char c : s) {
        if (c != ' ' && c != '{' && c != '}' && c != ',') {
            set.insert(c);
        }
    }

    cout << set.size();
    return 0;
}
