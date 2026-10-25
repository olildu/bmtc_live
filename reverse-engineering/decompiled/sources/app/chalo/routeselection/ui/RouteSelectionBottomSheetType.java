package app.chalo.routeselection.ui;

import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType;", "", "MultipleRouteAvailable", "NoRouteAvailableAvailable", "Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType$MultipleRouteAvailable;", "Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType$NoRouteAvailableAvailable;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteSelectionBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType$MultipleRouteAvailable;", "Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleRouteAvailable extends RouteSelectionBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9188a;
        public final String b;
        public final String c;

        public MultipleRouteAvailable(String str, String str2, List routes) {
            Intrinsics.i(routes, "routes");
            this.f9188a = routes;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleRouteAvailable)) {
                return false;
            }
            MultipleRouteAvailable multipleRouteAvailable = (MultipleRouteAvailable) obj;
            return Intrinsics.d(this.f9188a, multipleRouteAvailable.f9188a) && Intrinsics.d(this.b, multipleRouteAvailable.b) && Intrinsics.d(this.c, multipleRouteAvailable.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9188a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultipleRouteAvailable(routes=");
            sb.append(this.f9188a);
            sb.append(", fromStopName=");
            sb.append(this.b);
            sb.append(", toStopName=");
            return vo1.p(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType$NoRouteAvailableAvailable;", "Lapp/chalo/routeselection/ui/RouteSelectionBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoRouteAvailableAvailable extends RouteSelectionBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9189a;

        public NoRouteAvailableAvailable(String text) {
            Intrinsics.i(text, "text");
            this.f9189a = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoRouteAvailableAvailable) && Intrinsics.d(this.f9189a, ((NoRouteAvailableAvailable) obj).f9189a);
        }

        public final int hashCode() {
            return this.f9189a.hashCode();
        }

        public final String toString() {
            return vo1.B("NoRouteAvailableAvailable(text=", this.f9189a, ")");
        }
    }
}
