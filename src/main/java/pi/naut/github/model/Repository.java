package pi.naut.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {
	private long id;
	private String name;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("private")
	private boolean isPrivate;
}
