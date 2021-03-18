package day7;

public class CommandDemo {
	public static void main(String[] args) {
		Tv tv = new Tv();;
		SetTopBox settopbox = new SetTopBox();
		Vgame vgame = new Vgame();
		SoundSystem soundsystem = new SoundSystem();
		
		FatherNewsChannelCommand fncc = new FatherNewsChannelCommand(tv,settopbox,vgame,soundsystem);
		MotherSerialChannelCommand mscc = new MotherSerialChannelCommand(tv,settopbox,vgame,soundsystem);
		FatherVgameCommand fvc = new FatherVgameCommand(tv,settopbox,vgame,soundsystem);
		
		UniversalRemote universalremote = new UniversalRemote();
		universalremote.setSlot(1, fncc);
		universalremote.setSlot(3, mscc);
		universalremote.setSlot(3, fvc);
		
		universalremote.executeCommand(1);
	}
}

class UniversalRemote
{
	Command[] commandarray = new Command[5];
	public UniversalRemote()
	{
		for(int i = 0; i < 5; i++)
		{
			commandarray[i] = new Dummy();
		}
	}
	public void setSlot(int slot, Command command)
	{
		this.commandarray[slot] = command;
	}
	public void executeCommand(int slot)
	{
		this.commandarray[slot].execute();
	}
}

class Dummy extends Command
{
	public void execute()
	{
		System.out.println("Yet to be initiated....");
	}
}

abstract class Command
{
	public Command()
	{
		
	}
	Tv tv;
	SetTopBox settopbox;
	Vgame vgame;
	SoundSystem soundsystem;
	
	public Command(Tv tv, SetTopBox settopbox, Vgame vgame, SoundSystem soundsystem) {
		this.tv = tv;
		this.settopbox = settopbox;
		this.vgame = vgame;
		this.soundsystem = soundsystem;
	}
	
	public Tv getTv() {
		return tv;
	}

	public SetTopBox getSettopbox() {
		return settopbox;
	}

	public Vgame getVgame() {
		return vgame;
	}

	public SoundSystem getSoundsystem() {
		return soundsystem;
	}

	abstract public void execute();
}

class FatherNewsChannelCommand extends Command
{
	public FatherNewsChannelCommand(Tv tv, SetTopBox settopbox, Vgame vgame, SoundSystem soundsystem)
	{
		super(tv,settopbox,vgame,soundsystem);
	}
	@Override
	public void execute()
	{
		System.out.println("Logic for Father News Channel is started....");
		tv.tvOn();
		tv.av1Mode();
		settopbox.newsChannel();
		soundsystem.highSound();
		System.out.println("Enjoy the news...");
	}
}

class MotherSerialChannelCommand extends Command
{
	public MotherSerialChannelCommand(Tv tv, SetTopBox settopbox, Vgame vgame, SoundSystem soundsystem)
	{
		super(tv,settopbox,vgame,soundsystem);
	}
	@Override
	public void execute()
	{
		System.out.println("Logic for Mother Serial Channel is started....");
		tv.tvOn();
		tv.av1Mode();
		settopbox.serialChannel();
		soundsystem.lowSound();
		System.out.println("Enjoy the serials... ");
	}
}

class FatherVgameCommand extends Command
{
	public FatherVgameCommand(Tv tv, SetTopBox settopbox, Vgame vgame, SoundSystem soundsystem)
	{
		super(tv,settopbox,vgame,soundsystem);
	}
	@Override
	public void execute()
	{
		System.out.println("Logic for Father Vgame is started....");
		tv.tvOn();
		vgame.playTennis();
		soundsystem.highSound();
		System.out.println("Enjoy the Tennis Game...");
	}
}

class Tv
{
	public void tvOn()
	{
		System.out.println("Tv On State...");
	}
	public void av1Mode()
	{
		System.out.println("Welcome to AV1 mode...");
	}
	public void vgameMode()
	{
		System.out.println("Welcome to vgame mode....");
	}
}

class SetTopBox
{
	public void newsChannel()
	{
		System.out.println("News Channel is started...");
	}
	public void serialChannel()
	{
		System.out.println("Serial Channel started...");
	}
}

class SoundSystem
{
	public void lowSound()
	{
		System.out.println("Low sound ....");
	}
	public void highSound()
	{
		System.out.println("High Sound....");
	}
}

class Vgame
{
	public void playTennis()
	{
		System.out.println("Tennis is played...");
	}
}