# backpack-kata


Historia:

Cuando Durance se fue de casa para iniciar sus aventuras, sólo llevaba consigo una mochila. Con el tiempo, encontró más bolsas pequeñas para guardar sus pertenencias.

Después de hechizar sus armas y buscar ingredientes y materiales durante mucho tiempo, Durance se dio cuenta de que sus bolsas estaban realmente desorganizadas, ¿quizás podamos codificar un hechizo para que las organice?
Requisitos

Crea una aplicación que ayude a Durance a organizar los objetos dentro de sus bolsas. Cada bolsa puede tener o no una categoría, pero la mochila no tendrá ninguna categoría.

Los objetos se meterán siempre a la mochila, si ésta está llena, el objeto se añadirá a la siguiente bolsa disponible.

Una vez organizados los objetos, cada bolsa deberá contener artículos que pertenezcan a su categoría y deberán estar ordenados alfabéticamente. Si la bolsa está llena, el resto de los objetos se guardarán en la mochila o en bolsas sucesivas, siguiendo la clasificación anterior.
Reglas

    Durance tiene 1 mochila y 4 bolsas extra
    Cada bolsa tiene una capacidad de 4 artículos, mientras que la mochila tiene una capacidad de 8 artículos
    Cada bolsa puede tener una categoría, la mochila no tendrá ninguna
    Los objetos se clasifican alfabéticamente tras organizar las bolsas

Ejemplo

Digamos que Durance tiene 8 objetos en su mochila y 1 bolsa extra vacía categorizada para `Metales`:

backpack = ['Leather', 'Iron', 'Copper', 'Marigold', 'Wool', 'Gold',      'Silk', 'Copper']
bag_with_metals_category = []
bag_with_no_category = []
bag_with_weapons_category = []
bag_with_no_category = []

Él encuentra 2 objetos nuevos y, puesto que la mochila ya está llena, estos se guardarán en la siguiente bolsa disponible:

backpack = ['Leather', 'Iron', 'Copper', 'Marigold', 'Wool', 'Gold',      'Silk', 'Copper']
bag_with_metals_category = ['Copper', 'Cherry Blossom']
bag_with_no_category = []
bag_with_weapons_category = []
bag_with_no_category = []

Él ahora lanza el hechizo organizador:
backpack = ['Cherry Blossom', 'Iron', 'Leather', 'Marigold', 'Silk',   'Wool']
bag_with_metals_category = ['Copper', 'Copper', 'Copper', 'Gold']
bag_with_no_category = []
bag_with_weapons_category = []
bag_with_no_category = []

Objetos

{
"clothes": ["Leather", "Linen", "Silk", "Wool"],
"herbs": ["Cherry Blossom", "Marigold", "Rose", "Seaweed"],
"metals": ["Copper", "Gold", "Iron", "Silver"],
"weapons": ["Axe", "Dagger", "Mace", "Sword"]
}
