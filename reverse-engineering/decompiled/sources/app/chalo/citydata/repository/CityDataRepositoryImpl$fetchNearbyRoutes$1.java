package app.chalo.citydata.repository;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.citydata.data.model.api.response.NearbyRouteApiModel;
import app.chalo.citydata.data.model.api.response.NearbyRoutesApiResponseModel;
import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModelKt;
import app.chalo.citydata.data.model.api.response.StopApiModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.ChaloRouteCategory;
import app.chalo.citydata.data.model.app.response.NearbyRouteAppModel;
import app.chalo.citydata.data.model.app.response.NearbyRoutesResponseAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.citydata.repository.CityDataRepositoryImpl", f = "CityDataRepositoryImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "fetchNearbyRoutes", v = 1)
final class CityDataRepositoryImpl$fetchNearbyRoutes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CityDataRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityDataRepositoryImpl$fetchNearbyRoutes$1(CityDataRepositoryImpl cityDataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = cityDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CityDataRepositoryImpl$fetchNearbyRoutes$1 cityDataRepositoryImpl$fetchNearbyRoutes$1;
        ChaloRouteCategory chaloRouteCategory;
        NearbyRoutesResponseAppModel nearbyRoutesResponseAppModel;
        String str;
        StopAppModel stopAppModel;
        List list;
        NearbyRouteAppModel nearbyRouteAppModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        CityDataRepositoryImpl cityDataRepositoryImpl = this.this$0;
        cityDataRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            cityDataRepositoryImpl$fetchNearbyRoutes$1 = this;
        } else {
            cityDataRepositoryImpl$fetchNearbyRoutes$1 = new CityDataRepositoryImpl$fetchNearbyRoutes$1(cityDataRepositoryImpl, this);
        }
        Object obj2 = cityDataRepositoryImpl$fetchNearbyRoutes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityDataRepositoryImpl$fetchNearbyRoutes$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        boolean z = true;
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        ArrayList arrayList = new ArrayList();
        for (NearbyRoutesApiResponseModel nearbyRoutesApiResponseModel : (List) obj2) {
            Intrinsics.i(nearbyRoutesApiResponseModel, "<this>");
            ChaloRouteCategory.Companion companion = ChaloRouteCategory.INSTANCE;
            String str2 = nearbyRoutesApiResponseModel.b;
            if (str2 == null) {
                str2 = "";
            }
            companion.getClass();
            ChaloRouteCategory[] chaloRouteCategoryArrValues = ChaloRouteCategory.values();
            int length = chaloRouteCategoryArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    chaloRouteCategory = null;
                    break;
                }
                chaloRouteCategory = chaloRouteCategoryArrValues[i3];
                if (StringsKt.x(chaloRouteCategory.getValue(), str2, z)) {
                    break;
                }
                i3++;
            }
            if (chaloRouteCategory == null) {
                nearbyRoutesResponseAppModel = null;
            } else {
                List<NearbyRouteApiModel> list2 = nearbyRoutesApiResponseModel.f1664a;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NearbyRouteApiModel nearbyRouteApiModel : list2) {
                        Intrinsics.i(nearbyRouteApiModel, "<this>");
                        String str3 = nearbyRouteApiModel.f1662a;
                        if (str3 == null || (str = nearbyRouteApiModel.b) == null) {
                            nearbyRouteAppModel = null;
                        } else {
                            RouteNamingSchemeType.Companion companion2 = RouteNamingSchemeType.INSTANCE;
                            String str4 = nearbyRouteApiModel.c;
                            companion2.getClass();
                            RouteNamingSchemeType routeNamingSchemeTypeA = RouteNamingSchemeType.Companion.a(str4);
                            String str5 = nearbyRouteApiModel.e;
                            StopApiModel stopApiModel = nearbyRouteApiModel.f;
                            StopAppModel stopAppModelD = stopApiModel != null ? RoutesDataResponseApiModelKt.d(stopApiModel) : null;
                            List list3 = nearbyRouteApiModel.d;
                            if (list3 != null) {
                                List list4 = list3;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(new RouteSpecialFeatureAppModel((String) it.next(), RouteSpecialFeatureType.NEW));
                                }
                                stopAppModel = null;
                                list = arrayList3;
                            } else {
                                stopAppModel = null;
                                list = EmptyList.f17557a;
                            }
                            List list5 = list;
                            StopApiModel stopApiModel2 = nearbyRouteApiModel.g;
                            nearbyRouteAppModel = new NearbyRouteAppModel(str, str3, str5, stopApiModel2 != null ? RoutesDataResponseApiModelKt.d(stopApiModel2) : stopAppModel, stopAppModelD, list5, routeNamingSchemeTypeA);
                        }
                        if (nearbyRouteAppModel != null) {
                            arrayList2.add(nearbyRouteAppModel);
                        }
                    }
                    nearbyRoutesResponseAppModel = new NearbyRoutesResponseAppModel(chaloRouteCategory, arrayList2);
                } else {
                    nearbyRoutesResponseAppModel = null;
                }
            }
            if (nearbyRoutesResponseAppModel != null) {
                arrayList.add(nearbyRoutesResponseAppModel);
            }
            z = true;
        }
        return arrayList;
    }
}
