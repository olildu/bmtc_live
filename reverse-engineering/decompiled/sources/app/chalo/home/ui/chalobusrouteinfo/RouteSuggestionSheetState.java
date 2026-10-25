package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState;", "", "Form", InitializationStatus.SUCCESS, "Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState$Form;", "Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteSuggestionSheetState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState$Form;", "Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Form extends RouteSuggestionSheetState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f3370a;
        public final PBStopPlaceSelectedAppModel b;
        public final RouteSuggestionReachByTime c;
        public final boolean d;

        static {
            PBStopPlaceSelectedAppModel.Companion companion = PBStopPlaceSelectedAppModel.INSTANCE;
        }

        public Form(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, RouteSuggestionReachByTime routeSuggestionReachByTime, boolean z) {
            this.f3370a = pBStopPlaceSelectedAppModel;
            this.b = pBStopPlaceSelectedAppModel2;
            this.c = routeSuggestionReachByTime;
            this.d = z;
        }

        public static Form a(Form form, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, RouteSuggestionReachByTime routeSuggestionReachByTime, boolean z, int i) {
            if ((i & 1) != 0) {
                pBStopPlaceSelectedAppModel = form.f3370a;
            }
            if ((i & 2) != 0) {
                pBStopPlaceSelectedAppModel2 = form.b;
            }
            if ((i & 4) != 0) {
                routeSuggestionReachByTime = form.c;
            }
            if ((i & 8) != 0) {
                z = form.d;
            }
            form.getClass();
            return new Form(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, routeSuggestionReachByTime, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Form)) {
                return false;
            }
            Form form = (Form) obj;
            return Intrinsics.d(this.f3370a, form.f3370a) && Intrinsics.d(this.b, form.b) && Intrinsics.d(this.c, form.c) && this.d == form.d;
        }

        public final int hashCode() {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.f3370a;
            int iHashCode = (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode()) * 31;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.b;
            int iHashCode2 = (iHashCode + (pBStopPlaceSelectedAppModel2 == null ? 0 : pBStopPlaceSelectedAppModel2.hashCode())) * 31;
            RouteSuggestionReachByTime routeSuggestionReachByTime = this.c;
            return ((iHashCode2 + (routeSuggestionReachByTime != null ? routeSuggestionReachByTime.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return "Form(pickupLocation=" + this.f3370a + ", dropLocation=" + this.b + ", reachByTime=" + this.c + ", isTimePickerVisible=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState$Success;", "Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionSheetState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends RouteSuggestionSheetState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f3371a = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 711249333;
        }

        public final String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
