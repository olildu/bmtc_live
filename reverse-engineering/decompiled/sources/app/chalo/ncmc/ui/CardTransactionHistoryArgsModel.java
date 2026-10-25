package app.chalo.ncmc.ui;

import app.chalo.constants.Source;
import defpackage.nf1;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/CardTransactionHistoryArgsModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardTransactionHistoryArgsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xe(28)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f6265a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/CardTransactionHistoryArgsModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/CardTransactionHistoryArgsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardTransactionHistoryArgsModel> serializer() {
            return CardTransactionHistoryArgsModel$$serializer.f6266a;
        }
    }

    public /* synthetic */ CardTransactionHistoryArgsModel(int i, Source source, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CardTransactionHistoryArgsModel$$serializer.f6266a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6265a = source;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionHistoryArgsModel)) {
            return false;
        }
        CardTransactionHistoryArgsModel cardTransactionHistoryArgsModel = (CardTransactionHistoryArgsModel) obj;
        return this.f6265a == cardTransactionHistoryArgsModel.f6265a && Intrinsics.d(this.b, cardTransactionHistoryArgsModel.b) && Intrinsics.d(this.c, cardTransactionHistoryArgsModel.c) && Intrinsics.d(this.d, cardTransactionHistoryArgsModel.d);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6265a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardTransactionHistoryArgsModel(source=");
        sb.append(this.f6265a);
        sb.append(", cardNumber=");
        sb.append(this.b);
        sb.append(", kitNumber=");
        return r30.i(sb, this.c, ", cardType=", this.d, ")");
    }

    public CardTransactionHistoryArgsModel(Source source, String cardNumber, String str, String str2) {
        Intrinsics.i(source, "source");
        Intrinsics.i(cardNumber, "cardNumber");
        this.f6265a = source;
        this.b = cardNumber;
        this.c = str;
        this.d = str2;
    }
}
