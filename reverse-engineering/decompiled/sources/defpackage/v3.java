package defpackage;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19797a;
    public final /* synthetic */ long b;

    public /* synthetic */ v3(long j, int i) {
        this.f19797a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMapU;
        switch (this.f19797a) {
            case 0:
                return AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0(this.b, (CacheDrawScope) obj);
            case 1:
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, false, false, null, null, null, null, 0L, this.b, false, 1535);
            case 2:
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(this.b, (SemanticsPropertyReceiver) obj);
            case 3:
                return Long.valueOf(this.b);
            case 4:
                uf0.x((SqlPreparedStatement) obj, "$this$execute", this.b, 0);
                return Unit.f17538a;
            case 5:
                PremiumBusSlotSelectionDataState it2 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                Map map = it2.g;
                if (map != null) {
                    linkedHashMapU = MapsKt.u(map);
                    long j = this.b;
                    PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j));
                    if (pBODPairWithSlotSectionListUiModel != null) {
                        linkedHashMapU.put(Long.valueOf(j), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, null, null, false, 0, 0, false, true, 8191));
                    }
                } else {
                    linkedHashMapU = null;
                }
                return PremiumBusSlotSelectionDataState.a(it2, false, false, false, null, null, null, linkedHashMapU, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -65);
            case 6:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, null, this.b, false, false, null, 0L, false, null, 1015);
            case 7:
                return StopTripPlannerResultsDataState.a((StopTripPlannerResultsDataState) obj, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, true, Long.valueOf(this.b), 131071);
            case 8:
                return WalletTransactionSummaryState.a((WalletTransactionSummaryState) obj, null, null, null, null, null, null, null, null, false, false, false, false, null, this.b, false, 24575);
            default:
                return WalletTransactionSummaryState.a((WalletTransactionSummaryState) obj, null, null, null, null, null, null, null, null, false, false, false, false, null, this.b, false, 24575);
        }
    }
}
