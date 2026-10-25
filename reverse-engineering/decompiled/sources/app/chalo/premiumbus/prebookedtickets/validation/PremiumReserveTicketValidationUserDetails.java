package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationUserDetails;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketValidationUserDetails implements UserDetailsForProducts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7490a;
    public final String b;
    public final String c;
    public final Gender d;
    public final String e;

    public PremiumReserveTicketValidationUserDetails(String userId, String phoneNumber, String fullName, Gender gender, String str) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        this.f7490a = userId;
        this.b = phoneNumber;
        this.c = fullName;
        this.d = gender;
        this.e = str;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String b() {
        return "";
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final StringEnum d() {
        return GenderKt.a(this.d);
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String e() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketValidationUserDetails)) {
            return false;
        }
        PremiumReserveTicketValidationUserDetails premiumReserveTicketValidationUserDetails = (PremiumReserveTicketValidationUserDetails) obj;
        return Intrinsics.d(this.f7490a, premiumReserveTicketValidationUserDetails.f7490a) && Intrinsics.d(this.b, premiumReserveTicketValidationUserDetails.b) && Intrinsics.d(this.c, premiumReserveTicketValidationUserDetails.c) && this.d == premiumReserveTicketValidationUserDetails.d && Intrinsics.d(this.e, premiumReserveTicketValidationUserDetails.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + nf1.e(nf1.e(this.f7490a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketValidationUserDetails(userId=", this.f7490a, ", phoneNumber=", this.b, ", fullName=");
        sbE.append(this.c);
        sbE.append(", gender=");
        sbE.append(this.d);
        sbE.append(", profilePhotoUrl=");
        return vo1.p(sbE, this.e, ")");
    }
}
