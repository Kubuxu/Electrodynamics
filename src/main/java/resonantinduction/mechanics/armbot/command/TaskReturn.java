package resonantinduction.mechanics.armbot.command;

import resonantinduction.mechanics.armbot.TaskBaseProcess;

public class TaskReturn extends TaskRotateTo
{
	public TaskReturn()
	{
		super("Return", 0, 0);
	}

	@Override
	public TaskBaseProcess clone()
	{
		return new TaskReturn();
	}

}
