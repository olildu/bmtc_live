package app.chalo.instantticket.ui.instantticketscreen;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.MinKycDetailsArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.domain.CreateQuickPayOrderUsecase;
import app.chalo.wallet.domain.QuickPayValidationResult;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import defpackage.gb0;
import defpackage.hq0;
import defpackage.vo1;
import defpackage.y80;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1", f = "InstantTicketWalletAccessComponent.kt", l = {455, 457, 478, TypedValues.PositionType.TYPE_DRAWPATH, InputDeviceCompat.SOURCE_DPAD}, m = "invokeSuspend", v = 1)
final class InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstantTicketWalletAccessIntent.PayUsingWalletClicked $intent;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ InstantTicketWalletAccessComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3954a;

        static {
            int[] iArr = new int[WalletStatus.values().length];
            try {
                iArr[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatus.KYC_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatus.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletStatus.BLOCKED_USER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f3954a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1(InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, InstantTicketWalletAccessIntent.PayUsingWalletClicked payUsingWalletClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = instantTicketWalletAccessComponent;
        this.$intent = payUsingWalletClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstantTicketWalletAccessComponent$handlePayUsingWalletClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x013a  */
    /* JADX WARN: Code duplicated, block: B:46:0x015b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0216 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jB;
        Object objA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object objA2;
        ChaloUseCaseResult chaloUseCaseResult;
        KotlinToastManager kotlinToastManager2;
        Object objB2;
        KotlinToastManager kotlinToastManager3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        Integer num = null;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContract.DefaultImpls.a(this.this$0.n, "paymentMethod", "new pay for ticket bottom sheet", vo1.s("paymentMethod", "chalo wallet"), null, false, 24);
            int i2 = WhenMappings.f3954a[((InstantTicketWalletAccessState) this.this$0.E.a()).g.ordinal()];
            InstantTicketWalletAccessSideEffect.CloseBottomSheet closeBottomSheet = InstantTicketWalletAccessSideEffect.CloseBottomSheet.f3957a;
            switch (i2) {
                case 1:
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent = this.this$0;
                    instantTicketWalletAccessComponent.E0(new gb0(instantTicketWalletAccessComponent, 1));
                    return unit;
                case 2:
                case 3:
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent2 = this.this$0;
                    AnalyticsContract.DefaultImpls.a(instantTicketWalletAccessComponent2.n, "activate wallet clicked", "new pay for ticket bottom sheet", null, null, false, 28);
                    instantTicketWalletAccessComponent2.r0(closeBottomSheet);
                    instantTicketWalletAccessComponent2.A.b(new ChaloNavigationRequest.Navigate(MinKycDetailsArgs.INSTANCE, new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.MinKycDetails, true), 3), null, 4));
                    instantTicketWalletAccessComponent2.E0(new y80(27));
                    return unit;
                case 4:
                    jB = this.this$0.p.b(this.$intent.f3955a);
                    WalletTypeIdentifier walletTypeIdentifier = ((InstantTicketWalletAccessState) this.this$0.E.a()).f3960a;
                    if (walletTypeIdentifier != null) {
                        ValidateQuickPayUseCase validateQuickPayUseCase = this.this$0.q;
                        this.J$0 = jB;
                        this.label = 1;
                        objA = validateQuickPayUseCase.a(jB, walletTypeIdentifier, this);
                        if (objA != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return unit;
                case 5:
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent3 = this.this$0;
                    BuildersKt.d(instantTicketWalletAccessComponent3.j, null, null, new InstantTicketWalletAccessComponent$handleBackendReclaimKnowMore$1(instantTicketWalletAccessComponent3, null), 3);
                    return unit;
                case 6:
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent4 = this.this$0;
                    this.label = 5;
                    if (InstantTicketWalletAccessComponent.G0(instantTicketWalletAccessComponent4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                case 7:
                    InstantTicketWalletAccessComponent instantTicketWalletAccessComponent5 = this.this$0;
                    AnalyticsContract.DefaultImpls.a(instantTicketWalletAccessComponent5.n, "wallet blocked know more clicked", "new pay for ticket bottom sheet", null, null, false, 28);
                    instantTicketWalletAccessComponent5.r0(closeBottomSheet);
                    return unit;
                case 8:
                case 9:
                case 10:
                case 11:
                    return unit;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.b(obj);
                objA2 = obj;
                chaloUseCaseResult = (ChaloUseCaseResult) objA2;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    this.this$0.A.b(new ChaloNavigationRequest.BuildStack(CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs((String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, "quickpay", "quickpay", Source.INSTANT_TICKET_FRAGMENT, null, null, null, 1008))));
                    return unit;
                }
                InstantTicketWalletAccessComponent instantTicketWalletAccessComponent6 = this.this$0;
                kotlinToastManager2 = instantTicketWalletAccessComponent6.B;
                StringProvider stringProvider = instantTicketWalletAccessComponent6.v;
                StringEnum stringEnum = StringEnum.GENERIC_ERROR_WITH_CODE;
                Intrinsics.g(chaloUseCaseResult, "null cannot be cast to non-null type app.chalo.utils.ChaloUseCaseResult.Failure<kotlin.String, kotlin.Int>");
                Object[] objArr = {((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a};
                this.L$0 = kotlinToastManager2;
                this.label = 3;
                objB2 = stringProvider.b(stringEnum, objArr, this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager3 = kotlinToastManager2;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                hq0.s(kotlinToastManager, (String) objB);
                return unit;
            }
            kotlinToastManager3 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB2 = obj;
            hq0.s(kotlinToastManager3, (String) objB2);
            return unit;
        }
        jB = this.J$0;
        ResultKt.b(obj);
        objA = obj;
        QuickPayValidationResult quickPayValidationResult = (QuickPayValidationResult) objA;
        if (!(quickPayValidationResult instanceof QuickPayValidationResult.Success)) {
            if (quickPayValidationResult instanceof QuickPayValidationResult.InsufficientBalance) {
                AnalyticsContract.DefaultImpls.a(this.this$0.n, "instant ticket bottom sheet recharge button clicked", "new pay for ticket bottom sheet", null, null, false, 28);
                this.this$0.A.b(new ChaloNavigationRequest.Navigate(new WalletLoadMoneyArgs(6), null, null, 6));
                this.this$0.E0(new y80(29));
                return unit;
            }
            QuickPayValidationResult.GeneralError generalError = QuickPayValidationResult.GeneralError.f10778a;
            boolean zD = Intrinsics.d(quickPayValidationResult, generalError);
            QuickPayValidationResult.WalletNotFound walletNotFound = QuickPayValidationResult.WalletNotFound.f10782a;
            QuickPayValidationResult.UserNotFound userNotFound = QuickPayValidationResult.UserNotFound.f10781a;
            if (!zD && !Intrinsics.d(quickPayValidationResult, userNotFound) && !Intrinsics.d(quickPayValidationResult, walletNotFound)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.i(quickPayValidationResult, "<this>");
            if (!(quickPayValidationResult instanceof QuickPayValidationResult.Success)) {
                if (quickPayValidationResult instanceof QuickPayValidationResult.InsufficientBalance) {
                    num = 101;
                } else if (quickPayValidationResult.equals(generalError)) {
                    num = 0;
                } else if (quickPayValidationResult.equals(userNotFound)) {
                    num = 99;
                } else {
                    if (!quickPayValidationResult.equals(walletNotFound)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = 100;
                }
            }
            if (num != null) {
                InstantTicketWalletAccessComponent instantTicketWalletAccessComponent7 = this.this$0;
                int iIntValue = num.intValue();
                KotlinToastManager kotlinToastManager4 = instantTicketWalletAccessComponent7.B;
                StringProvider stringProvider2 = instantTicketWalletAccessComponent7.v;
                StringEnum stringEnum2 = StringEnum.GENERIC_ERROR_WITH_CODE;
                Object[] objArr2 = {new Integer(iIntValue)};
                this.L$0 = kotlinToastManager4;
                this.label = 4;
                objB = stringProvider2.b(stringEnum2, objArr2, this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager4;
                    hq0.s(kotlinToastManager, (String) objB);
                }
            }
            return unit;
        }
        CreateQuickPayOrderUsecase createQuickPayOrderUsecase = this.this$0.r;
        WalletAppModel walletAppModel = ((QuickPayValidationResult.Success) quickPayValidationResult).f10780a;
        this.label = 2;
        objA2 = createQuickPayOrderUsecase.a(walletAppModel, jB, this);
        if (objA2 != coroutineSingletons) {
            chaloUseCaseResult = (ChaloUseCaseResult) objA2;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                this.this$0.A.b(new ChaloNavigationRequest.BuildStack(CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs((String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, "quickpay", "quickpay", Source.INSTANT_TICKET_FRAGMENT, null, null, null, 1008))));
                return unit;
            }
            InstantTicketWalletAccessComponent instantTicketWalletAccessComponent8 = this.this$0;
            kotlinToastManager2 = instantTicketWalletAccessComponent8.B;
            StringProvider stringProvider3 = instantTicketWalletAccessComponent8.v;
            StringEnum stringEnum3 = StringEnum.GENERIC_ERROR_WITH_CODE;
            Intrinsics.g(chaloUseCaseResult, "null cannot be cast to non-null type app.chalo.utils.ChaloUseCaseResult.Failure<kotlin.String, kotlin.Int>");
            Object[] objArr3 = {((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a};
            this.L$0 = kotlinToastManager2;
            this.label = 3;
            objB2 = stringProvider3.b(stringEnum3, objArr3, this);
            if (objB2 != coroutineSingletons) {
                kotlinToastManager3 = kotlinToastManager2;
                hq0.s(kotlinToastManager3, (String) objB2);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
