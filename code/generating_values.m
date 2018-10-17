%This file will cover how to generate values
clc
clearvars

disp('1. normal way of generating values')
disp('2. generating values using linspace')

val=input('Enter value : ')

switch val
    case 1
        clc
        
        disp('This file will cover how to generate values')

        
        disp(' a:b:c ')

        disp(' where a = start position ')
        

        disp('b = step interval ')
        

        disp('c=end position')
     

        disp('For example')
        a=input('Enter a as stated above : ');
        b=input('Enter b as stated above : ');
        c=input('Enter c as stated above : ');

        disp(char(10))
        disp('The generated values are : ')
        disp(a:b:c)

    case 2
        
        disp('Generating values using linspace')
        clc
        clearvars

        a=input('Enter start point : ');
        b=input('Enter end point : ');
        c=input('Enter the no of elements : ');

        disp(linspace(a,b,c))
end






