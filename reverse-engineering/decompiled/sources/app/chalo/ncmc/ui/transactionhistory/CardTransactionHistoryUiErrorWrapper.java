package app.chalo.ncmc.ui.transactionhistory;

import defpackage.xe;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryUiErrorWrapper;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTransactionHistoryUiErrorWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6435a;
    public final ChaloCardTransactionsUiErrorType b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryUiErrorWrapper$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryUiErrorWrapper;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTransactionHistoryUiErrorWrapper> serializer() {
            return CardTransactionHistoryUiErrorWrapper$$serializer.f6436a;
        }
    }

    public /* synthetic */ CardTransactionHistoryUiErrorWrapper(int i, int i2, ChaloCardTransactionsUiErrorType chaloCardTransactionsUiErrorType) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CardTransactionHistoryUiErrorWrapper$$serializer.f6436a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6435a = i2;
        this.b = chaloCardTransactionsUiErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionHistoryUiErrorWrapper)) {
            return false;
        }
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = (CardTransactionHistoryUiErrorWrapper) obj;
        return this.f6435a == cardTransactionHistoryUiErrorWrapper.f6435a && this.b == cardTransactionHistoryUiErrorWrapper.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6435a * 31);
    }

    public final String toString() {
        return "CardTransactionHistoryUiErrorWrapper(errorCode=" + this.f6435a + ", errorType=" + this.b + ")";
    }

    public CardTransactionHistoryUiErrorWrapper(int i, ChaloCardTransactionsUiErrorType errorType) {
        Intrinsics.i(errorType, "errorType");
        this.f6435a = i;
        this.b = errorType;
    }
}
