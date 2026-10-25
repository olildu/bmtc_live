package app.chalo.ncmc.data.appmodel;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardUnsyncedRechargeDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloCardUnsyncedRechargeDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6134a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardUnsyncedRechargeDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardUnsyncedRechargeDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloCardUnsyncedRechargeDetails> serializer() {
            return ChaloCardUnsyncedRechargeDetails$$serializer.f6135a;
        }
    }

    public /* synthetic */ ChaloCardUnsyncedRechargeDetails(int i, String str, long j) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ChaloCardUnsyncedRechargeDetails$$serializer.f6135a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6134a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCardUnsyncedRechargeDetails)) {
            return false;
        }
        ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetails = (ChaloCardUnsyncedRechargeDetails) obj;
        return Intrinsics.d(this.f6134a, chaloCardUnsyncedRechargeDetails.f6134a) && this.b == chaloCardUnsyncedRechargeDetails.b;
    }

    public final int hashCode() {
        int iHashCode = this.f6134a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "ChaloCardUnsyncedRechargeDetails(cardNumber=", this.f6134a, ", totalPendingAmount=");
        sbM.append(")");
        return sbM.toString();
    }

    public ChaloCardUnsyncedRechargeDetails(String cardNumber, long j) {
        Intrinsics.i(cardNumber, "cardNumber");
        this.f6134a = cardNumber;
        this.b = j;
    }
}
