package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.b3;
import defpackage.ll1;
import defpackage.n21;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerTabType;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerTabType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;
    public static final TripPlannerTabType g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4685a;
    public final ChaloTransitMode b;
    public final int c;
    public final RouteServiceType d;
    public final boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerTabType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerTabType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerTabType> serializer() {
            return TripPlannerTabType$$serializer.f4686a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new ll1(2)), null, LazyKt.a(lazyThreadSafetyMode, new ll1(3)), null};
        ChaloTransitMode chaloTransitMode = ChaloTransitMode.ALL;
        RouteServiceType routeServiceType = RouteServiceType.ALL;
        g = new TripPlannerTabType("All", chaloTransitMode, -1, routeServiceType, true);
        h = CollectionsKt.S(new TripPlannerTabType("All", chaloTransitMode, -1, routeServiceType, true), new TripPlannerTabType("Direct", ChaloTransitMode.BUS, 1, routeServiceType, false));
    }

    public /* synthetic */ TripPlannerTabType(int i, String str, ChaloTransitMode chaloTransitMode, int i2, RouteServiceType routeServiceType, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(TripPlannerTabType$$serializer.f4686a.getDescriptor(), i, 3);
            throw null;
        }
        this.f4685a = str;
        this.b = chaloTransitMode;
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = RouteServiceType.ALL;
        } else {
            this.d = routeServiceType;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerTabType)) {
            return false;
        }
        TripPlannerTabType tripPlannerTabType = (TripPlannerTabType) obj;
        return Intrinsics.d(this.f4685a, tripPlannerTabType.f4685a) && this.b == tripPlannerTabType.b && this.c == tripPlannerTabType.c && this.d == tripPlannerTabType.d && this.e == tripPlannerTabType.e;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((n21.c(this.b, this.f4685a.hashCode() * 31, 31) + this.c) * 31)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripPlannerTabType(name=");
        sb.append(this.f4685a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", noOfLegs=");
        sb.append(this.c);
        sb.append(", serviceType=");
        sb.append(this.d);
        sb.append(", shouldMakeApiCall=");
        return b3.g(")", sb, this.e);
    }

    public TripPlannerTabType(String name, ChaloTransitMode mode, int i, RouteServiceType serviceType, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(mode, "mode");
        Intrinsics.i(serviceType, "serviceType");
        this.f4685a = name;
        this.b = mode;
        this.c = i;
        this.d = serviceType;
        this.e = z;
    }
}
