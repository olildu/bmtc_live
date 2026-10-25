package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.sos.data.model.RaiseSOSException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15506a;

    public /* synthetic */ e01(int i) {
        this.f15506a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15506a) {
            case 0:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, true, null, 0L, false, null, 975);
            case 1:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, false, null, 0L, false, null, 975);
            case 2:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, false, null, 0L, false, null, 1007);
            case 3:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, true, null, 0L, false, null, 991);
            case 4:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, 0L, false, false, null, 0L, false, null, 975);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new RaiseSOSException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 6:
                return Boolean.valueOf(ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode$lambda$0((DragAndDropEvent) obj));
            case 7:
                Intrinsics.i((String) obj, "<unused var>");
                return Unit.f17538a;
            case 8:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("recent_location_pair_table");
                return Unit.f17538a;
            case 9:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("recent_location_pair_table");
                return Unit.f17538a;
            case 10:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 11:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("recent_location_pair_table");
                return Unit.f17538a;
            case 12:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("recent_location_pair_table");
                return Unit.f17538a;
            case 13:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("recent_location_pair_table");
                return Unit.f17538a;
            case 14:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("recent_place_table");
                return Unit.f17538a;
            case 15:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("recent_place_table");
                return Unit.f17538a;
            case 16:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("recent_place_table");
                return Unit.f17538a;
            case 17:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("recent_place_table");
                return Unit.f17538a;
            case 18:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 19:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("recent_place_table");
                return Unit.f17538a;
            case 20:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 21:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 22:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 23:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("recent_route_table");
                return Unit.f17538a;
            case 24:
                Function1 emit12 = (Function1) obj;
                Intrinsics.i(emit12, "emit");
                emit12.invoke("recent_route_table");
                return Unit.f17538a;
            case 25:
                Function1 emit13 = (Function1) obj;
                Intrinsics.i(emit13, "emit");
                emit13.invoke("recent_route_table");
                return Unit.f17538a;
            case 26:
                Function1 emit14 = (Function1) obj;
                Intrinsics.i(emit14, "emit");
                emit14.invoke("recent_route_table");
                return Unit.f17538a;
            case 27:
                Function1 emit15 = (Function1) obj;
                Intrinsics.i(emit15, "emit");
                emit15.invoke("recent_route_table");
                return Unit.f17538a;
            case 28:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            default:
                Function1 emit16 = (Function1) obj;
                Intrinsics.i(emit16, "emit");
                emit16.invoke("recent_route_table");
                return Unit.f17538a;
        }
    }
}
