package app.chalo.scenes.args;

import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.scenes.ChaloScenes;
import defpackage.b3;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.nt0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusProductModificationArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusProductModificationArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(15)), null, null, null};
    public final String b;
    public final PremiumReserveTicketOptionAction c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusProductModificationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusProductModificationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusProductModificationArgs> serializer() {
            return PremiumBusProductModificationArgs$$serializer.f9294a;
        }
    }

    public PremiumBusProductModificationArgs(int i, PremiumReserveTicketOptionAction reason, String str, String str2, String str3) {
        Intrinsics.i(reason, "reason");
        this.b = str;
        this.c = reason;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PremiumBusProductModification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductModificationArgs)) {
            return false;
        }
        PremiumBusProductModificationArgs premiumBusProductModificationArgs = (PremiumBusProductModificationArgs) obj;
        return Intrinsics.d(this.b, premiumBusProductModificationArgs.b) && this.c == premiumBusProductModificationArgs.c && Intrinsics.d(this.d, premiumBusProductModificationArgs.d) && Intrinsics.d(this.e, premiumBusProductModificationArgs.e) && this.f == premiumBusProductModificationArgs.f;
    }

    public final int hashCode() {
        return nf1.e(nf1.e((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusProductModificationArgs(bookingId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", productType=");
        cb0.t(sb, this.d, ", productSubType=", this.e, ", noOfSeatSelectedInCurrentBooking=");
        return b3.f(")", this.f, sb);
    }

    public /* synthetic */ PremiumBusProductModificationArgs(int i, String str, PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, String str2, String str3, int i2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PremiumBusProductModificationArgs$$serializer.f9294a.getDescriptor(), i, 31);
            throw null;
        }
        this.b = str;
        this.c = premiumReserveTicketOptionAction;
        this.d = str2;
        this.e = str3;
        this.f = i2;
    }
}
