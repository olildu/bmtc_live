package app.chalo.usecase;

import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateKt;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetTimeInMillisAfterXTimeUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTimeInMillisAfterXTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f10195a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10196a;

        static {
            int[] iArr = new int[MillisAfterTimeFormatType.values().length];
            try {
                iArr[MillisAfterTimeFormatType.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MillisAfterTimeFormatType.START_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MillisAfterTimeFormatType.END_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10196a = iArr;
        }
    }

    public GetTimeInMillisAfterXTimeUseCase(TimeUtilsContract timeUtilsContract) {
        this.f10195a = timeUtilsContract;
    }

    public final long a(long j, long j2, MillisAfterTimeFormatType formatType) {
        Intrinsics.i(formatType, "formatType");
        Instant.INSTANCE.getClass();
        Instant instantA = Instant.Companion.a(j + j2);
        TimeZone.Companion companion = TimeZone.INSTANCE;
        TimeUtilsContract timeUtilsContract = this.f10195a;
        String strB = timeUtilsContract.b();
        companion.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(instantA, TimeZone.Companion.a(strB));
        int i = WhenMappings.f10196a[formatType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                localDateTimeC = LocalDateKt.a(localDateTimeC.a(), 0, 0, localDateTimeC.l(), 8);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                localDateTimeC = LocalDateKt.a(localDateTimeC.a(), 23, 59, localDateTimeC.l(), 8);
            }
        }
        return TimeZoneKt.a(localDateTimeC, TimeZone.Companion.a(timeUtilsContract.b())).f();
    }
}
