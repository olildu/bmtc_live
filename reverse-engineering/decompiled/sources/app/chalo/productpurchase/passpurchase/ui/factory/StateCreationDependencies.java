package app.chalo.productpurchase.passpurchase.ui.factory;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/factory/StateCreationDependencies;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StateCreationDependencies {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8433a;
    public final TimeUtilsContract b;
    public final BasicInfoContract c;
    public final CityProvider d;
    public final ProductPurchaseRepository e;
    public final UserProfileDetailsProvider f;
    public final CrashlyticsLogger g;

    public StateCreationDependencies(SuperPassRepository superPassRepository, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, CityProvider cityProvider, ProductPurchaseRepository productPurchaseRepository, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger errorReporterContract) {
        Intrinsics.i(superPassRepository, "superPassRepository");
        Intrinsics.i(timeUtilsContract, "timeUtilsContract");
        Intrinsics.i(basicInfoContract, "basicInfoContract");
        Intrinsics.i(cityProvider, "cityProvider");
        Intrinsics.i(productPurchaseRepository, "productPurchaseRepository");
        Intrinsics.i(userProfileDetailsProvider, "userProfileDetailsProvider");
        Intrinsics.i(errorReporterContract, "errorReporterContract");
        this.f8433a = superPassRepository;
        this.b = timeUtilsContract;
        this.c = basicInfoContract;
        this.d = cityProvider;
        this.e = productPurchaseRepository;
        this.f = userProfileDetailsProvider;
        this.g = errorReporterContract;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateCreationDependencies)) {
            return false;
        }
        StateCreationDependencies stateCreationDependencies = (StateCreationDependencies) obj;
        return Intrinsics.d(this.f8433a, stateCreationDependencies.f8433a) && Intrinsics.d(this.b, stateCreationDependencies.b) && Intrinsics.d(this.c, stateCreationDependencies.c) && Intrinsics.d(this.d, stateCreationDependencies.d) && Intrinsics.d(this.e, stateCreationDependencies.e) && Intrinsics.d(this.f, stateCreationDependencies.f) && Intrinsics.d(this.g, stateCreationDependencies.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8433a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StateCreationDependencies(superPassRepository=" + this.f8433a + ", timeUtilsContract=" + this.b + ", basicInfoContract=" + this.c + ", cityProvider=" + this.d + ", productPurchaseRepository=" + this.e + ", userProfileDetailsProvider=" + this.f + ", errorReporterContract=" + this.g + ")";
    }
}
