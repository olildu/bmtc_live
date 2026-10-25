package app.chalo.productpurchase.productselection.data.models.mappers;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.productconfig.BrandingApiModel;
import app.chalo.productbooking.common.data.mappers.ProductBookingCommonApiToAppModelsMappersKt;
import app.chalo.productbooking.common.data.models.api.response.PassOfferTagApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareBreakupApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigSubCategorySelectionApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel;
import app.chalo.productbooking.common.data.models.app.PassOfferTagAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productpurchase.productselection.data.models.api.CardRechargeFareInfoApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.EligibleSubProductApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.InstantTicketFareInfoApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigFareMappingApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigSubCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductFareInfoApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductFareMappingApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductSubCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductSubCategorySelectionApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductValidDurationInfoApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.app.CardRechargeFareInfoResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.EligibleSubProductAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingGroupAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductFareInfoResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductConfigFareMappingGroupAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductSubCategorySelectionResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductValidDurationInfoResponseAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AllProductsConfigApiToAppMappersKt {
    public static final ArrayList a(Map map) {
        Iterator it;
        UnknownProductConfigFareMappingResponseAppModel unknownProductConfigFareMappingResponseAppModel;
        List list;
        String str;
        List list2;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                UnknownProductFareMappingApiResponseModel unknownProductFareMappingApiResponseModel = (UnknownProductFareMappingApiResponseModel) it3.next();
                String str3 = unknownProductFareMappingApiResponseModel.n;
                Integer num = unknownProductFareMappingApiResponseModel.f8621a;
                int iIntValue = num != null ? num.intValue() : 0;
                Boolean bool = unknownProductFareMappingApiResponseModel.j;
                String str4 = unknownProductFareMappingApiResponseModel.b;
                Boolean bool2 = unknownProductFareMappingApiResponseModel.f;
                boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
                Long l = unknownProductFareMappingApiResponseModel.g;
                if (l != null) {
                    long jLongValue = l.longValue();
                    Integer num2 = unknownProductFareMappingApiResponseModel.h;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    Integer num3 = unknownProductFareMappingApiResponseModel.i;
                    int iIntValue3 = num3 != null ? num3.intValue() : -1;
                    Integer num4 = unknownProductFareMappingApiResponseModel.q;
                    int iIntValue4 = num4 != null ? num4.intValue() : -1;
                    String str5 = unknownProductFareMappingApiResponseModel.p;
                    Boolean bool3 = unknownProductFareMappingApiResponseModel.d;
                    Boolean bool4 = unknownProductFareMappingApiResponseModel.e;
                    Integer num5 = unknownProductFareMappingApiResponseModel.r;
                    int iIntValue5 = num5 != null ? num5.intValue() : -1;
                    Double d = unknownProductFareMappingApiResponseModel.s;
                    double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
                    List list3 = unknownProductFareMappingApiResponseModel.t;
                    if (list3 != null) {
                        List<String> list4 = list3;
                        ArrayList arrayList3 = new ArrayList();
                        for (String str6 : list4) {
                            Iterator it4 = it3;
                            if (str6 != null) {
                                arrayList3.add(str6);
                            }
                            it3 = it4;
                        }
                        it = it3;
                        list = arrayList3;
                    } else {
                        it = it3;
                        list = EmptyList.f17557a;
                    }
                    List list5 = list;
                    String str7 = unknownProductFareMappingApiResponseModel.l;
                    String str8 = unknownProductFareMappingApiResponseModel.m;
                    List list6 = unknownProductFareMappingApiResponseModel.c;
                    if (list6 != null) {
                        List<String> list7 = list6;
                        ArrayList arrayList4 = new ArrayList();
                        for (String str9 : list7) {
                            String str10 = str8;
                            if (str9 != null) {
                                arrayList4.add(str9);
                            }
                            str8 = str10;
                        }
                        str = str8;
                        list2 = arrayList4;
                    } else {
                        str = str8;
                        list2 = EmptyList.f17557a;
                    }
                    String str11 = unknownProductFareMappingApiResponseModel.k;
                    Integer num6 = unknownProductFareMappingApiResponseModel.o;
                    unknownProductConfigFareMappingResponseAppModel = new UnknownProductConfigFareMappingResponseAppModel(str3, iIntValue, bool, str4, zBooleanValue, jLongValue, iIntValue2, iIntValue3, iIntValue4, str5, bool3, bool4, iIntValue5, dDoubleValue, list5, str7, str, list2, str11, num6 != null ? num6.intValue() : 0);
                } else {
                    it = it3;
                    unknownProductConfigFareMappingResponseAppModel = null;
                }
                if (unknownProductConfigFareMappingResponseAppModel != null) {
                    arrayList2.add(unknownProductConfigFareMappingResponseAppModel);
                }
                it2 = it2;
                it3 = it;
            }
            arrayList.add(new UnknownProductConfigFareMappingGroupAppModel(str2, arrayList2));
            it2 = it2;
        }
        return arrayList;
    }

    public static final UnknownProductSubCategoryResponseAppModel b(UnknownProductSubCategoryApiResponseModel unknownProductSubCategoryApiResponseModel) {
        Boolean bool = unknownProductSubCategoryApiResponseModel.f8623a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        String str = unknownProductSubCategoryApiResponseModel.b;
        String str2 = str == null ? "" : str;
        String str3 = unknownProductSubCategoryApiResponseModel.c;
        String str4 = str3 == null ? "" : str3;
        String str5 = unknownProductSubCategoryApiResponseModel.d;
        String str6 = str5 == null ? "" : str5;
        Boolean bool2 = unknownProductSubCategoryApiResponseModel.f;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        String str7 = unknownProductSubCategoryApiResponseModel.e;
        String str8 = str7 == null ? "" : str7;
        String str9 = unknownProductSubCategoryApiResponseModel.g;
        return new UnknownProductSubCategoryResponseAppModel(str2, str4, str6, str8, zBooleanValue, zBooleanValue2, str9 == null ? "" : str9);
    }

    public static final ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Long lT0 = StringsKt.t0((String) entry.getKey());
            UnknownProductValidDurationInfoResponseAppModel unknownProductValidDurationInfoResponseAppModel = null;
            if (lT0 != null) {
                long jLongValue = lT0.longValue();
                UnknownProductValidDurationInfoApiResponseModel unknownProductValidDurationInfoApiResponseModel = (UnknownProductValidDurationInfoApiResponseModel) entry.getValue();
                String str = unknownProductValidDurationInfoApiResponseModel.f8627a;
                if (str != null) {
                    Boolean bool = unknownProductValidDurationInfoApiResponseModel.b;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    Boolean bool2 = unknownProductValidDurationInfoApiResponseModel.c;
                    unknownProductValidDurationInfoResponseAppModel = new UnknownProductValidDurationInfoResponseAppModel(jLongValue, str, zBooleanValue, bool2 != null ? bool2.booleanValue() : true, unknownProductValidDurationInfoApiResponseModel.d);
                }
            }
            if (unknownProductValidDurationInfoResponseAppModel != null) {
                arrayList.add(unknownProductValidDurationInfoResponseAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:158:0x0297  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    public static final ProductConfigResponseAppModel.SuperPassConfigAppModel d(ProductConfigApiResponseModel.SuperPassConfigApiResponseModel superPassConfigApiResponseModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List list;
        List list2;
        List list3;
        ?? arrayList;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel;
        List list4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str9;
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel;
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel2;
        String str10;
        String str11;
        String str12;
        String str13;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        List list5;
        SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel;
        ?? arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List list6;
        String str14;
        Integer num;
        String str15;
        List list7;
        SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel;
        String str16 = "<this>";
        Intrinsics.i(superPassConfigApiResponseModel, "<this>");
        String str17 = superPassConfigApiResponseModel.b;
        if (str17 != null && (str = superPassConfigApiResponseModel.e) != null && (str2 = superPassConfigApiResponseModel.f8607a) != null && (str3 = superPassConfigApiResponseModel.d) != null && (str4 = superPassConfigApiResponseModel.f) != null && (str5 = superPassConfigApiResponseModel.c) != null) {
            Boolean bool = superPassConfigApiResponseModel.o;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            Boolean bool2 = superPassConfigApiResponseModel.q;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            Integer num2 = superPassConfigApiResponseModel.n;
            int iIntValue = num2 != null ? num2.intValue() : 1000;
            Long l = superPassConfigApiResponseModel.g;
            if (l != null) {
                long jLongValue = l.longValue();
                List list8 = superPassConfigApiResponseModel.h;
                if (list8 != null) {
                    boolean z = zBooleanValue2;
                    int i = iIntValue;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it = list8.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SuperPassProductConfigCategoryApiResponseModel superPassProductConfigCategoryApiResponseModel = (SuperPassProductConfigCategoryApiResponseModel) it.next();
                        Intrinsics.i(superPassProductConfigCategoryApiResponseModel, "<this>");
                        String str18 = str17;
                        String str19 = superPassProductConfigCategoryApiResponseModel.f8611a;
                        if (str19 == null || (num = superPassProductConfigCategoryApiResponseModel.b) == null) {
                            str15 = str;
                            superPassProductConfigCategoryResponseAppModel = null;
                        } else {
                            int iIntValue2 = num.intValue();
                            String str20 = superPassProductConfigCategoryApiResponseModel.c;
                            if (str20 == null) {
                                str15 = str;
                                superPassProductConfigCategoryResponseAppModel = null;
                            } else {
                                List list9 = superPassProductConfigCategoryApiResponseModel.d;
                                if (list9 != null) {
                                    List<String> list10 = list9;
                                    ArrayList arrayList8 = new ArrayList();
                                    for (String str21 : list10) {
                                        String str22 = str;
                                        if (str21 != null) {
                                            arrayList8.add(str21);
                                        }
                                        str = str22;
                                    }
                                    str15 = str;
                                    list7 = arrayList8;
                                } else {
                                    str15 = str;
                                    list7 = EmptyList.f17557a;
                                }
                                List list11 = list7;
                                Boolean bool3 = superPassProductConfigCategoryApiResponseModel.e;
                                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : true;
                                Boolean bool4 = superPassProductConfigCategoryApiResponseModel.f;
                                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                Boolean bool5 = superPassProductConfigCategoryApiResponseModel.g;
                                boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                                String str23 = superPassProductConfigCategoryApiResponseModel.h;
                                String str24 = superPassProductConfigCategoryApiResponseModel.i;
                                Boolean bool6 = superPassProductConfigCategoryApiResponseModel.j;
                                superPassProductConfigCategoryResponseAppModel = new SuperPassProductConfigCategoryResponseAppModel(str19, iIntValue2, str20, list11, zBooleanValue3, zBooleanValue4, zBooleanValue5, str23, str24, bool6 != null ? bool6.booleanValue() : true, superPassProductConfigCategoryApiResponseModel.k);
                            }
                        }
                        if (superPassProductConfigCategoryResponseAppModel != null) {
                            arrayList7.add(superPassProductConfigCategoryResponseAppModel);
                        }
                        str17 = str18;
                        str = str15;
                    }
                    String str25 = str17;
                    String str26 = str;
                    Map map = superPassConfigApiResponseModel.i;
                    if (map == null) {
                        return null;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str27 = (String) entry.getKey();
                        Iterable iterable = (Iterable) entry.getValue();
                        Iterator it3 = it2;
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            SuperPassProductConfigFareMappingApiResponseModel superPassProductConfigFareMappingApiResponseModel = (SuperPassProductConfigFareMappingApiResponseModel) it4.next();
                            Intrinsics.i(superPassProductConfigFareMappingApiResponseModel, str16);
                            String str28 = str2;
                            String str29 = superPassProductConfigFareMappingApiResponseModel.f8613a;
                            Integer num3 = superPassProductConfigFareMappingApiResponseModel.b;
                            if (num3 != null) {
                                int iIntValue3 = num3.intValue();
                                Boolean bool7 = superPassProductConfigFareMappingApiResponseModel.c;
                                String str30 = superPassProductConfigFareMappingApiResponseModel.d;
                                Boolean bool8 = superPassProductConfigFareMappingApiResponseModel.e;
                                boolean zBooleanValue6 = bool8 != null ? bool8.booleanValue() : true;
                                Long l2 = superPassProductConfigFareMappingApiResponseModel.f;
                                if (l2 != null) {
                                    long jLongValue2 = l2.longValue();
                                    Integer num4 = superPassProductConfigFareMappingApiResponseModel.g;
                                    int iIntValue4 = num4 != null ? num4.intValue() : -1;
                                    String str31 = superPassProductConfigFareMappingApiResponseModel.h;
                                    if (str31 == null) {
                                        str10 = str16;
                                        str11 = str3;
                                        str12 = str4;
                                    } else {
                                        Boolean bool9 = superPassProductConfigFareMappingApiResponseModel.i;
                                        Boolean bool10 = superPassProductConfigFareMappingApiResponseModel.j;
                                        Integer num5 = superPassProductConfigFareMappingApiResponseModel.k;
                                        int iIntValue5 = num5 != null ? num5.intValue() : -1;
                                        Double d = superPassProductConfigFareMappingApiResponseModel.l;
                                        double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
                                        Boolean bool11 = superPassProductConfigFareMappingApiResponseModel.m;
                                        boolean zBooleanValue7 = bool11 != null ? bool11.booleanValue() : true;
                                        List list12 = superPassProductConfigFareMappingApiResponseModel.n;
                                        if (list12 != null) {
                                            List<String> list13 = list12;
                                            ArrayList arrayList11 = new ArrayList();
                                            for (String str32 : list13) {
                                                String str33 = str3;
                                                if (str32 != null) {
                                                    arrayList11.add(str32);
                                                }
                                                str3 = str33;
                                            }
                                            str11 = str3;
                                            list5 = arrayList11;
                                        } else {
                                            str11 = str3;
                                            list5 = EmptyList.f17557a;
                                        }
                                        List list14 = list5;
                                        SuperPassProductFareInfoApiResponseModel superPassProductFareInfoApiResponseModel = superPassProductConfigFareMappingApiResponseModel.o;
                                        if (superPassProductFareInfoApiResponseModel != null) {
                                            Double d2 = superPassProductFareInfoApiResponseModel.f8617a;
                                            if (d2 != null) {
                                                double dDoubleValue2 = d2.doubleValue();
                                                Double d3 = superPassProductFareInfoApiResponseModel.b;
                                                if (d3 != null) {
                                                    double dDoubleValue3 = d3.doubleValue();
                                                    Boolean bool12 = superPassProductFareInfoApiResponseModel.c;
                                                    boolean zBooleanValue8 = bool12 != null ? bool12.booleanValue() : false;
                                                    Double d4 = superPassProductFareInfoApiResponseModel.d;
                                                    double dDoubleValue4 = d4 != null ? d4.doubleValue() : -1.0d;
                                                    List list15 = superPassProductFareInfoApiResponseModel.e;
                                                    if (list15 != null) {
                                                        ArrayList arrayList12 = new ArrayList();
                                                        Iterator it6 = list15.iterator();
                                                        while (it6.hasNext()) {
                                                            Iterator it7 = it6;
                                                            ProductConfigFareBreakupApiResponseModel productConfigFareBreakupApiResponseModel = (ProductConfigFareBreakupApiResponseModel) it6.next();
                                                            Intrinsics.i(productConfigFareBreakupApiResponseModel, str16);
                                                            String str34 = str16;
                                                            String str35 = str4;
                                                            String str36 = productConfigFareBreakupApiResponseModel.f8161a;
                                                            ProductConfigFareBreakupAppModel productConfigFareBreakupAppModel = (str36 == null || (str14 = productConfigFareBreakupApiResponseModel.b) == null) ? null : new ProductConfigFareBreakupAppModel(str36, str14);
                                                            if (productConfigFareBreakupAppModel != null) {
                                                                arrayList12.add(productConfigFareBreakupAppModel);
                                                            }
                                                            str16 = str34;
                                                            it6 = it7;
                                                            str4 = str35;
                                                        }
                                                        str10 = str16;
                                                        str12 = str4;
                                                        list6 = arrayList12;
                                                    } else {
                                                        str10 = str16;
                                                        str12 = str4;
                                                        list6 = EmptyList.f17557a;
                                                    }
                                                    superPassProductFareInfoResponseAppModel = new SuperPassProductFareInfoResponseAppModel(dDoubleValue2, dDoubleValue3, zBooleanValue8, dDoubleValue4, list6);
                                                } else {
                                                    str10 = str16;
                                                    str12 = str4;
                                                    superPassProductFareInfoResponseAppModel = null;
                                                }
                                            } else {
                                                str10 = str16;
                                                str12 = str4;
                                                superPassProductFareInfoResponseAppModel = null;
                                            }
                                            if (superPassProductFareInfoResponseAppModel != null) {
                                                String str37 = superPassProductConfigFareMappingApiResponseModel.p;
                                                List<String> list16 = superPassProductConfigFareMappingApiResponseModel.q;
                                                if (list16 != null) {
                                                    arrayList4 = new ArrayList();
                                                    for (String str38 : list16) {
                                                        if (str38 != null) {
                                                            arrayList4.add(str38);
                                                        }
                                                    }
                                                } else {
                                                    arrayList4 = EmptyList.f17557a;
                                                }
                                                ?? r52 = arrayList4;
                                                String str39 = superPassProductConfigFareMappingApiResponseModel.r;
                                                String str40 = superPassProductConfigFareMappingApiResponseModel.s;
                                                List list17 = superPassProductConfigFareMappingApiResponseModel.t;
                                                if (list17 != null) {
                                                    ArrayList arrayList13 = new ArrayList();
                                                    Iterator it8 = list17.iterator();
                                                    while (it8.hasNext()) {
                                                        String str41 = str39;
                                                        PassOfferTagApiResponseModel passOfferTagApiResponseModel = (PassOfferTagApiResponseModel) it8.next();
                                                        String str42 = str40;
                                                        String str43 = passOfferTagApiResponseModel.f8145a;
                                                        Iterator it9 = it8;
                                                        String str44 = passOfferTagApiResponseModel.b;
                                                        String str45 = passOfferTagApiResponseModel.c;
                                                        PassOfferTagAppModel passOfferTagAppModel = (str43 == null || str43.length() == 0 || str44 == null || str44.length() == 0 || str45 == null || str45.length() == 0) ? null : new PassOfferTagAppModel(str44, str45, str43);
                                                        if (passOfferTagAppModel != null) {
                                                            arrayList13.add(passOfferTagAppModel);
                                                        }
                                                        it8 = it9;
                                                        str5 = str5;
                                                        str39 = str41;
                                                        str40 = str42;
                                                    }
                                                    arrayList5 = arrayList13;
                                                } else {
                                                    arrayList5 = null;
                                                }
                                                String str46 = str39;
                                                String str47 = str40;
                                                str13 = str5;
                                                List list18 = superPassProductConfigFareMappingApiResponseModel.u;
                                                if (list18 != null) {
                                                    ArrayList arrayList14 = new ArrayList();
                                                    Iterator it10 = list18.iterator();
                                                    while (it10.hasNext()) {
                                                        ApplicableRuleAppModel applicableRuleAppModelB = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it10.next());
                                                        if (applicableRuleAppModelB != null) {
                                                            arrayList14.add(applicableRuleAppModelB);
                                                        }
                                                    }
                                                    arrayList6 = arrayList14;
                                                } else {
                                                    arrayList6 = null;
                                                }
                                                superPassProductConfigFareMappingResponseAppModel = new SuperPassProductConfigFareMappingResponseAppModel(str29, iIntValue3, bool7, str30, zBooleanValue6, jLongValue2, iIntValue4, str31, bool9, bool10, iIntValue5, dDoubleValue, zBooleanValue7, list14, superPassProductFareInfoResponseAppModel, str37, r52, str46, str47, arrayList5, arrayList6);
                                            }
                                        } else {
                                            str10 = str16;
                                            str12 = str4;
                                        }
                                    }
                                    str13 = str5;
                                    superPassProductConfigFareMappingResponseAppModel = null;
                                } else {
                                    str10 = str16;
                                    str11 = str3;
                                    str12 = str4;
                                    str13 = str5;
                                    superPassProductConfigFareMappingResponseAppModel = null;
                                }
                            } else {
                                str10 = str16;
                                str11 = str3;
                                str12 = str4;
                                str13 = str5;
                                superPassProductConfigFareMappingResponseAppModel = null;
                            }
                            if (superPassProductConfigFareMappingResponseAppModel != null) {
                                arrayList10.add(superPassProductConfigFareMappingResponseAppModel);
                            }
                            str2 = str28;
                            it4 = it5;
                            str16 = str10;
                            str4 = str12;
                            str5 = str13;
                            str3 = str11;
                        }
                        arrayList9.add(new SuperPassProductConfigFareMappingGroupAppModel(str27, arrayList10));
                        it2 = it3;
                        str16 = str16;
                    }
                    String str48 = str2;
                    String str49 = str3;
                    String str50 = str4;
                    String str51 = str5;
                    String str52 = superPassConfigApiResponseModel.j;
                    String str53 = superPassConfigApiResponseModel.k;
                    String str54 = superPassConfigApiResponseModel.l;
                    String str55 = superPassConfigApiResponseModel.m;
                    String str56 = superPassConfigApiResponseModel.p;
                    Boolean bool13 = superPassConfigApiResponseModel.r;
                    boolean zBooleanValue9 = bool13 != null ? bool13.booleanValue() : false;
                    Integer num6 = superPassConfigApiResponseModel.s;
                    int iIntValue6 = num6 != null ? num6.intValue() : -1;
                    Integer num7 = superPassConfigApiResponseModel.t;
                    int iIntValue7 = num7 != null ? num7.intValue() : -1;
                    BrandingApiModel brandingApiModel = superPassConfigApiResponseModel.u;
                    BrandingDetails brandingDetails = new BrandingDetails(brandingApiModel != null ? brandingApiModel.f7144a : true);
                    List list19 = superPassConfigApiResponseModel.v;
                    if (list19 != null) {
                        List<SuperPassProductConfigSubCategoryApiResponseModel> list20 = list19;
                        ArrayList arrayList15 = new ArrayList();
                        for (SuperPassProductConfigSubCategoryApiResponseModel superPassProductConfigSubCategoryApiResponseModel : list20) {
                            String str57 = str53;
                            String str58 = str54;
                            String str59 = str55;
                            if (Intrinsics.d(superPassProductConfigSubCategoryApiResponseModel.e, Boolean.FALSE)) {
                                superPassProductConfigSubCategoryResponseAppModel2 = null;
                            } else {
                                String str60 = superPassProductConfigSubCategoryApiResponseModel.f8615a;
                                if (str60 == null || (str9 = superPassProductConfigSubCategoryApiResponseModel.b) == null) {
                                    superPassProductConfigSubCategoryResponseAppModel = null;
                                } else {
                                    Boolean bool14 = superPassProductConfigSubCategoryApiResponseModel.d;
                                    boolean zBooleanValue10 = bool14 != null ? bool14.booleanValue() : true;
                                    String str61 = superPassProductConfigSubCategoryApiResponseModel.c;
                                    Boolean bool15 = superPassProductConfigSubCategoryApiResponseModel.e;
                                    boolean zBooleanValue11 = bool15 != null ? bool15.booleanValue() : true;
                                    String str62 = superPassProductConfigSubCategoryApiResponseModel.f;
                                    if (str62 == null) {
                                        str62 = "";
                                    }
                                    String str63 = str62;
                                    String str64 = superPassProductConfigSubCategoryApiResponseModel.g;
                                    String str65 = superPassProductConfigSubCategoryApiResponseModel.h;
                                    String str66 = superPassProductConfigSubCategoryApiResponseModel.i;
                                    Boolean bool16 = superPassProductConfigSubCategoryApiResponseModel.j;
                                    superPassProductConfigSubCategoryResponseAppModel = new SuperPassProductConfigSubCategoryResponseAppModel(str60, str9, str61, zBooleanValue10, zBooleanValue11, str63, str64, str65, str66, bool16 != null ? bool16.booleanValue() : false);
                                }
                                superPassProductConfigSubCategoryResponseAppModel2 = superPassProductConfigSubCategoryResponseAppModel;
                            }
                            if (superPassProductConfigSubCategoryResponseAppModel2 != null) {
                                arrayList15.add(superPassProductConfigSubCategoryResponseAppModel2);
                            }
                            str54 = str58;
                            str53 = str57;
                            str55 = str59;
                        }
                        str6 = str53;
                        str7 = str54;
                        str8 = str55;
                        list = arrayList15;
                    } else {
                        str6 = str53;
                        str7 = str54;
                        str8 = str55;
                        list = EmptyList.f17557a;
                    }
                    ProductConfigSubCategorySelectionApiResponseModel productConfigSubCategorySelectionApiResponseModel = superPassConfigApiResponseModel.w;
                    ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel2 = productConfigSubCategorySelectionApiResponseModel != null ? new ProductConfigSubCategorySelectionAppModel(productConfigSubCategorySelectionApiResponseModel.f8173a, productConfigSubCategorySelectionApiResponseModel.b) : null;
                    List<String> list21 = superPassConfigApiResponseModel.x;
                    if (list21 != null) {
                        ArrayList arrayList16 = new ArrayList();
                        List list22 = list;
                        for (String str67 : list21) {
                            List list23 = list22;
                            if (str67 != null) {
                                arrayList16.add(str67);
                            }
                            list22 = list23;
                        }
                        list2 = list22;
                        list3 = arrayList16;
                    } else {
                        list2 = list;
                        list3 = EmptyList.f17557a;
                    }
                    List list24 = superPassConfigApiResponseModel.y;
                    if (list24 != null) {
                        arrayList = new ArrayList();
                        Iterator it11 = list24.iterator();
                        while (it11.hasNext()) {
                            Iterator it12 = it11;
                            String str68 = (String) it11.next();
                            if (str68 != null) {
                                arrayList.add(str68);
                            }
                            it11 = it12;
                        }
                    } else {
                        arrayList = EmptyList.f17557a;
                    }
                    ProductConfigServiceType.Companion companion = ProductConfigServiceType.INSTANCE;
                    ?? r16 = arrayList;
                    List list25 = superPassConfigApiResponseModel.z;
                    if (list25 != null) {
                        List<String> list26 = list25;
                        ArrayList arrayList17 = new ArrayList();
                        for (String str69 : list26) {
                            ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel3 = productConfigSubCategorySelectionAppModel2;
                            if (str69 != null) {
                                arrayList17.add(str69);
                            }
                            productConfigSubCategorySelectionAppModel2 = productConfigSubCategorySelectionAppModel3;
                        }
                        productConfigSubCategorySelectionAppModel = productConfigSubCategorySelectionAppModel2;
                        list4 = arrayList17;
                    } else {
                        productConfigSubCategorySelectionAppModel = productConfigSubCategorySelectionAppModel2;
                        list4 = EmptyList.f17557a;
                    }
                    List listA = ProductConfigServiceType.Companion.a(companion, list4);
                    Boolean bool17 = superPassConfigApiResponseModel.A;
                    boolean zBooleanValue12 = bool17 != null ? bool17.booleanValue() : false;
                    List list27 = superPassConfigApiResponseModel.B;
                    if (list27 != null) {
                        arrayList2 = new ArrayList();
                        Iterator it13 = list27.iterator();
                        while (it13.hasNext()) {
                            List list28 = listA;
                            ProductImageAppModel productImageAppModelB = ProductBookingCommonApiToAppModelsMappersKt.b((ProductImageApiResponseModel) it13.next());
                            if (productImageAppModelB != null) {
                                arrayList2.add(productImageAppModelB);
                            }
                            listA = list28;
                        }
                    } else {
                        arrayList2 = null;
                    }
                    List list29 = listA;
                    List list30 = superPassConfigApiResponseModel.C;
                    if (list30 != null) {
                        arrayList3 = new ArrayList();
                        Iterator it14 = list30.iterator();
                        while (it14.hasNext()) {
                            ApplicableRuleAppModel applicableRuleAppModelB2 = PBRemoteToAppModelMappersKt.b((ApplicableRuleApiResponseModel) it14.next());
                            if (applicableRuleAppModelB2 != null) {
                                arrayList3.add(applicableRuleAppModelB2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                    return new ProductConfigResponseAppModel.SuperPassConfigAppModel(str25, str26, str48, str49, str50, str51, zBooleanValue, z, i, jLongValue, arrayList7, arrayList9, str52, str6, str7, str8, str56, zBooleanValue9, iIntValue6, iIntValue7, brandingDetails, list2, productConfigSubCategorySelectionAppModel, list3, r16, list29, zBooleanValue12, arrayList2, arrayList3);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v75, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4, types: [app.chalo.productpurchase.productselection.data.models.app.UnknownProductSubCategorySelectionResponseAppModel] */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r3v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v32, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static final ProductConfigResponseAppModel e(ProductConfigApiResponseModel productConfigApiResponseModel) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        UnknownProductSubCategorySelectionResponseAppModel unknownProductSubCategorySelectionResponseAppModel;
        ?? arrayList;
        ?? arrayList2;
        String str5;
        String str6;
        String str7;
        ProductConfigResponseAppModel productConfigResponseAppModel;
        List list2;
        ?? unknownProductSubCategorySelectionResponseAppModel2;
        ?? arrayList3;
        ?? arrayList4;
        String str8;
        String str9;
        String str10;
        String str11;
        ?? arrayList5;
        Long l;
        Long l2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        ?? arrayList6;
        ?? arrayList7;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        ?? arrayList8;
        Intrinsics.i(productConfigApiResponseModel, "<this>");
        if (productConfigApiResponseModel instanceof ProductConfigApiResponseModel.SuperPassConfigApiResponseModel) {
            return d((ProductConfigApiResponseModel.SuperPassConfigApiResponseModel) productConfigApiResponseModel);
        }
        if (productConfigApiResponseModel instanceof ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel) {
            ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel = (ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel) productConfigApiResponseModel;
            String str24 = cardRechargeConfigApiResponseModel.f8597a;
            if (str24 != null && (str21 = cardRechargeConfigApiResponseModel.d) != null && (str22 = cardRechargeConfigApiResponseModel.e) != null) {
                String str25 = cardRechargeConfigApiResponseModel.c;
                String str26 = str25 == null ? "" : str25;
                String str27 = cardRechargeConfigApiResponseModel.f;
                if (str27 != null && (str23 = cardRechargeConfigApiResponseModel.b) != null) {
                    Boolean bool = cardRechargeConfigApiResponseModel.i;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    Boolean bool2 = cardRechargeConfigApiResponseModel.j;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                    CardRechargeFareInfoApiResponseModel cardRechargeFareInfoApiResponseModel = cardRechargeConfigApiResponseModel.g;
                    if (cardRechargeFareInfoApiResponseModel != null) {
                        Long l3 = cardRechargeFareInfoApiResponseModel.f8559a;
                        long jLongValue = l3 != null ? l3.longValue() : 0L;
                        Long l4 = cardRechargeFareInfoApiResponseModel.b;
                        long jLongValue2 = l4 != null ? l4.longValue() : 1L;
                        List list3 = cardRechargeFareInfoApiResponseModel.c;
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        CardRechargeFareInfoResponseAppModel cardRechargeFareInfoResponseAppModel = new CardRechargeFareInfoResponseAppModel(list3, jLongValue, jLongValue2);
                        String str28 = cardRechargeConfigApiResponseModel.h;
                        Integer num = cardRechargeConfigApiResponseModel.k;
                        int iIntValue = num != null ? num.intValue() : -1;
                        Integer num2 = cardRechargeConfigApiResponseModel.l;
                        int iIntValue2 = num2 != null ? num2.intValue() : -1;
                        BrandingApiModel brandingApiModel = cardRechargeConfigApiResponseModel.m;
                        BrandingDetails brandingDetails = new BrandingDetails(brandingApiModel != null ? brandingApiModel.f7144a : true);
                        List<String> list4 = cardRechargeConfigApiResponseModel.n;
                        if (list4 != null) {
                            arrayList8 = new ArrayList();
                            for (String str29 : list4) {
                                if (str29 != null) {
                                    arrayList8.add(str29);
                                }
                            }
                        } else {
                            arrayList8 = EmptyList.f17557a;
                        }
                        return new ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel(str24, str21, str22, str26, str27, str23, zBooleanValue, zBooleanValue2, cardRechargeFareInfoResponseAppModel, str28, iIntValue, iIntValue2, brandingDetails, arrayList8);
                    }
                }
            }
        } else if (productConfigApiResponseModel instanceof ProductConfigApiResponseModel.GroupTicketConfigurationApiModel) {
            ProductConfigApiResponseModel.GroupTicketConfigurationApiModel groupTicketConfigurationApiModel = (ProductConfigApiResponseModel.GroupTicketConfigurationApiModel) productConfigApiResponseModel;
            String str30 = groupTicketConfigurationApiModel.f8599a;
            if (str30 != null && (str15 = groupTicketConfigurationApiModel.b) != null && (str16 = groupTicketConfigurationApiModel.c) != null && (str17 = groupTicketConfigurationApiModel.d) != null) {
                Boolean bool3 = groupTicketConfigurationApiModel.e;
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = groupTicketConfigurationApiModel.f;
                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                BrandingApiModel brandingApiModel2 = groupTicketConfigurationApiModel.g;
                BrandingDetails brandingDetails2 = new BrandingDetails(brandingApiModel2 != null ? brandingApiModel2.f7144a : true);
                String str31 = groupTicketConfigurationApiModel.h;
                if (str31 != null && (str18 = groupTicketConfigurationApiModel.i) != null) {
                    Long l5 = groupTicketConfigurationApiModel.j;
                    long jLongValue3 = l5 != null ? l5.longValue() : 0L;
                    Integer num3 = groupTicketConfigurationApiModel.k;
                    int iIntValue3 = num3 != null ? num3.intValue() : -1;
                    Integer num4 = groupTicketConfigurationApiModel.l;
                    int iIntValue4 = num4 != null ? num4.intValue() : -1;
                    List list5 = groupTicketConfigurationApiModel.n;
                    if (list5 == null) {
                        list5 = EmptyList.f17557a;
                    }
                    List list6 = list5;
                    List list7 = groupTicketConfigurationApiModel.m;
                    if (list7 != null) {
                        arrayList6 = new ArrayList();
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            ProductImageAppModel productImageAppModelB = ProductBookingCommonApiToAppModelsMappersKt.b((ProductImageApiResponseModel) it.next());
                            if (productImageAppModelB != null) {
                                arrayList6.add(productImageAppModelB);
                            }
                        }
                    } else {
                        arrayList6 = EmptyList.f17557a;
                    }
                    ?? r23 = arrayList6;
                    List<EligibleSubProductApiResponseModel> list8 = groupTicketConfigurationApiModel.o;
                    if (list8 != null) {
                        arrayList7 = new ArrayList();
                        for (EligibleSubProductApiResponseModel eligibleSubProductApiResponseModel : list8) {
                            String str32 = eligibleSubProductApiResponseModel.f8561a;
                            EligibleSubProductAppModel eligibleSubProductAppModel = (str32 == null || (str19 = eligibleSubProductApiResponseModel.b) == null || (str20 = eligibleSubProductApiResponseModel.c) == null) ? null : new EligibleSubProductAppModel(str32, str19, str20);
                            if (eligibleSubProductAppModel != null) {
                                arrayList7.add(eligibleSubProductAppModel);
                            }
                        }
                    } else {
                        arrayList7 = EmptyList.f17557a;
                    }
                    return new ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel(str30, str15, str16, str17, zBooleanValue3, zBooleanValue4, brandingDetails2, str31, str18, jLongValue3, iIntValue3, iIntValue4, r23, list6, arrayList7);
                }
            }
        } else if (productConfigApiResponseModel instanceof ProductConfigApiResponseModel.QuickPayConfigApiResponseModel) {
            ProductConfigApiResponseModel.QuickPayConfigApiResponseModel quickPayConfigApiResponseModel = (ProductConfigApiResponseModel.QuickPayConfigApiResponseModel) productConfigApiResponseModel;
            String str33 = quickPayConfigApiResponseModel.f8603a;
            if (str33 != null && (str12 = quickPayConfigApiResponseModel.d) != null && (str13 = quickPayConfigApiResponseModel.e) != null) {
                String str34 = quickPayConfigApiResponseModel.c;
                String str35 = str34 == null ? "" : str34;
                String str36 = quickPayConfigApiResponseModel.f;
                if (str36 != null && (str14 = quickPayConfigApiResponseModel.b) != null) {
                    Boolean bool5 = quickPayConfigApiResponseModel.h;
                    boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                    Long l6 = quickPayConfigApiResponseModel.g;
                    if (l6 != null) {
                        long jLongValue4 = l6.longValue();
                        Integer num5 = quickPayConfigApiResponseModel.i;
                        int iIntValue5 = num5 != null ? num5.intValue() : -1;
                        Integer num6 = quickPayConfigApiResponseModel.j;
                        return new ProductConfigResponseAppModel.QuickPayConfigResponseAppModel(str33, str12, str13, str35, str36, str14, zBooleanValue5, jLongValue4, iIntValue5, num6 != null ? num6.intValue() : -1);
                    }
                }
            }
        } else if (productConfigApiResponseModel instanceof ProductConfigApiResponseModel.InstantTicketConfigurationApiModel) {
            ProductConfigApiResponseModel.InstantTicketConfigurationApiModel instantTicketConfigurationApiModel = (ProductConfigApiResponseModel.InstantTicketConfigurationApiModel) productConfigApiResponseModel;
            InstantTicketFareInfoApiResponseModel instantTicketFareInfoApiResponseModel = instantTicketConfigurationApiModel.i;
            String str37 = instantTicketConfigurationApiModel.f8601a;
            if (str37 != null && (str8 = instantTicketConfigurationApiModel.b) != null && (str9 = instantTicketConfigurationApiModel.c) != null && (str10 = instantTicketConfigurationApiModel.d) != null) {
                Boolean bool6 = instantTicketConfigurationApiModel.e;
                boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
                BrandingApiModel brandingApiModel3 = instantTicketConfigurationApiModel.f;
                BrandingDetails brandingDetails3 = new BrandingDetails(brandingApiModel3 != null ? brandingApiModel3.f7144a : true);
                String str38 = instantTicketConfigurationApiModel.g;
                if (str38 != null && (str11 = instantTicketConfigurationApiModel.h) != null) {
                    FareInfo fareInfo = new FareInfo((instantTicketFareInfoApiResponseModel == null || (l2 = instantTicketFareInfoApiResponseModel.f8567a) == null) ? 0L : l2.longValue(), (instantTicketFareInfoApiResponseModel == null || (l = instantTicketFareInfoApiResponseModel.b) == null) ? 0L : l.longValue());
                    Long l7 = instantTicketConfigurationApiModel.j;
                    long jLongValue5 = l7 != null ? l7.longValue() : 0L;
                    Boolean bool7 = instantTicketConfigurationApiModel.k;
                    boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
                    Boolean bool8 = instantTicketConfigurationApiModel.l;
                    boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
                    List list9 = instantTicketConfigurationApiModel.m;
                    if (list9 != null) {
                        arrayList5 = new ArrayList();
                        Iterator it2 = list9.iterator();
                        while (it2.hasNext()) {
                            ProductImageAppModel productImageAppModelB2 = ProductBookingCommonApiToAppModelsMappersKt.b((ProductImageApiResponseModel) it2.next());
                            if (productImageAppModelB2 != null) {
                                arrayList5.add(productImageAppModelB2);
                            }
                        }
                    } else {
                        arrayList5 = EmptyList.f17557a;
                    }
                    return new ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel(str37, str8, str9, str10, zBooleanValue6, brandingDetails3, str38, str11, fareInfo, jLongValue5, zBooleanValue7, zBooleanValue8, arrayList5);
                }
            }
        } else {
            if (!(productConfigApiResponseModel instanceof ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel)) {
                if (!(productConfigApiResponseModel instanceof ProductConfigApiResponseModel.SingleJourneyTicketApiModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel singleJourneyTicketApiModel = (ProductConfigApiResponseModel.SingleJourneyTicketApiModel) productConfigApiResponseModel;
                String str39 = singleJourneyTicketApiModel.c;
                String str40 = singleJourneyTicketApiModel.f8605a;
                if (str40 == null || (str = singleJourneyTicketApiModel.b) == null) {
                    return null;
                }
                String str41 = ((str39 == null || str39.length() == 0) && (str39 = singleJourneyTicketApiModel.d) == null) ? "" : str39;
                String str42 = singleJourneyTicketApiModel.e;
                String str43 = singleJourneyTicketApiModel.f;
                String str44 = singleJourneyTicketApiModel.g;
                String str45 = singleJourneyTicketApiModel.h;
                Integer num7 = singleJourneyTicketApiModel.i;
                int iIntValue6 = num7 != null ? num7.intValue() : 1000;
                String str46 = singleJourneyTicketApiModel.j;
                if (str46 == null || (str2 = singleJourneyTicketApiModel.k) == null || (str3 = singleJourneyTicketApiModel.l) == null) {
                    return null;
                }
                BrandingApiModel brandingApiModel4 = singleJourneyTicketApiModel.m;
                BrandingDetails brandingDetails4 = new BrandingDetails(brandingApiModel4 != null ? brandingApiModel4.f7144a : true);
                Long l8 = singleJourneyTicketApiModel.o;
                long jLongValue6 = l8 != null ? l8.longValue() : 0L;
                Long l9 = singleJourneyTicketApiModel.p;
                long jLongValue7 = l9 != null ? l9.longValue() : 0L;
                List<UnknownProductSubCategoryApiResponseModel> list10 = singleJourneyTicketApiModel.q;
                if (list10 != null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (UnknownProductSubCategoryApiResponseModel unknownProductSubCategoryApiResponseModel : list10) {
                        String str47 = str42;
                        UnknownProductSubCategoryResponseAppModel unknownProductSubCategoryResponseAppModelB = Intrinsics.d(unknownProductSubCategoryApiResponseModel.f8623a, Boolean.FALSE) ? null : b(unknownProductSubCategoryApiResponseModel);
                        if (unknownProductSubCategoryResponseAppModelB != null) {
                            arrayList9.add(unknownProductSubCategoryResponseAppModelB);
                        }
                        str42 = str47;
                    }
                    str4 = str42;
                    list = arrayList9;
                } else {
                    str4 = str42;
                    list = EmptyList.f17557a;
                }
                List list11 = list;
                UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel = singleJourneyTicketApiModel.r;
                if (unknownProductSubCategorySelectionApiResponseModel != null) {
                    String str48 = unknownProductSubCategorySelectionApiResponseModel.f8625a;
                    if (str48 == null) {
                        str48 = "";
                    }
                    String str49 = unknownProductSubCategorySelectionApiResponseModel.b;
                    unknownProductSubCategorySelectionResponseAppModel = new UnknownProductSubCategorySelectionResponseAppModel(str48, str49 != null ? str49 : "");
                } else {
                    unknownProductSubCategorySelectionResponseAppModel = null;
                }
                List list12 = singleJourneyTicketApiModel.s;
                if (list12 == null) {
                    return null;
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it3 = list12.iterator();
                while (it3.hasNext()) {
                    UnknownProductCategoryResponseAppModel unknownProductCategoryResponseAppModelF = f((UnknownProductCategoryApiResponseModel) it3.next());
                    if (unknownProductCategoryResponseAppModelF != null) {
                        arrayList10.add(unknownProductCategoryResponseAppModelF);
                    }
                }
                Map map = singleJourneyTicketApiModel.t;
                List listC = map != null ? c(map) : EmptyList.f17557a;
                Map map2 = singleJourneyTicketApiModel.u;
                List listA = map2 != null ? a(map2) : EmptyList.f17557a;
                List<String> list13 = singleJourneyTicketApiModel.v;
                if (list13 != null) {
                    arrayList = new ArrayList();
                    for (String str50 : list13) {
                        if (str50 != null) {
                            arrayList.add(str50);
                        }
                    }
                } else {
                    arrayList = EmptyList.f17557a;
                }
                ?? r45 = arrayList;
                ProductConfigServiceType.Companion companion = ProductConfigServiceType.INSTANCE;
                List<String> list14 = singleJourneyTicketApiModel.w;
                if (list14 != null) {
                    arrayList2 = new ArrayList();
                    for (String str51 : list14) {
                        if (str51 != null) {
                            arrayList2.add(str51);
                        }
                    }
                } else {
                    arrayList2 = EmptyList.f17557a;
                }
                List listA2 = ProductConfigServiceType.Companion.a(companion, arrayList2);
                Boolean bool9 = singleJourneyTicketApiModel.x;
                boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : true;
                String str52 = singleJourneyTicketApiModel.y;
                Boolean bool10 = singleJourneyTicketApiModel.z;
                boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : true;
                Boolean bool11 = singleJourneyTicketApiModel.A;
                boolean zBooleanValue11 = bool11 != null ? bool11.booleanValue() : false;
                Integer num8 = singleJourneyTicketApiModel.B;
                int iIntValue7 = num8 != null ? num8.intValue() : -1;
                Integer num9 = singleJourneyTicketApiModel.C;
                return new ProductConfigResponseAppModel.SingleJourneyTicketAppModel(str40, str, str41, str4, str43, str44, str45, iIntValue6, str46, str2, str3, brandingDetails4, jLongValue6, jLongValue7, list11, unknownProductSubCategorySelectionResponseAppModel, arrayList10, listC, listA, r45, listA2, zBooleanValue9, str52, zBooleanValue10, zBooleanValue11, iIntValue7, num9 != null ? num9.intValue() : -1);
            }
            ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel unknownProductConfigApiResponseModel = (ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel) productConfigApiResponseModel;
            String str53 = unknownProductConfigApiResponseModel.c;
            String str54 = unknownProductConfigApiResponseModel.f8609a;
            if (str54 != null && (str5 = unknownProductConfigApiResponseModel.b) != null) {
                String str55 = ((str53 == null || str53.length() == 0) && (str53 = unknownProductConfigApiResponseModel.d) == null) ? "" : str53;
                String str56 = unknownProductConfigApiResponseModel.e;
                String str57 = unknownProductConfigApiResponseModel.f;
                String str58 = unknownProductConfigApiResponseModel.g;
                String str59 = unknownProductConfigApiResponseModel.h;
                Integer num10 = unknownProductConfigApiResponseModel.i;
                int iIntValue8 = num10 != null ? num10.intValue() : 1000;
                String str60 = unknownProductConfigApiResponseModel.j;
                if (str60 != null && (str6 = unknownProductConfigApiResponseModel.k) != null && (str7 = unknownProductConfigApiResponseModel.l) != null) {
                    BrandingApiModel brandingApiModel5 = unknownProductConfigApiResponseModel.m;
                    BrandingDetails brandingDetails5 = new BrandingDetails(brandingApiModel5 != null ? brandingApiModel5.f7144a : true);
                    Long l10 = unknownProductConfigApiResponseModel.n;
                    long jLongValue8 = l10 != null ? l10.longValue() : 0L;
                    Long l11 = unknownProductConfigApiResponseModel.o;
                    long jLongValue9 = l11 != null ? l11.longValue() : 0L;
                    List list15 = unknownProductConfigApiResponseModel.p;
                    if (list15 != null) {
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it4 = list15.iterator();
                        while (it4.hasNext()) {
                            UnknownProductSubCategoryApiResponseModel unknownProductSubCategoryApiResponseModel2 = (UnknownProductSubCategoryApiResponseModel) it4.next();
                            Iterator it5 = it4;
                            UnknownProductSubCategoryResponseAppModel unknownProductSubCategoryResponseAppModelB2 = Intrinsics.d(unknownProductSubCategoryApiResponseModel2.f8623a, Boolean.FALSE) ? null : b(unknownProductSubCategoryApiResponseModel2);
                            if (unknownProductSubCategoryResponseAppModelB2 != null) {
                                arrayList11.add(unknownProductSubCategoryResponseAppModelB2);
                            }
                            it4 = it5;
                        }
                        productConfigResponseAppModel = null;
                        list2 = arrayList11;
                    } else {
                        productConfigResponseAppModel = null;
                        list2 = EmptyList.f17557a;
                    }
                    List list16 = list2;
                    UnknownProductSubCategorySelectionApiResponseModel unknownProductSubCategorySelectionApiResponseModel2 = unknownProductConfigApiResponseModel.q;
                    if (unknownProductSubCategorySelectionApiResponseModel2 != null) {
                        String str61 = unknownProductSubCategorySelectionApiResponseModel2.f8625a;
                        if (str61 == null) {
                            str61 = "";
                        }
                        String str62 = unknownProductSubCategorySelectionApiResponseModel2.b;
                        unknownProductSubCategorySelectionResponseAppModel2 = new UnknownProductSubCategorySelectionResponseAppModel(str61, str62 != null ? str62 : "");
                    } else {
                        unknownProductSubCategorySelectionResponseAppModel2 = productConfigResponseAppModel;
                    }
                    List list17 = unknownProductConfigApiResponseModel.r;
                    if (list17 == null) {
                        return productConfigResponseAppModel;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it6 = list17.iterator();
                    while (it6.hasNext()) {
                        UnknownProductCategoryResponseAppModel unknownProductCategoryResponseAppModelF2 = f((UnknownProductCategoryApiResponseModel) it6.next());
                        if (unknownProductCategoryResponseAppModelF2 != null) {
                            arrayList12.add(unknownProductCategoryResponseAppModelF2);
                        }
                    }
                    Map map3 = unknownProductConfigApiResponseModel.s;
                    List listC2 = map3 != null ? c(map3) : EmptyList.f17557a;
                    Map map4 = unknownProductConfigApiResponseModel.t;
                    List listA3 = map4 != null ? a(map4) : EmptyList.f17557a;
                    List<String> list18 = unknownProductConfigApiResponseModel.u;
                    if (list18 != null) {
                        arrayList3 = new ArrayList();
                        for (String str63 : list18) {
                            if (str63 != null) {
                                arrayList3.add(str63);
                            }
                        }
                    } else {
                        arrayList3 = EmptyList.f17557a;
                    }
                    ?? r40 = arrayList3;
                    ProductConfigServiceType.Companion companion2 = ProductConfigServiceType.INSTANCE;
                    List<String> list19 = unknownProductConfigApiResponseModel.v;
                    if (list19 != null) {
                        arrayList4 = new ArrayList();
                        for (String str64 : list19) {
                            if (str64 != null) {
                                arrayList4.add(str64);
                            }
                        }
                    } else {
                        arrayList4 = EmptyList.f17557a;
                    }
                    List listA4 = ProductConfigServiceType.Companion.a(companion2, arrayList4);
                    Boolean bool12 = unknownProductConfigApiResponseModel.w;
                    boolean zBooleanValue12 = bool12 != null ? bool12.booleanValue() : true;
                    String str65 = unknownProductConfigApiResponseModel.x;
                    Boolean bool13 = unknownProductConfigApiResponseModel.y;
                    boolean zBooleanValue13 = bool13 != null ? bool13.booleanValue() : true;
                    Boolean bool14 = unknownProductConfigApiResponseModel.z;
                    boolean zBooleanValue14 = bool14 != null ? bool14.booleanValue() : false;
                    Integer num11 = unknownProductConfigApiResponseModel.A;
                    int iIntValue9 = num11 != null ? num11.intValue() : -1;
                    Integer num12 = unknownProductConfigApiResponseModel.B;
                    int iIntValue10 = num12 != null ? num12.intValue() : -1;
                    Boolean bool15 = unknownProductConfigApiResponseModel.C;
                    return new ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel(str54, str5, str55, str56, str57, str58, str59, iIntValue8, str60, str6, str7, brandingDetails5, jLongValue8, jLongValue9, list16, unknownProductSubCategorySelectionResponseAppModel2, arrayList12, listC2, listA3, r40, listA4, zBooleanValue12, str65, zBooleanValue13, zBooleanValue14, iIntValue9, iIntValue10, bool15 != null ? bool15.booleanValue() : false);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static final UnknownProductCategoryResponseAppModel f(UnknownProductCategoryApiResponseModel unknownProductCategoryApiResponseModel) {
        ?? arrayList;
        String str = unknownProductCategoryApiResponseModel.f8619a;
        if (str == null) {
            return null;
        }
        String str2 = unknownProductCategoryApiResponseModel.b;
        Integer num = unknownProductCategoryApiResponseModel.c;
        int iIntValue = num != null ? num.intValue() : 0;
        List<String> list = unknownProductCategoryApiResponseModel.d;
        if (list != null) {
            arrayList = new ArrayList();
            for (String str3 : list) {
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        Integer num2 = unknownProductCategoryApiResponseModel.e;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Boolean bool = unknownProductCategoryApiResponseModel.f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = unknownProductCategoryApiResponseModel.g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String str4 = unknownProductCategoryApiResponseModel.h;
        Boolean bool3 = unknownProductCategoryApiResponseModel.i;
        String str5 = unknownProductCategoryApiResponseModel.j;
        Integer num3 = unknownProductCategoryApiResponseModel.k;
        int iIntValue3 = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
        String str6 = unknownProductCategoryApiResponseModel.l;
        Integer num4 = unknownProductCategoryApiResponseModel.m;
        int iIntValue4 = num4 != null ? num4.intValue() : -1;
        Integer num5 = unknownProductCategoryApiResponseModel.n;
        int iIntValue5 = num5 != null ? num5.intValue() : -1;
        String str7 = unknownProductCategoryApiResponseModel.o;
        Boolean bool4 = unknownProductCategoryApiResponseModel.p;
        return new UnknownProductCategoryResponseAppModel(str, str2, iIntValue, arrayList, iIntValue2, zBooleanValue, zBooleanValue2, str4, bool3, str5, iIntValue3, str6, iIntValue4, iIntValue5, str7, bool4 != null ? bool4.booleanValue() : true);
    }
}
