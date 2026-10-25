package app.chalo.electricitybill.data.model.apimodel.request;

import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/EbillProps;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EbillProps {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2526a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/request/EbillProps$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/request/EbillProps;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EbillProps> serializer() {
            return EbillProps$$serializer.f2527a;
        }
    }

    public /* synthetic */ EbillProps(int i, int i2, String str, long j, long j2, String str2, String str3) {
        if (61 != (i & 61)) {
            PluginExceptionsKt.b(EbillProps$$serializer.f2527a.getDescriptor(), i, 61);
            throw null;
        }
        this.f2526a = i2;
        if ((i & 2) == 0) {
            this.b = "ebill_dakjh";
        } else {
            this.b = str;
        }
        this.c = j;
        this.d = j2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EbillProps)) {
            return false;
        }
        EbillProps ebillProps = (EbillProps) obj;
        return this.f2526a == ebillProps.f2526a && Intrinsics.d(this.b, ebillProps.b) && this.c == ebillProps.c && this.d == ebillProps.d && Intrinsics.d(this.e, ebillProps.e) && Intrinsics.d(this.f, ebillProps.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2526a * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return this.f.hashCode() + nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f2526a, "EbillProps(amount=", ", configId=", this.b, ", billDate=");
        sbP.append(this.c);
        xs.r(this.d, ", dueDate=", ", accountNumber=", sbP);
        return r30.i(sbP, this.e, ", customerName=", this.f, ")");
    }

    public EbillProps(int i, String configId, long j, long j2, String accountNumber, String customerName) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(accountNumber, "accountNumber");
        Intrinsics.i(customerName, "customerName");
        this.f2526a = i;
        this.b = configId;
        this.c = j;
        this.d = j2;
        this.e = accountNumber;
        this.f = customerName;
    }
}
