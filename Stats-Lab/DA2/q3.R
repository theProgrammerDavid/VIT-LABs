d=10.075
sigma = 0.03
x=seq(0,20,0.2)

y=dnorm(x,mean=10,sd=2)

p_10.075mm= pnorm (d,10,sigma)
p_exceed_d= 1-p_10.075mm

p_piston_ring = pnorm ( 10.03,10,sigma) - pnorm ( 9.97, 10 , sigma)

p_exceed_d
p_piston_ring

plot(x,y)