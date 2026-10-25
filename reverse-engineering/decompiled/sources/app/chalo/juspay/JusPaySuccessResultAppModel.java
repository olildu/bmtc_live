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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JusPaySuccessResultAppModel;", "Lapp/chalo/juspay/JusPayResultAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JusPaySuccessResultAppModel extends JusPayResultAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;
    public final String b;
    public final String c;
    public final JusPayAction d;
    public final JusPayResultDataType e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JusPaySuccessResultAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JusPaySuccessResultAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JusPaySuccessResultAppModel> serializer() {
            return JusPaySuccessResultAppModel$$serializer.f4027a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new uc0(20)), LazyKt.a(lazyThreadSafetyMode, new uc0(21))};
    }

    public /* synthetic */ JusPaySuccessResultAppModel(int i, String str, String str2, JusPayAction jusPayAction, JusPayResultDataType jusPayResultDataType) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(JusPaySuccessResultAppModel$$serializer.f4027a.getDescriptor(), i, 15);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = jusPayAction;
        this.e = jusPayResultDataType;
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
        if (!(obj instanceof JusPaySuccessResultAppModel)) {
            return false;
        }
        JusPaySuccessResultAppModel jusPaySuccessResultAppModel = (JusPaySuccessResultAppModel) obj;
        return Intrinsics.d(this.b, jusPaySuccessResultAppModel.b) && Intrinsics.d(this.c, jusPaySuccessResultAppModel.c) && this.d == jusPaySuccessResultAppModel.d && Intrinsics.d(this.e, jusPaySuccessResultAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + nf1.e(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("JusPaySuccessResultAppModel(requestId=", this.b, ", service=", this.c, ", jusPayAction=");
        sbE.append(this.d);
        sbE.append(", resultData=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }

    public JusPaySuccessResultAppModel(String requestId, String service, JusPayAction jusPayAction, JusPayResultDataType resultData) {
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(service, "service");
        Intrinsics.i(resultData, "resultData");
        this.b = requestId;
        this.c = service;
        this.d = jusPayAction;
        this.e = resultData;
    }
}
