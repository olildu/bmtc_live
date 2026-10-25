package app.chalo.juspay;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JusPaySDKRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4003a;
    public final String b;
    public final JusPayRequestPayload c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySDKRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JusPaySDKRequestApiModel> serializer() {
            return JusPaySDKRequestApiModel$$serializer.f4004a;
        }
    }

    public /* synthetic */ JusPaySDKRequestApiModel(int i, String str, String str2, JusPayRequestPayload jusPayRequestPayload) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(JusPaySDKRequestApiModel$$serializer.f4004a.getDescriptor(), i, 7);
            throw null;
        }
        this.f4003a = str;
        this.b = str2;
        this.c = jusPayRequestPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JusPaySDKRequestApiModel)) {
            return false;
        }
        JusPaySDKRequestApiModel jusPaySDKRequestApiModel = (JusPaySDKRequestApiModel) obj;
        return Intrinsics.d(this.f4003a, jusPaySDKRequestApiModel.f4003a) && Intrinsics.d(this.b, jusPaySDKRequestApiModel.b) && Intrinsics.d(this.c, jusPaySDKRequestApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f4003a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("JusPaySDKRequestApiModel(requestId=", this.f4003a, ", service=", this.b, ", payload=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public JusPaySDKRequestApiModel(String requestId, JusPayRequestPayload jusPayRequestPayload) {
        Intrinsics.i(requestId, "requestId");
        this.f4003a = requestId;
        this.b = "in.juspay.hyperapi";
        this.c = jusPayRequestPayload;
    }
}
