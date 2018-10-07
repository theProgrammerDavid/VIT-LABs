%This file will cover how to generate values
clc
clearvars

fprintf('\n')
disp('This file will cover how to generate values')

fprintf('\n')
disp(' a:b:c ')

disp(' where a = start position ')
fprintf('\n')

disp('b = step interval ')
fprintf('\n')

disp('c=end position')
fprintf('\n')

disp('For example')
a=input('Enter a as stated above : ')
b=input('Enter b as stated above : ')
c=input('Enter c as stated above : ')

disp(char(10))
disp('The generated values are : ')
disp(a:b:c)
