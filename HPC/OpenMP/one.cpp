#include <omp.h>
#include <iostream>
#include <thread>

int main()
{
    int count = 0;
    int t = 0;
#pragma omp parallel for schedule(dynamic) private(t) reduction(+ \
                                                                : count)
    for (int i = 1; i <= 100; i++)
    {   t=0;
        std::this_thread::sleep_for(std::chrono::milliseconds(10));

        std::cout << t << ' ';
        count += i;
    }
    std::cout << '\n'
              << count << '\n';
    return 0;
}