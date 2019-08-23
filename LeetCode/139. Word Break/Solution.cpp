//
// Created by mohamedessam on 8/23/19.
//

#include <algorithm>
#include <iostream>
#include "Solution.h"

bool Solution::wordBreak(string s, vector <string> &wordDict){
    int check [s.length()+1];
    check[0] = true;
    string subWord;
    for (int i = 0; i < s.length()+1; ++i) {
        for ( int j = 0; j <i ; ++j) {
            if (!check[j]) {
                continue;
            }
            subWord = s.substr(j, (i-j));
                if(find(wordDict.begin(), wordDict.end(),subWord) != wordDict.end()) {
                    check[i]= true;
                    cout << s.substr(j, (i-j)) << endl;
                    break;
                }
        }
    }
    if (check[s.length()]==0) {
        cout<<"false";
        return false;
    }
    return true;

}