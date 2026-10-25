package app.chalo.scenes.args;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.scenes.ChaloScenes;
import defpackage.b3;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xp0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PbBulkBookingRideDetailsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PbBulkBookingRideDetailsArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xp0(27)), null, null, null};
    public final String b;
    public final SuperPassSubTypes c;
    public final boolean d;
    public final String e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PbBulkBookingRideDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PbBulkBookingRideDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PbBulkBookingRideDetailsArgs> serializer() {
            return PbBulkBookingRideDetailsArgs$$serializer.f9280a;
        }
    }

    public PbBulkBookingRideDetailsArgs(int i, SuperPassSubTypes superPassSubType, String passId, String configId) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(superPassSubType, "superPassSubType");
        Intrinsics.i(configId, "configId");
        this.b = passId;
        this.c = superPassSubType;
        this.d = false;
        this.e = configId;
        this.f = i;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PbBulkBookingRideDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbBulkBookingRideDetailsArgs)) {
            return false;
        }
        PbBulkBookingRideDetailsArgs pbBulkBookingRideDetailsArgs = (PbBulkBookingRideDetailsArgs) obj;
        return Intrinsics.d(this.b, pbBulkBookingRideDetailsArgs.b) && this.c == pbBulkBookingRideDetailsArgs.c && this.d == pbBulkBookingRideDetailsArgs.d && Intrinsics.d(this.e, pbBulkBookingRideDetailsArgs.e) && this.f == pbBulkBookingRideDetailsArgs.f;
    }

    public final int hashCode() {
        return nf1.e((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PbBulkBookingRideDetailsArgs(passId=");
        sb.append(this.b);
        sb.append(", superPassSubType=");
        sb.append(this.c);
        sb.append(", isNewPurchaseFlow=");
        pk0.x(", configId=", this.e, ", fareMappingId=", sb, this.d);
        return b3.f(")", this.f, sb);
    }

    public /* synthetic */ PbBulkBookingRideDetailsArgs(int i, String str, SuperPassSubTypes superPassSubTypes, boolean z, String str2, int i2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PbBulkBookingRideDetailsArgs$$serializer.f9280a.getDescriptor(), i, 31);
            throw null;
        }
        this.b = str;
        this.c = superPassSubTypes;
        this.d = z;
        this.e = str2;
        this.f = i2;
    }
}
