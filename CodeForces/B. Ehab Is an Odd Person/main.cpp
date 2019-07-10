#include "Solver.h"
using namespace std;

int main()
{
    vector<int>vector;
    Solver solver;
    int n;
    scanf("%d",&n);
    vector = solver.EhabIsOddPerson(n);
    for (auto value : vector)
        cout << value << " ";
    return 0;
}