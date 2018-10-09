clear all
clc
syms t w
f=input('Enter the function of t: ');
F=laplace(f,w);
disp(['L{',char(f),'}=',char(F)]);