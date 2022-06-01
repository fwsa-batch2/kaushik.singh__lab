class CLSVAR
    @@no_of_followers = 532
    def initialize (name,frnd,posts)
        @inst_name=name
        @inst_frnd=frnd
        @inst_posts=posts
    end

    def user
        puts "User name #@inst_name"
        puts "inst bio #@inst_frds"
        puts "inst posts #@inst_posts"
    end

    def follower 
        @@no_of_followers +=1
        puts "no of followers = #@@no_of_followers"
    end    
    
end
obj1=CLSVAR.new("Damon","Aswin","21")
obj2=CLSVAR.new("klaus","Gowatham","10")
obj1.user()
obj1.follower()
obj2.user()
obj2.follower()

