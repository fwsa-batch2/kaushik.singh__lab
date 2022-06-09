class ENCAP
    def initialize(freshjuice, cococola, pepsi)
        @frsjce = freshjuice
        @coc = cococola
        @pep = pepsi
    end

    def pepl
        puts "freshjuice :  #@frsjce"
        puts "cococola :  #@coc"
        puts "pepsi :  #@pep"
    end
end

obj1 = ENCAP.new('watermelon', 'sugar', 'sugar')
obj2 = ENCAP.new('lemon', 'coco', 'pep')
    obj1.pepl()
    obj2.pepl()