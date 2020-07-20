clc
clearvars
close all
syms x y
f = input('Enter the function f(x,y): ');
I = input('Enter the point [a,b] around which Taylor series is sought:');
a = I(1);b=I(2);
n=input('enter the order of series:');
tayser=taylor(f,[x,y],[a,b],'order',n)