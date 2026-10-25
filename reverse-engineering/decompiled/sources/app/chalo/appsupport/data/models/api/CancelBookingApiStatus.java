package app.chalo.appsupport.data.models.api;

import app.chalo.appsupport.data.models.app.CancelBookingStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lapp/chalo/appsupport/data/models/api/CancelBookingApiStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INITIATED", "SUCCESS", "FAILED", "ERROR", "toCancelBookingStatus", "Lapp/chalo/appsupport/data/models/app/CancelBookingStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CancelBookingApiStatus {
    INITIATED,
    SUCCESS,
    FAILED,
    ERROR;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f975a;

        static {
            int[] iArr = new int[CancelBookingApiStatus.values().length];
            try {
                iArr[CancelBookingApiStatus.INITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CancelBookingApiStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CancelBookingApiStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CancelBookingApiStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f975a = iArr;
        }
    }

    public static EnumEntries<CancelBookingApiStatus> getEntries() {
        return $ENTRIES;
    }

    public final CancelBookingStatus toCancelBookingStatus() {
        int i = WhenMappings.f975a[ordinal()];
        if (i == 1) {
            return CancelBookingStatus.Initiated;
        }
        if (i == 2) {
            return CancelBookingStatus.Success;
        }
        if (i == 3) {
            return CancelBookingStatus.Failed;
        }
        if (i == 4) {
            return CancelBookingStatus.Error;
        }
        throw new NoWhenBranchMatchedException();
    }
}
