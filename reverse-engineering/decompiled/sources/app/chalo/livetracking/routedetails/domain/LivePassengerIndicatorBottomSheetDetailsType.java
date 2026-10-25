package app.chalo.livetracking.routedetails.domain;

import androidx.webkit.Profile;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType;", "", "WithNotice", "WithoutNotice", Profile.DEFAULT_PROFILE_NAME, "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$Default;", "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$WithNotice;", "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$WithoutNotice;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LivePassengerIndicatorBottomSheetDetailsType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$Default;", "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends LivePassengerIndicatorBottomSheetDetailsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f4441a = new Default();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$WithNotice;", "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WithNotice extends LivePassengerIndicatorBottomSheetDetailsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4442a;

        public WithNotice(String str) {
            this.f4442a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithNotice) && Intrinsics.d(this.f4442a, ((WithNotice) obj).f4442a);
        }

        public final int hashCode() {
            return this.f4442a.hashCode();
        }

        public final String toString() {
            return vo1.B("WithNotice(recommendedCapacityNotice=", this.f4442a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType$WithoutNotice;", "Lapp/chalo/livetracking/routedetails/domain/LivePassengerIndicatorBottomSheetDetailsType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithoutNotice extends LivePassengerIndicatorBottomSheetDetailsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WithoutNotice f4443a = new WithoutNotice();
    }
}
