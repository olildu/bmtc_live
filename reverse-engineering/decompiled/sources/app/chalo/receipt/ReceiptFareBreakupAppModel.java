package app.chalo.receipt;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/receipt/ReceiptFareBreakupAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ReceiptFareBreakupAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8919a;
    public final String b;
    public final double c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/receipt/ReceiptFareBreakupAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/receipt/ReceiptFareBreakupAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ReceiptFareBreakupAppModel> serializer() {
            return ReceiptFareBreakupAppModel$$serializer.f8920a;
        }
    }

    public ReceiptFareBreakupAppModel(int i, String str, double d) {
        this.f8919a = i;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptFareBreakupAppModel)) {
            return false;
        }
        ReceiptFareBreakupAppModel receiptFareBreakupAppModel = (ReceiptFareBreakupAppModel) obj;
        return this.f8919a == receiptFareBreakupAppModel.f8919a && Intrinsics.d(this.b, receiptFareBreakupAppModel.b) && Double.compare(this.c, receiptFareBreakupAppModel.c) == 0;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8919a * 31, 31, this.b);
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f8919a, "ReceiptFareBreakupAppModel(count=", ", categoryCode=", this.b, ", categoryAmountInCurrency=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ ReceiptFareBreakupAppModel(String str, double d, int i, int i2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ReceiptFareBreakupAppModel$$serializer.f8920a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8919a = i2;
        this.b = str;
        this.c = d;
    }
}
