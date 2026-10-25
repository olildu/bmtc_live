package app.chalo.productpurchase.utils;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingGroupAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.mappers.AllProductsConfigApiToAppMappersKt;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import defpackage.n4;
import defpackage.vb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/utils/BookingHelper;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8703a;
    public final ProductPurchaseLocalDataSource b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/utils/BookingHelper$Companion;", "", "", "URI_PRODUCT", "Ljava/lang/String;", "URI_FARES", "URI_PRODUCT_ID", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BookingHelper(ProductPurchaseRepository productPurchaseRepository, ProductPurchaseLocalDataSource productPurchaseLocalDataSource) {
        this.f8703a = productPurchaseRepository;
        this.b = productPurchaseLocalDataSource;
    }

    public static Map b(String str, Map lMasterBookableSuperPassConfigMap) {
        Intrinsics.i(lMasterBookableSuperPassConfigMap, "lMasterBookableSuperPassConfigMap");
        if (str == null || str.length() == 0) {
            return lMasterBookableSuperPassConfigMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : lMasterBookableSuperPassConfigMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                BookableSuperPassConfiguration bookableSuperPassConfiguration = (BookableSuperPassConfiguration) entry2.getValue();
                SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel = bookableSuperPassConfiguration.e;
                if (str.equals(superPassProductConfigSubCategoryResponseAppModel != null ? superPassProductConfigSubCategoryResponseAppModel.f8644a : null)) {
                    linkedHashMap2.put(Integer.valueOf(iIntValue), bookableSuperPassConfiguration);
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                linkedHashMap.put(str2, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public static HashMap c(ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2 = superPassConfigAppModel.t;
        ArrayList arrayList3 = superPassConfigAppModel.u;
        HashMap map = new HashMap();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel = (SuperPassProductConfigCategoryResponseAppModel) obj2;
            String str = superPassProductConfigCategoryResponseAppModel.f8639a;
            int size2 = arrayList3.size();
            int i2 = 0;
            do {
                if (i2 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i2);
                i2++;
            } while (!Intrinsics.d(((SuperPassProductConfigFareMappingGroupAppModel) obj).f8641a, str));
            SuperPassProductConfigFareMappingGroupAppModel superPassProductConfigFareMappingGroupAppModel = (SuperPassProductConfigFareMappingGroupAppModel) obj;
            ArrayList arrayList4 = superPassProductConfigFareMappingGroupAppModel != null ? superPassProductConfigFareMappingGroupAppModel.b : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (arrayList4 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                int size3 = arrayList4.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList4.get(i3);
                    i3++;
                    SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = (SuperPassProductConfigFareMappingResponseAppModel) obj3;
                    if (superPassProductConfigFareMappingResponseAppModel.e) {
                        arrayList.add(superPassProductConfigFareMappingResponseAppModel);
                    }
                }
                CollectionsKt.t0(arrayList, new vb(new n4(superPassProductConfigCategoryResponseAppModel, 2), 0));
            }
            if (arrayList4 != null) {
                int i4 = 0;
                for (int size4 = arrayList.size(); i4 < size4; size4 = size4) {
                    int i5 = i4 + 1;
                    SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel2 = (SuperPassProductConfigFareMappingResponseAppModel) arrayList.get(i4);
                    SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModelD = d(superPassProductConfigFareMappingResponseAppModel2.d, superPassConfigAppModel.E);
                    List list = superPassProductConfigFareMappingResponseAppModel2.q;
                    if (list.isEmpty()) {
                        list = superPassProductConfigCategoryResponseAppModel.d;
                    }
                    List list2 = list;
                    SuperPassProductConfigurationProperties.INSTANCE.getClass();
                    linkedHashMap.put(Integer.valueOf(superPassProductConfigFareMappingResponseAppModel2.b), new BookableSuperPassConfiguration(superPassConfigAppModel.j, SuperPassProductConfigurationProperties.Companion.a(superPassConfigAppModel), superPassProductConfigFareMappingResponseAppModel2, superPassProductConfigCategoryResponseAppModel, superPassProductConfigSubCategoryResponseAppModelD, list2));
                    i4 = i5;
                    arrayList = arrayList;
                }
            }
            map.put(str, linkedHashMap);
        }
        return map;
    }

    public static SuperPassProductConfigSubCategoryResponseAppModel d(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((SuperPassProductConfigSubCategoryResponseAppModel) next).f8644a, str)) {
                return (SuperPassProductConfigSubCategoryResponseAppModel) next;
            }
        }
        next = null;
        return (SuperPassProductConfigSubCategoryResponseAppModel) next;
    }

    public static LinkedHashMap e(ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (superPassConfigAppModel != null) {
            List<SuperPassProductConfigSubCategoryResponseAppModel> list = superPassConfigAppModel.E;
            if (!list.isEmpty()) {
                for (SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel : list) {
                    if (superPassProductConfigSubCategoryResponseAppModel.e) {
                        linkedHashMap.put(superPassProductConfigSubCategoryResponseAppModel.f8644a, superPassProductConfigSubCategoryResponseAppModel);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SuperPassApplication superPassApplication, ContinuationImpl continuationImpl) {
        BookingHelper$getBookablePassConfigFromSuperPassApplication$1 bookingHelper$getBookablePassConfigFromSuperPassApplication$1;
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModelD;
        Object obj;
        SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel;
        Object obj2;
        Object obj3;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        if (continuationImpl instanceof BookingHelper$getBookablePassConfigFromSuperPassApplication$1) {
            bookingHelper$getBookablePassConfigFromSuperPassApplication$1 = (BookingHelper$getBookablePassConfigFromSuperPassApplication$1) continuationImpl;
            int i = bookingHelper$getBookablePassConfigFromSuperPassApplication$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelper$getBookablePassConfigFromSuperPassApplication$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelper$getBookablePassConfigFromSuperPassApplication$1 = new BookingHelper$getBookablePassConfigFromSuperPassApplication$1(this, continuationImpl);
            }
        } else {
            bookingHelper$getBookablePassConfigFromSuperPassApplication$1 = new BookingHelper$getBookablePassConfigFromSuperPassApplication$1(this, continuationImpl);
        }
        Object objF = bookingHelper$getBookablePassConfigFromSuperPassApplication$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelper$getBookablePassConfigFromSuperPassApplication$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            String str = superPassApplication.c;
            bookingHelper$getBookablePassConfigFromSuperPassApplication$1.L$0 = superPassApplication;
            bookingHelper$getBookablePassConfigFromSuperPassApplication$1.label = 1;
            objF = this.b.f(str, bookingHelper$getBookablePassConfigFromSuperPassApplication$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassApplication = (SuperPassApplication) bookingHelper$getBookablePassConfigFromSuperPassApplication$1.L$0;
            ResultKt.b(objF);
        }
        ProductConfigApiResponseModel productConfigApiResponseModel = (ProductConfigApiResponseModel) objF;
        if (productConfigApiResponseModel != null) {
            ProductConfigApiResponseModel.SuperPassConfigApiResponseModel superPassConfigApiResponseModel = productConfigApiResponseModel instanceof ProductConfigApiResponseModel.SuperPassConfigApiResponseModel ? (ProductConfigApiResponseModel.SuperPassConfigApiResponseModel) productConfigApiResponseModel : null;
            if (superPassConfigApiResponseModel != null && (superPassConfigAppModelD = AllProductsConfigApiToAppMappersKt.d(superPassConfigApiResponseModel)) != null) {
                SuperPassProductConfigurationProperties.INSTANCE.getClass();
                SuperPassProductConfigurationProperties superPassProductConfigurationPropertiesA = SuperPassProductConfigurationProperties.Companion.a(superPassConfigAppModelD);
                ArrayList arrayList = superPassConfigAppModelD.t;
                String str2 = superPassApplication.d;
                int i3 = 0;
                if (arrayList.isEmpty()) {
                    superPassProductConfigCategoryResponseAppModel = null;
                } else {
                    int size = arrayList.size();
                    int i4 = 0;
                    do {
                        if (i4 >= size) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i4);
                        i4++;
                    } while (!StringsKt.x(((SuperPassProductConfigCategoryResponseAppModel) obj).f8639a, str2, true));
                    superPassProductConfigCategoryResponseAppModel = (SuperPassProductConfigCategoryResponseAppModel) obj;
                }
                if (superPassProductConfigCategoryResponseAppModel != null) {
                    ArrayList arrayList2 = superPassConfigAppModelD.u;
                    String str3 = superPassApplication.d;
                    int i5 = superPassApplication.e;
                    if (arrayList2.isEmpty()) {
                        superPassProductConfigFareMappingResponseAppModel = null;
                    } else {
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        do {
                            if (i6 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList2.get(i6);
                            i6++;
                        } while (!Intrinsics.d(((SuperPassProductConfigFareMappingGroupAppModel) obj2).f8641a, str3));
                        SuperPassProductConfigFareMappingGroupAppModel superPassProductConfigFareMappingGroupAppModel = (SuperPassProductConfigFareMappingGroupAppModel) obj2;
                        if (superPassProductConfigFareMappingGroupAppModel == null) {
                            superPassProductConfigFareMappingResponseAppModel = null;
                        } else {
                            ArrayList arrayList3 = superPassProductConfigFareMappingGroupAppModel.b;
                            int size3 = arrayList3.size();
                            do {
                                if (i3 >= size3) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = arrayList3.get(i3);
                                i3++;
                            } while (((SuperPassProductConfigFareMappingResponseAppModel) obj3).b != i5);
                            superPassProductConfigFareMappingResponseAppModel = (SuperPassProductConfigFareMappingResponseAppModel) obj3;
                        }
                    }
                    if (superPassProductConfigFareMappingResponseAppModel != null) {
                        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModelD = d(superPassProductConfigFareMappingResponseAppModel.d, superPassConfigAppModelD.E);
                        List list = superPassProductConfigFareMappingResponseAppModel.q;
                        if (list.isEmpty()) {
                            list = superPassProductConfigCategoryResponseAppModel.d;
                        }
                        return new BookableSuperPassConfiguration(superPassApplication.c, superPassProductConfigurationPropertiesA, superPassProductConfigFareMappingResponseAppModel, superPassProductConfigCategoryResponseAppModel, superPassProductConfigSubCategoryResponseAppModelD, list);
                    }
                }
            }
        }
        return null;
    }
}
