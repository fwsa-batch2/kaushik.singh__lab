class EROHN
    def haner
        begin
        #    num = 20/2
        # num = 20/0
        num = nil + 15
            puts "it is begin"
    rescue  StandardError=> e
            puts "there was an error #{e}"
            # ZeroDivisionError   for zero divided
    end
    end
end
obj = EROHN.new
obj.haner