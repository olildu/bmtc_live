package app.chalo.home.helper;

import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/InstantTicketConfigHelperImpl;", "Lapp/chalo/premiumbus/helper/InstantTicketConfigHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketConfigHelperImpl implements InstantTicketConfigHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBookingDataStore f3103a;
    public final FetchProductConfigsUseCase b;
    public final StringProvider c;

    public InstantTicketConfigHelperImpl(ProductBookingDataStore productBookingDataStore, FetchProductConfigsUseCase fetchProductConfigsUseCase, StringProvider stringProvider) {
        this.f3103a = productBookingDataStore;
        this.b = fetchProductConfigsUseCase;
        this.c = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r6 == r1) goto L31;
     */
    @Override // app.chalo.premiumbus.helper.InstantTicketConfigHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.home.helper.InstantTicketConfigHelperImpl$fetchAndCacheInstantTicketConfig$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.home.helper.InstantTicketConfigHelperImpl$fetchAndCacheInstantTicketConfig$1 r0 = (app.chalo.home.helper.InstantTicketConfigHelperImpl$fetchAndCacheInstantTicketConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.helper.InstantTicketConfigHelperImpl$fetchAndCacheInstantTicketConfig$1 r0 = new app.chalo.home.helper.InstantTicketConfigHelperImpl$fetchAndCacheInstantTicketConfig$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L78
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase r6 = r5.b
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L77
        L44:
            app.chalo.productpurchase.productselection.domain.ProductFetchResult r6 = (app.chalo.productpurchase.productselection.domain.ProductFetchResult) r6
            boolean r2 = r6 instanceof app.chalo.productpurchase.productselection.domain.ProductFetchResult.Success
            if (r2 == 0) goto L52
            app.chalo.utils.ChaloUseCaseResult$Success r6 = new app.chalo.utils.ChaloUseCaseResult$Success
            kotlin.Unit r0 = kotlin.Unit.f17538a
            r6.<init>(r0)
            return r6
        L52:
            boolean r2 = r6 instanceof app.chalo.productpurchase.productselection.domain.ProductFetchResult.FetchFailed
            if (r2 == 0) goto L60
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.productpurchase.productselection.domain.ProductFetchResult$FetchFailed r6 = (app.chalo.productpurchase.productselection.domain.ProductFetchResult.FetchFailed) r6
            java.lang.String r6 = r6.f8660a
            r0.<init>(r6)
            return r0
        L60:
            app.chalo.productpurchase.productselection.domain.ProductFetchResult$InvalidCity r2 = app.chalo.productpurchase.productselection.domain.ProductFetchResult.InvalidCity.f8661a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r6, r2)
            if (r2 == 0) goto L7e
            app.chalo.providers.stringprovider.StringEnum r6 = app.chalo.providers.stringprovider.StringEnum.INVALID_CITY
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.label = r3
            app.chalo.providers.stringprovider.StringProvider r3 = r5.c
            java.lang.Object r6 = r3.b(r6, r2, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r0.<init>(r6)
            return r0
        L7e:
            boolean r0 = r6 instanceof app.chalo.productpurchase.productselection.domain.ProductFetchResult.InvalidResponse
            if (r0 == 0) goto L8c
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.productpurchase.productselection.domain.ProductFetchResult$InvalidResponse r6 = (app.chalo.productpurchase.productselection.domain.ProductFetchResult.InvalidResponse) r6
            java.lang.String r6 = r6.f8662a
            r0.<init>(r6)
            return r0
        L8c:
            boolean r0 = r6 instanceof app.chalo.productpurchase.productselection.domain.ProductFetchResult.UnknownError
            if (r0 == 0) goto L9a
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.productpurchase.productselection.domain.ProductFetchResult$UnknownError r6 = (app.chalo.productpurchase.productselection.domain.ProductFetchResult.UnknownError) r6
            java.lang.String r6 = r6.f8664a
            r0.<init>(r6)
            return r0
        L9a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.helper.InstantTicketConfigHelperImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.premiumbus.helper.InstantTicketConfigHelper
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        InstantTicketConfigHelperImpl$getInstantConfiguration$1 instantTicketConfigHelperImpl$getInstantConfiguration$1;
        Object objA;
        if (continuationImpl instanceof InstantTicketConfigHelperImpl$getInstantConfiguration$1) {
            instantTicketConfigHelperImpl$getInstantConfiguration$1 = (InstantTicketConfigHelperImpl$getInstantConfiguration$1) continuationImpl;
            int i = instantTicketConfigHelperImpl$getInstantConfiguration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketConfigHelperImpl$getInstantConfiguration$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketConfigHelperImpl$getInstantConfiguration$1 = new InstantTicketConfigHelperImpl$getInstantConfiguration$1(this, continuationImpl);
            }
        } else {
            instantTicketConfigHelperImpl$getInstantConfiguration$1 = new InstantTicketConfigHelperImpl$getInstantConfiguration$1(this, continuationImpl);
        }
        Object objA2 = instantTicketConfigHelperImpl$getInstantConfiguration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketConfigHelperImpl$getInstantConfiguration$1.label;
        ProductBookingDataStore productBookingDataStore = this.f3103a;
        if (i2 == 0) {
            ResultKt.b(objA2);
            instantTicketConfigHelperImpl$getInstantConfiguration$1.Z$0 = z;
            instantTicketConfigHelperImpl$getInstantConfiguration$1.label = 1;
            objA2 = productBookingDataStore.a(instantTicketConfigHelperImpl$getInstantConfiguration$1);
            if (objA2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = instantTicketConfigHelperImpl$getInstantConfiguration$1.Z$0;
            ResultKt.b(objA2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA2);
                return objA2;
            }
            ResultKt.b(objA2);
        }
        instantTicketConfigHelperImpl$getInstantConfiguration$1.label = 3;
        objA = productBookingDataStore.a(instantTicketConfigHelperImpl$getInstantConfiguration$1);
        if (objA != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) objA2;
        if (instantTicketConfiguration != null && !z) {
            return instantTicketConfiguration;
        }
        instantTicketConfigHelperImpl$getInstantConfiguration$1.label = 2;
        if (this.b.a(instantTicketConfigHelperImpl$getInstantConfiguration$1) != coroutineSingletons) {
            instantTicketConfigHelperImpl$getInstantConfiguration$1.label = 3;
            objA = productBookingDataStore.a(instantTicketConfigHelperImpl$getInstantConfiguration$1);
            if (objA != coroutineSingletons) {
                return objA;
            }
        }
        return coroutineSingletons;
    }
}
