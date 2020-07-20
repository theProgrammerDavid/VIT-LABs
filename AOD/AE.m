clc
close all
syms c1 c2 x m
F= input('Enter the coeffieients [a,b,c] : ');
f=input('Enter the RHS function f(x) : ');
a=F(1);
B=F(2); C=F(3);

AE = a*m^2 + b*m + c ; %Auxiliary Equation
m=solve(AE);
m1=m(1); m2=m(2);

D=b^2 - 4*a*c ;

if (D>0) % roots are real and different
    y1=exp(m1*x);
    y2=exp(m2*x);
end
if (D==0)%roots are real and equal
    y1=exp(m1*x);
    y2=exp(m2*x);
else %roots are complex
    alfa= real(m1);
    beta = imag(m1);
    y1=exp(alfa*x)* cos(beta*x);
    y2=exp(alfa*x)*sin(beta*x);
end