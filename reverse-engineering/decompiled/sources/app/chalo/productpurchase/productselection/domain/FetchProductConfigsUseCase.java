package app.chalo.productpurchase.productselection.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.FareInfo;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.productpurchase.productselection.data.exceptions.AllProductsConfigFetchFailedException;
import app.chalo.productpurchase.productselection.data.exceptions.AllProductsConfigInvalidResponseException;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/FetchProductConfigsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchProductConfigsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8657a;
    public final CityProvider b;
    public final BasicInfoContract c;
    public final GetPremiumBusCurrentCityConfigUseCase d;
    public final ProductBookingDataStore e;

    public FetchProductConfigsUseCase(ProductPurchaseRepository productPurchaseRepository, CityProvider cityProvider, BasicInfoContract basicInfoContract, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, ProductBookingDataStore productBookingDataStore) {
        this.f8657a = productPurchaseRepository;
        this.b = cityProvider;
        this.c = basicInfoContract;
        this.d = getPremiumBusCurrentCityConfigUseCase;
        this.e = productBookingDataStore;
    }

    public static boolean b(ProductConfigResponseAppModel productConfigResponseAppModel) {
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            String str = ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).l;
            if (!Intrinsics.d(str, "rideBasedPass") && !Intrinsics.d(str, "magicPass")) {
                return false;
            }
        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) {
            ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel instantTicketConfigResponseAppModel = (ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) productConfigResponseAppModel;
            if (!Intrinsics.d(instantTicketConfigResponseAppModel.p, "mobileTicket") || !Intrinsics.d(instantTicketConfigResponseAppModel.q, "instantTicket")) {
                return false;
            }
        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) {
            ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel groupTicketConfigResponseAppModel = (ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) productConfigResponseAppModel;
            if (!Intrinsics.d(groupTicketConfigResponseAppModel.q, "mobileTicket") || !Intrinsics.d(groupTicketConfigResponseAppModel.r, "multiModalTicket")) {
                return false;
            }
        } else {
            if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) {
                return Intrinsics.d(((ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) productConfigResponseAppModel).k, "quickpay");
            }
            if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel)) {
                if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel)) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel;
            if (!Intrinsics.d(singleJourneyTicketAppModel.r, "singleJourneyTicket") || !Intrinsics.d(singleJourneyTicketAppModel.s, "singleJourneyTicket")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[Catch: Exception -> 0x0032, NetworkSuccessResponseParseException -> 0x0035, ChaloLocalException -> 0x0038, AllProductsConfigInvalidResponseException -> 0x003b, AllProductsConfigFetchFailedException -> 0x003e, TryCatch #2 {ChaloLocalException -> 0x0038, NetworkSuccessResponseParseException -> 0x0035, AllProductsConfigFetchFailedException -> 0x003e, AllProductsConfigInvalidResponseException -> 0x003b, Exception -> 0x0032, blocks: (B:14:0x002d, B:55:0x00dd, B:28:0x0049, B:45:0x00a7, B:46:0x00b6, B:48:0x00bc, B:50:0x00c9, B:51:0x00cd, B:31:0x0059, B:42:0x0093, B:38:0x0071), top: B:63:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchProductConfigsUseCase$invoke$1 fetchProductConfigsUseCase$invoke$1;
        int iH;
        ProductPurchaseRepository productPurchaseRepository;
        String lowerCase;
        int i;
        ArrayList arrayList;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModelA;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel;
        if (continuationImpl instanceof FetchProductConfigsUseCase$invoke$1) {
            fetchProductConfigsUseCase$invoke$1 = (FetchProductConfigsUseCase$invoke$1) continuationImpl;
            int i2 = fetchProductConfigsUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchProductConfigsUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                fetchProductConfigsUseCase$invoke$1 = new FetchProductConfigsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchProductConfigsUseCase$invoke$1 = new FetchProductConfigsUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchProductConfigsUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = fetchProductConfigsUseCase$invoke$1.label;
        try {
            if (i3 == 0) {
                ResultKt.b(objA);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return ProductFetchResult.InvalidCity.f8661a;
                }
                iH = this.c.h();
                productPurchaseRepository = this.f8657a;
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase = this.d;
                fetchProductConfigsUseCase$invoke$1.L$0 = productPurchaseRepository;
                fetchProductConfigsUseCase$invoke$1.L$1 = lowerCase;
                fetchProductConfigsUseCase$invoke$1.I$0 = iH;
                fetchProductConfigsUseCase$invoke$1.I$1 = iH;
                fetchProductConfigsUseCase$invoke$1.label = 1;
                objA = getPremiumBusCurrentCityConfigUseCase.a(fetchProductConfigsUseCase$invoke$1);
                if (objA != obj) {
                    i = iH;
                }
                return obj;
            }
            if (i3 == 1) {
                iH = fetchProductConfigsUseCase$invoke$1.I$1;
                i = fetchProductConfigsUseCase$invoke$1.I$0;
                lowerCase = (String) fetchProductConfigsUseCase$invoke$1.L$1;
                productPurchaseRepository = (ProductPurchaseRepository) fetchProductConfigsUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            } else {
                if (i3 == 2) {
                    ResultKt.b(objA);
                    AllProductConfigsResponseAppModel allProductConfigsResponseAppModel2 = (AllProductConfigsResponseAppModel) objA;
                    List list = allProductConfigsResponseAppModel2.f8629a;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (b((ProductConfigResponseAppModel) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    allProductConfigsResponseAppModelA = AllProductConfigsResponseAppModel.a(allProductConfigsResponseAppModel2, arrayList);
                    fetchProductConfigsUseCase$invoke$1.L$0 = allProductConfigsResponseAppModelA;
                    fetchProductConfigsUseCase$invoke$1.label = 3;
                    if (c(allProductConfigsResponseAppModelA, fetchProductConfigsUseCase$invoke$1) != obj) {
                        allProductConfigsResponseAppModel = allProductConfigsResponseAppModelA;
                    }
                    return obj;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                allProductConfigsResponseAppModel = (AllProductConfigsResponseAppModel) fetchProductConfigsUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            }
            return new ProductFetchResult.Success(allProductConfigsResponseAppModel);
            boolean zA = ((PremiumBusNativeCityWiseConfigAppModel) objA).a(i);
            fetchProductConfigsUseCase$invoke$1.L$0 = null;
            fetchProductConfigsUseCase$invoke$1.L$1 = null;
            fetchProductConfigsUseCase$invoke$1.label = 2;
            objA = productPurchaseRepository.f(iH, lowerCase, fetchProductConfigsUseCase$invoke$1, zA);
            if (objA != obj) {
                AllProductConfigsResponseAppModel allProductConfigsResponseAppModel3 = (AllProductConfigsResponseAppModel) objA;
                List list2 = allProductConfigsResponseAppModel3.f8629a;
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (b((ProductConfigResponseAppModel) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                allProductConfigsResponseAppModelA = AllProductConfigsResponseAppModel.a(allProductConfigsResponseAppModel3, arrayList);
                fetchProductConfigsUseCase$invoke$1.L$0 = allProductConfigsResponseAppModelA;
                fetchProductConfigsUseCase$invoke$1.label = 3;
                if (c(allProductConfigsResponseAppModelA, fetchProductConfigsUseCase$invoke$1) != obj) {
                    allProductConfigsResponseAppModel = allProductConfigsResponseAppModelA;
                    return new ProductFetchResult.Success(allProductConfigsResponseAppModel);
                }
            }
            return obj;
        } catch (ChaloLocalException e) {
            return new ProductFetchResult.UnknownError(e.getMessage());
        } catch (NetworkSuccessResponseParseException e2) {
            return new ProductFetchResult.InvalidResponse(e2.getMessage());
        } catch (AllProductsConfigFetchFailedException e3) {
            return new ProductFetchResult.FetchFailed(e3.getMessage());
        } catch (AllProductsConfigInvalidResponseException e4) {
            return new ProductFetchResult.InvalidResponse(e4.getMessage());
        } catch (Exception e5) {
            return new ProductFetchResult.UnknownError(e5.getMessage());
        }
    }

    public final Object c(AllProductConfigsResponseAppModel allProductConfigsResponseAppModel, Continuation continuation) {
        List list = allProductConfigsResponseAppModel.f8629a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) {
                arrayList.add(obj);
            }
        }
        ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel instantTicketConfigResponseAppModel = (ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) CollectionsKt.H(arrayList);
        if (instantTicketConfigResponseAppModel != null) {
            String str = instantTicketConfigResponseAppModel.j;
            String str2 = instantTicketConfigResponseAppModel.k;
            String str3 = instantTicketConfigResponseAppModel.l;
            String str4 = instantTicketConfigResponseAppModel.m;
            boolean z = instantTicketConfigResponseAppModel.n;
            BrandingDetails brandingDetails = instantTicketConfigResponseAppModel.o;
            String str5 = instantTicketConfigResponseAppModel.p;
            String str6 = instantTicketConfigResponseAppModel.q;
            FareInfo fareInfo = instantTicketConfigResponseAppModel.r;
            long j = instantTicketConfigResponseAppModel.s;
            boolean z2 = instantTicketConfigResponseAppModel.t;
            boolean z3 = instantTicketConfigResponseAppModel.u;
            List list2 = instantTicketConfigResponseAppModel.v;
            if (list2 == null) {
                list2 = EmptyList.f17557a;
            }
            InstantTicketConfiguration instantTicketConfiguration = new InstantTicketConfiguration(str, str2, str3, str4, z, brandingDetails, str5, str6, fareInfo, j, z2, z3, list2);
            Json json = ChaloJson.b;
            json.getClass();
            Object objB = this.e.b(json.a(InstantTicketConfiguration.INSTANCE.serializer(), instantTicketConfiguration), (ContinuationImpl) continuation);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        }
        return Unit.f17538a;
    }
}
