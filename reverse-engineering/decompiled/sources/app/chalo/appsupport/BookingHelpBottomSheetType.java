package app.chalo.appsupport;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "", "CancellationInitiated", "CancellationSuccess", "CancellationFailed", "CancellationError", "None", "Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationError;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationFailed;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationInitiated;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationSuccess;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType$None;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookingHelpBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationError;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancellationError extends BookingHelpBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationError f962a = new CancellationError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationFailed;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancellationFailed extends BookingHelpBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f963a;

        public CancellationFailed(String str) {
            this.f963a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancellationFailed) && Intrinsics.d(this.f963a, ((CancellationFailed) obj).f963a);
        }

        public final int hashCode() {
            String str = this.f963a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("CancellationFailed(errorMsg=", this.f963a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationInitiated;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancellationInitiated extends BookingHelpBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationInitiated f964a = new CancellationInitiated();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType$CancellationSuccess;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancellationSuccess extends BookingHelpBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationSuccess f965a = new CancellationSuccess();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpBottomSheetType$None;", "Lapp/chalo/appsupport/BookingHelpBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends BookingHelpBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f966a = new None();
    }
}
