package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.ChaloScenes;
import defpackage.vr0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PickStopArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PickStopArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;
    public final Source b;
    public final String c;
    public final ChaloTransitMode d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PickStopArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PickStopArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PickStopArgs> serializer() {
            return PickStopArgs$$serializer.f9282a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new vr0(1)), null, LazyKt.a(lazyThreadSafetyMode, new vr0(2)), null};
    }

    public /* synthetic */ PickStopArgs(int i, Source source, String str, ChaloTransitMode chaloTransitMode, String str2) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.b(PickStopArgs$$serializer.f9282a.getDescriptor(), i, 8);
            throw null;
        }
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = source;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = chaloTransitMode;
        }
        this.e = str2;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.PickStop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickStopArgs)) {
            return false;
        }
        PickStopArgs pickStopArgs = (PickStopArgs) obj;
        return this.b == pickStopArgs.b && Intrinsics.d(this.c, pickStopArgs.c) && this.d == pickStopArgs.d && Intrinsics.d(this.e, pickStopArgs.e);
    }

    public final int hashCode() {
        Source source = this.b;
        int iHashCode = (source == null ? 0 : source.hashCode()) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChaloTransitMode chaloTransitMode = this.d;
        return this.e.hashCode() + ((iHashCode2 + (chaloTransitMode != null ? chaloTransitMode.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PickStopArgs(source=" + this.b + ", requestId=" + this.c + ", mode=" + this.d + ", productBookingStopList=" + this.e + ")";
    }

    public PickStopArgs(Source source, String str, ChaloTransitMode chaloTransitMode, String str2) {
        this.b = source;
        this.c = str;
        this.d = chaloTransitMode;
        this.e = str2;
    }

    public /* synthetic */ PickStopArgs(Source source, String str, ChaloTransitMode chaloTransitMode, String str2, int i) {
        this((i & 1) != 0 ? null : source, str, (i & 4) != 0 ? null : chaloTransitMode, str2);
    }
}
