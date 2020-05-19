package test.data_visualisation.resource.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Participant
{
	private String participant_id;
	private List<ParticipantType> participant_type;
	private List<String> product_range;
	private Map<ParticipantType, List<Transaction>> transaction_history = new HashMap<>();
	
}
