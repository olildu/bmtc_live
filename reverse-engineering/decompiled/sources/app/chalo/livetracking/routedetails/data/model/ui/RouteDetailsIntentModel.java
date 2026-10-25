package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsIntentModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteDetailsIntentModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4405a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final boolean g;
    public final TrackingAdditionalFeatures h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsIntentModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsIntentModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteDetailsIntentModel> serializer() {
            return RouteDetailsIntentModel$$serializer.f4406a;
        }
    }

    public /* synthetic */ RouteDetailsIntentModel(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, boolean z, TrackingAdditionalFeatures trackingAdditionalFeatures) {
        List list = null;
        if (17 != (i & 17)) {
            PluginExceptionsKt.b(RouteDetailsIntentModel$$serializer.f4406a.getDescriptor(), i, 17);
            throw null;
        }
        this.f4405a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = new TrackingAdditionalFeatures(32767, list, list, list);
        } else {
            this.h = trackingAdditionalFeatures;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsIntentModel)) {
            return false;
        }
        RouteDetailsIntentModel routeDetailsIntentModel = (RouteDetailsIntentModel) obj;
        return Intrinsics.d(this.f4405a, routeDetailsIntentModel.f4405a) && Intrinsics.d(this.b, routeDetailsIntentModel.b) && Intrinsics.d(this.c, routeDetailsIntentModel.c) && Intrinsics.d(this.d, routeDetailsIntentModel.d) && Intrinsics.d(this.e, routeDetailsIntentModel.e) && Intrinsics.d(this.f, routeDetailsIntentModel.f) && this.g == routeDetailsIntentModel.g && Intrinsics.d(this.h, routeDetailsIntentModel.h);
    }

    public final int hashCode() {
        int iHashCode = this.f4405a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iE = nf1.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        return this.h.hashCode() + ((((iE + (bool != null ? bool.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteDetailsIntentModel(routeId=", this.f4405a, ", startStopId=", this.b, ", endStopId=");
        cb0.t(sbE, this.c, ", triggerStopId=", this.d, ", origin=");
        gf.v(this.f, this.e, ", isBoardingStopBasedOnLocation=", ", premiumBusTrackingFlow=", sbE);
        sbE.append(this.g);
        sbE.append(", additionalFeatures=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    public RouteDetailsIntentModel(String routeId, String str, String str2, String str3, String origin, Boolean bool, boolean z, TrackingAdditionalFeatures trackingAdditionalFeatures) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(origin, "origin");
        this.f4405a = routeId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = origin;
        this.f = bool;
        this.g = z;
        this.h = trackingAdditionalFeatures;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RouteDetailsIntentModel(String str, String str2, String str3, int i) {
        List list = null;
        this(str, null, null, (i & 8) != 0 ? null : str2, str3, null, false, new TrackingAdditionalFeatures(32767, list, list, list));
    }
}
