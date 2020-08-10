#include <iostream>

using namespace std;

int i, j, k, l;
int fs;
int gs;
int g[20];
int f[20];
int crc[15];
int tf[15];
int rrem[15];
int rs;
int temp[20];
int flag = 0;

void inputs()
{
    //Get Frame
    cout << "\n Enter Frame size: ";
    cin >> fs;

    cout << "\n Enter Frame:";
    for (i = 0; i < fs; i++)
    {
        cin >> f[i];
    }

    //Get Generator
    cout << "\n Enter Generator size: ";
    cin >> gs;

    cout << "\n Enter Generator:";
    for (i = 0; i < gs; i++)
    {
        cin >> g[i];
    }

    cout << "\n Sender Side:";
    cout << "\n Frame: ";
    for (i = 0; i < fs; i++)
    {
        cout << f[i];
    }
    cout << "\n Generator :";
    for (i = 0; i < gs; i++)
    {
        cout << g[i];
    }

    cout << "\n\n";
}

void append_zeros()
{
    rs = gs - 1;
    cout << "\n Number of 0's to be appended: " << rs;
    for (i = fs; i < fs + rs; i++)
    {
        f[i] = 0;
    }

    for (i = 0; i < 20; i++)
    {
        temp[i] = f[i];
    }

    cout << "\n Message after appending 0's :";
    for (i = 0; i < fs + rs; i++)
    {
        cout << temp[i];
    }
}

void division()
{
    for (i = 0; i < fs; i++)
    {
        j = 0;
        k = i;
        //check whether it is divisible or not
        if (temp[k] >= g[j])
        {
            for (j = 0, k = i; j < gs; j++, k++)
            {
                if ((temp[k] == 1 && g[j] == 1) || (temp[k] == 0 && g[j] == 0))
                {
                    temp[k] = 0;
                }
                else
                {
                    temp[k] = 1;
                }
            }
        }
    }
}

void crc_fun()
{

    for (i = 0, j = fs; i < rs; i++, j++)
    {
        crc[i] = temp[j];
    }

    cout << "\n CRC bits: ";
    for (i = 0; i < rs; i++)
    {
        cout << crc[i];
    }

    cout << "\n Transmitted Frame: ";
    for (i = 0; i < fs; i++)
    {
        tf[i] = f[i];
    }
    for (i = fs, j = 0; i < fs + rs; i++, j++)
    {
        tf[i] = crc[j];
    }
    for (i = 0; i < fs + rs; i++)
    {
        cout << tf[i];
    }

    cout << "\n Receiver side : ";
    cout << "\n Received Frame: ";
    for (i = 0; i < fs + rs; i++)
    {
        cout << tf[i];
    }

    for (i = 0; i < fs + rs; i++)
    {
        temp[i] = tf[i];
    }
}

void remainder()
{
    for (i = fs, j = 0; i < fs + rs; i++, j++)
    {
        rrem[j] = temp[i];
    }
    for (i = 0; i < rs; i++)
    {
        cout << rrem[i];
    }

    for (i = 0; i < rs; i++)
    {
        if (rrem[i] != 0)
        {
            flag = 1;
        }
    }
}
void transmission_error()
{
    temp[fs+1]=1;
}
int main()
{
    inputs();
    append_zeros();
    division();
    crc_fun();
    division();

    cout << "\n Remainder: ";
    transmission_error();
    remainder();
    if (flag == 0)
    {
        cout << "\n Since Remainder Is 0 Hence Message Transmitted From Sender To Receriver Is Correct\n";
    }
    else
    {
        cout << "\n Since Remainder Is Not 0 Hence Message Transmitted From Sender To Receriver Contains Error\n";
    }
}
