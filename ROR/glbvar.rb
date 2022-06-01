class GLBVAR
    $fwsa = 30
    $elscoach = "Revathi iyer"
    $techcoach = "chitra"
    def els
        puts "The total batch-2 students are #$fwsa"
        puts "The coach for els is #$elscoach"
    end
end    
 class GLB2 
    def tech 
        puts "The total batch-2 students are #$fwsa"
        puts "The coach for tech is #$techcoach"
    end
    
end

obje = GLBVAR.new
obje.els 
objt = GLB2.new 
objt.tech