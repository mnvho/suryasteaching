package frc.robot;

public class Autonomous 
{
	String autoSelected = "middleAuto";
	static int surya = 0;
	
	public void runAuto(double lEnc, double rEnc)
	{
		if(autoSelected.equals("middleAuto"))
		{
			middleAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("rightAuto"))
		{
			rightAuto(lEnc, rEnc);
		}
		else if(autoSelected.equals("leftAuto"))
		{
			leftAuto(lEnc, rEnc);
		}
		else
		{
			Motors.leftMotor.set(0);
			Motors.rightMotor.set(0);
		}
	}
	
	public static void middleAuto(double lEnc, double rEnc)
	{
	String autoSelected = "middleAuto";
	double encoderDiff = (Math.abs(rEnc - lEnc));
	double speedDiff = (encoderDiff*0.3/60);
		switch(surya)
		{
			case 0:
				if(rEnc < 4000)
				{
					if(encoderDiff < 6)
					{
						Motors.rightMotor.set(-.7);
						Motors.leftMotor.set(.7);
					}
					else 
					{
						if(rEnc>lEnc)
						{
							Motors.rightMotor.set(-.7 + speedDiff);
							Motors.leftMotor.set(.7 + speedDiff);
						}
						else
						{
							Motors.rightMotor.set(-.7 - speedDiff);
							Motors.leftMotor.set(.7-speedDiff);
						}
					}
				}
			else
			{
				surya = 1;
			}
			break;
			case 1:
			Motors.rightMotor.set(0);
			Motors.leftMotor.set(0);
			Encoders.resetEncoders();
			break;
		}
	}
	
	public static void rightAuto(double lEnc, double rEnc)
	{
	String autoSelected = "middleAuto";
	double encoderDiff = (Math.abs(rEnc - lEnc));
	double speedDiff = (encoderDiff*0.3/60);
		switch(surya)
		{
			case 0:
				if(rEnc < 2000)
				{
					if(encoderDiff < 6)
					{
						Motors.rightMotor.set(-.7);
						Motors.leftMotor.set(.7);
					}
					else 
					{
						if(rEnc>lEnc)
						{
							Motors.rightMotor.set(-.7 + speedDiff);
							Motors.leftMotor.set(.7 + speedDiff);
						}
						else
						{
							Motors.rightMotor.set(-.7 - speedDiff);
							Motors.leftMotor.set(.7 - speedDiff);
						}
					}
				}
			else
			{
				surya = 1;
			}
			break;
			case 1:
				Motors.rightMotor.set(0);
				Motors.leftMotor.set(0);
				Encoders.resetEncoders();
				surya = 2;
				break;
			case 2:
				if(rEnc < 4000)
				{
					if(encoderDiff < 6)
					{
						Motors.rightMotor.set(-.9);
						Motors.leftMotor.set(.3);
					}
					else
					{
						if(rEnc>lEnc)
						{
							Motors.rightMotor.set(-.9);
							Motors.leftMotor.set(.3);
						}
						else
						{
							Motors.rightMotor.set(-.9);
							Motors.leftMotor.set(.3
							);
						}
					}
				}
				else
				{
					surya = 3;
				}
				break;
				case 3:
				Motors.rightMotor.set(0);
				Motors.leftMotor.set(0);
				Encoders.resetEncoders();
				break;
		}
	}

	public static void leftAuto(double lEnc, double rEnc)
	{
	String autoSelected = "middleAuto";
	double encoderDiff = (Math.abs(rEnc - lEnc));
	double speedDiff = (encoderDiff*0.3/60);
		switch(surya)
		{
			case 0:
				if(rEnc < 2000)
				{
					if(encoderDiff < 6)
					{
						Motors.rightMotor.set(-.7);
						Motors.leftMotor.set(.7);
					}
					else 
					{
						if(rEnc>lEnc)
						{
							Motors.rightMotor.set(-.7 + speedDiff);
							Motors.leftMotor.set(.7 + speedDiff);
						}
						else
						{
							Motors.rightMotor.set(-.7 - speedDiff);
							Motors.leftMotor.set(.7 - speedDiff);
						}
					}
				}
			else
			{
				surya = 1;
			}
			break;
			case 1:
				Motors.rightMotor.set(0);
				Motors.leftMotor.set(0);
				Encoders.resetEncoders();
				surya = 2;
				break;
			case 2:
				if(rEnc < 2000)
				{
					if(encoderDiff < 6)
					{
						Motors.rightMotor.set(-.3);
						Motors.leftMotor.set(.9);
					}
					else 
					{
						if(rEnc>lEnc)
						{
							Motors.rightMotor.set(-.3 + speedDiff);
							Motors.leftMotor.set(.9 + speedDiff);
						}
						else
						{
							Motors.rightMotor.set(-.3 - speedDiff);
							Motors.leftMotor.set(.9 - speedDiff);
						}
					}
				}
				else
				{
					surya = 3;
				}
				break;
				case 3:
				Motors.rightMotor.set(0);
				Motors.leftMotor.set(0);
				Encoders.resetEncoders();
				break;
		}
	}
}