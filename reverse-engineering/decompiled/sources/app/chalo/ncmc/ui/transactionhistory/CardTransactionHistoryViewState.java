package app.chalo.ncmc.ui.transactionhistory;

import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTransactionHistoryViewState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6437a;
    public final CardTransactionHistoryUiErrorWrapper b;
    public final String c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTransactionHistoryViewState> serializer() {
            return CardTransactionHistoryViewState$$serializer.f6438a;
        }
    }

    public /* synthetic */ CardTransactionHistoryViewState(int i, String str, CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper, String str2, boolean z, String str3) {
        if ((i & 1) == 0) {
            this.f6437a = null;
        } else {
            this.f6437a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cardTransactionHistoryUiErrorWrapper;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public static CardTransactionHistoryViewState a(CardTransactionHistoryViewState cardTransactionHistoryViewState, String str, CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper, String str2, boolean z, String str3, int i) {
        if ((i & 1) != 0) {
            str = cardTransactionHistoryViewState.f6437a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            cardTransactionHistoryUiErrorWrapper = cardTransactionHistoryViewState.b;
        }
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper2 = cardTransactionHistoryUiErrorWrapper;
        if ((i & 4) != 0) {
            str2 = cardTransactionHistoryViewState.c;
        }
        String currencySymbol = str2;
        if ((i & 8) != 0) {
            z = cardTransactionHistoryViewState.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = cardTransactionHistoryViewState.e;
        }
        cardTransactionHistoryViewState.getClass();
        Intrinsics.i(currencySymbol, "currencySymbol");
        return new CardTransactionHistoryViewState(str4, cardTransactionHistoryUiErrorWrapper2, currencySymbol, z2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionHistoryViewState)) {
            return false;
        }
        CardTransactionHistoryViewState cardTransactionHistoryViewState = (CardTransactionHistoryViewState) obj;
        return Intrinsics.d(this.f6437a, cardTransactionHistoryViewState.f6437a) && Intrinsics.d(this.b, cardTransactionHistoryViewState.b) && Intrinsics.d(this.c, cardTransactionHistoryViewState.c) && this.d == cardTransactionHistoryViewState.d && Intrinsics.d(this.e, cardTransactionHistoryViewState.e);
    }

    public final int hashCode() {
        String str = this.f6437a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = this.b;
        int iE = (nf1.e((iHashCode + (cardTransactionHistoryUiErrorWrapper == null ? 0 : cardTransactionHistoryUiErrorWrapper.hashCode())) * 31, 31, this.c) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionHistoryViewState(errorMessage=");
        sb.append(this.f6437a);
        sb.append(", errorType=");
        sb.append(this.b);
        sb.append(", currencySymbol=");
        t10.s(this.c, ", showEmailStatementDialog=", ", pendingRechargeBannerTitle=", sb, this.d);
        return vo1.p(sb, this.e, ")");
    }

    public CardTransactionHistoryViewState(String str, CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper, String str2, boolean z, String str3) {
        this.f6437a = str;
        this.b = cardTransactionHistoryUiErrorWrapper;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public /* synthetic */ CardTransactionHistoryViewState() {
        this(null, null, "", false, null);
    }
}
