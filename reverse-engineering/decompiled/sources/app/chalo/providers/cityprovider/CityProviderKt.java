package app.chalo.providers.cityprovider;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityProviderKt {
    public static final boolean a(CityProvider cityProvider, LatLng latLng) {
        Intrinsics.i(cityProvider, "<this>");
        Intrinsics.i(latLng, "latLng");
        CityAppModel cityAppModel = (CityAppModel) cityProvider.b().getValue();
        return cityAppModel != null && CityAppModelKt.b(cityAppModel, latLng);
    }

    public static final String b(CityProvider cityProvider) {
        Intrinsics.i(cityProvider, "<this>");
        CityAppModel cityAppModel = (CityAppModel) cityProvider.b().getValue();
        if (cityAppModel != null) {
            return cityAppModel.f8854a;
        }
        return null;
    }

    public static final boolean c(CityProvider cityProvider) {
        return ((Boolean) cityProvider.i().getValue()).booleanValue();
    }
}
