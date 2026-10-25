package app.chalo.validation.superpass;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userprofile.GenderKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassUserDetailsForProducts;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassUserDetailsForProducts implements UserDetailsForProducts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassUserDetails f10464a;
    public final TimeUtilsContract b;

    public SuperPassUserDetailsForProducts(SuperPassUserDetails superPassUserDetails, TimeUtilsContract timeUtilsContract) {
        Intrinsics.i(superPassUserDetails, "superPassUserDetails");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        this.f10464a = superPassUserDetails;
        this.b = timeUtilsContract;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: a */
    public final String getC() {
        return this.f10464a.c;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String b() {
        return this.f10464a.d.get_value();
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: c */
    public final String getE() {
        return this.f10464a.g;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final StringEnum d() {
        return GenderKt.a(this.f10464a.d);
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String e() {
        TimeUtilsContract timeUtilsContract = this.b;
        SuperPassUserDetails superPassUserDetails = this.f10464a;
        return superPassUserDetails.a(timeUtilsContract) == -1 ? "" : superPassUserDetails.e;
    }
}
