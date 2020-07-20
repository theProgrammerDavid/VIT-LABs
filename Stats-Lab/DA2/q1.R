p = 0.4
x=15

at_least_10_survive = sum ( dbinom (10:x,x,p))

three_to_8_survive= sum (dbinom(3:8,x,p))

exactly_5_survive = sum(dbinom(5,x,p))

plot(0:x,dbinom(0:x,x,p),type="o")

at_least_10_survive
three_to_8_survive
exactly_5_survive