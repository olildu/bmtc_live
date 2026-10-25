package app.chalo.productbooking.common.domain;

import app.chalo.datastore.LocalDataStore;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.productbooking.common.data.models.api.response.PassOfferTagApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCategoryApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDisplayPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareBreakupApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareMappingApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigGstApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigSubCategoryApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigSubCategorySelectionApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigValidDurationsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel;
import app.chalo.productbooking.common.data.models.app.PassOfferTagAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCategoryAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDisplayPropsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDocumentPropsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareInfoAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareMappingAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategoryAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigValidDurationsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.providers.CoroutineContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/StoreCompleteProductConfigLocallyUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StoreCompleteProductConfigLocallyUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f8266a;
    public final LocalDataStore b;
    public final LocalDataStore c;
    public final CoroutineContextProvider d;

    public StoreCompleteProductConfigLocallyUseCase(LocalDataStore localDataStore, LocalDataStore localDataStore2, LocalDataStore localDataStore3, CoroutineContextProvider coroutineContextProvider) {
        this.f8266a = localDataStore;
        this.b = localDataStore2;
        this.c = localDataStore3;
        this.d = coroutineContextProvider;
    }

    public final Object a(ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel, ContinuationImpl continuationImpl) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Intrinsics.i(productConfigCompleteDetailsListAppModel, "<this>");
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a;
        Intrinsics.i(productConfigCompleteDetailsAppModel, "<this>");
        String str = productConfigCompleteDetailsAppModel.f8203a;
        String str2 = productConfigCompleteDetailsAppModel.b;
        String str3 = productConfigCompleteDetailsAppModel.c;
        String str4 = productConfigCompleteDetailsAppModel.d;
        String str5 = productConfigCompleteDetailsAppModel.e;
        List list = productConfigCompleteDetailsAppModel.f;
        String str6 = productConfigCompleteDetailsAppModel.g;
        BrandingDetails brandingDetails = productConfigCompleteDetailsAppModel.h;
        Intrinsics.i(brandingDetails, "<this>");
        BrandingApiModel brandingApiModel = new BrandingApiModel(brandingDetails.f3827a);
        String str7 = productConfigCompleteDetailsAppModel.i;
        Boolean boolValueOf = Boolean.valueOf(productConfigCompleteDetailsAppModel.j);
        Integer numValueOf = Integer.valueOf(productConfigCompleteDetailsAppModel.k);
        Boolean boolValueOf2 = Boolean.valueOf(productConfigCompleteDetailsAppModel.l);
        List<ProductConfigCategoryAppModel> list2 = productConfigCompleteDetailsAppModel.m;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list2, 10));
        for (ProductConfigCategoryAppModel productConfigCategoryAppModel : list2) {
            Intrinsics.i(productConfigCategoryAppModel, "<this>");
            arrayList5.add(new ProductConfigCategoryApiResponseModel(productConfigCategoryAppModel.f8201a, productConfigCategoryAppModel.b, productConfigCategoryAppModel.c, productConfigCategoryAppModel.d, productConfigCategoryAppModel.e, productConfigCategoryAppModel.f, productConfigCategoryAppModel.g, productConfigCategoryAppModel.h, productConfigCategoryAppModel.i));
        }
        Map map = productConfigCompleteDetailsAppModel.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList6 = arrayList5;
            String str8 = str3;
            String str9 = str4;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.v(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                ProductConfigFareMappingAppModel productConfigFareMappingAppModel = (ProductConfigFareMappingAppModel) it3.next();
                Intrinsics.i(productConfigFareMappingAppModel, "<this>");
                ProductConfigGstApiResponseModel productConfigGstApiResponseModel = productConfigFareMappingAppModel.f8215a;
                Iterator it4 = it3;
                String str10 = productConfigFareMappingAppModel.b;
                String str11 = productConfigFareMappingAppModel.c;
                Integer num = productConfigFareMappingAppModel.d;
                Integer num2 = productConfigFareMappingAppModel.e;
                Boolean bool = productConfigFareMappingAppModel.f;
                String str12 = productConfigFareMappingAppModel.g;
                Boolean bool2 = productConfigFareMappingAppModel.h;
                String str13 = productConfigFareMappingAppModel.i;
                Integer num3 = productConfigFareMappingAppModel.j;
                String str14 = productConfigFareMappingAppModel.k;
                Boolean bool3 = productConfigFareMappingAppModel.l;
                Boolean bool4 = productConfigFareMappingAppModel.m;
                String str15 = productConfigFareMappingAppModel.n;
                Integer num4 = productConfigFareMappingAppModel.o;
                String str16 = productConfigFareMappingAppModel.p;
                Integer num5 = productConfigFareMappingAppModel.q;
                Integer num6 = productConfigFareMappingAppModel.r;
                Integer num7 = productConfigFareMappingAppModel.s;
                Boolean boolValueOf3 = Boolean.valueOf(productConfigFareMappingAppModel.t);
                List list3 = productConfigFareMappingAppModel.u;
                Integer num8 = productConfigFareMappingAppModel.v;
                Integer num9 = productConfigFareMappingAppModel.w;
                ProductConfigFareInfoAppModel productConfigFareInfoAppModel = productConfigFareMappingAppModel.x;
                Intrinsics.i(productConfigFareInfoAppModel, "<this>");
                String str17 = str5;
                Long lValueOf = Long.valueOf(productConfigFareInfoAppModel.f8213a);
                Long lValueOf2 = Long.valueOf(productConfigFareInfoAppModel.b);
                Boolean boolValueOf4 = Boolean.valueOf(productConfigFareInfoAppModel.c);
                Long lValueOf3 = Long.valueOf(productConfigFareInfoAppModel.d);
                List list4 = productConfigFareInfoAppModel.e;
                List list5 = list;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.v(list4, 10));
                for (Iterator it5 = list4.iterator(); it5.hasNext(); it5 = it5) {
                    ProductConfigFareBreakupAppModel productConfigFareBreakupAppModel = (ProductConfigFareBreakupAppModel) it5.next();
                    Intrinsics.i(productConfigFareBreakupAppModel, "<this>");
                    arrayList8.add(new ProductConfigFareBreakupApiResponseModel(productConfigFareBreakupAppModel.f8211a, productConfigFareBreakupAppModel.b));
                }
                ProductConfigFareInfoApiResponseModel productConfigFareInfoApiResponseModel = new ProductConfigFareInfoApiResponseModel(lValueOf, lValueOf2, boolValueOf4, lValueOf3, arrayList8);
                String str18 = productConfigFareMappingAppModel.y;
                List list6 = productConfigFareMappingAppModel.z;
                if (list6 != null) {
                    List list7 = list6;
                    ArrayList arrayList9 = new ArrayList(CollectionsKt.v(list7, 10));
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        PassOfferTagAppModel passOfferTagAppModel = (PassOfferTagAppModel) it6.next();
                        Intrinsics.i(passOfferTagAppModel, "<this>");
                        arrayList9.add(new PassOfferTagApiResponseModel(passOfferTagAppModel.c, passOfferTagAppModel.f8192a, passOfferTagAppModel.b));
                        it6 = it6;
                        str6 = str6;
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                String str19 = str6;
                List list8 = productConfigFareMappingAppModel.A;
                if (list8 != null) {
                    List list9 = list8;
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.v(list9, 10));
                    Iterator it7 = list9.iterator();
                    while (it7.hasNext()) {
                        arrayList10.add(PBRemoteToAppModelMappersKt.a((ApplicableRuleAppModel) it7.next()));
                    }
                    arrayList4 = arrayList10;
                } else {
                    arrayList4 = null;
                }
                arrayList7.add(new ProductConfigFareMappingApiResponseModel(productConfigGstApiResponseModel, str10, str11, num, num2, bool, str12, bool2, str13, num3, str14, bool3, bool4, str15, num4, str16, num5, num6, num7, boolValueOf3, list3, num8, num9, productConfigFareInfoApiResponseModel, str18, arrayList3, arrayList4));
                it3 = it4;
                str5 = str17;
                str6 = str19;
                list = list5;
            }
            linkedHashMap.put(key, arrayList7);
            it = it2;
            arrayList5 = arrayList6;
            str3 = str8;
            str4 = str9;
        }
        ArrayList arrayList11 = arrayList5;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        List list10 = list;
        String str23 = str6;
        String str24 = productConfigCompleteDetailsAppModel.o;
        List<ProductConfigSubCategoryAppModel> list11 = productConfigCompleteDetailsAppModel.p;
        ArrayList arrayList12 = new ArrayList(CollectionsKt.v(list11, 10));
        for (ProductConfigSubCategoryAppModel productConfigSubCategoryAppModel : list11) {
            Intrinsics.i(productConfigSubCategoryAppModel, "<this>");
            arrayList12.add(new ProductConfigSubCategoryApiResponseModel(productConfigSubCategoryAppModel.d, productConfigSubCategoryAppModel.e, productConfigSubCategoryAppModel.f8218a, productConfigSubCategoryAppModel.b, productConfigSubCategoryAppModel.c, productConfigSubCategoryAppModel.f, productConfigSubCategoryAppModel.g));
            str24 = str24;
        }
        String str25 = str24;
        Boolean boolValueOf5 = Boolean.valueOf(productConfigCompleteDetailsAppModel.q);
        Integer numValueOf2 = Integer.valueOf(productConfigCompleteDetailsAppModel.r);
        Long lValueOf4 = Long.valueOf(productConfigCompleteDetailsAppModel.s);
        String str26 = productConfigCompleteDetailsAppModel.t;
        String str27 = productConfigCompleteDetailsAppModel.u;
        Map map2 = productConfigCompleteDetailsAppModel.v;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.g(map2.size()));
        Iterator it8 = map2.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it8.next();
            Iterator it9 = it8;
            Object key2 = entry2.getKey();
            ProductConfigValidDurationsAppModel productConfigValidDurationsAppModel = (ProductConfigValidDurationsAppModel) entry2.getValue();
            Intrinsics.i(productConfigValidDurationsAppModel, "<this>");
            linkedHashMap2.put(key2, new ProductConfigValidDurationsApiResponseModel(productConfigValidDurationsAppModel.b, productConfigValidDurationsAppModel.f8222a));
            it8 = it9;
            linkedHashMap = linkedHashMap;
            numValueOf2 = numValueOf2;
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        Integer num10 = numValueOf2;
        Boolean bool5 = productConfigCompleteDetailsAppModel.w;
        List list12 = productConfigCompleteDetailsAppModel.x;
        String str28 = productConfigCompleteDetailsAppModel.y;
        Boolean boolValueOf6 = Boolean.valueOf(productConfigCompleteDetailsAppModel.z);
        Integer num11 = productConfigCompleteDetailsAppModel.A;
        Long l = productConfigCompleteDetailsAppModel.B;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = productConfigCompleteDetailsAppModel.C;
        ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel = productConfigSubCategorySelectionAppModel != null ? new ProductConfigSubCategorySelectionApiResponseModel(productConfigSubCategorySelectionAppModel.f8220a, productConfigSubCategorySelectionAppModel.b) : null;
        String str29 = productConfigCompleteDetailsAppModel.D;
        String str30 = productConfigCompleteDetailsAppModel.E;
        String str31 = productConfigCompleteDetailsAppModel.F;
        String str32 = productConfigCompleteDetailsAppModel.G;
        List list13 = productConfigCompleteDetailsAppModel.H;
        List list14 = productConfigCompleteDetailsAppModel.I;
        if (list14 != null) {
            List list15 = list14;
            arrayList2 = new ArrayList(CollectionsKt.v(list15, 10));
            for (Iterator it10 = list15.iterator(); it10.hasNext(); it10 = it10) {
                ProductImageAppModel productImageAppModel = (ProductImageAppModel) it10.next();
                Intrinsics.i(productImageAppModel, "<this>");
                arrayList2.add(new ProductImageApiResponseModel(productImageAppModel.f8224a, productImageAppModel.b.getIconType()));
            }
        } else {
            arrayList2 = null;
        }
        FareInfo fareInfo = productConfigCompleteDetailsAppModel.J;
        List list16 = productConfigCompleteDetailsAppModel.K;
        if (list16 != null) {
            List list17 = list16;
            ArrayList arrayList13 = new ArrayList(CollectionsKt.v(list17, 10));
            Iterator it11 = list17.iterator();
            while (it11.hasNext()) {
                arrayList13.add(((ProductConfigServiceType) it11.next()).name());
            }
            arrayList = arrayList13;
        }
        List list18 = productConfigCompleteDetailsAppModel.L;
        ArrayList arrayList14 = new ArrayList(CollectionsKt.v(list18, 10));
        Iterator it12 = list18.iterator();
        while (it12.hasNext()) {
            arrayList14.add(PBRemoteToAppModelMappersKt.a((ApplicableRuleAppModel) it12.next()));
        }
        ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel = new ProductConfigCompleteDetailsApiResponseModel(str, str2, str20, str21, str22, list10, str23, brandingApiModel, str7, boolValueOf, numValueOf, boolValueOf2, arrayList11, linkedHashMap3, str25, arrayList12, boolValueOf5, num10, lValueOf4, str26, str27, linkedHashMap2, bool5, list12, str28, boolValueOf6, num11, l, productConfigSubCategorySelectionApiResponseModel, str29, str30, str31, str32, list13, arrayList2, fareInfo, arrayList, arrayList14);
        List<ProductConfigDisplayPropsAppModel> list19 = productConfigCompleteDetailsListAppModel.b;
        ArrayList arrayList15 = new ArrayList(CollectionsKt.v(list19, 10));
        for (ProductConfigDisplayPropsAppModel productConfigDisplayPropsAppModel : list19) {
            Intrinsics.i(productConfigDisplayPropsAppModel, "<this>");
            arrayList15.add(new ProductConfigDisplayPropsApiResponseModel(productConfigDisplayPropsAppModel.c, productConfigDisplayPropsAppModel.f8207a, productConfigDisplayPropsAppModel.b));
        }
        List<ProductConfigDocumentPropsAppModel> list20 = productConfigCompleteDetailsListAppModel.c;
        ArrayList arrayList16 = new ArrayList(CollectionsKt.v(list20, 10));
        for (ProductConfigDocumentPropsAppModel productConfigDocumentPropsAppModel : list20) {
            Intrinsics.i(productConfigDocumentPropsAppModel, "<this>");
            arrayList16.add(new ProductConfigDocumentPropsApiResponseModel(productConfigDocumentPropsAppModel.f8209a, productConfigDocumentPropsAppModel.b, productConfigDocumentPropsAppModel.c, productConfigDocumentPropsAppModel.d));
        }
        ProductConfigCompleteDetailsListApiResponseModel productConfigCompleteDetailsListApiResponseModel = new ProductConfigCompleteDetailsListApiResponseModel(productConfigCompleteDetailsApiResponseModel, arrayList15, arrayList16);
        String str33 = productConfigCompleteDetailsApiResponseModel.f8151a;
        return str33 == null ? Boolean.FALSE : BuildersKt.g(this.d.b(), new StoreCompleteProductConfigLocallyUseCase$invoke$2(productConfigCompleteDetailsApiResponseModel, this, str33, productConfigCompleteDetailsListApiResponseModel, null), continuationImpl);
    }
}
