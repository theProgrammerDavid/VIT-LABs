#include <stdlib.h>

#include <stdio.h>

typedef struct process
{

    int processno;

    int AT;

    int BT;

    int BTbackup;

    int WT;

    int TAT;

    int CT;
} process;

struct process p[4];

int totaltime = 0;

int prefinaltotal = 0;

int compare(const void *p1, const void *p2)

{

    return ((process *)p1)->AT > ((process *)p2)->AT;
}

int findlargest(int at)

{

    int max = 0, i;

    for (i = 0; i < 4; i++)
    {

        if (p[i].AT <= at)
        {

            if (p[i].BT > p[max].BT)

                max = i;
        }
    }

    return max;
}

void findCT()

{

    int index;

    int flag = 0;

    int i = p[0].AT;

    while (1)
    {

        if (i <= 4)
        {

            index = findlargest(i);
        }

        else

            index = findlargest(4);

        // cout << "Process executing at time " << totaltime

        //      << " is: P" << index + 1 << "\t";

        printf("Process executing at time %d is P%d \n", totaltime, index + 1);

        p[index].BT -= 1;

        totaltime += 1;

        i++;

        if (p[index].BT == 0)
        {

            p[index].CT = totaltime;

            printf("Process P %d is completed at %d \n", p[index].processno, totaltime);
            // cout << " Process P" << p[index].processno

            //      << " is completed at " << totaltime;
        }
        printf("\n");
        // cout << endl;

        if (totaltime == prefinaltotal)

            break;
    }
}

int main()

{

    int i;

    for (i = 0; i < 4; i++)
    {

        p[i].processno = i + 1;
    }

    for (i = 0; i < 4; i++) // taking AT

    {

        p[i].AT = i + 1;
    }

    for (i = 0; i < 4; i++)
    {

        p[i].BT = 2 * (i + 1);

        p[i].BTbackup = p[i].BT;

        prefinaltotal += p[i].BT;
    }
    printf("PNo\tAT\tBT\n");
    // cout << "PNo\tAT\tBT\n";

    for (i = 0; i < 4; i++)
    {
        printf("%d \t %d \t %d \n", p[i].processno, p[i].AT, p[i].BT);
        // cout << p[i].processno << "\t";

        // cout << p[i].AT << "\t";

        // cout << p[i].BT << "\t";

        // cout << endl;
    }
    printf("\n");
    // cout << endl;

    qsort(p, 4, sizeof(process), compare);
    for (int i = 0; i < 4; i++)
    {
        printf("%d ", p[i].AT);
    }

    totaltime += p[0].AT;

    prefinaltotal += p[0].AT;

    findCT();

    int totalWT = 0;

    int totalTAT = 0;

    for (i = 0; i < 4; i++)
    {

        p[i].TAT = p[i].CT - p[i].AT;

        p[i].WT = p[i].TAT - p[i].BTbackup;

        totalWT += p[i].WT;

        totalTAT += p[i].TAT;
    }

    printf("After execution of all processes ... \n");

    printf("PNo\tAT\tBT\tCT\tTAT\tWT\n");

    for (i = 0; i < 4; i++)
    {
        printf("%d \t %d \t %d \t %d \t %d \t %d \n", p[i].processno,
               p[i].AT, p[i].BTbackup, p[i].CT, p[i].TAT, p[i].WT);
    }

    // cout << endl;
    printf("\n");
    printf("Total TAT: %d \nAverage TAT: %f, \nTotal WT: %d \nAverage WT: %f\n", totalTAT, totalTAT / 4.0, totalWT, totalWT / 4.0);

    return 0;
}