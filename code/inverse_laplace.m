clear all
clc
syms s
F=input('Enter the function of s: ');
f=ilaplace(F);
disp(['f(t)=',char(f)]);