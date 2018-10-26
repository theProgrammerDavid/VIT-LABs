clear all
clc
syms x y z real
xa=0;
xb=1;
ya=0+0*x;
yb=1-x;
za=0*x+0*y;
zb=cos(pi*x/2)+0*y;
I=int(int(int(1+0*z,z,za,zb),y,ya,yb),x,xa,xb)
viewSolid(z,za,zb,y,ya,yb,x,xa,xb)