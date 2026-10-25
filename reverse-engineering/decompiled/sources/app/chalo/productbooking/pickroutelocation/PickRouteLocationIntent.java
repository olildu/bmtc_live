package app.chalo.productbooking.pickroutelocation;

import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "", "InitialIntent", "RouteSearchedIntent", "RouteSelectedIntent", "ClearSearchTextFieldIntent", "BackButtonPressIntent", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$BackButtonPressIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$InitialIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$RouteSearchedIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$RouteSelectedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PickRouteLocationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$BackButtonPressIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackButtonPressIntent extends PickRouteLocationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackButtonPressIntent f8280a = new BackButtonPressIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackButtonPressIntent);
        }

        public final int hashCode() {
            return -1373751208;
        }

        public final String toString() {
            return "BackButtonPressIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClearSearchTextFieldIntent extends PickRouteLocationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearSearchTextFieldIntent f8281a = new ClearSearchTextFieldIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearSearchTextFieldIntent);
        }

        public final int hashCode() {
            return -2040601438;
        }

        public final String toString() {
            return "ClearSearchTextFieldIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$InitialIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends PickRouteLocationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8282a;

        public InitialIntent(boolean z) {
            this.f8282a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialIntent) && this.f8282a == ((InitialIntent) obj).f8282a;
        }

        public final int hashCode() {
            return this.f8282a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("InitialIntent(isForMobileTicketing=", ")", this.f8282a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$RouteSearchedIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSearchedIntent extends PickRouteLocationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8283a;

        public RouteSearchedIntent(String query) {
            Intrinsics.i(query, "query");
            this.f8283a = query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteSearchedIntent) && Intrinsics.d(this.f8283a, ((RouteSearchedIntent) obj).f8283a);
        }

        public final int hashCode() {
            return this.f8283a.hashCode();
        }

        public final String toString() {
            return vo1.B("RouteSearchedIntent(query=", this.f8283a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent$RouteSelectedIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSelectedIntent extends PickRouteLocationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8284a;

        public RouteSelectedIntent(String routeId) {
            Intrinsics.i(routeId, "routeId");
            this.f8284a = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteSelectedIntent) && Intrinsics.d(this.f8284a, ((RouteSelectedIntent) obj).f8284a);
        }

        public final int hashCode() {
            return this.f8284a.hashCode();
        }

        public final String toString() {
            return vo1.B("RouteSelectedIntent(routeId=", this.f8284a, ")");
        }
    }
}
