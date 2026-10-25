package app.chalo.contract;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/ProductInfoContractImpl;", "Lapp/chalo/contract/ProductInfoContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductInfoContractImpl implements ProductInfoContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f1950a;

    public ProductInfoContractImpl(BasicInfoContract basicInfoContract) {
        this.f1950a = basicInfoContract;
    }

    @Override // app.chalo.contract.ProductInfoContract
    public final boolean a(ChaloTransitMode mode, CityAppModel city) {
        Intrinsics.i(mode, "mode");
        Intrinsics.i(city, "city");
        return this.f1950a.a(mode, city);
    }
}
