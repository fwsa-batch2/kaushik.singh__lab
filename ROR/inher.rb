class MULTHR
    def acdmy
        p "We are acdmy student"        
    end   
    
    def inten 
        p "We are finished acdmy now we are inten now"
    end
    
    def gratra
        p "We aregrug from inten to perment emp"
    end    
end

class MUL2 < MULTHR
    def inten
        p "kaushik"
    end
    
    def fresh
        p "ceo of freshworks is G"
    end    
end    


obj = MULTHR.new
obj.inten

manger = MUL2.new   
manger.inten