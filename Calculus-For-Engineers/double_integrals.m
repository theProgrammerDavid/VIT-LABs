%Double Integral for Area

%The curves are y=x^2 and y=x+2

int(int(1,y,x+2,x^2),x,-1,2)
int(int(16-x^2-y^2,x,(y^2)/4,(y+2)/4),y,0,1)
syms r theta
int(int(r^3,r,1/sin(theta),2),theta,(22/42),(22/21))