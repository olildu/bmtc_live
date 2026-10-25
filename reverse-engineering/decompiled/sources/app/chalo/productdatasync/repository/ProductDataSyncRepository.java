package app.chalo.productdatasync.repository;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.features.productsync.model.api.BookingHistoryDataApiModel;
import app.chalo.features.productsync.model.api.BookingHistoryDataApiModelKt;
import app.chalo.features.productsync.model.api.HistoryResponseApiModel;
import app.chalo.features.productsync.model.api.PassType;
import app.chalo.features.productsync.model.api.PropertiesApiModel;
import app.chalo.features.productsync.model.app.BookingHistoryDataAppModel;
import app.chalo.features.productsync.model.app.HistoryResponseAppModel;
import app.chalo.features.productsync.model.app.PropertiesAppModel;
import app.chalo.home.data.model.api.request.AutoLinkDeviceIdRequestApiModel;
import app.chalo.home.data.model.api.response.AutoLinkDeviceIdResponseApiModel;
import app.chalo.home.data.model.app.request.AutoLinkDeviceIdRequestAppModel;
import app.chalo.home.data.model.app.response.AutoLinkDeviceIdResponseAppModel;
import app.chalo.productdatasync.repository.remote.IProductDataSyncRemoteDataSource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productdatasync/repository/ProductDataSyncRepository;", "Lapp/chalo/productdatasync/repository/IProductDataSyncRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductDataSyncRepository implements IProductDataSyncRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IProductDataSyncRemoteDataSource f8314a;

    public ProductDataSyncRepository(IProductDataSyncRemoteDataSource iProductDataSyncRemoteDataSource) {
        this.f8314a = iProductDataSyncRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.productdatasync.repository.IProductDataSyncRepository
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) throws JsonException {
        ProductDataSyncRepository$initiateProductDataSyncCall$1 productDataSyncRepository$initiateProductDataSyncCall$1;
        PassType passType;
        if (continuationImpl instanceof ProductDataSyncRepository$initiateProductDataSyncCall$1) {
            productDataSyncRepository$initiateProductDataSyncCall$1 = (ProductDataSyncRepository$initiateProductDataSyncCall$1) continuationImpl;
            int i = productDataSyncRepository$initiateProductDataSyncCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDataSyncRepository$initiateProductDataSyncCall$1.label = i - Integer.MIN_VALUE;
            } else {
                productDataSyncRepository$initiateProductDataSyncCall$1 = new ProductDataSyncRepository$initiateProductDataSyncCall$1(this, continuationImpl);
            }
        } else {
            productDataSyncRepository$initiateProductDataSyncCall$1 = new ProductDataSyncRepository$initiateProductDataSyncCall$1(this, continuationImpl);
        }
        Object objA = productDataSyncRepository$initiateProductDataSyncCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productDataSyncRepository$initiateProductDataSyncCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            productDataSyncRepository$initiateProductDataSyncCall$1.label = 1;
            objA = this.f8314a.a(str, productDataSyncRepository$initiateProductDataSyncCall$1, z);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        HistoryResponseApiModel historyResponseApiModel = (HistoryResponseApiModel) objA;
        Intrinsics.i(historyResponseApiModel, "<this>");
        PropertiesApiModel propertiesApiModel = historyResponseApiModel.f2748a;
        Intrinsics.i(propertiesApiModel, "<this>");
        PropertiesAppModel propertiesAppModel = new PropertiesAppModel(propertiesApiModel.f2750a);
        String str2 = historyResponseApiModel.c;
        BookingHistoryDataApiModel bookingHistoryDataApiModel = historyResponseApiModel.b;
        Intrinsics.i(bookingHistoryDataApiModel, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        JsonArray jsonArray = bookingHistoryDataApiModel.b;
        String str3 = "productType";
        if (jsonArray != null) {
            int size = jsonArray.f18186a.size();
            for (int i3 = 0; i3 < size; i3++) {
                JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArray, i3);
                if (Intrinsics.d(JsonElementExtensionsKt.s(jsonObjectF, "productType", ""), "superPass")) {
                    String strS = JsonElementExtensionsKt.s(jsonObjectF, "status", "");
                    try {
                        try {
                            SuperPassApplicationStatus.valueOf(strS);
                            passType = PassType.PASS_APPLICATION;
                        } catch (Exception unused) {
                            switch (BookingHistoryDataApiModelKt.WhenMappings.b[SuperPassStatus.valueOf(strS).ordinal()]) {
                                case 1:
                                case 2:
                                    passType = PassType.PENDING_SUPER_PASS;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                    passType = PassType.BOOKED_PASS;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    } catch (Exception unused2) {
                        passType = PassType.UNKNOWN_OR_INVALID;
                    }
                    int i4 = BookingHistoryDataApiModelKt.WhenMappings.f2747a[passType.ordinal()];
                    if (i4 == 1) {
                        arrayList.add(jsonObjectF);
                    } else if (i4 == 2) {
                        arrayList2.add(jsonObjectF);
                    } else if (i4 == 3) {
                        arrayList3.add(jsonObjectF);
                    } else if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        JsonArray jsonArray2 = bookingHistoryDataApiModel.d;
        if (jsonArray2 != null) {
            int size2 = jsonArray2.f18186a.size();
            int i5 = 0;
            while (i5 < size2) {
                JsonObject jsonObjectF2 = JsonElementExtensionsKt.f(jsonArray2, i5);
                String strS2 = JsonElementExtensionsKt.s(jsonObjectF2, str3, "");
                String strS3 = JsonElementExtensionsKt.s(jsonObjectF2, "productSubType", "");
                String str4 = str3;
                if (Intrinsics.d(strS2, "mobileTicket") && CollectionsKt.w(CollectionsKt.S("instantTicket", "premiumReserveTicket", "ondcTicket", "ondcMetroTicket", "metroTicket", "multiModalTicket"), strS3)) {
                    arrayList4.add(jsonObjectF2);
                } else if (JsonElementExtensionsKt.s(jsonObjectF2, "rideType", "").length() > 0) {
                    arrayList5.add(jsonObjectF2);
                }
                i5++;
                str3 = str4;
            }
        }
        JsonArray jsonArray3 = new JsonArray(arrayList);
        JsonArray jsonArray4 = new JsonArray(arrayList2);
        JsonArray jsonArray5 = new JsonArray(arrayList3);
        JsonArray jsonArray6 = new JsonArray(arrayList4);
        JsonArray jsonArray7 = new JsonArray(arrayList5);
        JsonObject jsonObject = bookingHistoryDataApiModel.f2745a;
        JsonArray jsonArray8 = bookingHistoryDataApiModel.c;
        JsonArray jsonArray9 = bookingHistoryDataApiModel.e;
        if (jsonArray9 == null) {
            jsonArray9 = new JsonArray(EmptyList.f17557a);
        }
        return new HistoryResponseAppModel(propertiesAppModel, new BookingHistoryDataAppModel(jsonArray3, jsonArray4, jsonArray5, jsonArray6, jsonArray7, jsonObject, jsonArray8, jsonArray9), str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productdatasync.repository.IProductDataSyncRepository
    public final Object b(AutoLinkDeviceIdRequestAppModel autoLinkDeviceIdRequestAppModel, ContinuationImpl continuationImpl) {
        ProductDataSyncRepository$autoLinkDeviceId$1 productDataSyncRepository$autoLinkDeviceId$1;
        if (continuationImpl instanceof ProductDataSyncRepository$autoLinkDeviceId$1) {
            productDataSyncRepository$autoLinkDeviceId$1 = (ProductDataSyncRepository$autoLinkDeviceId$1) continuationImpl;
            int i = productDataSyncRepository$autoLinkDeviceId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDataSyncRepository$autoLinkDeviceId$1.label = i - Integer.MIN_VALUE;
            } else {
                productDataSyncRepository$autoLinkDeviceId$1 = new ProductDataSyncRepository$autoLinkDeviceId$1(this, continuationImpl);
            }
        } else {
            productDataSyncRepository$autoLinkDeviceId$1 = new ProductDataSyncRepository$autoLinkDeviceId$1(this, continuationImpl);
        }
        Object objB = productDataSyncRepository$autoLinkDeviceId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productDataSyncRepository$autoLinkDeviceId$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(autoLinkDeviceIdRequestAppModel, "<this>");
            AutoLinkDeviceIdRequestApiModel autoLinkDeviceIdRequestApiModel = new AutoLinkDeviceIdRequestApiModel(autoLinkDeviceIdRequestAppModel.f2948a, autoLinkDeviceIdRequestAppModel.b);
            productDataSyncRepository$autoLinkDeviceId$1.label = 1;
            objB = this.f8314a.b(autoLinkDeviceIdRequestApiModel, productDataSyncRepository$autoLinkDeviceId$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        AutoLinkDeviceIdResponseApiModel autoLinkDeviceIdResponseApiModel = (AutoLinkDeviceIdResponseApiModel) objB;
        Intrinsics.i(autoLinkDeviceIdResponseApiModel, "<this>");
        Boolean bool = autoLinkDeviceIdResponseApiModel.f2916a;
        return new AutoLinkDeviceIdResponseAppModel(bool != null ? bool.booleanValue() : false);
    }
}
