package defpackage;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.location.LatLng;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18410a;
    public final /* synthetic */ LocationSummaryPayloadResponseAppModel b;
    public final /* synthetic */ double c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ LatLng f;

    public /* synthetic */ mm0(LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel, double d, String str, List list, LatLng latLng, int i) {
        this.f18410a = i;
        this.b = locationSummaryPayloadResponseAppModel;
        this.c = d;
        this.d = str;
        this.e = list;
        this.f = latLng;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18410a) {
            case 0:
                LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel = this.b;
                String str = locationSummaryPayloadResponseAppModel.f9494a;
                StopAppModel stopAppModel = locationSummaryPayloadResponseAppModel.e;
                return NearbyStopsMapState.a((NearbyStopsMapState) obj, false, null, null, null, false, null, null, new NearbyStopAndTripsUiModel(str, stopAppModel.f1727a, stopAppModel.b, stopAppModel.c, stopAppModel.d, this.c, this.d, this.e, this.f), null, null, null, false, 32511);
            default:
                LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel2 = this.b;
                String str2 = locationSummaryPayloadResponseAppModel2.f9494a;
                StopAppModel stopAppModel2 = locationSummaryPayloadResponseAppModel2.e;
                return RegularBusViewState.a((RegularBusViewState) obj, false, null, null, new NearbyStopAndTripsUiModel(str2, stopAppModel2.f1727a, stopAppModel2.b, stopAppModel2.c, stopAppModel2.d, this.c, this.d, this.e, this.f), false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 4194255);
        }
    }
}
