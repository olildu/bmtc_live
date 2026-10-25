package app.chalo.stoptripdetails.data.mappers;

import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt;
import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.LocationSummaryPayloadApiResponseModel;
import app.chalo.stoptripdetails.data.model.api.StopTripDetailsResponseApiModel;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryResponseAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsResponseAppModel;
import app.chalo.utils.KUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocationSummaryApiToAppModelsMappersKt {
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public static final LocationSummaryResponseAppModel a(LocationSummaryApiResponseModel locationSummaryApiResponseModel) {
        LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel;
        Intrinsics.i(locationSummaryApiResponseModel, "<this>");
        List<LocationSummaryPayloadApiResponseModel> list = locationSummaryApiResponseModel.f9475a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (LocationSummaryPayloadApiResponseModel locationSummaryPayloadApiResponseModel : list) {
                Intrinsics.i(locationSummaryPayloadApiResponseModel, "<this>");
                String strA = KUUID.a();
                List list2 = locationSummaryPayloadApiResponseModel.f9477a;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        StopTripDetailsResponseAppModel stopTripDetailsResponseAppModelA = StopTripDetailsRemoteToAppModelMappersKt.a((StopTripDetailsResponseApiModel) it.next());
                        StopTripDetailsAppModel stopTripDetailsAppModel = stopTripDetailsResponseAppModelA != null ? stopTripDetailsResponseAppModelA.b : null;
                        if (stopTripDetailsAppModel != null) {
                            arrayList2.add(stopTripDetailsAppModel);
                        }
                    }
                    String str = locationSummaryPayloadApiResponseModel.b;
                    Double d = locationSummaryPayloadApiResponseModel.c;
                    StopApiModel stopApiModel = locationSummaryPayloadApiResponseModel.d;
                    if (stopApiModel != null) {
                        StopAppModel stopAppModelD = RoutesDataResponseApiModelKt.d(stopApiModel);
                        String str2 = locationSummaryPayloadApiResponseModel.e;
                        if (str2 == null) {
                            locationSummaryPayloadResponseAppModel = null;
                        } else {
                            locationSummaryPayloadResponseAppModel = new LocationSummaryPayloadResponseAppModel(strA, arrayList2, str, d, stopAppModelD, str2);
                        }
                    } else {
                        locationSummaryPayloadResponseAppModel = null;
                    }
                } else {
                    locationSummaryPayloadResponseAppModel = null;
                }
                if (locationSummaryPayloadResponseAppModel != null) {
                    arrayList.add(locationSummaryPayloadResponseAppModel);
                }
            }
            String str3 = locationSummaryApiResponseModel.b;
            if (str3 != null) {
                return new LocationSummaryResponseAppModel(arrayList, str3);
            }
        }
        return null;
    }
}
