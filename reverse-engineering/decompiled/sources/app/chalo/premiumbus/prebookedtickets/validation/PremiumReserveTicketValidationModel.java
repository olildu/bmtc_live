package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.i5;
import defpackage.nf1;
import defpackage.qv0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7485a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final i5 k;
    public final PremiumReserveTicketValidationUserDetails l;
    public final String m;
    public final long n;
    public final String o;
    public final String p;
    public final String q;
    public final qv0 r;

    public PremiumReserveTicketValidationModel(String str, String str2, String str3, String str4, long j, int i, String str5, String productSubType, String productType, Long l, i5 i5Var, PremiumReserveTicketValidationUserDetails premiumReserveTicketValidationUserDetails, String city, long j2, String startStopName, String endStopName, String str6, qv0 qv0Var) {
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(city, "city");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        this.f7485a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = i;
        this.g = str5;
        this.h = productSubType;
        this.i = productType;
        this.j = l;
        this.k = i5Var;
        this.l = premiumReserveTicketValidationUserDetails;
        this.m = city;
        this.n = j2;
        this.o = startStopName;
        this.p = endStopName;
        this.q = str6;
        this.r = qv0Var;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJ() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getH() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        return ((Boolean) this.r.invoke()).booleanValue();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getJ() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketValidationModel)) {
            return false;
        }
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = (PremiumReserveTicketValidationModel) obj;
        return this.f7485a.equals(premiumReserveTicketValidationModel.f7485a) && this.b.equals(premiumReserveTicketValidationModel.b) && this.c.equals(premiumReserveTicketValidationModel.c) && this.d.equals(premiumReserveTicketValidationModel.d) && this.e == premiumReserveTicketValidationModel.e && this.f == premiumReserveTicketValidationModel.f && this.g.equals(premiumReserveTicketValidationModel.g) && Intrinsics.d(this.h, premiumReserveTicketValidationModel.h) && Intrinsics.d(this.i, premiumReserveTicketValidationModel.i) && Intrinsics.d(this.j, premiumReserveTicketValidationModel.j) && this.k.equals(premiumReserveTicketValidationModel.k) && this.l.equals(premiumReserveTicketValidationModel.l) && Intrinsics.d(this.m, premiumReserveTicketValidationModel.m) && this.n == premiumReserveTicketValidationModel.n && Intrinsics.d(this.o, premiumReserveTicketValidationModel.o) && Intrinsics.d(this.p, premiumReserveTicketValidationModel.p) && this.q.equals(premiumReserveTicketValidationModel.q) && this.r.equals(premiumReserveTicketValidationModel.r);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getG() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getE() {
        return this.e;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f7485a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int iE2 = nf1.e((((this.h.hashCode() + nf1.e((((iE + ((int) (j ^ (j >>> 32)))) * 961) + this.f) * 31, 31, this.g)) * 31) + 2030500110) * 31, 31, this.i);
        Long l = this.j;
        int iE3 = nf1.e((this.l.hashCode() + ((this.k.hashCode() + ((iE2 + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31, 31, this.m);
        long j2 = this.n;
        return this.r.hashCode() + nf1.e(nf1.e(nf1.e((iE3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.o), 31, this.p), 31, this.q);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i */
    public final String getK() {
        return "One Way Booking";
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketValidationModel(transactionId=", this.f7485a, ", paymentMode=", this.b, ", qrCode=");
        cb0.t(sbE, this.c, ", soundStaticTone=", this.d, ", expiryTime=");
        sbE.append(this.e);
        sbE.append(", activationDuration=null, amount=");
        sbE.append(this.f);
        cb0.t(sbE, ", orderId=", this.g, ", productSubType=", this.h);
        sbE.append(", productName=One Way Booking, productType=");
        sbE.append(this.i);
        sbE.append(", punchTime=");
        sbE.append(this.j);
        sbE.append(", checkIsValid=");
        sbE.append(this.k);
        sbE.append(", userDetails=");
        sbE.append(this.l);
        d.t(sbE, ", city=", this.m, ", scheduledAt=");
        dd.k(this.n, ", startStopName=", this.o, sbE);
        cb0.t(sbE, ", endStopName=", this.p, ", routeName=", this.q);
        sbE.append(", isTicketUsed=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }
}
