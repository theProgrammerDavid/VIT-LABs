!18BCB0142
clc
clear all
close all
syms x n
f(x)=input('Enter the function : ');
a=input('Enter a interval for (a,b):');
b=input('Enter b interval for (a,b):');
nt=input('Enter the number of harmonics : ');
c=(b-a)/2;
a0 = int(f,x,a,b)/c;
an(n)= int(f*cos(n*pi*x/c),x,a,b)/c;
bn(n)= int(f*sin(n*pi*x/c),x,a,b)/c;
fa0=a0/2;
fc=0;fs=0;
for i=1:nt;
    fc=fc + an(i)*cos(i*pi*x/c);
    fs=fs + bn(i)*sin(i*pi*x/c);
end
Fs=fa0 + fc + fs;
disp('Fourier series f(x) = ');
disp(char(Fs))

