package the9a.sample.api_sample.common.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Schema ( description = "기본 응답값" )
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class DefaultResponseDTO {

	@Schema ( description = "에러코드", example = "0000", nullable = false )
	private String errCode;
	@Schema ( description = "에러메세지", example = "성공하였습니다.", nullable = false )
	private String errMsg;
	@Schema ( description = "디버깅메세지", example = "", nullable = true )
	private String devMsg;
	@Schema ( description = "디버깅시리얼", example = "", nullable = true )
	private String devSerial;

	/**
	 * <pre>
	 *	기본 응답 복사처리
	 * </pre>
	 * 
	 * @param src  : 원본객체
	 * @param dest : 복사 대상 객체
	 */
	public final static void copyDefaultValue(DefaultResponseDTO src, DefaultResponseDTO dest) {

		dest.setErrCode(src.getErrCode());
		dest.setErrMsg(src.getErrMsg());
		dest.setDevMsg(src.getDevMsg());
		dest.setDevSerial(src.getDevSerial());

	}

}
