package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassBookingSuccessArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassBookingSuccessArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassBookingSuccessArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassBookingSuccessArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassBookingSuccessArgs> serializer() {
            return SuperPassBookingSuccessArgs$$serializer.f9310a;
        }
    }

    public /* synthetic */ SuperPassBookingSuccessArgs(int i, String str, String str2, String str3, long j, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(SuperPassBookingSuccessArgs$$serializer.f9310a.getDescriptor(), i, 31);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.SuperPassBookingSuccessScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessArgs)) {
            return false;
        }
        SuperPassBookingSuccessArgs superPassBookingSuccessArgs = (SuperPassBookingSuccessArgs) obj;
        return Intrinsics.d(this.b, superPassBookingSuccessArgs.b) && Intrinsics.d(this.c, superPassBookingSuccessArgs.c) && Intrinsics.d(this.d, superPassBookingSuccessArgs.d) && this.e == superPassBookingSuccessArgs.e && Intrinsics.d(this.f, superPassBookingSuccessArgs.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassBookingSuccessArgs(source=", this.b, ", superPassId=", this.c, ", superPassSubType=");
        n21.p(this.e, this.d, ", passStartTime=", sbE);
        return z40.h(sbE, ", superPassPurchaseStopsInfo=", this.f, ")");
    }
}
