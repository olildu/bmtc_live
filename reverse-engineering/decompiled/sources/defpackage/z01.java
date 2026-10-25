package defpackage;

import app.cash.sqldelight.db.SqlCursor;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20157a;

    public /* synthetic */ z01(int i) {
        this.f20157a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20157a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("recent_route_table");
                return Unit.f17538a;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 3:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 4:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 5:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 6:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 7:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("recent_stop_and_route_based_trip_table");
                return Unit.f17538a;
            case 8:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("recent_stop_based_trip_table");
                return Unit.f17538a;
            case 9:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 10:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("recent_stop_based_trip_table");
                return Unit.f17538a;
            case 11:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("recent_stop_based_trip_table");
                return Unit.f17538a;
            case 12:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("recent_stop_based_trip_table");
                return Unit.f17538a;
            case 13:
                Function1 emit12 = (Function1) obj;
                Intrinsics.i(emit12, "emit");
                emit12.invoke("recent_stop_based_trip_table");
                return Unit.f17538a;
            case 14:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 15:
                Function1 emit13 = (Function1) obj;
                Intrinsics.i(emit13, "emit");
                emit13.invoke("recent_stop_table");
                return Unit.f17538a;
            case 16:
                Function1 emit14 = (Function1) obj;
                Intrinsics.i(emit14, "emit");
                emit14.invoke("recent_stop_table");
                return Unit.f17538a;
            case 17:
                Function1 emit15 = (Function1) obj;
                Intrinsics.i(emit15, "emit");
                emit15.invoke("recent_stop_table");
                return Unit.f17538a;
            case 18:
                Function1 emit16 = (Function1) obj;
                Intrinsics.i(emit16, "emit");
                emit16.invoke("recent_stop_table");
                return Unit.f17538a;
            case 19:
                Function1 emit17 = (Function1) obj;
                Intrinsics.i(emit17, "emit");
                emit17.invoke("recent_stop_table");
                return Unit.f17538a;
            case 20:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 21:
                Function1 emit18 = (Function1) obj;
                Intrinsics.i(emit18, "emit");
                emit18.invoke("recent_stop_table");
                return Unit.f17538a;
            case 22:
                Function1 emit19 = (Function1) obj;
                Intrinsics.i(emit19, "emit");
                emit19.invoke("recent_trip_table");
                return Unit.f17538a;
            case 23:
                Function1 emit20 = (Function1) obj;
                Intrinsics.i(emit20, "emit");
                emit20.invoke("recent_trip_table");
                return Unit.f17538a;
            case 24:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 25:
                Function1 emit21 = (Function1) obj;
                Intrinsics.i(emit21, "emit");
                emit21.invoke("recent_trip_table");
                return Unit.f17538a;
            case 26:
                Function1 emit22 = (Function1) obj;
                Intrinsics.i(emit22, "emit");
                emit22.invoke("recent_trip_table");
                return Unit.f17538a;
            case 27:
                Function1 emit23 = (Function1) obj;
                Intrinsics.i(emit23, "emit");
                emit23.invoke("recent_trip_table");
                return Unit.f17538a;
            case 28:
                RegularBusViewState it = (RegularBusViewState) obj;
                Intrinsics.i(it, "it");
                return RegularBusViewState.a(it, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 1048575);
            default:
                RegularBusViewState it2 = (RegularBusViewState) obj;
                Intrinsics.i(it2, "it");
                return RegularBusViewState.a(it2, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4128767);
        }
    }
}
