package app.chalo.stoptripdetails.domain;

import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/domain/GetEstimatedTimeUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetEstimatedTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f9504a;
    public final GetTimeTableDisclaimerTextUseCase b;
    public final TimeUtilsContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9505a;

        static {
            int[] iArr = new int[TimeTableStatus.values().length];
            try {
                iArr[TimeTableStatus.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeTableStatus.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeTableStatus.VALID_WITH_DISCLAIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeTableStatus.VALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9505a = iArr;
        }
    }

    public GetEstimatedTimeUseCase(StringProvider stringProvider, GetTimeTableDisclaimerTextUseCase getTimeTableDisclaimerTextUseCase, TimeUtilsContract timeUtilsContract) {
        this.f9504a = stringProvider;
        this.b = getTimeTableDisclaimerTextUseCase;
        this.c = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r15 == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0163, code lost:
    
        if (r15 == r1) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase.a(app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
