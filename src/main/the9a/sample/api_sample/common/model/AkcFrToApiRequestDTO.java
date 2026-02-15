package the9a.sample.api_sample.common.model;

import org.apache.ibatis.type.Alias;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Schema ( description = "akc 기간 정보모델" )
@Alias ( "AkcFrToApiRequestDTO" )
@Data
@SuperBuilder
@EqualsAndHashCode ( callSuper = true )
@NoArgsConstructor
@AllArgsConstructor
public class AkcFrToApiRequestDTO extends AkcDefaultApiRequestDTO {

	@Schema ( description = "요청 기간 시작", example = "20250101", maxLength = 8 )
	private String startDate;
	@Schema ( description = "요청 기간 종료", example = "20251231", maxLength = 8 )
	private String endDate;

}
