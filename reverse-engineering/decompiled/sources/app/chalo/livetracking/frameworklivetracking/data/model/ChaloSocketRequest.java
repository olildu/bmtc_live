package app.chalo.livetracking.frameworklivetracking.data.model;

import defpackage.b3;
import defpackage.q7;
import defpackage.ul;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketRequest;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloSocketRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4241a;
    public final List b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloSocketRequest> serializer() {
            return ChaloSocketRequest$$serializer.f4242a;
        }
    }

    public ChaloSocketRequest(int i, String ref, List list) {
        Intrinsics.i(ref, "ref");
        this.f4241a = ref;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloSocketRequest)) {
            return false;
        }
        ChaloSocketRequest chaloSocketRequest = (ChaloSocketRequest) obj;
        return Intrinsics.d(this.f4241a, chaloSocketRequest.f4241a) && Intrinsics.d(this.b, chaloSocketRequest.b) && this.c == chaloSocketRequest.c;
    }

    public final int hashCode() {
        int iHashCode = this.f4241a.hashCode() * 31;
        List list = this.b;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, q7.h("ChaloSocketRequest(ref=", this.f4241a, ", etasList=", ", requestId=", this.b));
    }

    public /* synthetic */ ChaloSocketRequest(String str, int i, int i2, List list) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.b(ChaloSocketRequest$$serializer.f4242a.getDescriptor(), i, 5);
            throw null;
        }
        this.f4241a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        this.c = i2;
    }
}
