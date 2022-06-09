class POLYMO
    def fresh
        puts "I am kaushik from fwsa"
    end
end

class student < POLYMO
    def fresh
        puts "working on final project"
    end
end

class inten < POLYMO
    def fresh
        puts"If we finished projet then we are placed to inten"
    end 
end

obj = POLYMO.new
obj.fresh

obj = student.new
obj.fresh

obj = inten.new
obj.fresh