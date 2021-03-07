#include <omp.h>
#include <iostream>
#include <thread>

int main()
{
    int count = 0;
#pragma omp parallel for schedule(dynamic) reduction(+ \
                                                     : count)
    for (int i = 1; i <= 100; i++)
    {
        count += i;
    }
    std::cout << '\n'
              << count << '\n';
    return 0;
}