# BattleSlimes

## Introduction

BattleSlimes is an NFT monster collecting game built upon the Ethereum Blockchain.

Players collect NFTs which represent in game assets. The main example of this are the *BattleSlimes* which are hand drawn pixel art characters.

The gameplay is a turn based take on Rock, Paper, scissors heavily inspired by Pokemon, Monster Stories 2, and Final Fantasy. 


About BattleSlimes:

1. Each Defence  is categorized as one of 3 *Types*. (Attack, Defence, Special)
2. There is a *Master Collection* of BattleSlimes, which describes each created *BattleSlime*.
3. Each *BattleSlime* in the *Master Collection* is unique and has a uniqe *Collector Number* and *Name*.
4. Each *BattleSlime* has a unique *Special Ability* to be used in *Battles*
5. Each *BattleSlime* has *Hitpoints* or *"HP"* for short. Which describes how much *Damage* a *BattleSlime* can withstand before being *Knocked Out* or *KOd* for short. 
6. Each *BattleSlime* has *SlimePoints`* or *"SP"* for short. *SlimePoints* are needed to use a *BattleSlime*'s *Special Ability*.

Gameplay:
1. Players create *Teams* of 3 BattleSlimes (Can be the same BattleSlime). Which are used to *Battle* the other player.
2. *HP* is taken away from *Successful Attacks*. A *Special Ability* may sometimes give *HP*.
3. Players choose between *Attack*, *Block*, *Slime*, or *Swap* for a turn's action.
4. A *Successful Attack* is determined by (Attack > Block > Slime > Attack). A *Successful Attack* damages the opposing *BattleSlime* and gains *SP*. (Bonus *SP* is gained if a *Successful Attack* is done with the action releated to the *Type* of *BattleSlime*)
5. *Swap* allows the player to swap the active slime. When a *BattleSlime* is swapped in, the *Type* of slime is immediately used. 


Combos: 

A + A + A = 2 Damage 

D + D + D = Heal 1 to Entire Team

S + S + S = Gain 2 SP 

A + D + S = Heal 2 HP

A + D + A = Gain 1 SP

D + A + D = Gain 1 SP

## Art

The Pixel Art uses the color palette [ENDESGA 64](https://lospec.com/palette-list/endesga-64).

Each art entity base is 4 colors. 
1. Outline
2. Main Color
3. Top highlight (Drawn along the top outline, +1 Pixel down)
4. Botton contrast (Drawn along the bottom outline)

ENDESGA 64 Palette:

```
#ff0040
#131313
#1b1b1b
#272727
#3d3d3d
#5d5d5d
#858585
#b4b4b4
#ffffff
#c7cfdd
#92a1b9
#657392
#424c6e
#2a2f4e
#1a1932
#0e071b
#1c121c
#391f21
#5d2c28
#8a4836
#bf6f4a
#e69c69
#f6ca9f
#f9e6cf
#edab50
#e07438
#c64524
#8e251d
#ff5000
#ed7614
#ffa214
#ffc825
#ffeb57
#d3fc7e
#99e65f
#5ac54f
#33984b
#1e6f50
#134c4c
#0c2e44
#00396d
#0069aa
#0098dc
#00cdf9
#0cf1ff
#94fdff
#fdd2ed
#f389f5
#db3ffd
#7a09fa
#3003d9
#0c0293
#03193f
#3b1443
#622461
#93388f
#ca52c9
#c85086
```

## Insparations

- [Neutronized](https://www.neutronized.com/) (Art Style)
- [Monster Hunter Stories](https://www.polygon.com/monster-hunter-stories-2-wings-of-ruin-guide/22558083/mhs-2-combat-head-to-head-double-attacks-kinship-gauge) (BattleStyle)