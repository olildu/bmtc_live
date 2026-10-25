package app.chalo.productbooking.common.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.productbooking.common.data.exception.ProductConfigsForUiFetchFailedException;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/FetchProductConfigsForUiUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchProductConfigsForUiUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f8264a;
    public final CityProvider b;
    public final BasicInfoContract c;
    public final UserProfileDetailsProvider d;

    public FetchProductConfigsForUiUseCase(BasicInfoContract basicInfoContract, PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f8264a = premiumBusRepository;
        this.b = cityProvider;
        this.c = basicInfoContract;
        this.d = userProfileDetailsProvider;
    }

    public static ProductsConfigListForUiAppModel a(ProductsConfigListForUiAppModel productsConfigListForUiAppModel, List list) {
        if (list.isEmpty()) {
            return productsConfigListForUiAppModel;
        }
        List list2 = productsConfigListForUiAppModel.f8226a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (list.contains(((ProductConfigForUiAppModel) obj).m)) {
                arrayList.add(obj);
            }
        }
        return new ProductsConfigListForUiAppModel(arrayList);
    }

    public static ProductsConfigListForUiAppModel b(ProductsConfigListForUiAppModel productsConfigListForUiAppModel, List list) {
        if (list.isEmpty()) {
            return productsConfigListForUiAppModel;
        }
        List list2 = productsConfigListForUiAppModel.f8226a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!CollectionsKt.M(((ProductConfigForUiAppModel) obj).n, CollectionsKt.G0(list)).isEmpty()) {
                arrayList.add(obj);
            }
        }
        return new ProductsConfigListForUiAppModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        FetchProductConfigsForUiUseCase$invoke$1 fetchProductConfigsForUiUseCase$invoke$1;
        List list3;
        List list4 = list2;
        if (continuationImpl instanceof FetchProductConfigsForUiUseCase$invoke$1) {
            fetchProductConfigsForUiUseCase$invoke$1 = (FetchProductConfigsForUiUseCase$invoke$1) continuationImpl;
            int i = fetchProductConfigsForUiUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchProductConfigsForUiUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchProductConfigsForUiUseCase$invoke$1 = new FetchProductConfigsForUiUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchProductConfigsForUiUseCase$invoke$1 = new FetchProductConfigsForUiUseCase$invoke$1(this, continuationImpl);
        }
        FetchProductConfigsForUiUseCase$invoke$1 fetchProductConfigsForUiUseCase$invoke$2 = fetchProductConfigsForUiUseCase$invoke$1;
        Object objJ = fetchProductConfigsForUiUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchProductConfigsForUiUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objJ);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(FetchProductConfigForUiErrorReason.INVALID_CITY);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                String strM = this.d.m();
                boolean z = !(strM == null || strM.length() == 0);
                PremiumBusRepository premiumBusRepository = this.f8264a;
                int iH = this.c.h();
                ProductConfigServiceType productConfigServiceType = list4 != null ? (ProductConfigServiceType) CollectionsKt.H(list4) : null;
                fetchProductConfigsForUiUseCase$invoke$2.L$0 = list;
                fetchProductConfigsForUiUseCase$invoke$2.L$1 = list4;
                fetchProductConfigsForUiUseCase$invoke$2.label = 1;
                objJ = premiumBusRepository.j(lowerCase, iH, productConfigServiceType, str, str2, str3, z, str4, str5, str6, fetchProductConfigsForUiUseCase$invoke$2);
                if (objJ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list3 = list;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list4 = (List) fetchProductConfigsForUiUseCase$invoke$2.L$1;
                list3 = (List) fetchProductConfigsForUiUseCase$invoke$2.L$0;
                ResultKt.b(objJ);
            }
            ProductsConfigListForUiAppModel productsConfigListForUiAppModel = (ProductsConfigListForUiAppModel) objJ;
            if (list3 == null) {
                list3 = EmptyList.f17557a;
            }
            ProductsConfigListForUiAppModel productsConfigListForUiAppModelA = a(productsConfigListForUiAppModel, list3);
            if (list4 == null) {
                list4 = EmptyList.f17557a;
            }
            return new ChaloUseCaseResult.Success(b(productsConfigListForUiAppModelA, list4));
        } catch (ChaloLocalException unused) {
            return new ChaloUseCaseResult.Failure(FetchProductConfigForUiErrorReason.LOCAL_ERROR);
        } catch (NetworkSuccessResponseParseException unused2) {
            return new ChaloUseCaseResult.Failure(FetchProductConfigForUiErrorReason.PARSE_ERROR);
        } catch (ProductConfigsForUiFetchFailedException unused3) {
            return new ChaloUseCaseResult.Failure(FetchProductConfigForUiErrorReason.SERVER_ERROR);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(FetchProductConfigForUiErrorReason.UNKNOWN_ERROR);
        }
    }
}
