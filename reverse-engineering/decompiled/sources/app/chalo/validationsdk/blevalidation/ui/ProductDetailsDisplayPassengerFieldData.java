package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.userprofile.Gender;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/ProductDetailsDisplayPassengerFieldData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDetailsDisplayPassengerFieldData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10618a;
    public final String b;
    public final String c;
    public final Gender d;

    public ProductDetailsDisplayPassengerFieldData(String profilePhoto, String passengerName, String dobString, Gender gender) {
        Intrinsics.i(profilePhoto, "profilePhoto");
        Intrinsics.i(passengerName, "passengerName");
        Intrinsics.i(dobString, "dobString");
        this.f10618a = profilePhoto;
        this.b = passengerName;
        this.c = dobString;
        this.d = gender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsDisplayPassengerFieldData)) {
            return false;
        }
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData = (ProductDetailsDisplayPassengerFieldData) obj;
        return Intrinsics.d(this.f10618a, productDetailsDisplayPassengerFieldData.f10618a) && Intrinsics.d(this.b, productDetailsDisplayPassengerFieldData.b) && Intrinsics.d(this.c, productDetailsDisplayPassengerFieldData.c) && this.d == productDetailsDisplayPassengerFieldData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f10618a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductDetailsDisplayPassengerFieldData(profilePhoto=", this.f10618a, ", passengerName=", this.b, ", dobString=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
