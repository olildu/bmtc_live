package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.extensions.StringExtsKt;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.productpurchase.passpurchase.domain.FetchSuperPassCashPaymentInfoUseCase;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.productselection.data.models.app.PassCashPaymentInfoResponseAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.superpass.data.models.entities.CashPaymentPendingTransactionDetails;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {624, 635, 656}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent postCashPaymentIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$intent = postCashPaymentIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$handlePostCashPaymentIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0161  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        Object value;
        SuperPassPurchaseSharedState superPassPurchaseSharedState;
        Long l;
        String str;
        SuperPassApplication superPassApplication;
        Object objB;
        String str2;
        CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails;
        String str3;
        Object objValueOf;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            FetchSuperPassCashPaymentInfoUseCase fetchSuperPassCashPaymentInfoUseCase = this.this$0.y;
            ConfirmSuperPassPurchaseIntent.PostCashPaymentIntent postCashPaymentIntent = this.$intent;
            String str4 = postCashPaymentIntent.b;
            String str5 = postCashPaymentIntent.f8376a;
            this.label = 1;
            objA = fetchSuperPassCashPaymentInfoUseCase.a(str4, str5, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                str2 = (String) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                hq0.s(this.this$0.z, StringExtsKt.b(str2, (String) objB));
                return unit;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassApplication = (SuperPassApplication) this.L$2;
            superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.L$1;
            chaloUseCaseResult = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            ConfirmSuperPassPurchaseViewModel.s(this.this$0, true, ((PassCashPaymentInfoResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b);
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = superPassPurchaseSharedState.i;
            confirmSuperPassPurchaseViewModel.getClass();
            cashPaymentPendingTransactionDetails = superPassApplication.m;
            if (cashPaymentPendingTransactionDetails != null || (str3 = cashPaymentPendingTransactionDetails.b) == null) {
                str3 = r3;
            }
            if (cashPaymentPendingTransactionDetails != null) {
                objValueOf = Double.valueOf(cashPaymentPendingTransactionDetails.f9541a);
            } else {
                objValueOf = "";
            }
            AnalyticsContract analyticsContract = confirmSuperPassPurchaseViewModel.n;
            Source source = Source.MY_TICKETS_SCREEN_TAB;
            Pair pair = new Pair("referenceId", str3);
            Pair pair2 = new Pair("pendingFare", objValueOf);
            SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
            AnalyticsContractImplKt.b(analyticsContract, "open super pass cash payment web page", source, MapsKt.i(pair, pair2, new Pair("productCity", superPassProductConfigurationProperties.b), new Pair("productAgency", superPassProductConfigurationProperties.k)), false, 24);
            return unit;
        }
        ResultKt.b(obj);
        objA = obj;
        chaloUseCaseResult = (ChaloUseCaseResult) objA;
        MutableStateFlow mutableStateFlow = this.this$0.e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a((ConfirmSuperPassPurchaseDataState) value, false, false, null, null, null, null, null, null, null, null, 2043)));
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.this$0.l.getF().getValue();
            SuperPassApplication.Companion companion = SuperPassApplication.INSTANCE;
            BookableSuperPassConfiguration bookableSuperPassConfiguration2 = superPassPurchaseSharedState.i;
            if (bookableSuperPassConfiguration2 != null && (l = superPassPurchaseSharedState.j) != null) {
                long jLongValue = l.longValue();
                long j = superPassPurchaseSharedState.k;
                AgencyInfoAppModel agencyInfoAppModel = superPassPurchaseSharedState.c;
                if (agencyInfoAppModel != null && (str = agencyInfoAppModel.f8852a) != null) {
                    SuperPassUserDetails superPassUserDetails = superPassPurchaseSharedState.h;
                    SuperPassApplicationStatus superPassApplicationStatus = SuperPassApplicationStatus.PAYMENT_PENDING;
                    this.this$0.getClass();
                    HashMap mapG = ConfirmSuperPassPurchaseViewModel.G(superPassPurchaseSharedState);
                    List list = superPassPurchaseSharedState.o;
                    String strB = CityProviderKt.b(this.this$0.A);
                    String str6 = strB == null ? "" : strB;
                    PassCashPaymentInfoResponseAppModel passCashPaymentInfoResponseAppModel = (PassCashPaymentInfoResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    CashPaymentPendingTransactionDetails cashPaymentPendingTransactionDetails2 = new CashPaymentPendingTransactionDetails(passCashPaymentInfoResponseAppModel.c, passCashPaymentInfoResponseAppModel.b);
                    companion.getClass();
                    SuperPassApplication superPassApplicationA = SuperPassApplication.Companion.a(bookableSuperPassConfiguration2, jLongValue, j, str, superPassUserDetails, superPassApplicationStatus, mapG, list, str6, cashPaymentPendingTransactionDetails2);
                    SuperPassRepository superPassRepository = this.this$0.t;
                    this.L$0 = chaloUseCaseResult;
                    this.L$1 = superPassPurchaseSharedState;
                    this.L$2 = superPassApplicationA;
                    this.label = 3;
                    Object objE = superPassRepository.b.E(superPassApplicationA, this);
                    if (objE != coroutineSingletons) {
                        objE = unit;
                    }
                    if (objE != coroutineSingletons) {
                        superPassApplication = superPassApplicationA;
                        ConfirmSuperPassPurchaseViewModel.s(this.this$0, true, ((PassCashPaymentInfoResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b);
                        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
                        BookableSuperPassConfiguration bookableSuperPassConfiguration3 = superPassPurchaseSharedState.i;
                        confirmSuperPassPurchaseViewModel2.getClass();
                        cashPaymentPendingTransactionDetails = superPassApplication.m;
                        if (cashPaymentPendingTransactionDetails != null) {
                            str3 = r3;
                        } else {
                            str3 = r3;
                        }
                        if (cashPaymentPendingTransactionDetails != null) {
                            objValueOf = Double.valueOf(cashPaymentPendingTransactionDetails.f9541a);
                        } else {
                            objValueOf = "";
                        }
                        AnalyticsContract analyticsContract2 = confirmSuperPassPurchaseViewModel2.n;
                        Source source2 = Source.MY_TICKETS_SCREEN_TAB;
                        Pair pair3 = new Pair("referenceId", str3);
                        Pair pair4 = new Pair("pendingFare", objValueOf);
                        SuperPassProductConfigurationProperties superPassProductConfigurationProperties2 = bookableSuperPassConfiguration3.b;
                        AnalyticsContractImplKt.b(analyticsContract2, "open super pass cash payment web page", source2, MapsKt.i(pair3, pair4, new Pair("productCity", superPassProductConfigurationProperties2.b), new Pair("productAgency", superPassProductConfigurationProperties2.k)), false, 24);
                    }
                }
            }
            return unit;
        }
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
        String str7 = (String) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        ConfirmSuperPassPurchaseViewModel.s(confirmSuperPassPurchaseViewModel3, false, str7);
        this.L$0 = str7;
        this.label = 2;
        objB = this.this$0.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
        if (objB != coroutineSingletons) {
            str2 = str7;
            hq0.s(this.this$0.z, StringExtsKt.b(str2, (String) objB));
            return unit;
        }
        return coroutineSingletons;
    }
}
