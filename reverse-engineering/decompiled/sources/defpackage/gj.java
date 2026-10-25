package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import app.chalo.home.nearbytrips.ui.mapscreen.ComposableSingletons$NearbyStopsMapScreenKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gj implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15737a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ gj(Function0 function0, int i) {
        this.f15737a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15737a) {
            case 0:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1306598497, iIntValue, -1, "app.chalo.ncmc.ui.transactionhistory.compose.cardTransactionSuccessItems.<anonymous> (ChaloCardTransactionsScreen.kt:371)");
                    }
                    ChaloCardTransactionsScreenKt.k(this.b, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 1:
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1151574526, iIntValue2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenToolbar.<anonymous> (NearbyStopsMapScreen.kt:186)");
                    }
                    IconButtonKt.IconButton(this.b, null, false, null, null, null, ComposableSingletons$NearbyStopsMapScreenKt.b, composer2, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$26(this.b, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }
}
