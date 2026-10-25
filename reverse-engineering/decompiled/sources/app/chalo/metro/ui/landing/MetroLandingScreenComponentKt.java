package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroLandingScreenComponentKt {
    public static final StopAppModel a(StopAppModel stopAppModel) {
        String str = stopAppModel.f;
        if (str != null) {
            String str2 = !StringsKt.F(str) ? str : null;
            if (str2 != null) {
                String stopName = stopAppModel.b;
                LatLng stopLocation = stopAppModel.c;
                ChaloTransitMode transitMode = stopAppModel.d;
                String str3 = stopAppModel.e;
                String str4 = stopAppModel.f;
                Intrinsics.i(stopName, "stopName");
                Intrinsics.i(stopLocation, "stopLocation");
                Intrinsics.i(transitMode, "transitMode");
                return new StopAppModel(str2, stopName, stopLocation, transitMode, str3, str4);
            }
        }
        return null;
    }
}
