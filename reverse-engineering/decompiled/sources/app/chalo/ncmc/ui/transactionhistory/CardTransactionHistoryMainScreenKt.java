package app.chalo.ncmc.ui.transactionhistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.e0;
import defpackage.rf;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardTransactionHistoryMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(CardTransactionHistoryComponent cardTransactionHistoryComponent, Composer composer, int i) {
        int i2;
        LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems;
        Composer composerStartRestartGroup = composer.startRestartGroup(-166100618);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cardTransactionHistoryComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-166100618, i2, -1, "app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryMainScreen (CardTransactionHistoryMainScreen.kt:12)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(cardTransactionHistoryComponent.t0(), composerStartRestartGroup);
            Flow flow = cardTransactionHistoryComponent.A;
            if (flow == null) {
                composerStartRestartGroup.startReplaceGroup(-500953903);
                composerStartRestartGroup.endReplaceGroup();
                lazyPagingItemsCollectAsLazyPagingItems = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-708896464);
                composerStartRestartGroup.startReplaceableGroup(-42744368);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-42744368, 0, -1, "app.cash.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:52)");
                }
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17583a;
                composerStartRestartGroup.startReplaceableGroup(-1514954746);
                lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(flow, emptyCoroutineContext, composerStartRestartGroup, 72, 0);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            CardTransactionHistoryViewState cardTransactionHistoryViewState = (CardTransactionHistoryViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(cardTransactionHistoryComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new rf(cardTransactionHistoryComponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloCardTransactionsScreenKt.h(cardTransactionHistoryViewState, lazyPagingItemsCollectAsLazyPagingItems, (Function1) objRememberedValue, composerStartRestartGroup, LazyPagingItems.$stable << 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(cardTransactionHistoryComponent, i, 11));
        }
    }
}
