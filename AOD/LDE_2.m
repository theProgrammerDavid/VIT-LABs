clc
clear all
close all
syms x C1 C2
K=input('Enter [k1 k2] for the DE D^2y + k1Dy + k2y = Q(x) : ');
Q=input('Enter Q(x) for DE D^2y + k1Dy + k2y = Q(x) : ');
R=roots([1 K(1) K(2)]);
rr= K(1)^2 -4*K(2);

if rr > 0
    y1(1) = exp(R(1)*x);
    y2(2)=exp(R(2)*x);
    CF=C1*y1(x) + C2*y2(x);
end
 if rr == 0
      y1(x)=exp(R(1)*x);
        y2(x)=exp(R(2)*x);
        CF=C1*y1(x) + C2*y2(x);
 else
        
       y1(x)=exp(real(R(1)*x))*cos(abs(imag(R(1)*x)));
        y2(x)=exp(real(R(2)*x))*sin(abs(imag(R(2)*x)));
        CF= C1*y1(x) + C2*y2(x);
    end
     Dy1=diff(y1,x);    Dy2=diff(y2,x);
    W=det([y1 y2; Dy1 Dy2]);
    PI = -y1*int((y2*Q)/W,x) + y2*int((y1*Q)/W,x);
    disp('complete solution is : ');
    y=CF + PI;
    disp(y);
