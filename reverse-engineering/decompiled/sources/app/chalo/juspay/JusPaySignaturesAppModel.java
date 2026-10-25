package app.chalo.juspay;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySignaturesAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JusPaySignaturesAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4026a;
    public final String b;
    public final String c;
    public final String d;

    public JusPaySignaturesAppModel(String signaturePayload, String signature, String clientId, String merchantKeyId) {
        Intrinsics.i(signaturePayload, "signaturePayload");
        Intrinsics.i(signature, "signature");
        Intrinsics.i(clientId, "clientId");
        Intrinsics.i(merchantKeyId, "merchantKeyId");
        this.f4026a = signaturePayload;
        this.b = signature;
        this.c = clientId;
        this.d = merchantKeyId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JusPaySignaturesAppModel)) {
            return false;
        }
        JusPaySignaturesAppModel jusPaySignaturesAppModel = (JusPaySignaturesAppModel) obj;
        return Intrinsics.d(this.f4026a, jusPaySignaturesAppModel.f4026a) && Intrinsics.d(this.b, jusPaySignaturesAppModel.b) && Intrinsics.d(this.c, jusPaySignaturesAppModel.c) && Intrinsics.d(this.d, jusPaySignaturesAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f4026a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("JusPaySignaturesAppModel(signaturePayload=", this.f4026a, ", signature=", this.b, ", clientId="), this.c, ", merchantKeyId=", this.d, ")");
    }
}
