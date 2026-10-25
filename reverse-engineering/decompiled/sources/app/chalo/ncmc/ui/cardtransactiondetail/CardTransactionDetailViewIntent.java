package app.chalo.ncmc.ui.cardtransactiondetail;

import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewIntent;", "", "InitializationIntent", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewIntent$InitializationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardTransactionDetailViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewIntent$InitializationIntent;", "Lapp/chalo/ncmc/ui/cardtransactiondetail/CardTransactionDetailViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends CardTransactionDetailViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardTransaction f6314a;
        public final CardTransactionTypeUiModel b;

        public InitializationIntent(CardTransaction cardPassPurchaseTransactionAppModel, CardTransactionTypeUiModel cardTransactionType) {
            Intrinsics.i(cardPassPurchaseTransactionAppModel, "cardPassPurchaseTransactionAppModel");
            Intrinsics.i(cardTransactionType, "cardTransactionType");
            this.f6314a = cardPassPurchaseTransactionAppModel;
            this.b = cardTransactionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f6314a, initializationIntent.f6314a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6314a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(cardPassPurchaseTransactionAppModel=" + this.f6314a + ", cardTransactionType=" + this.b + ")";
        }
    }
}
