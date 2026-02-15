package the9a.sample.api_sample.common.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Schema ( description = "데이터 응답값" )
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode ( callSuper = true )
public class DataResponseDTO extends DefaultResponseDTO {

	@Schema ( description = "JSON 데이터", example = "{\"aaaa\":\"bbbb\"}" )
	private String data;

}
