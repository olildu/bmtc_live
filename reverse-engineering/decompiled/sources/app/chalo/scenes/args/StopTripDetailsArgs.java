package app.chalo.scenes.args;

import androidx.core.app.FrameMetricsAggregator;
import app.chalo.constants.Source;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.ra1;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/StopTripDetailsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopTripDetailsArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;
    public final String b;
    public final String c;
    public final LatLng d;
    public final ChaloTransitMode e;
    public final Source f;
    public final Double g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/StopTripDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/StopTripDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopTripDetailsArgs> serializer() {
            return StopTripDetailsArgs$$serializer.f9309a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new ra1(21)), LazyKt.a(lazyThreadSafetyMode, new ra1(22)), null, null, null, null};
    }

    public /* synthetic */ StopTripDetailsArgs(int i, String str, String str2, LatLng latLng, ChaloTransitMode chaloTransitMode, Source source, Double d, String str3, String str4, String str5) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(StopTripDetailsArgs$$serializer.f9309a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = latLng;
        this.e = chaloTransitMode;
        this.f = source;
        this.g = d;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.StopTripDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripDetailsArgs)) {
            return false;
        }
        StopTripDetailsArgs stopTripDetailsArgs = (StopTripDetailsArgs) obj;
        return Intrinsics.d(this.b, stopTripDetailsArgs.b) && Intrinsics.d(this.c, stopTripDetailsArgs.c) && Intrinsics.d(this.d, stopTripDetailsArgs.d) && this.e == stopTripDetailsArgs.e && this.f == stopTripDetailsArgs.f && Intrinsics.d(this.g, stopTripDetailsArgs.g) && Intrinsics.d(this.h, stopTripDetailsArgs.h) && Intrinsics.d(this.i, stopTripDetailsArgs.i) && Intrinsics.d(this.j, stopTripDetailsArgs.j);
    }

    public final int hashCode() {
        int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
        LatLng latLng = this.d;
        int iC = n21.c(this.e, (iE + (latLng == null ? 0 : latLng.hashCode())) * 31, 31);
        Source source = this.f;
        int iHashCode = (iC + (source == null ? 0 : source.hashCode())) * 31;
        Double d = this.g;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return this.j.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopTripDetailsArgs(stopId=", this.b, ", stopName=", this.c, ", stopLocation=");
        sbE.append(this.d);
        sbE.append(", mode=");
        sbE.append(this.e);
        sbE.append(", source=");
        sbE.append(this.f);
        sbE.append(", distKm=");
        sbE.append(this.g);
        sbE.append(", cityName=");
        cb0.t(sbE, this.h, ", tag=", this.i, ", sourceString=");
        return vo1.p(sbE, this.j, ")");
    }

    public StopTripDetailsArgs(String stopId, String stopName, LatLng latLng, ChaloTransitMode mode, Source source, Double d, String str, String str2, String sourceString) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(mode, "mode");
        Intrinsics.i(sourceString, "sourceString");
        this.b = stopId;
        this.c = stopName;
        this.d = latLng;
        this.e = mode;
        this.f = source;
        this.g = d;
        this.h = str;
        this.i = str2;
        this.j = sourceString;
    }
}
