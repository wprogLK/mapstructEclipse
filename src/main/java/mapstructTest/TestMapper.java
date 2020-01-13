package mapstructTest;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TestMapper {
	@Mapping(source = "myId", target = "myI")
	OtherDto convert(SimpleDto2 dto);
}
