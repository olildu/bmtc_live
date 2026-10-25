package app.chalo.citydata.repository.local.room.entity;

import app.chalo.citydata.data.model.app.TimeTableStatus;
import defpackage.r30;
import defpackage.y21;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTripTimingTableModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteEntityTripTimingTableModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeTableStatus f1792a;
    public final int b;
    public final List c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTripTimingTableModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntityTripTimingTableModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteEntityTripTimingTableModel> serializer() {
            return RouteEntityTripTimingTableModel$$serializer.f1793a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new y21(26)), null, LazyKt.a(lazyThreadSafetyMode, new y21(27)), LazyKt.a(lazyThreadSafetyMode, new y21(28))};
    }

    public /* synthetic */ RouteEntityTripTimingTableModel(int i, TimeTableStatus timeTableStatus, int i2, List list, List list2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(RouteEntityTripTimingTableModel$$serializer.f1793a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1792a = timeTableStatus;
        this.b = i2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEntityTripTimingTableModel)) {
            return false;
        }
        RouteEntityTripTimingTableModel routeEntityTripTimingTableModel = (RouteEntityTripTimingTableModel) obj;
        return this.f1792a == routeEntityTripTimingTableModel.f1792a && this.b == routeEntityTripTimingTableModel.b && Intrinsics.d(this.c, routeEntityTripTimingTableModel.c) && Intrinsics.d(this.d, routeEntityTripTimingTableModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.b(((this.f1792a.hashCode() * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return "RouteEntityTripTimingTableModel(timeTableStatus=" + this.f1792a + ", timeTableStatusId=" + this.b + ", shortTripTiming=" + this.c + ", fullTripTiming=" + this.d + ")";
    }

    public RouteEntityTripTimingTableModel(TimeTableStatus timeTableStatus, int i, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(timeTableStatus, "timeTableStatus");
        this.f1792a = timeTableStatus;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
    }
}
