package app.chalo.productbooking.common.data.mappers;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.productbooking.common.data.models.api.response.PassOfferTagApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCategoryApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsApiResponseModel;
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
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareInfoAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareMappingAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategoryAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigValidDurationsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingCommonApiToAppModelsMappersKt {
    /* JADX WARN: Code duplicated, block: B:132:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.util.List] */
    public static final ProductConfigCompleteDetailsAppModel a(ProductConfigCompleteDetailsApiResponseModel productConfigCompleteDetailsApiResponseModel) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        List list2;
        String str7;
        BrandingDetails brandingDetails;
        Map mapD;
        String str8;
        List list3;
        Map map;
        Map mapD2;
        String str9;
        List list4;
        ?? arrayList;
        List list5;
        String str10;
        BrandingDetails brandingDetails2;
        ProductConfigFareMappingAppModel productConfigFareMappingAppModel;
        ProductConfigFareInfoAppModel productConfigFareInfoAppModel;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list6;
        String str11;
        String str12 = "<this>";
        Intrinsics.i(productConfigCompleteDetailsApiResponseModel, "<this>");
        String str13 = productConfigCompleteDetailsApiResponseModel.f8151a;
        if (str13 != null && (str = productConfigCompleteDetailsApiResponseModel.b) != null) {
            String str14 = productConfigCompleteDetailsApiResponseModel.c;
            String str15 = productConfigCompleteDetailsApiResponseModel.d;
            if (str15 != null) {
                String str16 = productConfigCompleteDetailsApiResponseModel.e;
                List list7 = productConfigCompleteDetailsApiResponseModel.f;
                if (list7 == null) {
                    list7 = EmptyList.f17557a;
                }
                String str17 = productConfigCompleteDetailsApiResponseModel.g;
                BrandingApiModel brandingApiModel = productConfigCompleteDetailsApiResponseModel.h;
                BrandingDetails brandingDetails3 = new BrandingDetails(brandingApiModel != null ? brandingApiModel.f7144a : false);
                String str18 = productConfigCompleteDetailsApiResponseModel.i;
                Boolean bool = productConfigCompleteDetailsApiResponseModel.j;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = productConfigCompleteDetailsApiResponseModel.k;
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                Boolean bool2 = productConfigCompleteDetailsApiResponseModel.l;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                List list8 = productConfigCompleteDetailsApiResponseModel.m;
                if (list8 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = list8.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        ProductConfigCategoryApiResponseModel productConfigCategoryApiResponseModel = (ProductConfigCategoryApiResponseModel) it.next();
                        Intrinsics.i(productConfigCategoryApiResponseModel, "<this>");
                        String str19 = str13;
                        String str20 = productConfigCategoryApiResponseModel.f8149a;
                        ProductConfigCategoryAppModel productConfigCategoryAppModel = str20 == null ? null : new ProductConfigCategoryAppModel(str20, productConfigCategoryApiResponseModel.b, productConfigCategoryApiResponseModel.c, productConfigCategoryApiResponseModel.d, productConfigCategoryApiResponseModel.e, productConfigCategoryApiResponseModel.f, productConfigCategoryApiResponseModel.g, productConfigCategoryApiResponseModel.h, productConfigCategoryApiResponseModel.i);
                        if (productConfigCategoryAppModel != null) {
                            arrayList4.add(productConfigCategoryAppModel);
                        }
                        str13 = str19;
                        it = it2;
                    }
                    str2 = str13;
                    list = arrayList4;
                } else {
                    str2 = str13;
                    list = EmptyList.f17557a;
                }
                Map map2 = productConfigCompleteDetailsApiResponseModel.n;
                if (map2 != null) {
                    mapD = new LinkedHashMap(MapsKt.g(map2.size()));
                    Iterator it3 = map2.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = it3;
                        Object key = entry.getKey();
                        Iterable<ProductConfigFareMappingApiResponseModel> iterable = (Iterable) entry.getValue();
                        String str21 = str;
                        ArrayList arrayList5 = new ArrayList();
                        for (ProductConfigFareMappingApiResponseModel productConfigFareMappingApiResponseModel : iterable) {
                            String str22 = str14;
                            Intrinsics.i(productConfigFareMappingApiResponseModel, "<this>");
                            String str23 = str15;
                            ProductConfigGstApiResponseModel productConfigGstApiResponseModel = productConfigFareMappingApiResponseModel.f8165a;
                            String str24 = productConfigFareMappingApiResponseModel.b;
                            String str25 = productConfigFareMappingApiResponseModel.c;
                            Integer num2 = productConfigFareMappingApiResponseModel.d;
                            Integer num3 = productConfigFareMappingApiResponseModel.e;
                            Boolean bool3 = productConfigFareMappingApiResponseModel.f;
                            String str26 = productConfigFareMappingApiResponseModel.g;
                            Boolean bool4 = productConfigFareMappingApiResponseModel.h;
                            String str27 = productConfigFareMappingApiResponseModel.i;
                            Integer num4 = productConfigFareMappingApiResponseModel.j;
                            String str28 = productConfigFareMappingApiResponseModel.k;
                            Boolean bool5 = productConfigFareMappingApiResponseModel.l;
                            Boolean bool6 = productConfigFareMappingApiResponseModel.m;
                            String str29 = productConfigFareMappingApiResponseModel.n;
                            Integer num5 = productConfigFareMappingApiResponseModel.o;
                            String str30 = productConfigFareMappingApiResponseModel.p;
                            Integer num6 = productConfigFareMappingApiResponseModel.q;
                            Integer num7 = productConfigFareMappingApiResponseModel.r;
                            Integer num8 = productConfigFareMappingApiResponseModel.s;
                            Boolean bool7 = productConfigFareMappingApiResponseModel.t;
                            boolean zBooleanValue3 = bool7 != null ? bool7.booleanValue() : true;
                            List list9 = productConfigFareMappingApiResponseModel.u;
                            Integer num9 = productConfigFareMappingApiResponseModel.v;
                            Integer num10 = productConfigFareMappingApiResponseModel.w;
                            ProductConfigFareInfoApiResponseModel productConfigFareInfoApiResponseModel = productConfigFareMappingApiResponseModel.x;
                            String str31 = str16;
                            if (productConfigFareInfoApiResponseModel != null) {
                                Long l = productConfigFareInfoApiResponseModel.f8163a;
                                if (l != null) {
                                    long jLongValue = l.longValue();
                                    Long l2 = productConfigFareInfoApiResponseModel.b;
                                    if (l2 != null) {
                                        long jLongValue2 = l2.longValue();
                                        Boolean bool8 = productConfigFareInfoApiResponseModel.c;
                                        boolean zBooleanValue4 = bool8 != null ? bool8.booleanValue() : false;
                                        Long l3 = productConfigFareInfoApiResponseModel.d;
                                        if (l3 != null) {
                                            long jLongValue3 = l3.longValue();
                                            List list10 = productConfigFareInfoApiResponseModel.e;
                                            if (list10 != null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it5 = list10.iterator();
                                                while (it5.hasNext()) {
                                                    Iterator it6 = it5;
                                                    ProductConfigFareBreakupApiResponseModel productConfigFareBreakupApiResponseModel = (ProductConfigFareBreakupApiResponseModel) it5.next();
                                                    Intrinsics.i(productConfigFareBreakupApiResponseModel, "<this>");
                                                    List list11 = list7;
                                                    String str32 = str17;
                                                    String str33 = productConfigFareBreakupApiResponseModel.f8161a;
                                                    ProductConfigFareBreakupAppModel productConfigFareBreakupAppModel = (str33 == null || (str11 = productConfigFareBreakupApiResponseModel.b) == null) ? null : new ProductConfigFareBreakupAppModel(str33, str11);
                                                    if (productConfigFareBreakupAppModel != null) {
                                                        arrayList6.add(productConfigFareBreakupAppModel);
                                                    }
                                                    it5 = it6;
                                                    list7 = list11;
                                                    str17 = str32;
                                                }
                                                list5 = list7;
                                                str10 = str17;
                                                list6 = arrayList6;
                                            } else {
                                                list5 = list7;
                                                str10 = str17;
                                                list6 = EmptyList.f17557a;
                                            }
                                            productConfigFareInfoAppModel = new ProductConfigFareInfoAppModel(jLongValue, jLongValue2, zBooleanValue4, jLongValue3, list6);
                                        } else {
                                            list5 = list7;
                                            str10 = str17;
                                            productConfigFareInfoAppModel = null;
                                        }
                                    } else {
                                        list5 = list7;
                                        str10 = str17;
                                        productConfigFareInfoAppModel = null;
                                    }
                                } else {
                                    list5 = list7;
                                    str10 = str17;
                                    productConfigFareInfoAppModel = null;
                                }
                                if (productConfigFareInfoAppModel != null) {
                                    String str34 = productConfigFareMappingApiResponseModel.y;
                                    List list12 = productConfigFareMappingApiResponseModel.z;
                                    if (list12 != null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it7 = list12.iterator();
                                        while (it7.hasNext()) {
                                            PassOfferTagApiResponseModel passOfferTagApiResponseModel = (PassOfferTagApiResponseModel) it7.next();
                                            String str35 = str34;
                                            String str36 = passOfferTagApiResponseModel.f8145a;
                                            Iterator it8 = it7;
                                            String str37 = passOfferTagApiResponseModel.b;
                                            String str38 = passOfferTagApiResponseModel.c;
                                            PassOfferTagAppModel passOfferTagAppModel = (str36 == null || str36.length() == 0 || str37 == null || str37.length() == 0 || str38 == null || str38.length() == 0) ? null : new PassOfferTagAppModel(str37, str38, str36);
                                            if (passOfferTagAppModel != null) {
                                                arrayList7.add(passOfferTagAppModel);
                                            }
                                            it7 = it8;
                                            str34 = str35;
                                            brandingDetails3 = brandingDetails3;
                                        }
                                        arrayList2 = arrayList7;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    String str39 = str34;
                                    brandingDetails2 = brandingDetails3;
                                    List list13 = productConfigFareMappingApiResponseModel.A;
                                    if (list13 != null) {
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it9 = list13.iterator();
                                        while (it9.hasNext()) {
                                            ApplicableRuleAppModel applicableRuleAppModelB = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it9.next());
                                            if (applicableRuleAppModelB != null) {
                                                arrayList8.add(applicableRuleAppModelB);
                                            }
                                        }
                                        arrayList3 = arrayList8;
                                    } else {
                                        arrayList3 = null;
                                    }
                                    productConfigFareMappingAppModel = new ProductConfigFareMappingAppModel(productConfigGstApiResponseModel, str24, str25, num2, num3, bool3, str26, bool4, str27, num4, str28, bool5, bool6, str29, num5, str30, num6, num7, num8, zBooleanValue3, list9, num9, num10, productConfigFareInfoAppModel, str39, arrayList2, arrayList3);
                                }
                                if (productConfigFareMappingAppModel != null) {
                                    arrayList5.add(productConfigFareMappingAppModel);
                                }
                                str15 = str23;
                                str14 = str22;
                                str16 = str31;
                                brandingDetails3 = brandingDetails2;
                                list7 = list5;
                                str17 = str10;
                            } else {
                                list5 = list7;
                                str10 = str17;
                            }
                            brandingDetails2 = brandingDetails3;
                            productConfigFareMappingAppModel = null;
                            if (productConfigFareMappingAppModel != null) {
                                arrayList5.add(productConfigFareMappingAppModel);
                            }
                            str15 = str23;
                            str14 = str22;
                            str16 = str31;
                            brandingDetails3 = brandingDetails2;
                            list7 = list5;
                            str17 = str10;
                        }
                        mapD.put(key, arrayList5);
                        it3 = it4;
                        str = str21;
                    }
                    str3 = str;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    list2 = list7;
                    str7 = str17;
                    brandingDetails = brandingDetails3;
                } else {
                    str3 = str;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                    list2 = list7;
                    str7 = str17;
                    brandingDetails = brandingDetails3;
                    mapD = MapsKt.d();
                }
                String str40 = productConfigCompleteDetailsApiResponseModel.o;
                if (str40 == null) {
                    return null;
                }
                List list14 = productConfigCompleteDetailsApiResponseModel.p;
                if (list14 != null) {
                    List<ProductConfigSubCategoryApiResponseModel> list15 = list14;
                    ArrayList arrayList9 = new ArrayList(CollectionsKt.v(list15, 10));
                    for (ProductConfigSubCategoryApiResponseModel productConfigSubCategoryApiResponseModel : list15) {
                        Intrinsics.i(productConfigSubCategoryApiResponseModel, "<this>");
                        arrayList9.add(new ProductConfigSubCategoryAppModel(productConfigSubCategoryApiResponseModel.d, productConfigSubCategoryApiResponseModel.e, productConfigSubCategoryApiResponseModel.f8171a, productConfigSubCategoryApiResponseModel.b, productConfigSubCategoryApiResponseModel.c, productConfigSubCategoryApiResponseModel.f, productConfigSubCategoryApiResponseModel.g));
                        str40 = str40;
                    }
                    str8 = str40;
                    list3 = arrayList9;
                } else {
                    str8 = str40;
                    list3 = EmptyList.f17557a;
                }
                Boolean bool9 = productConfigCompleteDetailsApiResponseModel.q;
                boolean zBooleanValue5 = bool9 != null ? bool9.booleanValue() : false;
                Integer num11 = productConfigCompleteDetailsApiResponseModel.r;
                int iIntValue2 = num11 != null ? num11.intValue() : -1;
                Long l4 = productConfigCompleteDetailsApiResponseModel.s;
                long jLongValue4 = l4 != null ? l4.longValue() : -1L;
                String str41 = productConfigCompleteDetailsApiResponseModel.t;
                if (str41 == null) {
                    return null;
                }
                String str42 = productConfigCompleteDetailsApiResponseModel.u;
                Map map3 = productConfigCompleteDetailsApiResponseModel.v;
                if (map3 != null) {
                    mapD2 = new LinkedHashMap(MapsKt.g(map3.size()));
                    Iterator it10 = map3.entrySet().iterator();
                    while (it10.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it10.next();
                        Iterator it11 = it10;
                        Object key2 = entry2.getKey();
                        ProductConfigValidDurationsApiResponseModel productConfigValidDurationsApiResponseModel = (ProductConfigValidDurationsApiResponseModel) entry2.getValue();
                        Intrinsics.i(productConfigValidDurationsApiResponseModel, str12);
                        mapD2.put(key2, new ProductConfigValidDurationsAppModel(productConfigValidDurationsApiResponseModel.b, productConfigValidDurationsApiResponseModel.f8175a));
                        it10 = it11;
                        str12 = str12;
                        mapD = mapD;
                    }
                    map = mapD;
                } else {
                    map = mapD;
                    mapD2 = MapsKt.d();
                }
                Boolean bool10 = productConfigCompleteDetailsApiResponseModel.w;
                List list16 = productConfigCompleteDetailsApiResponseModel.x;
                if (list16 == null) {
                    list16 = EmptyList.f17557a;
                }
                String str43 = productConfigCompleteDetailsApiResponseModel.y;
                Boolean bool11 = productConfigCompleteDetailsApiResponseModel.z;
                boolean zBooleanValue6 = bool11 != null ? bool11.booleanValue() : false;
                Integer num12 = productConfigCompleteDetailsApiResponseModel.A;
                Long l5 = productConfigCompleteDetailsApiResponseModel.B;
                ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel = productConfigCompleteDetailsApiResponseModel.C;
                List list17 = list16;
                ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel = productConfigSubCategorySelectionApiResponseModel != null ? new ProductConfigSubCategorySelectionAppModel(productConfigSubCategorySelectionApiResponseModel.f8173a, productConfigSubCategorySelectionApiResponseModel.b) : null;
                String str44 = productConfigCompleteDetailsApiResponseModel.D;
                String str45 = productConfigCompleteDetailsApiResponseModel.E;
                String str46 = productConfigCompleteDetailsApiResponseModel.F;
                String str47 = productConfigCompleteDetailsApiResponseModel.G;
                List list18 = productConfigCompleteDetailsApiResponseModel.H;
                List list19 = productConfigCompleteDetailsApiResponseModel.I;
                if (list19 != null) {
                    List list20 = list19;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it12 = list20.iterator();
                    while (it12.hasNext()) {
                        String str48 = str45;
                        ProductImageAppModel productImageAppModelB = b((ProductImageApiResponseModel) it12.next());
                        if (productImageAppModelB != null) {
                            arrayList10.add(productImageAppModelB);
                        }
                        str45 = str48;
                    }
                    str9 = str45;
                    list4 = arrayList10;
                } else {
                    str9 = str45;
                    list4 = EmptyList.f17557a;
                }
                List list21 = list4;
                FareInfo fareInfo = productConfigCompleteDetailsApiResponseModel.J;
                ProductConfigServiceType.Companion companion = ProductConfigServiceType.INSTANCE;
                List list22 = productConfigCompleteDetailsApiResponseModel.K;
                if (list22 == null) {
                    list22 = EmptyList.f17557a;
                }
                List listA = ProductConfigServiceType.Companion.a(companion, list22);
                List list23 = productConfigCompleteDetailsApiResponseModel.L;
                if (list23 != null) {
                    arrayList = new ArrayList();
                    Iterator it13 = list23.iterator();
                    while (it13.hasNext()) {
                        ApplicableRuleAppModel applicableRuleAppModelB2 = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it13.next());
                        if (applicableRuleAppModelB2 != null) {
                            arrayList.add(applicableRuleAppModelB2);
                        }
                    }
                } else {
                    arrayList = EmptyList.f17557a;
                }
                return new ProductConfigCompleteDetailsAppModel(str2, str3, str4, str5, str6, list2, str7, brandingDetails, str18, zBooleanValue, iIntValue, zBooleanValue2, list, map, str8, list3, zBooleanValue5, iIntValue2, jLongValue4, str41, str42, mapD2, bool10, list17, str43, zBooleanValue6, num12, l5, productConfigSubCategorySelectionAppModel, str44, str9, str46, str47, list18, list21, fareInfo, listA, arrayList);
            }
        }
        return null;
    }

    public static final ProductImageAppModel b(ProductImageApiResponseModel productImageApiResponseModel) {
        Intrinsics.i(productImageApiResponseModel, "<this>");
        String str = productImageApiResponseModel.f8177a;
        ProductImageType productImageType = null;
        if (str == null) {
            return null;
        }
        ProductImageType.Companion companion = ProductImageType.INSTANCE;
        String str2 = productImageApiResponseModel.b;
        companion.getClass();
        for (ProductImageType productImageType2 : ProductImageType.values()) {
            if (Intrinsics.d(productImageType2.getIconType(), str2)) {
                productImageType = productImageType2;
                break;
            }
        }
        if (productImageType == null) {
            productImageType = ProductImageType.NOT_AVAILABLE;
        }
        return new ProductImageAppModel(str, productImageType);
    }
}
