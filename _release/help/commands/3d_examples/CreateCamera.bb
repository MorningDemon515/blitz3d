; CreateCamera Example
; --------------------

Graphics3D 640,480
SetBuffer BackBuffer()

; Create camera
camera=CreateCamera()

light=CreateLight()

cone=CreateCone()
PositionEntity cone,0,0,5

While Not KeyDown( 1 )
RenderWorld
Flip
Wend

End