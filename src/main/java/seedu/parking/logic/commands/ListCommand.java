package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_CARPARK;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;

/**
 * Lists all carparks in the address book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";
    public static final String COMMAND_ALIAS = "l";

    public static final String MESSAGE_SUCCESS = "Listed all car parks";


    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        requireNonNull(model);
        model.updateFilteredCarparkList(PREDICATE_SHOW_ALL_CARPARK);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}