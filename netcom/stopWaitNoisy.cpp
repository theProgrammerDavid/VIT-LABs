#include <bits/stdc++.h>
#include <ctime>
#include <cstdlib>

using namespace std;

string buffer;
int wire;

int counter = 0;
std::mutex m;

bool lossFunction()
{
    return (rand() % 10 == 4);
}

void sender()
{
    while (true)
    {
        if (lossFunction())
        {
            counter++;
            continue;
        }
        std::this_thread::sleep_for(std::chrono::milliseconds((rand() % 8) * 100));
        m.lock();
        buffer = "";
        wire = -1;

        buffer = to_string(counter);
        cout << counter << " sent" << endl;
        m.unlock();

        std::this_thread::sleep_for(std::chrono::milliseconds((rand() % 8) * 100));

        m.lock();
        if (wire != -1)
        {
            cout << counter << " Ack received\n"
                 << endl;
            ;
        }
        else
        {
            cout << counter << " Ack not Received\n"
                 << endl;
            ;
        }
        m.unlock();
        counter++;
    }
}

void receiver()
{
    while (true)
    {

        if (lossFunction())
        {

            continue;
        }

        std::this_thread::sleep_for(std::chrono::milliseconds((rand() % 8) * 100));
        m.lock();
        if (buffer != "")
        {
            cout << "Receiver received " << buffer << '\n'
                 << endl;
        }
        m.unlock();
        std::this_thread::sleep_for(std::chrono::milliseconds((rand() % 8) * 100));
    }
}

int main()
{
    srand((unsigned)time(0));

    thread t1(sender);
    t1.detach();

    receiver();

    return 0;
}