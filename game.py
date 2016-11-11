import random
import math
class ship:
  image = 
  k = 0
  def __init__(self, pos, vel, rotation):
    self.pos = pos
    self.vel = vel
    self.r = rotation
class asteroid:
  image =
  asteriodls = []
  def __init__(self, pos, vel, rotation, scale):
    self.pos = pos
    self.vel = vel
    self.rotation = rotation
    self.scale
    asteriodls.append(self)
  def split(self, pos, vel, rotation, relitave_angle, scale)
    self.rotation = rotation + relative_angle/3
    k = math.sqrt(vel[0]**2 + vel[1]**2)
    self.vel = [k*math.cos(rotation + relative_angle/3), k*math.sin(rotation + relative_angle/3)]
    self.pos = pos
    k = random.random()
    self.scale = k*scale
    asteroidls.append(asteroid(pos, [k*math.cos(rotation - relative_angle/3), k*math.sin(rotation - relative_angle/3)], rotation-relitave_angle/3, scale*(1-k)))
