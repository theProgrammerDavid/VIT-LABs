clear all
clc
syms t
f=input('Enter the function of t: ');
F=laplace(f);
disp(['L{',char(f),'}=',char(F)]);