package sprites;

import math.Hitbox;

public class Wall extends Sprite implements Collidable{

	@Override
	public void handle(Collidable otherSprite, double[] mtv) {
		
		if(!(otherSprite instanceof MoveableSprite))
			return;
		
		MoveableSprite target = (MoveableSprite) otherSprite;
		
		target.setxPosition(target.getxPosition() + mtv[0]);
		target.setyPosition(target.getyPosition() + mtv[1]);
		
	}

}
