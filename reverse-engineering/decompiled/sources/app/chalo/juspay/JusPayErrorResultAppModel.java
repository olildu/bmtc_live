package app.chalo.juspay;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uc0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPayErrorResultAppModel;", "Lapp/chalo/juspay/JusPayResultAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JusPayErrorResultAppModel extends JusPayResultAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;
    public final String b;
    public final String c;
    public final JusPayAction d;
    public final String e;
    public final JuspayErrorResultType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPayErrorResultAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPayErrorResultAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JusPayErrorResultAppModel> serializer() {
            return JusPayErrorResultAppModel$$serializer.f3981a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new uc0(3)), null, LazyKt.a(lazyThreadSafetyMode, new uc0(4))};
    }

    public /* synthetic */ JusPayErrorResultAppModel(int i, String str, String str2, JusPayAction jusPayAction, String str3, JuspayErrorResultType juspayErrorResultType) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(JusPayErrorResultAppModel$$serializer.f3981a.getDescriptor(), i, 31);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = jusPayAction;
        this.e = str3;
        this.f = juspayErrorResultType;
    }

    @Override // app.chalo.juspay.JusPayResultAppModel
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JusPayErrorResultAppModel)) {
            return false;
        }
        JusPayErrorResultAppModel jusPayErrorResultAppModel = (JusPayErrorResultAppModel) obj;
        return Intrinsics.d(this.b, jusPayErrorResultAppModel.b) && Intrinsics.d(this.c, jusPayErrorResultAppModel.c) && this.d == jusPayErrorResultAppModel.d && Intrinsics.d(this.e, jusPayErrorResultAppModel.e) && Intrinsics.d(this.f, jusPayErrorResultAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e((this.d.hashCode() + nf1.e(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("JusPayErrorResultAppModel(requestId=", this.b, ", service=", this.c, ", jusPayAction=");
        sbE.append(this.d);
        sbE.append(", message=");
        sbE.append(this.e);
        sbE.append(", errorType=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public JusPayErrorResultAppModel(String requestId, String service, JusPayAction jusPayAction, String str, JuspayErrorResultType juspayErrorResultType) {
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(service, "service");
        Intrinsics.i(jusPayAction, "jusPayAction");
        this.b = requestId;
        this.c = service;
        this.d = jusPayAction;
        this.e = str;
        this.f = juspayErrorResultType;
    }
}
