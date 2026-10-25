package app.chalo.electricitybill.ui.ebillfetch;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.domain.EBillFetchUseCase;
import app.chalo.electricitybill.exception.EBillFetchErrorType;
import app.chalo.electricitybill.exception.EBillFetchException;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.b00;
import defpackage.s00;
import defpackage.v00;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1", f = "EBillFetchComponent.kt", l = {177}, m = "invokeSuspend", v = 1)
final class EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentlyEnteredNumber;
    int label;
    final /* synthetic */ EBillFetchComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2557a;

        static {
            int[] iArr = new int[EBillFetchErrorType.values().length];
            try {
                iArr[EBillFetchErrorType.CONSUMER_NUM_LENGTH_TOO_SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EBillFetchErrorType.CONSUMER_NUM_LENGTH_TOO_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EBillFetchErrorType.USER_NOT_LOGGED_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EBillFetchErrorType.CONSUMER_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EBillFetchErrorType.API_RESPONSE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2557a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1(EBillFetchComponent eBillFetchComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eBillFetchComponent;
        this.$currentlyEnteredNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1(this.this$0, this.$currentlyEnteredNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EBillFetchComponent$navigateToEBillAmountScreenIfPossible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new b00(6));
            EBillFetchUseCase eBillFetchUseCase = this.this$0.l;
            String str = this.$currentlyEnteredNumber;
            this.label = 1;
            obj = eBillFetchUseCase.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        int i2 = 0;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            this.this$0.E0(new b00(7));
            ElectricityBillAppModel electricityBillAppModel = (ElectricityBillAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (electricityBillAppModel.e) {
                EBillFetchComponent eBillFetchComponent = this.this$0;
                eBillFetchComponent.getClass();
                eBillFetchComponent.E0(new s00(electricityBillAppModel, 0));
                AnalyticsContract analyticsContract = eBillFetchComponent.n;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
                MixpanelUtil.a(linkedHashMap, electricityBillAppModel);
                AnalyticsContract.DefaultImpls.a(analyticsContract, "eBill payment already done dialog shown", "", linkedHashMap, null, false, 24);
            } else {
                this.this$0.G0(electricityBillAppModel);
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloUseCaseResult.Failure failure = (ChaloUseCaseResult.Failure) chaloUseCaseResult;
            int i3 = WhenMappings.f2557a[((EBillFetchException) failure.f10418a).getErrorType().ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 3) {
                if (i3 == 4) {
                    this.this$0.E0(new v00(failure, i2));
                } else {
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.E0(new b00(8));
                }
            }
        }
        return Unit.f17538a;
    }
}
