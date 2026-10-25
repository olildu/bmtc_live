package defpackage;

import androidx.compose.material3.OverflowMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18658a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ List c;

    public /* synthetic */ oo0(ArrayList arrayList, List list, int i) {
        this.f18658a = i;
        this.b = arrayList;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18658a) {
            case 0:
                return OverflowMeasurePolicy.measure_3p2s80s$lambda$11(this.b, this.c, (Placeable.PlacementScope) obj);
            case 1:
                return OverflowMeasurePolicy.measure_3p2s80s$lambda$14(this.b, this.c, (Placeable.PlacementScope) obj);
            case 2:
                RouteDetailsDataState it = (RouteDetailsDataState) obj;
                Intrinsics.i(it, "it");
                return RouteDetailsDataState.a(it, false, null, null, null, null, null, null, null, null, this.b, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, null, this.c, false, false, null, null, false, null, false, null, false, -536871425, 127);
            case 3:
                WalletAllTransactionsState currentState = (WalletAllTransactionsState) obj;
                Intrinsics.i(currentState, "currentState");
                return WalletAllTransactionsState.a(currentState, this.c, this.b, false, false, null, false, false, 224);
            default:
                WalletAllTransactionsState currentState2 = (WalletAllTransactionsState) obj;
                Intrinsics.i(currentState2, "currentState");
                return WalletAllTransactionsState.a(currentState2, this.c, this.b, false, true, null, false, false, 224);
        }
    }

    public /* synthetic */ oo0(List list, ArrayList arrayList, int i) {
        this.f18658a = i;
        this.c = list;
        this.b = arrayList;
    }
}
