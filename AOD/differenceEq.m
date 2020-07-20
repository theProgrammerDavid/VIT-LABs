%TOIPC:
%HOMOGENEOUS DIFFERENTIAL EQUATION
clc
clear all
syms n k1 k2 m;
 a= input('Enter the coefficients of y(n+2) : ');
 b= input('Enter the coefficients of y(n+1) : ');
 c= input('Enter the coefficients of y(n) : ');
 r = solve(subs(a*m*n + m*b + c, m));
  if imag(r)~=0
     rho = sqrt(real(r(1))^2 + imag(r(1))^2);
     theta = a*tan(abs(imag(r(1))/real(r(1))));
     y1 = (rho^n)*cos(n*theta);
     y2 = (rho^n)*sin(n*theta);
     yc=k1*y1 + k2*y2;
 else if r(1) == r(2)
         y1 = r(1)^n;
         y2=n*r(2)^n;
         yc=k1*y1 + k2*y2;
 else if r(1)~=r(2)
         y1=r(1)^n;
         y2=r(2)^n;
         yc=k1*y1 + k2*y2
     end
     end
  end