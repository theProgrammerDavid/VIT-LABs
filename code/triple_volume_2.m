clear all
clc
syms x y z
ya=-2;
yb=2;
xa=-sqrt(4-y^2);
xb=sqrt(4-y^2);
za=0+0*x+0*y;
zb=3-x-0*y;
I=int(int(int(1+0*z,z,za,zb),x,xa,xb),y,ya,yb)
viewSolidone(z,za,zb,x,xa,xb,y,ya,yb)