clear all
clc
syms x w
f=input('Enter the function of x: ');
F=laplace(f,x,w);
disp(['L{',char(f),'}=',char(F)]);