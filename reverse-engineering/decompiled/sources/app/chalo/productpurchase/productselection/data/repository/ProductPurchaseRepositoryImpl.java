package app.chalo.productpurchase.productselection.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDisplayPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropInfoApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDisplayPropsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigDocumentPropsAppModel;
import app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel;
import app.chalo.productpurchase.productselection.data.exceptions.AllProductsConfigInvalidResponseException;
import app.chalo.productpurchase.productselection.data.exceptions.MTicketFareFetchFailedException;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.productselection.data.models.api.AllProductConfigsApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketFareDataResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketFareResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketFareRouteStageResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareBreakdownResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketPassengerFareResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationPropsRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationUserDetailsRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassCashPaymentInfoRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.PassCashPaymentInfoResponseApiModel;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareDataResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareRouteStageResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareBreakdownResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.PassCashPaymentInfoResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.mappers.AllProductsConfigApiToAppMappersKt;
import app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.utils.CollectionUtilsKt;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/repository/ProductPurchaseRepositoryImpl;", "Lapp/chalo/productpurchase/productselection/data/repository/ProductPurchaseRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductPurchaseRepositoryImpl implements ProductPurchaseRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRemoteDataSource f8655a;
    public final ProductPurchaseLocalDataSource b;
    public final BasicInfoContract c;
    public final CityProvider d;
    public final TimeUtilsContract e;

    public ProductPurchaseRepositoryImpl(ProductPurchaseRemoteDataSource productPurchaseRemoteDataSource, ProductPurchaseLocalDataSource productPurchaseLocalDataSource, BasicInfoContract basicInfoContract, CityProvider cityProvider, TimeUtilsContract timeUtilsContract) {
        this.f8655a = productPurchaseRemoteDataSource;
        this.b = productPurchaseLocalDataSource;
        this.c = basicInfoContract;
        this.d = cityProvider;
        this.e = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object a(MTicketOrderCreationRequestApiModel mTicketOrderCreationRequestApiModel, ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$createMTicketOrder$1 productPurchaseRepositoryImpl$createMTicketOrder$1;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$createMTicketOrder$1) {
            productPurchaseRepositoryImpl$createMTicketOrder$1 = (ProductPurchaseRepositoryImpl$createMTicketOrder$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$createMTicketOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$createMTicketOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$createMTicketOrder$1 = new ProductPurchaseRepositoryImpl$createMTicketOrder$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$createMTicketOrder$1 = new ProductPurchaseRepositoryImpl$createMTicketOrder$1(this, continuationImpl);
        }
        Object objA = productPurchaseRepositoryImpl$createMTicketOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$createMTicketOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            productPurchaseRepositoryImpl$createMTicketOrder$1.label = 1;
            objA = this.f8655a.a(mTicketOrderCreationRequestApiModel, productPurchaseRepositoryImpl$createMTicketOrder$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objA);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, ContinuationImpl continuationImpl) throws MTicketFareFetchFailedException {
        ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1 productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1;
        MTicketFareResponseAppModel mTicketFareResponseAppModel;
        ?? arrayList;
        String str9;
        String str10;
        String str11;
        String str12;
        MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel;
        Double d;
        MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1) {
            productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1 = (ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1 = new ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1 = new ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1(this, continuationImpl);
        }
        ProductPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1 productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$2 = productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$1;
        Object objB = productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$2.label = 1;
            objB = this.f8655a.b(str, str2, str3, str4, str5, str6, str7, str8, list, productPurchaseRepositoryImpl$fetchMTicketFareBetweenStops$2);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        MTicketFareResponseApiModel mTicketFareResponseApiModel = (MTicketFareResponseApiModel) objB;
        Intrinsics.i(mTicketFareResponseApiModel, "<this>");
        MTicketFareDataResponseApiModel mTicketFareDataResponseApiModel = mTicketFareResponseApiModel.f8571a;
        if (mTicketFareDataResponseApiModel != null) {
            Double d2 = mTicketFareDataResponseApiModel.f8569a;
            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            Integer num = mTicketFareDataResponseApiModel.b;
            int iIntValue = num != null ? num.intValue() : 0;
            Map map = mTicketFareDataResponseApiModel.c;
            if (map != null) {
                arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str13 = (String) entry.getKey();
                    MTicketPassengerFareResponseApiModel mTicketPassengerFareResponseApiModel = (MTicketPassengerFareResponseApiModel) entry.getValue();
                    if (str13 == null || mTicketPassengerFareResponseApiModel == null || (d = mTicketPassengerFareResponseApiModel.f8583a) == null) {
                        mTicketPassengerFareResponseAppModel = null;
                    } else {
                        double dDoubleValue2 = d.doubleValue();
                        Double d3 = mTicketPassengerFareResponseApiModel.b;
                        Double d4 = mTicketPassengerFareResponseApiModel.c;
                        double dDoubleValue3 = d4 != null ? d4.doubleValue() : dDoubleValue;
                        MTicketPassengerFareBreakdownResponseApiModel mTicketPassengerFareBreakdownResponseApiModel = mTicketPassengerFareResponseApiModel.d;
                        if (mTicketPassengerFareBreakdownResponseApiModel != null) {
                            Map map2 = mTicketPassengerFareBreakdownResponseApiModel.f8581a;
                            Map mapA = map2 != null ? CollectionUtilsKt.a(map2) : MapsKt.d();
                            Map map3 = mTicketPassengerFareBreakdownResponseApiModel.b;
                            mTicketPassengerFareBreakdownResponseAppModel = new MTicketPassengerFareBreakdownResponseAppModel(mapA, map3 != null ? CollectionUtilsKt.a(map3) : MapsKt.d());
                        } else {
                            mTicketPassengerFareBreakdownResponseAppModel = null;
                        }
                        mTicketPassengerFareResponseAppModel = new MTicketPassengerFareResponseAppModel(str13, dDoubleValue2, d3, dDoubleValue3, mTicketPassengerFareBreakdownResponseAppModel);
                    }
                    if (mTicketPassengerFareResponseAppModel != null) {
                        arrayList.add(mTicketPassengerFareResponseAppModel);
                    }
                }
            } else {
                arrayList = EmptyList.f17557a;
            }
            MTicketFareDataResponseAppModel mTicketFareDataResponseAppModel = new MTicketFareDataResponseAppModel(dDoubleValue, iIntValue, arrayList);
            MTicketFareRouteStageResponseApiModel mTicketFareRouteStageResponseApiModel = mTicketFareResponseApiModel.b;
            mTicketFareResponseAppModel = new MTicketFareResponseAppModel(mTicketFareDataResponseAppModel, (mTicketFareRouteStageResponseApiModel == null || (str9 = mTicketFareRouteStageResponseApiModel.f8573a) == null || (str10 = mTicketFareRouteStageResponseApiModel.b) == null || (str11 = mTicketFareRouteStageResponseApiModel.c) == null || (str12 = mTicketFareRouteStageResponseApiModel.d) == null) ? null : new MTicketFareRouteStageResponseAppModel(str9, str10, str11, str12));
        } else {
            mTicketFareResponseAppModel = null;
        }
        if (mTicketFareResponseAppModel != null) {
            return mTicketFareResponseAppModel;
        }
        throw new MTicketFareFetchFailedException(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object c(CreateSuperPassOrderRequestApiModel createSuperPassOrderRequestApiModel, String str, ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$createSuperPassOrder$1 productPurchaseRepositoryImpl$createSuperPassOrder$1;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$createSuperPassOrder$1) {
            productPurchaseRepositoryImpl$createSuperPassOrder$1 = (ProductPurchaseRepositoryImpl$createSuperPassOrder$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$createSuperPassOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$createSuperPassOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$createSuperPassOrder$1 = new ProductPurchaseRepositoryImpl$createSuperPassOrder$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$createSuperPassOrder$1 = new ProductPurchaseRepositoryImpl$createSuperPassOrder$1(this, continuationImpl);
        }
        Object objC = productPurchaseRepositoryImpl$createSuperPassOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$createSuperPassOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            productPurchaseRepositoryImpl$createSuperPassOrder$1.label = 1;
            objC = this.f8655a.c(createSuperPassOrderRequestApiModel, str, productPurchaseRepositoryImpl$createSuperPassOrder$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object d(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$getProofDocuments$1 productPurchaseRepositoryImpl$getProofDocuments$1;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$getProofDocuments$1) {
            productPurchaseRepositoryImpl$getProofDocuments$1 = (ProductPurchaseRepositoryImpl$getProofDocuments$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$getProofDocuments$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$getProofDocuments$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$getProofDocuments$1 = new ProductPurchaseRepositoryImpl$getProofDocuments$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$getProofDocuments$1 = new ProductPurchaseRepositoryImpl$getProofDocuments$1(this, continuationImpl);
        }
        Object objD = productPurchaseRepositoryImpl$getProofDocuments$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$getProofDocuments$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            productPurchaseRepositoryImpl$getProofDocuments$1.label = 1;
            objD = this.b.d(str, str2, str3, productPurchaseRepositoryImpl$getProofDocuments$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel = (ProductConfigDocumentPropsApiResponseModel) objD;
        if (productConfigDocumentPropsApiResponseModel == null) {
            return null;
        }
        String str10 = productConfigDocumentPropsApiResponseModel.c;
        String str11 = str10 == null ? "" : str10;
        ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel = productConfigDocumentPropsApiResponseModel.d;
        return new ProofDocumentProps(str11, (productConfigDocumentPropInfoApiResponseModel == null || (str9 = productConfigDocumentPropInfoApiResponseModel.f8157a) == null) ? "" : str9, (productConfigDocumentPropInfoApiResponseModel == null || (str8 = productConfigDocumentPropInfoApiResponseModel.e) == null) ? "" : str8, (productConfigDocumentPropInfoApiResponseModel == null || (str7 = productConfigDocumentPropInfoApiResponseModel.c) == null) ? "" : str7, (productConfigDocumentPropInfoApiResponseModel == null || (str6 = productConfigDocumentPropInfoApiResponseModel.g) == null) ? "" : str6, (productConfigDocumentPropInfoApiResponseModel == null || (str5 = productConfigDocumentPropInfoApiResponseModel.b) == null) ? "" : str5, (productConfigDocumentPropInfoApiResponseModel == null || (str4 = productConfigDocumentPropInfoApiResponseModel.f) == null) ? "" : str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Serializable e(ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$getAllProductConfigOffline$1 productPurchaseRepositoryImpl$getAllProductConfigOffline$1;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$getAllProductConfigOffline$1) {
            productPurchaseRepositoryImpl$getAllProductConfigOffline$1 = (ProductPurchaseRepositoryImpl$getAllProductConfigOffline$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$getAllProductConfigOffline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$getAllProductConfigOffline$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$getAllProductConfigOffline$1 = new ProductPurchaseRepositoryImpl$getAllProductConfigOffline$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$getAllProductConfigOffline$1 = new ProductPurchaseRepositoryImpl$getAllProductConfigOffline$1(this, continuationImpl);
        }
        Object objE = productPurchaseRepositoryImpl$getAllProductConfigOffline$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$getAllProductConfigOffline$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            productPurchaseRepositoryImpl$getAllProductConfigOffline$1.label = 1;
            objE = this.b.e(productPurchaseRepositoryImpl$getAllProductConfigOffline$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        List list = (List) objE;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductConfigResponseAppModel productConfigResponseAppModelE = AllProductsConfigApiToAppMappersKt.e((ProductConfigApiResponseModel) it.next());
            if (productConfigResponseAppModelE != null) {
                arrayList.add(productConfigResponseAppModelE);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object f(int i, String str, ContinuationImpl continuationImpl, boolean z) throws AllProductsConfigInvalidResponseException {
        ProductPurchaseRepositoryImpl$fetchAllProductsConfig$1 productPurchaseRepositoryImpl$fetchAllProductsConfig$1;
        ?? arrayList;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$fetchAllProductsConfig$1) {
            productPurchaseRepositoryImpl$fetchAllProductsConfig$1 = (ProductPurchaseRepositoryImpl$fetchAllProductsConfig$1) continuationImpl;
            int i2 = productPurchaseRepositoryImpl$fetchAllProductsConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$fetchAllProductsConfig$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$fetchAllProductsConfig$1 = new ProductPurchaseRepositoryImpl$fetchAllProductsConfig$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$fetchAllProductsConfig$1 = new ProductPurchaseRepositoryImpl$fetchAllProductsConfig$1(this, continuationImpl);
        }
        Object objF = productPurchaseRepositoryImpl$fetchAllProductsConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productPurchaseRepositoryImpl$fetchAllProductsConfig$1.label;
        if (i3 == 0) {
            ResultKt.b(objF);
            productPurchaseRepositoryImpl$fetchAllProductsConfig$1.label = 1;
            objF = this.f8655a.f(i, str, productPurchaseRepositoryImpl$fetchAllProductsConfig$1, z);
            if (objF != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AllProductConfigsResponseAppModel allProductConfigsResponseAppModel = (AllProductConfigsResponseAppModel) productPurchaseRepositoryImpl$fetchAllProductsConfig$1.L$0;
            ResultKt.b(objF);
            return allProductConfigsResponseAppModel;
        }
        ResultKt.b(objF);
        AllProductConfigsApiResponseModel allProductConfigsApiResponseModel = (AllProductConfigsApiResponseModel) objF;
        Intrinsics.i(allProductConfigsApiResponseModel, "<this>");
        List list = allProductConfigsApiResponseModel.f8557a;
        if (list == null) {
            throw new AllProductsConfigInvalidResponseException("Products list is null");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductConfigResponseAppModel productConfigResponseAppModelE = AllProductsConfigApiToAppMappersKt.e((ProductConfigApiResponseModel) it.next());
            if (productConfigResponseAppModelE != null) {
                arrayList2.add(productConfigResponseAppModelE);
            }
        }
        List list2 = allProductConfigsApiResponseModel.b;
        if (list2 == null) {
            throw new AllProductsConfigInvalidResponseException("Display props list is null");
        }
        List<ProductConfigDisplayPropsApiResponseModel> list3 = list2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list3, 10));
        for (ProductConfigDisplayPropsApiResponseModel productConfigDisplayPropsApiResponseModel : list3) {
            Intrinsics.i(productConfigDisplayPropsApiResponseModel, "<this>");
            arrayList3.add(new ProductConfigDisplayPropsAppModel(productConfigDisplayPropsApiResponseModel.c, productConfigDisplayPropsApiResponseModel.f8155a, productConfigDisplayPropsApiResponseModel.b));
        }
        List list4 = allProductConfigsApiResponseModel.c;
        if (list4 != null) {
            List<ProductConfigDocumentPropsApiResponseModel> list5 = list4;
            arrayList = new ArrayList(CollectionsKt.v(list5, 10));
            for (ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel : list5) {
                Intrinsics.i(productConfigDocumentPropsApiResponseModel, "<this>");
                arrayList.add(new ProductConfigDocumentPropsAppModel(productConfigDocumentPropsApiResponseModel.f8159a, productConfigDocumentPropsApiResponseModel.b, productConfigDocumentPropsApiResponseModel.c, productConfigDocumentPropsApiResponseModel.d));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel2 = new AllProductConfigsResponseAppModel(arrayList2, arrayList3, arrayList);
        productPurchaseRepositoryImpl$fetchAllProductsConfig$1.L$0 = allProductConfigsResponseAppModel2;
        productPurchaseRepositoryImpl$fetchAllProductsConfig$1.label = 2;
        return this.b.g(allProductConfigsApiResponseModel, productPurchaseRepositoryImpl$fetchAllProductsConfig$1) == coroutineSingletons ? coroutineSingletons : allProductConfigsResponseAppModel2;
    }

    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object g(SuperPassUserDetails superPassUserDetails, BookableSuperPassConfiguration bookableSuperPassConfiguration, long j, Map map, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, Boolean bool, Continuation continuation) {
        String strB = CityProviderKt.b(this.d);
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        BasicInfoContract basicInfoContract = this.c;
        int iH = basicInfoContract.h();
        String deviceId = basicInfoContract.getDeviceId();
        Intrinsics.i(superPassUserDetails, "<this>");
        PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel = new PassApplicationUserDetailsRequestApiModel(superPassUserDetails.a(this.e), superPassUserDetails.f, superPassUserDetails.b, superPassUserDetails.c, superPassUserDetails.d.get_value(), superPassUserDetails.e, superPassUserDetails.f9580a);
        String str2 = bookableSuperPassConfiguration.d.f8639a;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
        return this.f8655a.e(str, new PassApplicationSubmissionRequestApiModel(str, iH, deviceId, passApplicationUserDetailsRequestApiModel, new PassApplicationPropsRequestApiModel(j, str2, superPassProductConfigFareMappingResponseAppModel.b, bookableSuperPassConfiguration.f5569a, superPassProductConfigFareMappingResponseAppModel.o.f8646a, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.b : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.f5665a : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.d : null, superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.c : null), map, bool), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object h(String str, ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$getProductConfigOffline$1 productPurchaseRepositoryImpl$getProductConfigOffline$1;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$getProductConfigOffline$1) {
            productPurchaseRepositoryImpl$getProductConfigOffline$1 = (ProductPurchaseRepositoryImpl$getProductConfigOffline$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$getProductConfigOffline$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$getProductConfigOffline$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$getProductConfigOffline$1 = new ProductPurchaseRepositoryImpl$getProductConfigOffline$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$getProductConfigOffline$1 = new ProductPurchaseRepositoryImpl$getProductConfigOffline$1(this, continuationImpl);
        }
        Object objF = productPurchaseRepositoryImpl$getProductConfigOffline$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$getProductConfigOffline$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            productPurchaseRepositoryImpl$getProductConfigOffline$1.label = 1;
            objF = this.b.f(str, productPurchaseRepositoryImpl$getProductConfigOffline$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        ProductConfigApiResponseModel productConfigApiResponseModel = (ProductConfigApiResponseModel) objF;
        if (productConfigApiResponseModel != null) {
            return AllProductsConfigApiToAppMappersKt.e(productConfigApiResponseModel);
        }
        return null;
    }

    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object i(String str, String str2, String str3, Continuation continuation) {
        return this.f8655a.d(str, str2, str3, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository
    public final Object j(String str, String str2, ContinuationImpl continuationImpl) {
        ProductPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1 productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1;
        if (continuationImpl instanceof ProductPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1) {
            productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1 = (ProductPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1) continuationImpl;
            int i = productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1 = new ProductPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1(this, continuationImpl);
            }
        } else {
            productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1 = new ProductPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1(this, continuationImpl);
        }
        Object objG = productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            String strValueOf = String.valueOf(CityProviderKt.b(this.d));
            BasicInfoContract basicInfoContract = this.c;
            PassCashPaymentInfoRequestApiModel passCashPaymentInfoRequestApiModel = new PassCashPaymentInfoRequestApiModel(basicInfoContract.h(), str2, str, strValueOf, basicInfoContract.getDeviceId());
            productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1.label = 1;
            objG = this.f8655a.g(passCashPaymentInfoRequestApiModel, productPurchaseRepositoryImpl$fetchPassCashPaymentInfo$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        PassCashPaymentInfoResponseApiModel passCashPaymentInfoResponseApiModel = (PassCashPaymentInfoResponseApiModel) objG;
        Intrinsics.i(passCashPaymentInfoResponseApiModel, "<this>");
        String str3 = passCashPaymentInfoResponseApiModel.f8595a;
        if (str3 == null) {
            throw new IllegalArgumentException("userId not present");
        }
        String str4 = passCashPaymentInfoResponseApiModel.b;
        if (str4 == null) {
            throw new IllegalArgumentException("reference not present");
        }
        Double d = passCashPaymentInfoResponseApiModel.c;
        if (d != null) {
            return new PassCashPaymentInfoResponseAppModel(d.doubleValue(), str3, str4);
        }
        throw new IllegalArgumentException("amount not present");
    }
}
