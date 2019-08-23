#include <iostream>
#include "Solution.h"

int main() {
    Solution solution;
    vector <string>vector;
    string s = "catsandog";
    vector.push_back("cats");
    vector.push_back("dog");
    vector.push_back("sand");
    vector.push_back("and");
    vector.push_back("cat");
    solution.wordBreak(s, vector);
    return 0;
}