package app.chalo.usecase;

import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.sos.data.repository.RaiseSOSRepository;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usecase/RaiseSOSUseCase;", "", "RaiseSOSExceptionType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RaiseSOSUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RaiseSOSRepository f10216a;
    public final UserProfileDetailsProvider b;
    public final ChaloTimeProvider c;
    public final TimeUtilsContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/usecase/RaiseSOSUseCase$RaiseSOSExceptionType;", "", "<init>", "(Ljava/lang/String;I)V", "USER_MOBILE_NUMBER_NOT_FOUND", CLConstants.ERROR_INVALID_REQUEST, "SERVER_ERROR", "LOCAL_ERROR", "UNKNOWN_ERROR", "PARSE_ERROR", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum RaiseSOSExceptionType {
        USER_MOBILE_NUMBER_NOT_FOUND,
        INVALID_REQUEST,
        SERVER_ERROR,
        LOCAL_ERROR,
        UNKNOWN_ERROR,
        PARSE_ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<RaiseSOSExceptionType> getEntries() {
            return $ENTRIES;
        }
    }

    public RaiseSOSUseCase(RaiseSOSRepository raiseSOSRepository, UserProfileDetailsProvider userProfileDetailsProvider, ChaloTimeProvider chaloTimeProvider, TimeUtilsContract timeUtilsContract) {
        this.f10216a = raiseSOSRepository;
        this.b = userProfileDetailsProvider;
        this.c = chaloTimeProvider;
        this.d = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r12 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r10, app.chalo.models.LocationAppModel r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.RaiseSOSUseCase.a(java.util.Map, app.chalo.models.LocationAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
