package app.chalo.stoptripdetails.data.mappers;

import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt;
import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.stoptripdetails.data.model.api.FrequencyDataArrayApiModel;
import app.chalo.stoptripdetails.data.model.api.StopTripDetailsResponseApiModel;
import app.chalo.stoptripdetails.data.model.api.TripApiModel;
import app.chalo.stoptripdetails.data.model.app.FrequencyAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel;
import app.chalo.stoptripdetails.data.model.app.StopTripDetailsResponseAppModel;
import app.chalo.stoptripdetails.data.model.app.TimeIntervalAppModel;
import app.chalo.utils.KUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsRemoteToAppModelMappersKt {
    public static final StopTripDetailsResponseAppModel a(StopTripDetailsResponseApiModel stopTripDetailsResponseApiModel) {
        StopTripDetailsAppModel unknownTiming;
        StopTripDetailsAppModel fixedTime;
        String str;
        String str2;
        EmptyList emptyList;
        List list;
        Intrinsics.i(stopTripDetailsResponseApiModel, "<this>");
        int i = stopTripDetailsResponseApiModel.f9482a;
        TripApiModel tripApiModel = stopTripDetailsResponseApiModel.b;
        Boolean bool = tripApiModel.g;
        String str3 = tripApiModel.v;
        String str4 = tripApiModel.s;
        Integer num = tripApiModel.q;
        Integer num2 = tripApiModel.p;
        List list2 = tripApiModel.m;
        List list3 = tripApiModel.l;
        String str5 = tripApiModel.k;
        StopApiModel stopApiModel = tripApiModel.i;
        StopApiModel stopApiModel2 = tripApiModel.e;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            String strA = KUUID.a();
            if (stopApiModel2 != null) {
                StopAppModel stopAppModelD = RoutesDataResponseApiModelKt.d(stopApiModel2);
                List list4 = tripApiModel.f;
                if (list4 != null) {
                    List list5 = list4;
                    ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        FrequencyDataArrayApiModel frequencyDataArrayApiModel = (FrequencyDataArrayApiModel) it.next();
                        arrayList.add(new FrequencyAppModel(new TimeIntervalAppModel(frequencyDataArrayApiModel.c, frequencyDataArrayApiModel.f9471a), frequencyDataArrayApiModel.b));
                        it = it;
                        str3 = str3;
                        str4 = str4;
                    }
                    str = str3;
                    str2 = str4;
                    list = arrayList;
                } else {
                    str = str3;
                    str2 = str4;
                    emptyList = EmptyList.f17557a;
                }
                if (stopApiModel != null) {
                    list = emptyList;
                    StopAppModel stopAppModelD2 = RoutesDataResponseApiModelKt.d(stopApiModel);
                    String str6 = tripApiModel.j;
                    String str7 = str5 == null ? "" : str5;
                    if (list3 == null) {
                        list3 = EmptyList.f17557a;
                    }
                    List list6 = list3;
                    if (list2 == null) {
                        list2 = EmptyList.f17557a;
                    }
                    List list7 = list2;
                    String str8 = tripApiModel.o;
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    TimeTableStatus timeTableStatusB = RoutesDataResponseApiModelKt.b(num != null ? num.intValue() : -1);
                    String str9 = str2 == null ? "" : str2;
                    String str10 = tripApiModel.u;
                    RouteNamingSchemeType.INSTANCE.getClass();
                    unknownTiming = new StopTripDetailsAppModel.FrequencyTrip(strA, list, timeTableStatusB, stopAppModelD, stopAppModelD2, str6, str7, list6, list7, str8, iIntValue, str9, str10, RouteNamingSchemeType.Companion.a(str));
                    fixedTime = unknownTiming;
                }
            }
            list = emptyList;
            fixedTime = null;
        } else {
            if (i != 0) {
                String strA2 = KUUID.a();
                if (stopApiModel2 != null) {
                    StopAppModel stopAppModelD3 = RoutesDataResponseApiModelKt.d(stopApiModel2);
                    if (stopApiModel != null) {
                        StopAppModel stopAppModelD4 = RoutesDataResponseApiModelKt.d(stopApiModel);
                        String str11 = tripApiModel.j;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        List list8 = list2 == null ? EmptyList.f17557a : list2;
                        String str12 = tripApiModel.o;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        TimeTableStatus timeTableStatusB2 = RoutesDataResponseApiModelKt.b(num != null ? num.intValue() : -1);
                        String str13 = str4 == null ? "" : str4;
                        String str14 = tripApiModel.u;
                        RouteNamingSchemeType.INSTANCE.getClass();
                        fixedTime = new StopTripDetailsAppModel.FixedTime(strA2, timeTableStatusB2, stopAppModelD3, stopAppModelD4, str11, str5, list3, list8, str12, iIntValue2, str13, i, str14, RouteNamingSchemeType.Companion.a(str3));
                    }
                }
            } else {
                String strA3 = KUUID.a();
                if (stopApiModel2 != null) {
                    StopAppModel stopAppModelD5 = RoutesDataResponseApiModelKt.d(stopApiModel2);
                    if (stopApiModel != null) {
                        StopAppModel stopAppModelD6 = RoutesDataResponseApiModelKt.d(stopApiModel);
                        String str15 = tripApiModel.j;
                        String str16 = str5 == null ? "" : str5;
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        List list9 = list3;
                        List list10 = list2 == null ? EmptyList.f17557a : list2;
                        String str17 = tripApiModel.o;
                        int iIntValue3 = num2 != null ? num2.intValue() : 0;
                        TimeTableStatus timeTableStatusB3 = RoutesDataResponseApiModelKt.b(num != null ? num.intValue() : -1);
                        String str18 = str4 == null ? "" : str4;
                        String str19 = tripApiModel.u;
                        RouteNamingSchemeType.INSTANCE.getClass();
                        unknownTiming = new StopTripDetailsAppModel.UnknownTiming(strA3, timeTableStatusB3, stopAppModelD5, stopAppModelD6, str15, str16, list9, list10, str17, iIntValue3, str18, str19, RouteNamingSchemeType.Companion.a(str3));
                        fixedTime = unknownTiming;
                    }
                }
            }
            list = emptyList;
            fixedTime = null;
        }
        if (fixedTime == null) {
            return null;
        }
        return new StopTripDetailsResponseAppModel(i, fixedTime);
    }
}
