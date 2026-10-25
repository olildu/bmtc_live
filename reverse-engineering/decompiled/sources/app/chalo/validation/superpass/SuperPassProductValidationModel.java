package app.chalo.validation.superpass;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassProductValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProductValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10460a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final Long f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final SuperPassUserDetailsForProducts l;
    public final int m;
    public final int n;
    public final double o;
    public final Function1 p;
    public final Function1 q;
    public final Function1 r;
    public final String s;
    public final String t;
    public final boolean u;

    public SuperPassProductValidationModel(String transactionId, String paymentMode, String str, String str2, long j, Long l, int i, String orderId, String productType, String productSubType, String productName, SuperPassUserDetailsForProducts superPassValidationUserDetails, int i2, int i3, double d, Function1 function1, Function1 function2, Function1 function3, String str3, String agency, boolean z) {
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(superPassValidationUserDetails, "superPassValidationUserDetails");
        Intrinsics.i(agency, "agency");
        this.f10460a = transactionId;
        this.b = paymentMode;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = l;
        this.g = i;
        this.h = orderId;
        this.i = productType;
        this.j = productSubType;
        this.k = productName;
        this.l = superPassValidationUserDetails;
        this.m = i2;
        this.n = i3;
        this.o = d;
        this.p = function1;
        this.q = function2;
        this.r = function3;
        this.s = str3;
        this.t = agency;
        this.u = z;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e */
    public final Long getJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductValidationModel)) {
            return false;
        }
        SuperPassProductValidationModel superPassProductValidationModel = (SuperPassProductValidationModel) obj;
        return Intrinsics.d(this.f10460a, superPassProductValidationModel.f10460a) && Intrinsics.d(this.b, superPassProductValidationModel.b) && Intrinsics.d(this.c, superPassProductValidationModel.c) && Intrinsics.d(this.d, superPassProductValidationModel.d) && this.e == superPassProductValidationModel.e && Intrinsics.d(this.f, superPassProductValidationModel.f) && this.g == superPassProductValidationModel.g && Intrinsics.d(this.h, superPassProductValidationModel.h) && Intrinsics.d(this.i, superPassProductValidationModel.i) && Intrinsics.d(this.j, superPassProductValidationModel.j) && Intrinsics.d(this.k, superPassProductValidationModel.k) && Intrinsics.d(this.l, superPassProductValidationModel.l) && this.m == superPassProductValidationModel.m && this.n == superPassProductValidationModel.n && Double.compare(this.o, superPassProductValidationModel.o) == 0 && Intrinsics.d(this.p, superPassProductValidationModel.p) && Intrinsics.d(this.q, superPassProductValidationModel.q) && Intrinsics.d(this.r, superPassProductValidationModel.r) && Intrinsics.d(this.s, superPassProductValidationModel.s) && Intrinsics.d(this.t, superPassProductValidationModel.t) && this.u == superPassProductValidationModel.u;
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
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getE() {
        return this.e;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10460a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long j = this.e;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f;
        int iHashCode3 = (((((this.l.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((((i + (l != null ? l.hashCode() : 0)) * 31) + this.g) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31) + this.m) * 31) + this.n) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.o);
        return nf1.e(nf1.e((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((iHashCode3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31)) * 31)) * 31)) * 31, 31, this.s), 31, this.t) + (this.u ? 1231 : 1237);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getK() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassProductValidationModel(transactionId=", this.f10460a, ", paymentMode=", this.b, ", qrCode=");
        cb0.t(sbE, this.c, ", soundStaticTone=", this.d, ", expiryTime=");
        sbE.append(this.e);
        sbE.append(", activationDuration=");
        sbE.append(this.f);
        sbE.append(", amount=");
        sbE.append(this.g);
        sbE.append(", orderId=");
        sbE.append(this.h);
        cb0.t(sbE, ", productType=", this.i, ", productSubType=", this.j);
        sbE.append(", productName=");
        sbE.append(this.k);
        sbE.append(", superPassValidationUserDetails=");
        sbE.append(this.l);
        z40.o(this.m, this.n, ", remainingTripsForToday=", ", remainingTotalTrips=", sbE);
        pk0.z(sbE, ", maxPricePerTrip=", this.o, ", checkIsValid=");
        sbE.append(this.p);
        sbE.append(", getActivationTimeStamp=");
        sbE.append(this.q);
        sbE.append(", checkIsActivationValid=");
        sbE.append(this.r);
        sbE.append(", city=");
        sbE.append(this.s);
        sbE.append(", agency=");
        sbE.append(this.t);
        sbE.append(", shouldShowProductBranding=");
        sbE.append(this.u);
        sbE.append(")");
        return sbE.toString();
    }
}
