//
// Created by mohamedessam on 7/10/19.
//

#include "Solver.h"

vector <int>Solver::EhabIsOddPerson(int n) {
    vector<int>vector;
    int data;
    int odd = 0, even = 0;

    for (int i = 0; i < n ; i++) {
        scanf("%d",&data);
        vector.push_back(data);
    }

    for (int j = 0; j < n ; ++j) {
        if (vector.at(j) % 2 == 0)even++;
        else odd++;
    }
    if (even == 0  || odd == 0){
//        for (auto value : vector)
//            cout << value << " ";
    } else{
        sort(vector.begin(), vector.end());
//        for (auto value : vector)
//            cout << value << " ";
    }
    return vector;
}
