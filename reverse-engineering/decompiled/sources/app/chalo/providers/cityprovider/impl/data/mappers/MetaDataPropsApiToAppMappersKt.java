package app.chalo.providers.cityprovider.impl.data.mappers;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityAgencyResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityBoundsResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityCenterBoundResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityLineMapResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityModeResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataPropsCityResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CurrencyInfo;
import app.chalo.providers.cityprovider.impl.data.models.app.LineMap;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetaDataPropsApiToAppMappersKt {
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    public static final CityAppModel a(MetaDataPropsCityResponseApiModel metaDataPropsCityResponseApiModel) {
        LatLngBounds latLngBounds;
        String str;
        String str2;
        LatLng latLng;
        CurrencyInfo currencyInfo;
        String str3;
        List list;
        List list2;
        int i;
        List list3;
        String str4;
        ModeMapInfoAppModel modeMapInfoAppModel;
        String str5;
        LatLng latLng2;
        Intrinsics.i(metaDataPropsCityResponseApiModel, "<this>");
        MetaDataCityBoundsResponseApiModel metaDataCityBoundsResponseApiModel = metaDataPropsCityResponseApiModel.c;
        if (metaDataCityBoundsResponseApiModel == null) {
            return null;
        }
        Double d = metaDataCityBoundsResponseApiModel.f8840a;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = metaDataCityBoundsResponseApiModel.b;
            if (d2 != null) {
                LatLng latLng3 = new LatLng(dDoubleValue, d2.doubleValue());
                Double d3 = metaDataCityBoundsResponseApiModel.c;
                if (d3 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    Double d4 = metaDataCityBoundsResponseApiModel.d;
                    if (d4 != null) {
                        latLngBounds = new LatLngBounds(latLng3, new LatLng(dDoubleValue2, d4.doubleValue()));
                    } else {
                        latLngBounds = null;
                    }
                } else {
                    latLngBounds = null;
                }
            } else {
                latLngBounds = null;
            }
        } else {
            latLngBounds = null;
        }
        if (latLngBounds == null || (str = metaDataPropsCityResponseApiModel.f8848a) == null || (str2 = metaDataPropsCityResponseApiModel.b) == null) {
            return null;
        }
        MetaDataCityCenterBoundResponseApiModel metaDataCityCenterBoundResponseApiModel = metaDataPropsCityResponseApiModel.d;
        if (metaDataCityCenterBoundResponseApiModel == null) {
            com.google.android.gms.maps.model.LatLng center = ((com.google.android.gms.maps.model.LatLngBounds) latLngBounds.c.getValue()).getCenter();
            Intrinsics.h(center, "getCenter(...)");
            latLng = new LatLng(center.latitude, center.longitude);
        } else {
            Double d5 = metaDataCityCenterBoundResponseApiModel.f8842a;
            if (d5 != null) {
                double dDoubleValue3 = d5.doubleValue();
                Double d6 = metaDataCityCenterBoundResponseApiModel.b;
                if (d6 != null) {
                    latLng2 = new LatLng(dDoubleValue3, d6.doubleValue());
                } else {
                    latLng2 = null;
                }
            } else {
                latLng2 = null;
            }
            if (latLng2 == null) {
                com.google.android.gms.maps.model.LatLng center2 = ((com.google.android.gms.maps.model.LatLngBounds) latLngBounds.c.getValue()).getCenter();
                Intrinsics.h(center2, "getCenter(...)");
                latLng = new LatLng(center2.latitude, center2.longitude);
            } else {
                latLng = latLng2;
            }
        }
        List list4 = metaDataPropsCityResponseApiModel.e;
        if (list4 == null) {
            return null;
        }
        List list5 = list4;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, (String) it.next()));
        }
        List<MetaDataCityLineMapResponseApiModel> list6 = metaDataPropsCityResponseApiModel.f;
        if (list6 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MetaDataCityLineMapResponseApiModel metaDataCityLineMapResponseApiModel : list6) {
            String str6 = metaDataCityLineMapResponseApiModel.f8844a;
            LineMap lineMap = (str6 == null || (str5 = metaDataCityLineMapResponseApiModel.b) == null) ? null : new LineMap(str6, str5);
            if (lineMap != null) {
                arrayList2.add(lineMap);
            }
        }
        String str7 = metaDataPropsCityResponseApiModel.g;
        boolean z = metaDataPropsCityResponseApiModel.h;
        boolean z2 = metaDataPropsCityResponseApiModel.i;
        boolean z3 = metaDataPropsCityResponseApiModel.j;
        String str8 = metaDataPropsCityResponseApiModel.k;
        int i2 = metaDataPropsCityResponseApiModel.l;
        String str9 = metaDataPropsCityResponseApiModel.m;
        String str10 = metaDataPropsCityResponseApiModel.n;
        String str11 = metaDataPropsCityResponseApiModel.o;
        List list7 = metaDataPropsCityResponseApiModel.p;
        CurrencyInfo currencyInfo2 = new CurrencyInfo(metaDataPropsCityResponseApiModel.q, metaDataPropsCityResponseApiModel.r, metaDataPropsCityResponseApiModel.s);
        String str12 = metaDataPropsCityResponseApiModel.t;
        List list8 = metaDataPropsCityResponseApiModel.u;
        if (list8 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                MetaDataCityModeResponseApiModel metaDataCityModeResponseApiModel = (MetaDataCityModeResponseApiModel) it2.next();
                String str13 = metaDataCityModeResponseApiModel.f8846a;
                CurrencyInfo currencyInfo3 = currencyInfo2;
                if (str13 != null) {
                    ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, str13);
                    String str14 = metaDataCityModeResponseApiModel.b;
                    List list9 = metaDataCityModeResponseApiModel.c;
                    if (list9 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = list9.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = it3;
                            MetaDataCityAgencyResponseApiModel metaDataCityAgencyResponseApiModel = (MetaDataCityAgencyResponseApiModel) it3.next();
                            String str15 = str8;
                            String str16 = metaDataCityAgencyResponseApiModel.f8838a;
                            AgencyInfoAppModel agencyInfoAppModel = str16 == null ? null : new AgencyInfoAppModel(str16, metaDataCityAgencyResponseApiModel.c, metaDataCityAgencyResponseApiModel.f, metaDataCityAgencyResponseApiModel.h, metaDataCityAgencyResponseApiModel.i, metaDataCityAgencyResponseApiModel.j, metaDataCityAgencyResponseApiModel.g, metaDataCityAgencyResponseApiModel.b, metaDataCityAgencyResponseApiModel.k, metaDataCityAgencyResponseApiModel.l);
                            if (agencyInfoAppModel != null) {
                                arrayList4.add(agencyInfoAppModel);
                            }
                            str8 = str15;
                            it3 = it4;
                        }
                        str4 = str8;
                        modeMapInfoAppModel = new ModeMapInfoAppModel(chaloTransitModeB, str14, arrayList4);
                    } else {
                        str4 = str8;
                        modeMapInfoAppModel = null;
                    }
                } else {
                    str4 = str8;
                    modeMapInfoAppModel = null;
                }
                if (modeMapInfoAppModel != null) {
                    arrayList3.add(modeMapInfoAppModel);
                }
                it2 = it2;
                str8 = str4;
                currencyInfo2 = currencyInfo3;
            }
            currencyInfo = currencyInfo2;
            str3 = str8;
            list = arrayList3;
        } else {
            currencyInfo = currencyInfo2;
            str3 = str8;
            list = EmptyList.f17557a;
        }
        List list10 = metaDataPropsCityResponseApiModel.v;
        if (list10 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it5 = list10.iterator();
            List list11 = list;
            while (it5.hasNext()) {
                List list12 = (List) it5.next();
                LatLng latLng4 = list12.size() == 2 ? new LatLng(((Number) list12.get(0)).doubleValue(), ((Number) list12.get(1)).doubleValue()) : null;
                if (latLng4 != null) {
                    arrayList5.add(latLng4);
                }
                i2 = i2;
                it5 = it5;
                list11 = list11;
            }
            list2 = list11;
            i = i2;
            list3 = arrayList5;
        } else {
            list2 = list;
            i = i2;
            list3 = EmptyList.f17557a;
        }
        return new CityAppModel(str, str12, latLngBounds, latLng, arrayList, arrayList2, str7, list2, z, z2, z3, str3, i, str9, str10, str11, list7, currencyInfo, str2, list3, metaDataPropsCityResponseApiModel.w);
    }
}
