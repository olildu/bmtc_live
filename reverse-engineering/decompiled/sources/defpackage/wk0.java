package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.home.ui.history.compose.components.MultiModalTicketSelectionBottomSheetContentKt;
import app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContentKt;
import app.chalo.home.ui.history.compose.components.TabHeaderUiStateViewKt;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.zophop.homescreen.MyTicketsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wk0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19937a;
    public final /* synthetic */ MyTicketsViewState b;

    public /* synthetic */ wk0(MyTicketsViewState myTicketsViewState, int i) {
        this.f19937a = i;
        this.b = myTicketsViewState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19937a) {
            case 0:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1989539848, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:459)");
                    }
                    DividerUIState dividerUIState = this.b.y;
                    if (dividerUIState == null) {
                        composer.startReplaceGroup(-166999902);
                    } else {
                        composer.startReplaceGroup(-166999901);
                        DividerUIStateKt.a(null, dividerUIState, composer, 0, 1);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 1:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1910816639, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:329)");
                    }
                    DividerUIState dividerUIState2 = this.b.w;
                    if (dividerUIState2 == null) {
                        composer2.startReplaceGroup(-357970149);
                    } else {
                        composer2.startReplaceGroup(-357970148);
                        DividerUIStateKt.a(null, dividerUIState2, composer2, 0, 1);
                    }
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 2:
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(351873806, iIntValue3, -1, "app.chalo.home.ui.history.compose.MyTicketsScreenUI.<anonymous> (MyTicketsScreenUI.kt:121)");
                    }
                    MyTicketBottomSheetUiState myTicketBottomSheetUiState = this.b.k;
                    if (myTicketBottomSheetUiState instanceof MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState) {
                        composer3.startReplaceGroup(-1342473039);
                        PurchaseProductBottomSheetContentKt.b(null, (MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState) myTicketBottomSheetUiState, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (myTicketBottomSheetUiState instanceof MyTicketBottomSheetUiState.TicketsPageInfoBottomSheet) {
                        composer3.startReplaceGroup(-1342233595);
                        BottomSheetContentWithIconTitleSubTitleKt.a(null, ((MyTicketBottomSheetUiState.TicketsPageInfoBottomSheet) myTicketBottomSheetUiState).c, composer3, 0, 1);
                        composer3.endReplaceGroup();
                    } else if (myTicketBottomSheetUiState instanceof MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState) {
                        composer3.startReplaceGroup(-1341966809);
                        MultiModalTicketSelectionBottomSheetContentKt.a((MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState) myTicketBottomSheetUiState, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        if (!Intrinsics.d(myTicketBottomSheetUiState, MyTicketBottomSheetUiState.None.b)) {
                            throw pk0.p(composer3, -1151687495);
                        }
                        composer3.startReplaceGroup(-1341748910);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 3:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1723614604, iIntValue4, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:236)");
                    }
                    TabHeaderUiState tabHeaderUiState = this.b.e;
                    if (tabHeaderUiState == null) {
                        composer4.startReplaceGroup(-1868591445);
                    } else {
                        composer4.startReplaceGroup(-1868591444);
                        TabHeaderUiStateViewKt.d(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null), tabHeaderUiState, composer4, 0);
                    }
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(item4, "$this$item");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-45330274, iIntValue5, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:400)");
                    }
                    DividerUIState dividerUIState3 = this.b.x;
                    if (dividerUIState3 == null) {
                        composer5.startReplaceGroup(-1814384196);
                    } else {
                        composer5.startReplaceGroup(-1814384195);
                        DividerUIStateKt.a(null, dividerUIState3, composer5, 0, 1);
                    }
                    composer5.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }
}
