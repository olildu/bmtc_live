package app.chalo.ncmc.data.appmodel;

import defpackage.gf;
import defpackage.hq0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ClosedCardDetailsAppModel;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardDetails;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedCardDetailsAppModel implements ChaloCardDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6142a;
    public final boolean b;
    public final Long c;
    public final String d;
    public final Long e;
    public final int f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ClosedCardDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ClosedCardDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedCardDetailsAppModel> serializer() {
            return ClosedCardDetailsAppModel$$serializer.f6143a;
        }
    }

    public /* synthetic */ ClosedCardDetailsAppModel(int i, String str, boolean z, Long l, String str2, Long l2, int i2, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(ClosedCardDetailsAppModel$$serializer.f6143a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f6142a = str;
        this.b = z;
        this.c = l;
        this.d = str2;
        this.e = l2;
        this.f = i2;
        this.g = str3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getH() {
        return this.h;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF6151a() {
        return this.f6142a;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    public final Integer c() {
        return Integer.valueOf(this.f);
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getE() {
        return this.e;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedCardDetailsAppModel)) {
            return false;
        }
        ClosedCardDetailsAppModel closedCardDetailsAppModel = (ClosedCardDetailsAppModel) obj;
        return Intrinsics.d(this.f6142a, closedCardDetailsAppModel.f6142a) && this.b == closedCardDetailsAppModel.b && Intrinsics.d(this.c, closedCardDetailsAppModel.c) && Intrinsics.d(this.d, closedCardDetailsAppModel.d) && Intrinsics.d(this.e, closedCardDetailsAppModel.e) && this.f == closedCardDetailsAppModel.f && Intrinsics.d(this.g, closedCardDetailsAppModel.g) && Intrinsics.d(this.h, closedCardDetailsAppModel.h) && Intrinsics.d(this.i, closedCardDetailsAppModel.i) && Intrinsics.d(this.j, closedCardDetailsAppModel.j);
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getJ() {
        return this.j;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardDetails
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getI() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = ((this.f6142a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode4 = (((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f) * 31;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("ClosedCardDetailsAppModel(cardNumber=", this.f6142a, ", isCardRechargeEnabled=", ", rechargeLimit=", this.b);
        py.t(this.c, ", type=", this.d, ", issueDate=", sbM);
        sbM.append(this.e);
        sbM.append(", balance=");
        sbM.append(this.f);
        sbM.append(", cvv=");
        gf.v(this.h, this.g, ", isCardBlocked=", ", isEligibleForUnlink=", sbM);
        sbM.append(this.i);
        sbM.append(", isEligibleToBlockCard=");
        sbM.append(this.j);
        sbM.append(")");
        return sbM.toString();
    }

    public ClosedCardDetailsAppModel(String cardNumber, boolean z, Long l, String str, Long l2, int i, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.i(cardNumber, "cardNumber");
        this.f6142a = cardNumber;
        this.b = z;
        this.c = l;
        this.d = str;
        this.e = l2;
        this.f = i;
        this.g = str2;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }
}
