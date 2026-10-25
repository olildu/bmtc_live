package app.chalo.geoquery.data.mappers;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggerKt;
import app.chalo.geoquery.data.models.api.GeoQueryApiResponseModel;
import app.chalo.geoquery.data.models.api.GeoQueryBusInfoApiResponseModel;
import app.chalo.geoquery.data.models.api.GeoQueryBusInfoParametersApiResponseModel;
import app.chalo.geoquery.data.models.api.GeoQueryBusInfoSessionApiResponseModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoParametersResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoSessionResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GeoQueryRemoteToAppModelMappersKt {
    public static final Object a(JsonElement jsonElement, CrashlyticsLogger crashlyticsLogger, Continuation continuation) {
        if (jsonElement == null) {
            return null;
        }
        Object objB = CrashlyticsLoggerKt.b(crashlyticsLogger, new GeoQueryRemoteToAppModelMappersKt$parseJsonObject$2$1(jsonElement, null), (ContinuationImpl) continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : (JsonObject) objB;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d A[SYNTHETIC] */
    public static final Object b(GeoQueryApiResponseModel geoQueryApiResponseModel, CrashlyticsLogger crashlyticsLogger, ContinuationImpl continuationImpl) {
        GeoQueryRemoteToAppModelMappersKt$toAppModel$1 geoQueryRemoteToAppModelMappersKt$toAppModel$1;
        ArrayList arrayList;
        Iterator it;
        GeoQueryBusInfoResponseAppModel geoQueryBusInfoResponseAppModel;
        GeoQueryBusInfoSessionApiResponseModel geoQueryBusInfoSessionApiResponseModel;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        GeoQueryBusInfoSessionResponseAppModel geoQueryBusInfoSessionResponseAppModel;
        GeoQueryBusInfoParametersApiResponseModel geoQueryBusInfoParametersApiResponseModel;
        GeoQueryBusInfoParametersResponseAppModel geoQueryBusInfoParametersResponseAppModel;
        Double d;
        List list;
        GeoQueryApiResponseModel geoQueryApiResponseModel2;
        CrashlyticsLogger crashlyticsLogger2;
        JsonObject jsonObject;
        List list2;
        JsonObject jsonObject2;
        Object objA;
        List list3;
        JsonObject jsonObject3;
        JsonObject jsonObject4;
        Object objA2;
        JsonObject jsonObject5;
        JsonObject jsonObject6;
        List list4;
        GeoQueryApiResponseModel geoQueryApiResponseModel3 = geoQueryApiResponseModel;
        CrashlyticsLogger crashlyticsLogger3 = crashlyticsLogger;
        if (continuationImpl instanceof GeoQueryRemoteToAppModelMappersKt$toAppModel$1) {
            geoQueryRemoteToAppModelMappersKt$toAppModel$1 = (GeoQueryRemoteToAppModelMappersKt$toAppModel$1) continuationImpl;
            int i = geoQueryRemoteToAppModelMappersKt$toAppModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = i - Integer.MIN_VALUE;
            } else {
                geoQueryRemoteToAppModelMappersKt$toAppModel$1 = new GeoQueryRemoteToAppModelMappersKt$toAppModel$1(continuationImpl);
            }
        } else {
            geoQueryRemoteToAppModelMappersKt$toAppModel$1 = new GeoQueryRemoteToAppModelMappersKt$toAppModel$1(continuationImpl);
        }
        Object objA3 = geoQueryRemoteToAppModelMappersKt$toAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = geoQueryRemoteToAppModelMappersKt$toAppModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objA3);
            List list5 = geoQueryApiResponseModel3.f2805a;
            if (list5 != null) {
                arrayList = new ArrayList();
                for (Iterator it2 = list5.iterator(); it2.hasNext(); it2 = it) {
                    GeoQueryBusInfoApiResponseModel geoQueryBusInfoApiResponseModel = (GeoQueryBusInfoApiResponseModel) it2.next();
                    if (geoQueryBusInfoApiResponseModel == null || (geoQueryBusInfoSessionApiResponseModel = geoQueryBusInfoApiResponseModel.f2807a) == null) {
                        it = it2;
                    } else {
                        String str8 = geoQueryBusInfoSessionApiResponseModel.f2811a;
                        if (str8 == null || (str = geoQueryBusInfoSessionApiResponseModel.b) == null || (str2 = geoQueryBusInfoSessionApiResponseModel.c) == null || (str3 = geoQueryBusInfoSessionApiResponseModel.d) == null || (str4 = geoQueryBusInfoSessionApiResponseModel.e) == null || (str5 = geoQueryBusInfoSessionApiResponseModel.f) == null || (str6 = geoQueryBusInfoSessionApiResponseModel.g) == null) {
                            it = it2;
                        } else {
                            it = it2;
                            String str9 = geoQueryBusInfoSessionApiResponseModel.h;
                            geoQueryBusInfoSessionResponseAppModel = (str9 == null || (str7 = geoQueryBusInfoSessionApiResponseModel.i) == null) ? null : new GeoQueryBusInfoSessionResponseAppModel(str8, str, str2, str3, str4, str5, str6, str9, ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, str7));
                            if (geoQueryBusInfoSessionResponseAppModel != null && (geoQueryBusInfoParametersApiResponseModel = geoQueryBusInfoApiResponseModel.b) != null) {
                                Double d2 = geoQueryBusInfoParametersApiResponseModel.c;
                                String str10 = geoQueryBusInfoParametersApiResponseModel.f2809a;
                                d = geoQueryBusInfoParametersApiResponseModel.b;
                                if (d != null || d2 == null) {
                                    geoQueryBusInfoParametersResponseAppModel = null;
                                } else {
                                    LatLng latLng = new LatLng(d.doubleValue(), d2.doubleValue());
                                    Long l = geoQueryBusInfoParametersApiResponseModel.d;
                                    if (l != null) {
                                        geoQueryBusInfoParametersResponseAppModel = new GeoQueryBusInfoParametersResponseAppModel(str10, latLng, l.longValue(), geoQueryBusInfoParametersApiResponseModel.e, geoQueryBusInfoParametersApiResponseModel.f, geoQueryBusInfoParametersApiResponseModel.g, geoQueryBusInfoParametersApiResponseModel.h);
                                    } else {
                                        geoQueryBusInfoParametersResponseAppModel = null;
                                    }
                                }
                                if (geoQueryBusInfoParametersResponseAppModel == null) {
                                    geoQueryBusInfoResponseAppModel = new GeoQueryBusInfoResponseAppModel(geoQueryBusInfoSessionResponseAppModel, geoQueryBusInfoParametersResponseAppModel);
                                }
                            }
                            if (geoQueryBusInfoResponseAppModel != null) {
                                arrayList.add(geoQueryBusInfoResponseAppModel);
                            }
                        }
                        if (geoQueryBusInfoSessionResponseAppModel != null) {
                            Double d3 = geoQueryBusInfoParametersApiResponseModel.c;
                            String str11 = geoQueryBusInfoParametersApiResponseModel.f2809a;
                            d = geoQueryBusInfoParametersApiResponseModel.b;
                            if (d != null) {
                                geoQueryBusInfoParametersResponseAppModel = null;
                            } else {
                                geoQueryBusInfoParametersResponseAppModel = null;
                            }
                            if (geoQueryBusInfoParametersResponseAppModel == null) {
                                geoQueryBusInfoResponseAppModel = new GeoQueryBusInfoResponseAppModel(geoQueryBusInfoSessionResponseAppModel, geoQueryBusInfoParametersResponseAppModel);
                            }
                        }
                        if (geoQueryBusInfoResponseAppModel != null) {
                            arrayList.add(geoQueryBusInfoResponseAppModel);
                        }
                    }
                    geoQueryBusInfoResponseAppModel = null;
                    if (geoQueryBusInfoResponseAppModel != null) {
                        arrayList.add(geoQueryBusInfoResponseAppModel);
                    }
                }
            } else {
                arrayList = null;
            }
            JsonElement jsonElement = geoQueryApiResponseModel3.b;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = geoQueryApiResponseModel3;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = crashlyticsLogger3;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = arrayList;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 1;
            objA3 = a(jsonElement, crashlyticsLogger3, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
            list = arrayList;
            if (objA3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            List list6 = (List) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2;
            crashlyticsLogger3 = (CrashlyticsLogger) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1;
            GeoQueryApiResponseModel geoQueryApiResponseModel4 = (GeoQueryApiResponseModel) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0;
            ResultKt.b(objA3);
            list = list6;
            geoQueryApiResponseModel3 = geoQueryApiResponseModel4;
        } else {
            if (i2 == 2) {
                jsonObject = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3;
                List list7 = (List) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2;
                CrashlyticsLogger crashlyticsLogger4 = (CrashlyticsLogger) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1;
                geoQueryApiResponseModel2 = (GeoQueryApiResponseModel) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0;
                ResultKt.b(objA3);
                crashlyticsLogger2 = crashlyticsLogger4;
                list2 = list7;
                jsonObject2 = (JsonObject) objA3;
                JsonElement jsonElement2 = geoQueryApiResponseModel2.d;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = geoQueryApiResponseModel2;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = crashlyticsLogger2;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = list2;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4 = jsonObject2;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 3;
                objA = a(jsonElement2, crashlyticsLogger2, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
                if (objA != coroutineSingletons) {
                    list3 = list2;
                    jsonObject3 = jsonObject2;
                    objA3 = objA;
                    jsonObject4 = (JsonObject) objA3;
                    JsonElement jsonElement3 = geoQueryApiResponseModel2.e;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = list3;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = jsonObject;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = jsonObject3;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject4;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4 = null;
                    geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 4;
                    objA2 = a(jsonElement3, crashlyticsLogger2, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
                    if (objA2 != coroutineSingletons) {
                        jsonObject5 = jsonObject;
                        jsonObject6 = jsonObject4;
                        objA3 = objA2;
                        list4 = list3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                JsonObject jsonObject7 = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4;
                JsonObject jsonObject8 = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3;
                List list8 = (List) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2;
                crashlyticsLogger2 = (CrashlyticsLogger) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1;
                geoQueryApiResponseModel2 = (GeoQueryApiResponseModel) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0;
                ResultKt.b(objA3);
                jsonObject3 = jsonObject7;
                jsonObject = jsonObject8;
                list3 = list8;
                jsonObject4 = (JsonObject) objA3;
                JsonElement jsonElement4 = geoQueryApiResponseModel2.e;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = list3;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = jsonObject;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = jsonObject3;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject4;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4 = null;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 4;
                objA2 = a(jsonElement4, crashlyticsLogger2, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
                if (objA2 != coroutineSingletons) {
                    jsonObject5 = jsonObject;
                    jsonObject6 = jsonObject4;
                    objA3 = objA2;
                    list4 = list3;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JsonObject jsonObject9 = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3;
            jsonObject3 = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2;
            JsonObject jsonObject10 = (JsonObject) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1;
            List list9 = (List) geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0;
            ResultKt.b(objA3);
            jsonObject6 = jsonObject9;
            list4 = list9;
            jsonObject5 = jsonObject10;
        }
        return new GeoQueryResponseAppModel(list4, jsonObject5, jsonObject3, jsonObject6, (JsonObject) objA3);
        JsonObject jsonObject11 = (JsonObject) objA3;
        JsonElement jsonElement5 = geoQueryApiResponseModel3.c;
        geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = geoQueryApiResponseModel3;
        geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = crashlyticsLogger3;
        geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = list;
        geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject11;
        geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 2;
        Object objA4 = a(jsonElement5, crashlyticsLogger3, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
        if (objA4 != coroutineSingletons) {
            geoQueryApiResponseModel2 = geoQueryApiResponseModel3;
            crashlyticsLogger2 = crashlyticsLogger3;
            jsonObject = jsonObject11;
            list2 = list;
            objA3 = objA4;
            jsonObject2 = (JsonObject) objA3;
            JsonElement jsonElement6 = geoQueryApiResponseModel2.d;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = geoQueryApiResponseModel2;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = crashlyticsLogger2;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = list2;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4 = jsonObject2;
            geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 3;
            objA = a(jsonElement6, crashlyticsLogger2, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
            if (objA != coroutineSingletons) {
                list3 = list2;
                jsonObject3 = jsonObject2;
                objA3 = objA;
                jsonObject4 = (JsonObject) objA3;
                JsonElement jsonElement7 = geoQueryApiResponseModel2.e;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$0 = list3;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$1 = jsonObject;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$2 = jsonObject3;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$3 = jsonObject4;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.L$4 = null;
                geoQueryRemoteToAppModelMappersKt$toAppModel$1.label = 4;
                objA2 = a(jsonElement7, crashlyticsLogger2, geoQueryRemoteToAppModelMappersKt$toAppModel$1);
                if (objA2 != coroutineSingletons) {
                    jsonObject5 = jsonObject;
                    jsonObject6 = jsonObject4;
                    objA3 = objA2;
                    list4 = list3;
                    return new GeoQueryResponseAppModel(list4, jsonObject5, jsonObject3, jsonObject6, (JsonObject) objA3);
                }
            }
        }
        return coroutineSingletons;
    }
}
