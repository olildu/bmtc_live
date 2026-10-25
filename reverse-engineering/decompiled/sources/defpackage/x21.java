package defpackage;

import androidx.compose.runtime.ComposerImplKt;
import androidx.core.app.FrameMetricsAggregator;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import app.chalo.instantticket.ui.routeselection.RouteSelectionViewState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x21 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19981a;

    public /* synthetic */ x21(int i) {
        this.f19981a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19981a) {
            case 0:
                RideReceiptDataState it = (RideReceiptDataState) obj;
                Intrinsics.i(it, "it");
                return RideReceiptDataState.a(it, false, null, null, 6);
            case 1:
                RideReceiptDataState it2 = (RideReceiptDataState) obj;
                Intrinsics.i(it2, "it");
                return RideReceiptDataState.a(it2, true, null, null, 6);
            case 2:
                RideReceiptDataState it3 = (RideReceiptDataState) obj;
                Intrinsics.i(it3, "it");
                return RideReceiptDataState.a(it3, true, null, null, 6);
            case 3:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("ride_based_super_pass_ride_details_table");
                return Unit.f17538a;
            case 4:
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                Boolean bool = cursor.getBoolean(0);
                Intrinsics.f(bool);
                return bool;
            case 5:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("ride_based_super_pass_ride_details_table");
                return Unit.f17538a;
            case 6:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 7:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("ride_based_super_pass_table");
                return Unit.f17538a;
            case 8:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("ride_based_super_pass_table");
                return Unit.f17538a;
            case 9:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("ride_based_super_pass_table");
                return Unit.f17538a;
            case 10:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("ride_based_super_pass_table");
                return Unit.f17538a;
            case 11:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("ride_based_super_pass_table");
                return Unit.f17538a;
            case 12:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("ride_booking_user_feedback_table");
                return Unit.f17538a;
            case 13:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("ride_booking_user_feedback_table");
                return Unit.f17538a;
            case 14:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("ride_booking_user_feedback_table");
                return Unit.f17538a;
            case 15:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("ride_feedback_offline_queue_table");
                return Unit.f17538a;
            case 16:
                Function1 emit12 = (Function1) obj;
                Intrinsics.i(emit12, "emit");
                emit12.invoke("ride_feedback_offline_queue_table");
                return Unit.f17538a;
            case 17:
                Function1 emit13 = (Function1) obj;
                Intrinsics.i(emit13, "emit");
                emit13.invoke("ride_feedback_offline_queue_table");
                return Unit.f17538a;
            case 18:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, false, null, null, null, true, FrameMetricsAggregator.EVERY_DURATION);
            case 19:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, true, null, null, null, false, 1007);
            case 20:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, false, RouteSelectionStopType.FROM, null, null, false, 991);
            case 21:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, false, RouteSelectionStopType.TO, null, null, false, 991);
            case 22:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, false, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION);
            case 23:
                return RouteSelectionViewState.a((RouteSelectionViewState) obj, null, null, null, null, true, null, null, null, false, 1007);
            case 24:
                RouteDetailsDataState it4 = (RouteDetailsDataState) obj;
                Intrinsics.i(it4, "it");
                return RouteDetailsDataState.a(it4, false, null, null, null, null, null, null, RouteDetailsViewType.MainScreen.f4880a, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4194433, ComposerImplKt.nodeKey);
            case 25:
                RouteDetailsDataState it5 = (RouteDetailsDataState) obj;
                Intrinsics.i(it5, "it");
                return RouteDetailsDataState.a(it5, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, EmptyList.f17557a, false, "", false, -1048577, 83);
            case 26:
                RouteDetailsDataState it6 = (RouteDetailsDataState) obj;
                Intrinsics.i(it6, "it");
                return RouteDetailsDataState.a(it6, true, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, false, null, false, null, false, -2, 127);
            case 27:
                RouteDetailsDataState it7 = (RouteDetailsDataState) obj;
                Intrinsics.i(it7, "it");
                return RouteDetailsDataState.a(it7, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, null, true, null, false, null, false, -1, 123);
            case 28:
                RouteDetailsDataState it8 = (RouteDetailsDataState) obj;
                Intrinsics.i(it8, "it");
                return RouteDetailsDataState.a(it8, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, true, null, null, false, null, false, null, false, Integer.MAX_VALUE, 127);
            default:
                RouteDetailsDataState it9 = (RouteDetailsDataState) obj;
                Intrinsics.i(it9, "it");
                return RouteDetailsDataState.a(it9, false, null, null, null, null, null, null, RouteDetailsViewType.MainScreen.f4880a, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4194433, ComposerImplKt.nodeKey);
        }
    }
}
