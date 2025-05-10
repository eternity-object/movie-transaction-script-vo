package org.eternity.script.generic;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor
@Getter
public class PlayTime {
    @Enumerated(EnumType.STRING) @Column(columnDefinition = "varchar(10)")
    private DayOfWeek dayOfWeek;
    @AttributeOverrides(
            value = {
                    @AttributeOverride(name = "startTime", column = @Column(name = "start_datetime")),
                    @AttributeOverride(name = "endTime", column = @Column(name = "end_datetime"))
            }
    )
    private TimeInterval interval;
}
