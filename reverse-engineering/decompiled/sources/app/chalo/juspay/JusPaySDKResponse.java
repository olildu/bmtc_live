package app.chalo.juspay;

import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySDKResponse;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JusPaySDKResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4006a;
    public final String b;
    public final JsonObject c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySDKResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySDKResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JusPaySDKResponse> serializer() {
            return JusPaySDKResponse$$serializer.f4007a;
        }
    }

    public /* synthetic */ JusPaySDKResponse(int i, String str, String str2, JsonObject jsonObject, Boolean bool, String str3, String str4, String str5) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(JusPaySDKResponse$$serializer.f4007a.getDescriptor(), i, 127);
            throw null;
        }
        this.f4006a = str;
        this.b = str2;
        this.c = jsonObject;
        this.d = bool;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JusPaySDKResponse)) {
            return false;
        }
        JusPaySDKResponse jusPaySDKResponse = (JusPaySDKResponse) obj;
        return Intrinsics.d(this.f4006a, jusPaySDKResponse.f4006a) && Intrinsics.d(this.b, jusPaySDKResponse.b) && Intrinsics.d(this.c, jusPaySDKResponse.c) && Intrinsics.d(this.d, jusPaySDKResponse.d) && Intrinsics.d(this.e, jusPaySDKResponse.e) && Intrinsics.d(this.f, jusPaySDKResponse.f) && Intrinsics.d(this.g, jusPaySDKResponse.g);
    }

    public final int hashCode() {
        int iF = d.f(this.c.f18198a, nf1.e(this.f4006a.hashCode() * 31, 31, this.b), 31);
        Boolean bool = this.d;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("JusPaySDKResponse(requestId=", this.f4006a, ", service=", this.b, ", payload=");
        sbE.append(this.c);
        sbE.append(", error=");
        sbE.append(this.d);
        sbE.append(", errorMessage=");
        cb0.t(sbE, this.e, ", errorCode=", this.f, ", event=");
        return vo1.p(sbE, this.g, ")");
    }
}
