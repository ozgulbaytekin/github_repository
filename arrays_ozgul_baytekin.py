


import numpy as np
import random

def replace_center_with_minus_one(d,n,m):
    if(m>n):
        print("m can not bigger than n")
    elif(d<=0):
        print("d can not be equal to or smaller than 0")
    elif(n<0):
        print("n can not be negative")
    elif(m<0):
        print("m can not be negative")
    else:
        my_matrix = []
        for row in range(n):
            row = []
            for element in range(n):
                row.append(random.randint(10**(d-1),10**d))
            my_matrix.append(row)
        
        
        for i in range(1,m+1):
            for j in range(1,m+1):
                my_matrix[i][j]=-1
            
        for row in my_matrix:
            print(row)
replace_center_with_minus_one(1,5,3)

