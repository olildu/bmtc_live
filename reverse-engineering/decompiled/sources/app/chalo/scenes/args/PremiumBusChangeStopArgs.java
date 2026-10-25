package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.nt0;
import defpackage.t10;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusChangeStopArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusChangeStopArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(0))};
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final Source h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusChangeStopArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusChangeStopArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusChangeStopArgs> serializer() {
            return PremiumBusChangeStopArgs$$serializer.f9292a;
        }
    }

    public /* synthetic */ PremiumBusChangeStopArgs(int i2, String str, String str2, String str3, String str4, String str5, boolean z, Source source) {
        if (127 != (i2 & 127)) {
            PluginExceptionsKt.b(PremiumBusChangeStopArgs$$serializer.f9292a.getDescriptor(), i2, 127);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = source;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PremiumBusChangeStop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusChangeStopArgs)) {
            return false;
        }
        PremiumBusChangeStopArgs premiumBusChangeStopArgs = (PremiumBusChangeStopArgs) obj;
        return Intrinsics.d(this.b, premiumBusChangeStopArgs.b) && Intrinsics.d(this.c, premiumBusChangeStopArgs.c) && Intrinsics.d(this.d, premiumBusChangeStopArgs.d) && Intrinsics.d(this.e, premiumBusChangeStopArgs.e) && Intrinsics.d(this.f, premiumBusChangeStopArgs.f) && this.g == premiumBusChangeStopArgs.g && this.h == premiumBusChangeStopArgs.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((nf1.e(nf1.e(nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusChangeStopArgs(bookingId=", this.b, ", currentFromStopId=", this.c, ", currentToStopId=");
        cb0.t(sbE, this.d, ", routeId=", this.e, ", vehicleNumber=");
        t10.s(this.f, ", isLiveTrackingActive=", ", source=", sbE, this.g);
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }

    public PremiumBusChangeStopArgs(String str, String str2, String str3, String str4, String str5, boolean z, Source source) {
        Intrinsics.i(source, "source");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = source;
    }
}
