#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector <int>vector;
    int q,k,n;
    int data;
    scanf("%d",&q);
    while (q > 0){
        scanf("%d",&n);
        scanf("%d",&k);
        for (int i = 0; i <n ; ++i) {
            scanf("%d",&data);
            vector.push_back(data);
        }
        sort(vector.begin(), vector.end());
     //   printf("(%d) %d-%d = %d\t",2*k ,vector.at(vector.size()-1), vector.at(0), vector.at(vector.size()-1)-vector.at(0));
        if (vector.at(vector.size()-1)-vector.at(0) > 2*k) printf("-1\n");
        else printf("%d\n",vector.at(0)+k);

        vector.clear();
        q--;
    }
}