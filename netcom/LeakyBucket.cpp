#include <bits/stdc++.h>
#include <stdio.h>
#include <stdlib.h>
#include <thread>
#include <time.h>

 struct Packet
{

    int priority;

    int packetSize;

    // this will used to initialize the variables
    // of the structure
    Packet(int priority, int packetSize)
        : priority(priority), packetSize(packetSize)
    {
    }
};

// this is an strucure which implements the
// operator overlading
struct comparePacket
{
    bool operator()(Packet const &p1, Packet const &p2)
    {
        // return "true" if "p1" is ordered
        // before "p2", for example:
        return p1.priority < p2.priority;
    }
};
std::mutex m;
std::priority_queue<Packet, std::vector<Packet>, comparePacket> bucket;

const int BUCKET_SIZE = 100;

Packet NewNode()
{
    Packet t(rand(), 8);
    return t;
}

void FillBucket()
{
    while (true)
    {
        Packet x = NewNode();

        m.lock();
        std::cout << "Filling: \tPriority: " << x.priority << "\tSize: " << bucket.size() << "\n";
        bucket.push(x);
        m.unlock();

        std::this_thread::sleep_for(std::chrono::milliseconds(200));
    }
    std::cout << "\n";
}

void EmptyBucket()
{
    while (!bucket.empty())
    {
        m.lock();
        std::cout << "Emptying: \tPriority: " << bucket.top().priority << "\tSize: " << bucket.size() << std::endl;
        bucket.pop();
        m.unlock();

        std::this_thread::sleep_for(std::chrono::milliseconds(500));
    }
    std::cout << '\n';
}

void fillRandom()
{
    for (int i = 0; i < 100; i++)
    {
        bucket.push(NewNode());
    }
}

int main()
{
    srand(time(0));
    fillRandom();

    std::thread t(FillBucket);
    t.detach();

    EmptyBucket();

    return 0;
}