package net.sb.me.spaceHulk;

import net.sb.me.spaceHulk.fsm.IContext;
import net.sb.me.spaceHulk.fsm.IGuards;

final class Guards implements IGuards {
	@Override
	public boolean stealersPlayFirst(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanTakeArtifact(IContext context,
			boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanReload(IContext context, boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanOverwatch(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanMove(IContext context) {
		return true;
	}

	@Override
	public boolean spaceMarineCanManipulateDoor(IContext context,
			boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanFireOnTarget(IContext context) {
		return true;
	}

	@Override
	public boolean spaceMarineCanFire(IContext context, boolean withMessage) {
		return true;
	}

	@Override
	public boolean spaceMarineCanFight(IContext context, boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanDropArtifact(IContext context,
			boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanCancelOverwatch(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean spaceMarineCanActivateArea(IContext context,
			boolean withMessage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notLastArtifactToPlace(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean noVictory(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSpaceMarineJammed(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasUndoAction(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doubleShotWithTargetAvailable(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doubleShotNoTargetAvailableOrFiringSpaceMarineIsNotFlamer(
			IContext context) {
		return true;
	}

	@Override
	public boolean currentPlayingSpaceMarine(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canPlaceSpaceMarine(IContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canPlaceLastSpaceMarine(IContext context) {
		return Main.placed == Main.nbToPlace - 1;
	}

	@Override
	public boolean artifactsToPlace(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean areaFinished(IContext context) {
		// TODO Auto-generated method stub
		return false;
	}
}