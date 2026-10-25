package app.chalo.stoptripdetails.ui;

import app.chalo.stoptripdetails.data.model.app.StopTripAppModel;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;", "", "ViewCreatedIntentStop", "RouteDetailItemClickedIntentStop", "ErrorScreenRetryButtonClickIntent", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$ErrorScreenRetryButtonClickIntent;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$RouteDetailItemClickedIntentStop;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$ViewCreatedIntentStop;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopTripDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$ErrorScreenRetryButtonClickIntent;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorScreenRetryButtonClickIntent extends StopTripDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ErrorScreenRetryButtonClickIntent f9513a = new ErrorScreenRetryButtonClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$RouteDetailItemClickedIntentStop;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDetailItemClickedIntentStop extends StopTripDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9514a;
        public final String b;

        public RouteDetailItemClickedIntentStop(String routeId, String triggerStopId) {
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(triggerStopId, "triggerStopId");
            this.f9514a = routeId;
            this.b = triggerStopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteDetailItemClickedIntentStop)) {
                return false;
            }
            RouteDetailItemClickedIntentStop routeDetailItemClickedIntentStop = (RouteDetailItemClickedIntentStop) obj;
            return Intrinsics.d(this.f9514a, routeDetailItemClickedIntentStop.f9514a) && Intrinsics.d(this.b, routeDetailItemClickedIntentStop.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9514a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RouteDetailItemClickedIntentStop(routeId=", this.f9514a, ", triggerStopId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent$ViewCreatedIntentStop;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntentStop extends StopTripDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopTripAppModel f9515a;
        public final String b;
        public final String c;
        public final String d;

        public ViewCreatedIntentStop(StopTripAppModel stopTripAppModel, String str, String str2, String str3) {
            this.f9515a = stopTripAppModel;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCreatedIntentStop)) {
                return false;
            }
            ViewCreatedIntentStop viewCreatedIntentStop = (ViewCreatedIntentStop) obj;
            return Intrinsics.d(this.f9515a, viewCreatedIntentStop.f9515a) && Intrinsics.d(this.b, viewCreatedIntentStop.b) && Intrinsics.d(this.c, viewCreatedIntentStop.c) && Intrinsics.d(this.d, viewCreatedIntentStop.d);
        }

        public final int hashCode() {
            int iHashCode = this.f9515a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewCreatedIntentStop(stop=");
            sb.append(this.f9515a);
            sb.append(", cityName=");
            sb.append(this.b);
            sb.append(", source=");
            return r30.i(sb, this.c, ", tag=", this.d, ")");
        }
    }
}
