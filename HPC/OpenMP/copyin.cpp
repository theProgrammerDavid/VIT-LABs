#include <omp.h>
#include <iostream>
#include <thread>

int t = 2;
#pragma omp threadprivate(t)

int main()
{
#pragma omp parallel copyin(t)
#pragma omp for schedule(dynamic) 
    for (int i = 1; i <= 100; i++)
    {

#pragma omp critical
        std::cout << t << ' ';
    }
    return 0;
}