package app.chalo.ncmc.uvik;

import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikIntentData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UvikIntentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6443a;
    public final String b;
    public final UvikServiceType c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public UvikIntentData(String str, String subUserId, UvikServiceType transactionType, String invoiceNumber, String intentHash, String str2, String str3) {
        Intrinsics.i(subUserId, "subUserId");
        Intrinsics.i(transactionType, "transactionType");
        Intrinsics.i(invoiceNumber, "invoiceNumber");
        Intrinsics.i(intentHash, "intentHash");
        this.f6443a = str;
        this.b = subUserId;
        this.c = transactionType;
        this.d = invoiceNumber;
        this.e = intentHash;
        this.f = str2;
        this.g = str3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UvikIntentData)) {
            return false;
        }
        UvikIntentData uvikIntentData = (UvikIntentData) obj;
        if (!this.f6443a.equals(uvikIntentData.f6443a) || !Intrinsics.d(this.b, uvikIntentData.b) || this.c != uvikIntentData.c || !Intrinsics.d(this.d, uvikIntentData.d) || !Intrinsics.d(this.e, uvikIntentData.e)) {
            return false;
        }
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return orangePrimary.equals(orangePrimary) && Intrinsics.d(this.f, uvikIntentData.f) && Intrinsics.d(this.g, uvikIntentData.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.e.hashCode() + nf1.e((this.c.hashCode() + nf1.e(nf1.e(1954121954, 31, this.f6443a), 31, this.b)) * 31, 31, this.d)) * 31) - 770270357) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UvikIntentData(action=transaction, phoneNumber=", this.f6443a, ", subUserId=", this.b, ", transactionType=");
        sbE.append(this.c);
        sbE.append(", invoiceNumber=");
        sbE.append(this.d);
        sbE.append(", intentHash=");
        sbE.append(this.e);
        sbE.append(", sdkThemeColor=");
        sbE.append(ChaloColorToken.OrangePrimary.f9835a);
        sbE.append(", serviceId=");
        return r30.i(sbE, this.f, ", serviceManagementInfoNumber=", this.g, ")");
    }
}
