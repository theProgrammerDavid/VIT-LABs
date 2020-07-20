%Linear Differential EQuation
%Cauchy Euler Equation
clc
clear all
close all
syms y t
eqn=input('Enter the equation : ');
inits = input('Enter the conditions : ');
y=dsolve(eqn, inits, 't');
soln = ['y(t)', char(simplify(y))];
disp(soln);
ezplot(y);

% y(0)=0, y'(0)=1
%y'' + 4*y' + 4*y -exp(-t)