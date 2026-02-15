package the9a.sample.api_sample.common.model;

import org.apache.ibatis.type.Alias;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Schema(description = "akc기초정보모델")
@Alias("AkcDefaultApiRequestDTO")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AkcDefaultApiRequestDTO {

	@Schema(description = "사업자번호", example = "1010000522", maxLength = 10)
	private String bizrNo;
	@Schema(description = "OpenApi 암호화 로그인 아이디")
	private String efLoginId;

}
