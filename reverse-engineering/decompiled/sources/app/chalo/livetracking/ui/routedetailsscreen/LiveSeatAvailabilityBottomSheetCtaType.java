package app.chalo.livetracking.ui.routedetailsscreen;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType;", "", "Dismiss", "ShowMoreInfo", "Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType$Dismiss;", "Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType$ShowMoreInfo;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveSeatAvailabilityBottomSheetCtaType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType$Dismiss;", "Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dismiss extends LiveSeatAvailabilityBottomSheetCtaType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dismiss f4814a = new Dismiss();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType$ShowMoreInfo;", "Lapp/chalo/livetracking/ui/routedetailsscreen/LiveSeatAvailabilityBottomSheetCtaType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowMoreInfo extends LiveSeatAvailabilityBottomSheetCtaType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4815a;

        public ShowMoreInfo(String infoUrl) {
            Intrinsics.i(infoUrl, "infoUrl");
            this.f4815a = infoUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMoreInfo) && Intrinsics.d(this.f4815a, ((ShowMoreInfo) obj).f4815a);
        }

        public final int hashCode() {
            return this.f4815a.hashCode();
        }

        public final String toString() {
            return vo1.B("ShowMoreInfo(infoUrl=", this.f4815a, ")");
        }
    }
}
