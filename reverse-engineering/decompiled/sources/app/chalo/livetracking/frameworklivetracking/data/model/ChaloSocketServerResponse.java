package app.chalo.livetracking.frameworklivetracking.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketServerResponse;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloSocketServerResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4260a;
    public final Integer b;
    public final JsonObject c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketServerResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketServerResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloSocketServerResponse> serializer() {
            return ChaloSocketServerResponse$$serializer.f4261a;
        }
    }

    public /* synthetic */ ChaloSocketServerResponse(int i, String str, Integer num, JsonObject jsonObject) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ChaloSocketServerResponse$$serializer.f4261a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4260a = str;
        this.b = num;
        this.c = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloSocketServerResponse)) {
            return false;
        }
        ChaloSocketServerResponse chaloSocketServerResponse = (ChaloSocketServerResponse) obj;
        return Intrinsics.d(this.f4260a, chaloSocketServerResponse.f4260a) && Intrinsics.d(this.b, chaloSocketServerResponse.b) && Intrinsics.d(this.c, chaloSocketServerResponse.c);
    }

    public final int hashCode() {
        String str = this.f4260a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.c.f18198a.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChaloSocketServerResponse(ref=" + this.f4260a + ", requestId=" + this.b + ", res=" + this.c + ")";
    }
}
