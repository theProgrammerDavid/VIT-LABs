/*
 * MY INTERPRETATION OF THE 
 * STOP AND WAIT PROTOCOL FOR NOISELESS TRANSMISSION
 * */

#include <bits/stdc++.h>

using namespace std;

string buffer;
int counter = 0;
bool ack = false;
std::mutex m;
std::mutex m_ack;

void flush_buffer()
{
    m.lock();
    buffer = "EMPTY";
    m.unlock();
}

void sender()
{
    while (true)
    {
        m.lock();
        buffer = std::string("message number ") + to_string(counter);
        counter++;
        m.unlock();

        //and check for ack
        std::this_thread::sleep_for(std::chrono::milliseconds(1000));
        m_ack.lock();
        if (!ack)
        {
            cout << "Ack not received \n";
        }
        else
        {
            cout << counter << " received\n";
            ack = false;
        }
        m_ack.unlock();
    }
}

void receiver()
{
    while (true)
    {
        m.lock();
        if (buffer.compare("EMPTY") != 0)
        {
            m_ack.lock();
            ack = true;
            m_ack.unlock();
        }
        m.unlock();
    }
}

int main()
{

    thread t1(sender);
    t1.detach();

    receiver();

    return 0;
}
