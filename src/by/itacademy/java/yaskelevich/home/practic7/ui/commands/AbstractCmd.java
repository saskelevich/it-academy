package by.itacademy.java.yaskelevich.home.practic7.ui.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractCmd {
    private static final BufferedReader CONSOLE_READER = new BufferedReader(
            new InputStreamReader(System.in));

    private Class<? extends AbstractCmd>[] subCommands;

    @SafeVarargs
    public AbstractCmd(final Class<? extends AbstractCmd>... cmd) {
        if (this.getClass() != CmdHome.class) {
            final Class<? extends AbstractCmd>[] allSubcommands = new Class[cmd.length + 1];
            for (int i = 0; i < cmd.length; i++) {
                allSubcommands[i] = cmd[i];
            }
            allSubcommands[cmd.length] = CmdHome.class; // add default
            this.subCommands = allSubcommands;
        } else {
            this.subCommands = cmd;
        }
    }

    /**
     * Contains code to be executed when user selected current command and also returns the next
     * command
     * 
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws IOException
     */
    public AbstractCmd execute()
            throws InstantiationException, IllegalAccessException, IOException {
        final Class<? extends AbstractCmd> selectNextSubCommand = selectNextSubCommand();
        return selectNextSubCommand.newInstance();
    }

    protected Class<? extends AbstractCmd> selectNextSubCommand() {
        showSubCommands();
        Class<? extends AbstractCmd> selectedCmd = selectCommand();
        while (selectedCmd == null) {
            System.out.println("Input is wrong, try again...");
            showSubCommands();
            selectedCmd = selectCommand();
        }
        return selectedCmd;
    }

    protected String readInput() throws IOException {
        return CONSOLE_READER.readLine();
    }

    private String getDescription(final Class<? extends AbstractCmd> clazz) {
        return getMetadata(clazz).description();
    };

    private String getCommandName(final Class<? extends AbstractCmd> clazz) {
        return getMetadata(clazz).name();
    }

    private Command getMetadata(final Class<? extends AbstractCmd> clazz) {
        final Command annotation = clazz.getAnnotation(Command.class);
        if (annotation == null) {
            throw new IllegalArgumentException(
                    "Class should be annotated with metadata. Class:" + clazz);
        }
        return annotation;
    }

    private void showSubCommands() {
        if (subCommands.length != 0) {
            System.out.println("-----------Select an action-----------");
            for (final Class<? extends AbstractCmd> cmdClass : subCommands) {
                System.out.printf("%s - %s\n", getCommandName(cmdClass), getDescription(cmdClass));
            }
        } else {
            System.out.println("No subcommands to display");
            System.exit(1);
        }
    };

    private Class<? extends AbstractCmd> selectCommand() {
        String cmdName;
        try {
            cmdName = readInput();
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
        for (final Class<? extends AbstractCmd> cmd : subCommands) {
            if (getCommandName(cmd).equalsIgnoreCase(cmdName)) {
                return cmd;
            }
        }
        return null;
    }

}