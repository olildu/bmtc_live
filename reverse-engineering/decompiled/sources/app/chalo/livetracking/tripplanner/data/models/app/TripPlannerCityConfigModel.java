package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cl1;
import defpackage.hq0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerCityConfigModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerCityConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new cl1(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4657a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerCityConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerCityConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerCityConfigModel> serializer() {
            return TripPlannerCityConfigModel$$serializer.f4658a;
        }
    }

    public /* synthetic */ TripPlannerCityConfigModel(int i, String str, boolean z, int i2, int i3, boolean z2, List list) {
        this.f4657a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = -1;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = Integer.MAX_VALUE;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = CollectionsKt.S(new TripPlannerTabTypeConfigModel("All", ChaloTransitMode.ALL.getMode(), -1, true), new TripPlannerTabTypeConfigModel(ChaloTransitMode.BUS.getMode()));
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerCityConfigModel)) {
            return false;
        }
        TripPlannerCityConfigModel tripPlannerCityConfigModel = (TripPlannerCityConfigModel) obj;
        return Intrinsics.d(this.f4657a, tripPlannerCityConfigModel.f4657a) && this.b == tripPlannerCityConfigModel.b && this.c == tripPlannerCityConfigModel.c && this.d == tripPlannerCityConfigModel.d && this.e == tripPlannerCityConfigModel.e && Intrinsics.d(this.f, tripPlannerCityConfigModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (((((((((this.f4657a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("TripPlannerCityConfigModel(city=", this.f4657a, ", shouldOpenDirectly=", ", minAppVer=", this.b);
        hq0.p(this.c, this.d, ", maxAppVer=", ", shouldPaginate=", sbM);
        sbM.append(this.e);
        sbM.append(", tabs=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }

    public TripPlannerCityConfigModel(String str) {
        List tabs = CollectionsKt.S(new TripPlannerTabTypeConfigModel("All", ChaloTransitMode.ALL.getMode(), -1, true), new TripPlannerTabTypeConfigModel(ChaloTransitMode.BUS.getMode()));
        Intrinsics.i(tabs, "tabs");
        this.f4657a = str;
        this.b = false;
        this.c = -1;
        this.d = -1;
        this.e = false;
        this.f = tabs;
    }
}
