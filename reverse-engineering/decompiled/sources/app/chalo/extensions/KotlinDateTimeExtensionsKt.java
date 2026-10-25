package app.chalo.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KotlinDateTimeExtensionsKt {
    public static final long a(LocalDateTime localDateTime, String timezoneId) {
        Intrinsics.i(localDateTime, "<this>");
        Intrinsics.i(timezoneId, "timezoneId");
        TimeZone.INSTANCE.getClass();
        return TimeZoneKt.a(localDateTime, TimeZone.Companion.a(timezoneId)).f();
    }

    public static final LocalDateTime b(LocalDateTime.Companion companion, long j, String timezoneId) {
        Intrinsics.i(companion, "<this>");
        Intrinsics.i(timezoneId, "timezoneId");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j);
        TimeZone.INSTANCE.getClass();
        return TimeZoneKt.c(instantA, TimeZone.Companion.a(timezoneId));
    }
}
