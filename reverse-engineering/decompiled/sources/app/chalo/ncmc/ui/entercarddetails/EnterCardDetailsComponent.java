package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationUseCase;
import app.chalo.ncmc.domain.FetchEligibleCardsFailureReason;
import app.chalo.ncmc.domain.FetchEligibleCardsUseCase;
import app.chalo.ncmc.domain.LinkChaloCardUseCase;
import app.chalo.ncmc.domain.ValidateCardNumberUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EnterCardDetailsArgs;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.b00;
import defpackage.n10;
import defpackage.o10;
import defpackage.ui;
import defpackage.xx;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsIntent;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsViewState;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsDataState;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnterCardDetailsComponent extends ChaloBaseStateMviComponent<EnterCardDetailsIntent, EnterCardDetailsViewState, EnterCardDetailsViewState, EnterCardDetailsSideEffect> {
    public final ComponentContext k;
    public final AnalyticsContract l;
    public final FetchChaloCardRechargeConfigurationUseCase m;
    public final StringProvider n;
    public final ValidateCardNumberUseCase o;
    public final FetchEligibleCardsUseCase p;
    public final LinkChaloCardUseCase q;
    public final CrashlyticsLogger r;
    public final ChaloNavigationManager s;
    public final KotlinToastManager t;
    public EnterCardDetailsRestoredState u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsComponent$Companion;", "", "", "ENTER_CARD_DETAILS_RESTORE_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6322a;

        static {
            int[] iArr = new int[CardNumberFieldType.values().length];
            try {
                iArr[CardNumberFieldType.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardNumberFieldType.RE_ENTER_CARD_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6322a = iArr;
        }
    }

    public EnterCardDetailsComponent(EnterCardDetailsArgs enterCardDetailsArgs, ComponentContext componentContext, AnalyticsContract analyticsContract, FetchChaloCardRechargeConfigurationUseCase fetchChaloCardRechargeConfigurationUseCase, StringProvider stringProvider, ValidateCardNumberUseCase validateCardNumberUseCase, FetchEligibleCardsUseCase fetchEligibleCardsUseCase, LinkChaloCardUseCase linkChaloCardUseCase, CrashlyticsLogger crashlyticsLogger, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = componentContext;
        this.l = analyticsContract;
        this.m = fetchChaloCardRechargeConfigurationUseCase;
        this.n = stringProvider;
        this.o = validateCardNumberUseCase;
        this.p = fetchEligibleCardsUseCase;
        this.q = linkChaloCardUseCase;
        this.r = crashlyticsLogger;
        this.s = chaloNavigationManager;
        this.t = kotlinToastManager;
        componentContext.getB().d("enter_card_details_restore_key", EnterCardDetailsRestoredState.INSTANCE.serializer(), new xx(this, 8));
        H0(new EnterCardDetailsIntent.InitializationIntent(enterCardDetailsArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(EnterCardDetailsComponent enterCardDetailsComponent, ContinuationImpl continuationImpl) {
        EnterCardDetailsComponent$checkEligibleCards$1 enterCardDetailsComponent$checkEligibleCards$1;
        enterCardDetailsComponent.getClass();
        if (continuationImpl instanceof EnterCardDetailsComponent$checkEligibleCards$1) {
            enterCardDetailsComponent$checkEligibleCards$1 = (EnterCardDetailsComponent$checkEligibleCards$1) continuationImpl;
            int i = enterCardDetailsComponent$checkEligibleCards$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                enterCardDetailsComponent$checkEligibleCards$1.label = i - Integer.MIN_VALUE;
            } else {
                enterCardDetailsComponent$checkEligibleCards$1 = new EnterCardDetailsComponent$checkEligibleCards$1(enterCardDetailsComponent, continuationImpl);
            }
        } else {
            enterCardDetailsComponent$checkEligibleCards$1 = new EnterCardDetailsComponent$checkEligibleCards$1(enterCardDetailsComponent, continuationImpl);
        }
        Object objA = enterCardDetailsComponent$checkEligibleCards$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = enterCardDetailsComponent$checkEligibleCards$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            FetchEligibleCardsUseCase fetchEligibleCardsUseCase = enterCardDetailsComponent.p;
            enterCardDetailsComponent$checkEligibleCards$1.label = 1;
            objA = fetchEligibleCardsUseCase.a(enterCardDetailsComponent$checkEligibleCards$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            String str = (String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (!StringsKt.F(str)) {
                enterCardDetailsComponent.E0(new n10(str, 0));
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            enterCardDetailsComponent.r.i(new Exception(((FetchEligibleCardsFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()));
        }
        return Unit.f17538a;
    }

    public static final void G0(EnterCardDetailsComponent enterCardDetailsComponent, boolean z, long j) {
        AnalyticsContractImplKt.b(enterCardDetailsComponent.l, "ocr card validity checked", Source.CHALO_ENTER_CARD_DETAILS_SCREEN, MapsKt.i(new Pair("isSuccessful", Boolean.valueOf(z)), new Pair("cardNo", ((EnterCardDetailsViewState) enterCardDetailsComponent.f.getValue()).c), new Pair("rechargeLimit", Long.valueOf(j))), false, 24);
    }

    public final void H0(EnterCardDetailsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof EnterCardDetailsIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            E0(new o10(this, 0));
            BuildersKt.d(contextScope, null, null, new EnterCardDetailsComponent$fetchConfig$1(this, null), 3);
            return;
        }
        if (!(intent instanceof EnterCardDetailsIntent.OnAmountEnteredIntentEnter)) {
            if (intent.equals(EnterCardDetailsIntent.ProceedBtnClickedIntentEnter.f6330a)) {
                BuildersKt.d(contextScope, null, null, new EnterCardDetailsComponent$handleProceedBtnClickedIntent$1(this, null), 3);
                return;
            }
            if (intent.equals(EnterCardDetailsIntent.CardLinkBottomSheetLinkEnterCardClicked.f6324a)) {
                BuildersKt.d(contextScope, null, null, new EnterCardDetailsComponent$linkEligibleCard$1(this, null), 3);
                return;
            }
            if (intent.equals(EnterCardDetailsIntent.EnterCardLinkBottomContinueWithRechargeClicked.f6325a)) {
                E0(new b00(24));
                return;
            } else if (intent.equals(EnterCardDetailsIntent.OnRetryClicked.f6329a)) {
                BuildersKt.d(contextScope, null, null, new EnterCardDetailsComponent$fetchConfig$1(this, null), 3);
                return;
            } else {
                if (!intent.equals(EnterCardDetailsIntent.OnBottomsheetDismissed.f6328a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new b00(23));
                return;
            }
        }
        EnterCardDetailsIntent.OnAmountEnteredIntentEnter onAmountEnteredIntentEnter = (EnterCardDetailsIntent.OnAmountEnteredIntentEnter) intent;
        String str = onAmountEnteredIntentEnter.f6327a;
        CardNumberFieldType cardNumberFieldType = onAmountEnteredIntentEnter.b;
        int[] iArr = WhenMappings.f6322a;
        int i = iArr[cardNumberFieldType.ordinal()];
        if (i == 1) {
            boolean z2 = str.length() == 16;
            E0(new ui(str, z2, 2));
            if (z2) {
                r0(EnterCardDetailsSideEffect.FocusOnReEnterEnterCardNumberField.f6334a);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new n10(str, 1));
        }
        int i2 = iArr[cardNumberFieldType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new EnterCardDetailsComponent$processCardInput$3(this, str, null), 3);
        } else {
            String str2 = ((EnterCardDetailsViewState) this.f.getValue()).d;
            if (str.length() == 16 && str.equals(str2)) {
                E0(new b00(25));
            } else {
                E0(new b00(26));
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (EnterCardDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.u == null) {
            this.u = (EnterCardDetailsRestoredState) this.f5983a.getB().a("enter_card_details_restore_key", EnterCardDetailsRestoredState.INSTANCE.serializer());
        }
        EnterCardDetailsRestoredState enterCardDetailsRestoredState = this.u;
        if (enterCardDetailsRestoredState == null) {
            return new EnterCardDetailsViewState(0, 4095, null, null, null, null, null, false, false, false);
        }
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = enterCardDetailsRestoredState.f6332a;
        return new EnterCardDetailsViewState(enterCardDetailsRestoredState.b, 896, chaloCardRechargeConfigAppModel, enterCardDetailsRestoredState.c, enterCardDetailsRestoredState.d, enterCardDetailsRestoredState.e, enterCardDetailsRestoredState.h, enterCardDetailsRestoredState.f, enterCardDetailsRestoredState.g, enterCardDetailsRestoredState.i);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new EnterCardDetailsViewState(0, 4095, null, null, null, null, null, false, false, false);
    }
}
