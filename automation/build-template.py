print("Build Template starting...")
import os

# path specific
PATH_TO_MODELS = "/Users/soraboken/IdeaProjects/Minecraft/yukkuri/src/main/resources/assets/yukkuri/geo"
# this should be changed depends on your working directory

CHARACTERS = []

def noExt(f):
    return f.split('.')[0]
    
def chk_udrscr(s):
    return s.replace("_", "")
    
def up(s):
    return chk_udrscr(s.upper())

def cap(s):
    return chk_udrscr(s.title())

LS = sorted([f.lower() for f in os.listdir(PATH_TO_MODELS)])
for x in LS:
    if x.endswith(".json"):
        CHARACTERS.append(noExt(x))
        
for i in ['Entities', 'Models', 'Renderers']:    
    if not os.path.exists("output/" + i):
        print(i + " folder does not exist! Creating one...")
        os.makedirs("output/" + i)

print("Building Client Renderer...")
with open("output/YukkuriClient.java", "w") as f:
    for i in CHARACTERS:
        f.writelines("EntityRendererRegistry.register(Yukkuri."+ i.upper() +"_YUKKURI_TYPE, "+ i.capitalize() +"Renderer::new);\n")
        
print("Building EntityType...")
with open("output/Yukkuri.java", "w") as f:
    for i in CHARACTERS:
        f.writelines("public static final EntityType<"+ cap(i) +"Entity> "+ up(i)+"_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, \""+ i +"\"), FabricEntityTypeBuilder.<"+ cap(i) +"Entity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory("+ cap(i) +"Entity::new).defaultAttributes("+ cap(i) +"Entity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());\n")

for i in CHARACTERS:
    replacements = {'%string%': i, '%String%': cap(i), '%STRING%': up(i)}
    print("Building " + cap(i) + " Entity...")
    with open('template/Entity.java') as infile, open('output/Entities/'+cap(i)+'Entity.java', 'w') as outfile:
        for line in infile:
            for src, target in replacements.items():
                line = line.replace(src, target)
            outfile.write(line)
    
    print("Building " + cap(i) + " Model...")
    with open('template/Model.java') as infile, open('output/Models/'+cap(i)+'Model.java', 'w') as outfile:
        for line in infile:
            for src, target in replacements.items():
                line = line.replace(src, target)
            outfile.write(line)

    print("Building " + cap(i) + " Renderer...")
    with open('template/Renderer.java') as infile, open('output/Renderers/'+cap(i)+'Renderer.java', 'w') as outfile:
        for line in infile:
            for src, target in replacements.items():
                line = line.replace(src, target)
            outfile.write(line)

print("OK")
