%this file will cover all the basics of plotting functions in 2D and 3D
clc
clearvars


disp('this file will cover all the basics of plotting functions in 2D and 3D')
disp(char(10))


disp('1.  plot ')
disp('2. ezplot ')
disp('3. surface plot')
disp('4. 3D plot ')
disp('5. ezsurf ')
disp('6. colour map')

val=input('Enter value : ');

switch val
    case 1
        clc
        clearvars
        
        disp('Step 1: give some values to plot a graph on ')
        disp('You can use either linspace or the a:b:c ')
        
        disp('here we will use linspace and will generate 50 values from 0 to 100')
        x=linspace(0,100,50);
        
        y=input('Enter function as a vectorized function : ');
       %y=inline(vectorize(y));
        plot(x,y);
    case 2
        clc
        clearvars
        disp('ezplot plots a function but does not require any range to be specified, but range can be specified as an additional argument ' )
        disp('Neither do we need to declare preset values to plot the graph on ')
        disp('But we need to declare a symbolic variable ')
        
        syms x
        
        y=input('Enter the function as you would normally enter it : ')
        
        ezplot(y);
        
        disp('We can also plot the graph with limits')
        r=input('Now enter the limits as [a,b] : ')
        ezplot(y,r);
    case 3
        clc
        clearvars
        disp('A surface plot of a function which is displayed in 3D ')
        disp('In this example, we will use the meshgrid() function along with surf()')
        
        disp('We now generate some data to use via meshgrid. Meshgrid generates data from the domain of the vectors passed to it in the parameter list ')
        disp('We then store this data in 2 arrays to use later ')
        
        
        disp(' [x,y]=meshgrid(-2:.2:2); ')
        [x,y]=meshgrid(-2:.2:2);
        disp('Then we evaluate functions with this data ')
        disp('g=x.*exp(-x^2-y^2);')
        g=x.*exp(-x^2-y^2);
        
        disp('Then we call the function surf(x,y,g)')
        surf(x,y,g)
        
    case 4
        disp('3D plot is essentially a variant of ezsurf(), but with additional arguments')
        disp('The syntax for calling it is : ')
        disp('ezsurf( [function as a string],[xmin,xmax,ymin,ymax],[arguments as a string])')
        
    case 5
        clc
        clearvars
        disp('This is the ezsurf function. it is used to plot a 3D view of the function')
        disp('This does not require any declarations of variables or whatnot')
        disp('You can either use the function with limits or without limits')
        
        disp('For example, we can plot the curve x^2 + y^2 ')
        disp(' ezsurf( [function as a string], [lower limit if any, upper limit if any], [symbols to use while plotting] ) ')
    case 6
        disp('A colour map is essentially just a way to change how your plot looks')
        disp('We can set the colormap (i.e. type of shading) before or after we plot')
        disp('eg. colormap cool')
        disp('Where cool is a type of colormap')
        
end


