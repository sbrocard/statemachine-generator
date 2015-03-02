/**
* This code is generated
*/
package net.sb.me.spaceHulk.fsm;

public interface IGuards {
	boolean stealersPlayFirst(IContext context);
	boolean canPlaceSpaceMarine(IContext context);
	boolean canPlaceLastSpaceMarine(IContext context);
	boolean areaFinished(IContext context);
	boolean artifactsToPlace(IContext context);
	boolean notLastArtifactToPlace(IContext context);
	boolean currentPlayingSpaceMarine(IContext context);
	boolean doubleShotWithTargetAvailable(IContext context);
	boolean doubleShotNoTargetAvailableOrFiringSpaceMarineIsNotFlamer(IContext context);
	boolean noVictory(IContext context);
	boolean spaceMarineCanFire(IContext context, boolean withMessage);
	boolean spaceMarineCanFight(IContext context, boolean withMessage);
	boolean spaceMarineCanManipulateDoor(IContext context, boolean withMessage);
	boolean spaceMarineCanFireOnTarget(IContext context);
	boolean spaceMarineCanMove(IContext context);
	boolean spaceMarineCanOverwatch(IContext context);
	boolean spaceMarineCanReload(IContext context, boolean withMessage);
	boolean spaceMarineCanTakeArtifact(IContext context, boolean withMessage);
	boolean spaceMarineCanDropArtifact(IContext context, boolean withMessage);
	boolean spaceMarineCanActivateArea(IContext context, boolean withMessage);
	boolean spaceMarineCanCancelOverwatch(IContext context);
	boolean isSpaceMarineJammed(IContext context);
	boolean hasUndoAction(IContext context);
}
