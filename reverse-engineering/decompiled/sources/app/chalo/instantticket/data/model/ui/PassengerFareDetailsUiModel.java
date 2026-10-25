package app.chalo.instantticket.data.model.ui;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/ui/PassengerFareDetailsUiModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerFareDetailsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3895a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;

    public PassengerFareDetailsUiModel(String str, String str2, boolean z, String str3, String actualFarePerTicket, String payableFarePerTicket, ArrayList arrayList, int i, int i2, int i3, boolean z2, boolean z3, String totalFare, boolean z4) {
        Intrinsics.i(actualFarePerTicket, "actualFarePerTicket");
        Intrinsics.i(payableFarePerTicket, "payableFarePerTicket");
        Intrinsics.i(totalFare, "totalFare");
        this.f3895a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = actualFarePerTicket;
        this.f = payableFarePerTicket;
        this.g = arrayList;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z2;
        this.l = z3;
        this.m = totalFare;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerFareDetailsUiModel)) {
            return false;
        }
        PassengerFareDetailsUiModel passengerFareDetailsUiModel = (PassengerFareDetailsUiModel) obj;
        return this.f3895a.equals(passengerFareDetailsUiModel.f3895a) && this.b.equals(passengerFareDetailsUiModel.b) && this.c == passengerFareDetailsUiModel.c && Intrinsics.d(this.d, passengerFareDetailsUiModel.d) && Intrinsics.d(this.e, passengerFareDetailsUiModel.e) && Intrinsics.d(this.f, passengerFareDetailsUiModel.f) && this.g.equals(passengerFareDetailsUiModel.g) && this.h == passengerFareDetailsUiModel.h && this.i == passengerFareDetailsUiModel.i && this.j == passengerFareDetailsUiModel.j && this.k == passengerFareDetailsUiModel.k && this.l == passengerFareDetailsUiModel.l && Intrinsics.d(this.m, passengerFareDetailsUiModel.m) && this.n == passengerFareDetailsUiModel.n;
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f3895a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        return nf1.e((((((((((xs.e(this.g, nf1.e(nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31, 31, this.m) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassengerFareDetailsUiModel(passengerId=", this.f3895a, ", name=", this.b, ", isDiscountApplicable=");
        pk0.x(", discountPercentage=", this.d, ", actualFarePerTicket=", sbE, this.c);
        cb0.t(sbE, this.e, ", payableFarePerTicket=", this.f, ", fareBreakup=");
        sbE.append(this.g);
        sbE.append(", passengerCount=");
        sbE.append(this.h);
        sbE.append(", minBookingCount=");
        hq0.p(this.i, this.j, ", maxBookingCount=", ", isMaxPassengerCountLimitReached=", sbE);
        z40.r(sbE, this.k, ", isMinPassengerCountLimitReached=", this.l, ", totalFare=");
        sbE.append(this.m);
        sbE.append(", isSelectedCategory=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
