package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vr0;
import defpackage.z40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusActivationArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusActivationArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vr0(18))};
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Source h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusActivationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusActivationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusActivationArgs> serializer() {
            return PremiumBusActivationArgs$$serializer.f9283a;
        }
    }

    public /* synthetic */ PremiumBusActivationArgs(int i2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, Source source) {
        if (71 != (i2 & 71)) {
            PluginExceptionsKt.b(PremiumBusActivationArgs$$serializer.f9283a.getDescriptor(), i2, 71);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        this.h = source;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PremiumBusActivation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusActivationArgs)) {
            return false;
        }
        PremiumBusActivationArgs premiumBusActivationArgs = (PremiumBusActivationArgs) obj;
        return Intrinsics.d(this.b, premiumBusActivationArgs.b) && Intrinsics.d(this.c, premiumBusActivationArgs.c) && Intrinsics.d(this.d, premiumBusActivationArgs.d) && this.e == premiumBusActivationArgs.e && this.f == premiumBusActivationArgs.f && this.g == premiumBusActivationArgs.g && this.h == premiumBusActivationArgs.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((((((nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusActivationArgs(bookingId=", this.b, ", productType=", this.c, ", productSubType=");
        t10.s(this.d, ", shouldLaunchNew=", ", isPreBookingFlow=", sbE, this.e);
        z40.r(sbE, this.f, ", isNewPurchaseFlow=", this.g, ", source=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    public PremiumBusActivationArgs(Source source, String bookingId, String productType, String productSubType, boolean z) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(source, "source");
        this.b = bookingId;
        this.c = productType;
        this.d = productSubType;
        this.e = z;
        this.f = false;
        this.g = false;
        this.h = source;
    }
}
