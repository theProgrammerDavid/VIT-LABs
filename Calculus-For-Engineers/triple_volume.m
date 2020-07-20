%Triple Integral
%find volume enclosed between the surfaces
clear all
clc
syms x y z
xa=-2;
xb=2;
ya=-sqrt(2-x^2/2);
yb=sqrt(2-x^2/2);
za=x^2+3*y^2;
zb=8-x^2-y^2;
I=int(int(int(1+0*z,z,za,zb),y,ya,yb),x,xa,xb)
viewSolid(z,za,zb,y,ya,yb,x,xa,xb)