
; You may customize this and other start-up templates; 
; The location of this template is c:\emu8086\inc\0_com_template.txt


; add your code here

ASSUME CS:CODE, DS: DATA

DATA SEGMENT
    BUFFER DB 08
    DB 09 DUP(?)
DATA ENDS

CODE SEGMENT
    START:
    MOV AX, DATA
    MOV DS, AX
    
    MOV DX, OFFSET BUFFER
    MOV AH, 0AH
    INT 21H
    
    MOV AH, 4CH
    INT 21H
    CODE ENDS
END START





