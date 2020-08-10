#include <iostream>

#include <stdlib.h>

using namespace std;

#define maxlength 10

#define maxmessages 10

void initialize(int arr[][10], int m, int n)

{

    for (int i = 0; i < m; i++)

        for (int j = 0; j < n; j++)

        {

            arr[i][j] = rand() % 2;
        }
}

void print(int arr[][10], int m, int n)

{

    for (int i = 0; i < m; i++)

    {
        for (int j = 0; j < n; j++)

        {

            cout << arr[i][j] << " ";
        }

        cout << endl;
    }
}

void addparbit(int arr[][10], int m, int n) // Even Parity

{

    for (int i = 0; i < m; i++)

    {

        int count = 0;

        for (int j = 0; j < n; j++)

        {

            if (arr[i][j] == 1)

                count++;
        }

        if (count % 2 == 0)

            arr[i][n] = 0;

        else

            arr[i][n] = 1;
    }
}

void induceerror(int arr[][10], int m, int n)

{

    int k1, k2;

    k1 = rand() % m;

    k2 = rand() % n;

    if (arr[k1][k2] == 0)

        arr[k1][k2] = 1;

    else

        arr[k1][k2] = 0;

    cout << "Inducing error at line : " << k1 << endl;
}

void checkerror(int arr[][10], int m, int n)

{

    for (int i = 0; i < m; i++)

    {

        int count = 0;

        for (int j = 0; j < n; j++)

        {

            if (arr[i][j] == 1)

                count++;
        }

        if (count % 2 == 0 && arr[i][n] != 0)

        {

            cout << "Error here at line : " << i;
        }

        else if (count % 2 == 1 && arr[i][n] != 1)

        {

            cout << "Error here at line :  " << i;
        }
    }
}

int main()

{
    int m, n, arr[maxmessages][maxlength];

    cout << "Enter total number of messages: ";

    cin >> m;

    cout << "Enter length of each message: ";

    cin >> n;

    initialize(arr, m, n);

    print(arr, m, n);

    addparbit(arr, m, n);

    print(arr, m, n + 1);

    induceerror(arr, m, n);

    print(arr, m, n + 1);

    checkerror(arr, m, n);

    return 0;
}