clear all
clc
syms t
f=input('Enter the function of t: ');
F=laplace(f);
disp(['L{f(t)}=',char(F)]);