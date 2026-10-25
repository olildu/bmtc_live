package app.chalo.wallet.ui.mainbalance;

import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.contactsupport.ContactSupportCtaUIState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.ui.access.ProductFlow;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.wallet.ui.base.WalletBaseComponent;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.model.WalletTransactionUiWrapper;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.arkivanov.decompose.ComponentContext;
import defpackage.cp1;
import defpackage.do1;
import defpackage.dp1;
import defpackage.n8;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceComponent;", "Lapp/chalo/wallet/ui/base/WalletBaseComponent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceIntent;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceDataState;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceViewState;", "Lapp/chalo/wallet/ui/mainbalance/WalletBalanceSideEffect;", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletBalanceComponent extends WalletBaseComponent<WalletBalanceIntent, WalletBalanceDataState, WalletBalanceViewState, WalletBalanceSideEffect> {
    public final WalletResolver A;
    public Job B;
    public final WalletBalanceArgs p;
    public final GetWalletAndAllTransactionsUseCase q;
    public final StringProvider r;
    public final AnalyticsContract s;
    public final GetBannerForWalletScreenUseCase t;
    public final CurrencyFeature u;
    public final WalletRepository v;
    public final ChaloNavigationManager w;
    public final TimeUtilsContract x;
    public final GetWalletSetupConfigurationUseCase y;
    public final KotlinToastManager z;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.mainbalance.WalletBalanceComponent$1", f = "WalletBalanceComponent.kt", l = {98}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WalletBalanceComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                WalletBalanceComponent walletBalanceComponent = WalletBalanceComponent.this;
                this.label = 1;
                if (WalletBalanceComponent.H0(walletBalanceComponent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/wallet/ui/mainbalance/WalletBalanceComponent$Companion;", "", "", "NUMBER_OF_TRANSACTIONS_LIMIT", "I", "", "BANNER_SCROLL_TIME", "J", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBalanceComponent(ComponentContext componentContext, WalletBalanceArgs args, p71 p71Var, GetWalletAndAllTransactionsUseCase getWalletAndAllTransactionsUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase, CurrencyFeature currencyFeature, WalletRepository walletRepository, ChaloNavigationManager chaloNavigationManager, TimeUtilsContract timeUtilsContract, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, KotlinToastManager kotlinToastManager, WalletResolver walletResolver) {
        super(componentContext, p71Var);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.p = args;
        this.q = getWalletAndAllTransactionsUseCase;
        this.r = stringProvider;
        this.s = analyticsContract;
        this.t = getBannerForWalletScreenUseCase;
        this.u = currencyFeature;
        this.v = walletRepository;
        this.w = chaloNavigationManager;
        this.x = timeUtilsContract;
        this.y = getWalletSetupConfigurationUseCase;
        this.z = kotlinToastManager;
        this.A = walletResolver;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet balance fragment opened", Source.WALLET_BALANCE_COMPONENT.getSourceName(), null, null, false, 28);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(WalletBalanceComponent walletBalanceComponent, ContinuationImpl continuationImpl) {
        WalletBalanceComponent$initialiseWalletContext$1 walletBalanceComponent$initialiseWalletContext$1;
        walletBalanceComponent.getClass();
        if (continuationImpl instanceof WalletBalanceComponent$initialiseWalletContext$1) {
            walletBalanceComponent$initialiseWalletContext$1 = (WalletBalanceComponent$initialiseWalletContext$1) continuationImpl;
            int i = walletBalanceComponent$initialiseWalletContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBalanceComponent$initialiseWalletContext$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBalanceComponent$initialiseWalletContext$1 = new WalletBalanceComponent$initialiseWalletContext$1(walletBalanceComponent, continuationImpl);
            }
        } else {
            walletBalanceComponent$initialiseWalletContext$1 = new WalletBalanceComponent$initialiseWalletContext$1(walletBalanceComponent, continuationImpl);
        }
        Object objA = walletBalanceComponent$initialiseWalletContext$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletBalanceComponent$initialiseWalletContext$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletResolver walletResolver = walletBalanceComponent.A;
            walletBalanceComponent$initialiseWalletContext$1.label = 1;
            objA = walletResolver.a(walletBalanceComponent$initialiseWalletContext$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ResolvedPrimaryWalletResult resolvedPrimaryWalletResult = (ResolvedPrimaryWalletResult) objA;
        if (resolvedPrimaryWalletResult instanceof ResolvedPrimaryWalletResult.ResolvedWallet) {
            ProductFlow productFlowO0 = walletBalanceComponent.O0();
            WalletTypeIdentifier walletTypeIdentifier = ((ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult).f11098a;
            walletBalanceComponent.G0(new WalletAccessIntent.InitialisationIntent(productFlowO0, true, walletTypeIdentifier));
            walletBalanceComponent.N0(new WalletBalanceIntent.ViewCreated(walletTypeIdentifier));
            if (((WalletBalanceDataState) walletBalanceComponent.f.getValue()).k) {
                walletBalanceComponent.M0();
            }
        } else {
            if (!Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a) && !Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NotLoggedIn.f11097a)) {
                throw new NoWhenBranchMatchedException();
            }
            walletBalanceComponent.E0(new do1(16));
            ChaloNavigationManagerKt.e(walletBalanceComponent.w, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(WalletBalanceComponent walletBalanceComponent, ContinuationImpl continuationImpl) {
        WalletBalanceComponent$loadWalletData$1 walletBalanceComponent$loadWalletData$1;
        walletBalanceComponent.getClass();
        if (continuationImpl instanceof WalletBalanceComponent$loadWalletData$1) {
            walletBalanceComponent$loadWalletData$1 = (WalletBalanceComponent$loadWalletData$1) continuationImpl;
            int i = walletBalanceComponent$loadWalletData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBalanceComponent$loadWalletData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBalanceComponent$loadWalletData$1 = new WalletBalanceComponent$loadWalletData$1(walletBalanceComponent, continuationImpl);
            }
        } else {
            walletBalanceComponent$loadWalletData$1 = new WalletBalanceComponent$loadWalletData$1(walletBalanceComponent, continuationImpl);
        }
        Object objA = walletBalanceComponent$loadWalletData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletBalanceComponent$loadWalletData$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) walletBalanceComponent.m.a()).b;
            if (walletTypeIdentifier != null) {
                walletBalanceComponent.E0(new do1(15));
                GetWalletAndAllTransactionsUseCase getWalletAndAllTransactionsUseCase = walletBalanceComponent.q;
                walletBalanceComponent$loadWalletData$1.label = 1;
                objA = getWalletAndAllTransactionsUseCase.a(walletTypeIdentifier);
                if (objA != obj) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        ResultKt.b(objA);
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1((Flow) objA, walletBalanceComponent.v.v(), new WalletBalanceComponent$loadWalletData$3(walletBalanceComponent, null));
        walletBalanceComponent$loadWalletData$1.label = 2;
        return flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(WalletBalanceComponent$loadWalletData$4.f10859a, walletBalanceComponent$loadWalletData$1) == obj ? obj : unit;
    }

    @Override // app.chalo.wallet.ui.base.WalletBaseComponent
    public final void F0(boolean z) {
        if (!z) {
            E0(new do1(18));
            return;
        }
        E0(new do1(17));
        BuildersKt.d(this.j, null, null, new WalletBalanceComponent$onWalletActiveChanged$2(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final Object p0(WalletBalanceDataState walletBalanceDataState, ContinuationImpl continuationImpl) {
        WalletBalanceComponent$convertToUiState$1 walletBalanceComponent$convertToUiState$1;
        boolean z;
        String strA;
        WalletBalanceScreenType walletBalanceScreenType;
        List list;
        int i;
        boolean z2;
        String str;
        WalletBalanceScreenType walletBalanceScreenType2;
        int i2;
        int i3;
        List list2;
        List list3;
        ContactSupportUIState contactSupportUIState;
        int i4;
        String str2;
        List list4;
        ConfirmationDialogUiState confirmationDialogUiState;
        List list5;
        List list6;
        WalletBalanceScreenType walletBalanceScreenType3;
        int i5;
        List list7;
        boolean z3;
        ContactSupportUIState contactSupportUIState2;
        List list8;
        WalletBalanceDataState walletBalanceDataState2;
        int i6;
        WalletBalanceScreenType walletBalanceScreenType4;
        String str3;
        Boolean bool;
        boolean z4;
        boolean z5;
        boolean z6;
        WalletBalanceDataState walletBalanceDataState3 = walletBalanceDataState;
        if (continuationImpl instanceof WalletBalanceComponent$convertToUiState$1) {
            walletBalanceComponent$convertToUiState$1 = (WalletBalanceComponent$convertToUiState$1) continuationImpl;
            int i7 = walletBalanceComponent$convertToUiState$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                walletBalanceComponent$convertToUiState$1.label = i7 - Integer.MIN_VALUE;
            } else {
                walletBalanceComponent$convertToUiState$1 = new WalletBalanceComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            walletBalanceComponent$convertToUiState$1 = new WalletBalanceComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj = walletBalanceComponent$convertToUiState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = walletBalanceComponent$convertToUiState$1.label;
        if (i8 == 0) {
            ResultKt.b(obj);
            boolean z7 = walletBalanceDataState3.c;
            Integer num = walletBalanceDataState3.b;
            boolean z8 = walletBalanceDataState3.j;
            List list9 = walletBalanceDataState3.e;
            z = walletBalanceDataState3.d;
            CurrencyFeature currencyFeature = this.u;
            if (z7 || z8) {
                strA = (z && num != null) ? currencyFeature.a(num.intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING) : currencyFeature.d().concat(APSSharedUtil.TRUNCATE_SEPARATOR);
            } else {
                strA = currencyFeature.d();
            }
            ArrayList arrayList = new ArrayList();
            List list10 = list9;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list10, 10));
            Iterator it = list10.iterator();
            while (it.hasNext()) {
                arrayList2.add(new WalletTransactionUiWrapper((WalletTransactionUiModel) it.next(), false, 6));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new WalletTransactionUiWrapper(null, true, 4));
            arrayList.add(new WalletTransactionUiWrapper(null, false, 3));
            Boolean bool2 = walletBalanceDataState3.n;
            if (bool2 != null && !bool2.booleanValue()) {
                arrayList.add(new WalletTransactionUiWrapper(null, false, 4));
            }
            if (!z) {
                walletBalanceScreenType = WalletBalanceScreenType.None.f10880a;
            } else if (list9.isEmpty()) {
                walletBalanceScreenType = (num != null && num.intValue() == 0) ? WalletBalanceScreenType.AddMoneyTutorial.f10878a : WalletBalanceScreenType.EmptyScreenWithContactSupport.f10879a;
            } else {
                walletBalanceScreenType = WalletBalanceScreenType.WalletTransactions.f10881a;
            }
            int i9 = (z8 || (walletBalanceDataState3.f10861a && !z)) ? 1 : 0;
            int i10 = walletBalanceDataState3.h > 10 ? 1 : 0;
            if (!z) {
                list9 = null;
            }
            list = walletBalanceDataState3.f;
            i = walletBalanceDataState3.g;
            walletBalanceComponent$convertToUiState$1.L$0 = walletBalanceDataState3;
            walletBalanceComponent$convertToUiState$1.L$1 = strA;
            walletBalanceComponent$convertToUiState$1.L$2 = arrayList;
            walletBalanceComponent$convertToUiState$1.L$3 = walletBalanceScreenType;
            walletBalanceComponent$convertToUiState$1.L$4 = list9;
            walletBalanceComponent$convertToUiState$1.L$5 = list;
            walletBalanceComponent$convertToUiState$1.I$0 = i9;
            walletBalanceComponent$convertToUiState$1.Z$0 = z;
            walletBalanceComponent$convertToUiState$1.I$1 = i10;
            walletBalanceComponent$convertToUiState$1.I$2 = i;
            z2 = true;
            walletBalanceComponent$convertToUiState$1.label = 1;
            Object objL0 = L0(walletBalanceScreenType, walletBalanceComponent$convertToUiState$1);
            if (objL0 != obj2) {
                str = strA;
                obj = objL0;
                int i11 = i9;
                walletBalanceScreenType2 = walletBalanceScreenType;
                i2 = i10;
                i3 = i11;
                list2 = list9;
                list3 = arrayList;
            }
            return obj2;
        }
        if (i8 == 1) {
            int i12 = walletBalanceComponent$convertToUiState$1.I$2;
            i2 = walletBalanceComponent$convertToUiState$1.I$1;
            z = walletBalanceComponent$convertToUiState$1.Z$0;
            int i13 = walletBalanceComponent$convertToUiState$1.I$0;
            List list11 = (List) walletBalanceComponent$convertToUiState$1.L$5;
            List list12 = (List) walletBalanceComponent$convertToUiState$1.L$4;
            walletBalanceScreenType2 = (WalletBalanceScreenType) walletBalanceComponent$convertToUiState$1.L$3;
            List list13 = (List) walletBalanceComponent$convertToUiState$1.L$2;
            String str4 = (String) walletBalanceComponent$convertToUiState$1.L$1;
            WalletBalanceDataState walletBalanceDataState4 = (WalletBalanceDataState) walletBalanceComponent$convertToUiState$1.L$0;
            ResultKt.b(obj);
            str = str4;
            list3 = list13;
            z2 = true;
            list = list11;
            i = i12;
            walletBalanceDataState3 = walletBalanceDataState4;
            i3 = i13;
            list2 = list12;
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = walletBalanceComponent$convertToUiState$1.I$2;
            i5 = walletBalanceComponent$convertToUiState$1.I$1;
            z3 = walletBalanceComponent$convertToUiState$1.Z$0;
            i3 = walletBalanceComponent$convertToUiState$1.I$0;
            contactSupportUIState2 = (ContactSupportUIState) walletBalanceComponent$convertToUiState$1.L$6;
            list8 = (List) walletBalanceComponent$convertToUiState$1.L$5;
            list2 = (List) walletBalanceComponent$convertToUiState$1.L$4;
            walletBalanceScreenType4 = (WalletBalanceScreenType) walletBalanceComponent$convertToUiState$1.L$3;
            list7 = (List) walletBalanceComponent$convertToUiState$1.L$2;
            str3 = (String) walletBalanceComponent$convertToUiState$1.L$1;
            walletBalanceDataState2 = (WalletBalanceDataState) walletBalanceComponent$convertToUiState$1.L$0;
            ResultKt.b(obj);
            z2 = true;
        }
        WalletBalanceScreenType walletBalanceScreenType5 = walletBalanceScreenType4;
        contactSupportUIState = contactSupportUIState2;
        walletBalanceScreenType3 = walletBalanceScreenType5;
        list4 = list2;
        list6 = list7;
        confirmationDialogUiState = (ConfirmationDialogUiState) obj;
        list5 = list8;
        i4 = i6;
        walletBalanceDataState3 = walletBalanceDataState2;
        z = z3;
        i2 = i5;
        str2 = str3;
        bool = walletBalanceDataState3.n;
        if (bool != null || bool.booleanValue()) {
            z4 = false;
        } else {
            z4 = z2;
        }
        int i14 = i4;
        if (i3 != 0) {
            z5 = z2;
        } else {
            z5 = false;
        }
        if (i2 != 0) {
            z6 = z2;
        } else {
            z6 = false;
        }
        return new WalletBalanceViewState(z5, str2, z, z6, walletBalanceScreenType3, list4, list6, i14, list5, contactSupportUIState, confirmationDialogUiState, z4);
        ContactSupportUIState contactSupportUIState3 = (ContactSupportUIState) obj;
        if (walletBalanceDataState3.m) {
            walletBalanceComponent$convertToUiState$1.L$0 = walletBalanceDataState3;
            walletBalanceComponent$convertToUiState$1.L$1 = str;
            walletBalanceComponent$convertToUiState$1.L$2 = list3;
            walletBalanceComponent$convertToUiState$1.L$3 = walletBalanceScreenType2;
            walletBalanceComponent$convertToUiState$1.L$4 = list2;
            walletBalanceComponent$convertToUiState$1.L$5 = list;
            walletBalanceComponent$convertToUiState$1.L$6 = contactSupportUIState3;
            walletBalanceComponent$convertToUiState$1.I$0 = i3;
            walletBalanceComponent$convertToUiState$1.Z$0 = z;
            walletBalanceComponent$convertToUiState$1.I$1 = i2;
            walletBalanceComponent$convertToUiState$1.I$2 = i;
            walletBalanceComponent$convertToUiState$1.label = 2;
            Object objK0 = K0(walletBalanceComponent$convertToUiState$1);
            if (objK0 != obj2) {
                i5 = i2;
                list7 = list3;
                z3 = z;
                contactSupportUIState2 = contactSupportUIState3;
                obj = objK0;
                list8 = list;
                walletBalanceDataState2 = walletBalanceDataState3;
                i6 = i;
                walletBalanceScreenType4 = walletBalanceScreenType2;
                str3 = str;
                WalletBalanceScreenType walletBalanceScreenType6 = walletBalanceScreenType4;
                contactSupportUIState = contactSupportUIState2;
                walletBalanceScreenType3 = walletBalanceScreenType6;
                list4 = list2;
                list6 = list7;
                confirmationDialogUiState = (ConfirmationDialogUiState) obj;
                list5 = list8;
                i4 = i6;
                walletBalanceDataState3 = walletBalanceDataState2;
                z = z3;
                i2 = i5;
                str2 = str3;
            }
            return obj2;
        }
        int i15 = i;
        contactSupportUIState = contactSupportUIState3;
        i4 = i15;
        str2 = str;
        list4 = list2;
        confirmationDialogUiState = null;
        list5 = list;
        list6 = list3;
        walletBalanceScreenType3 = walletBalanceScreenType2;
        bool = walletBalanceDataState3.n;
        if (bool != null) {
            z4 = false;
        } else {
            z4 = false;
        }
        int i16 = i4;
        if (i3 != 0) {
            z5 = z2;
        } else {
            z5 = false;
        }
        if (i2 != 0) {
            z6 = z2;
        } else {
            z6 = false;
        }
        return new WalletBalanceViewState(z5, str2, z, z6, walletBalanceScreenType3, list4, list6, i16, list5, contactSupportUIState, confirmationDialogUiState, z4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object K0(ContinuationImpl continuationImpl) {
        WalletBalanceComponent$getContactSupportDialogUiState$1 walletBalanceComponent$getContactSupportDialogUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof WalletBalanceComponent$getContactSupportDialogUiState$1) {
            walletBalanceComponent$getContactSupportDialogUiState$1 = (WalletBalanceComponent$getContactSupportDialogUiState$1) continuationImpl;
            int i = walletBalanceComponent$getContactSupportDialogUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBalanceComponent$getContactSupportDialogUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBalanceComponent$getContactSupportDialogUiState$1 = new WalletBalanceComponent$getContactSupportDialogUiState$1(this, continuationImpl);
            }
        } else {
            walletBalanceComponent$getContactSupportDialogUiState$1 = new WalletBalanceComponent$getContactSupportDialogUiState$1(this, continuationImpl);
        }
        Object objB = walletBalanceComponent$getContactSupportDialogUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletBalanceComponent$getContactSupportDialogUiState$1.label;
        StringProvider stringProvider = this.r;
        if (i2 == 0) {
            ResultKt.b(objB);
            StringEnum stringEnum = StringEnum.WALLET_TRANSACTIONS_EMAIL_STATEMENT_MESSAGE;
            Object[] objArr = {new Integer(2)};
            walletBalanceComponent$getContactSupportDialogUiState$1.label = 1;
            objB = stringProvider.b(stringEnum, objArr, walletBalanceComponent$getContactSupportDialogUiState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) walletBalanceComponent$getContactSupportDialogUiState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        return new ConfirmationDialogUiState(chaloTextUIState, null, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new cp1(this, 0))), null, 5), null, 21);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        walletBalanceComponent$getContactSupportDialogUiState$1.L$0 = chaloTextUIState3;
        walletBalanceComponent$getContactSupportDialogUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.OKAY, new Object[0], walletBalanceComponent$getContactSupportDialogUiState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState3;
            return new ConfirmationDialogUiState(chaloTextUIState, null, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new cp1(this, 0))), null, 5), null, 21);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object L0(WalletBalanceScreenType walletBalanceScreenType, ContinuationImpl continuationImpl) {
        WalletBalanceComponent$getContactSupportUIState$1 walletBalanceComponent$getContactSupportUIState$1;
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof WalletBalanceComponent$getContactSupportUIState$1) {
            walletBalanceComponent$getContactSupportUIState$1 = (WalletBalanceComponent$getContactSupportUIState$1) continuationImpl;
            int i = walletBalanceComponent$getContactSupportUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBalanceComponent$getContactSupportUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBalanceComponent$getContactSupportUIState$1 = new WalletBalanceComponent$getContactSupportUIState$1(this, continuationImpl);
            }
        } else {
            walletBalanceComponent$getContactSupportUIState$1 = new WalletBalanceComponent$getContactSupportUIState$1(this, continuationImpl);
        }
        Object objB = walletBalanceComponent$getContactSupportUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletBalanceComponent$getContactSupportUIState$1.label;
        StringProvider stringProvider = this.r;
        if (i2 != 0) {
            if (i2 == 1) {
                imageUIState = (ImageUIState) walletBalanceComponent$getContactSupportUIState$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState = (TextUIState.ChaloTextUIState) walletBalanceComponent$getContactSupportUIState$1.L$1;
                imageUIState2 = (ImageUIState) walletBalanceComponent$getContactSupportUIState$1.L$0;
                ResultKt.b(objB);
            }
            return new ContactSupportUIState(imageUIState2, chaloTextUIState, new ContactSupportCtaUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), UiEventHandler.Companion.a(new cp1(this, 1))), 1);
        }
        ResultKt.b(objB);
        ImageUIState imageUIState3 = Intrinsics.d(walletBalanceScreenType, WalletBalanceScreenType.WalletTransactions.f10881a) ? null : new ImageUIState(IconType.IC_EMPTY_STATE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        StringEnum stringEnum = StringEnum.WALLET_TRANSACTIONS_X_HISTORY_SUPPORT_TEXT;
        Object[] objArr = {new Integer(2)};
        walletBalanceComponent$getContactSupportUIState$1.L$0 = imageUIState3;
        walletBalanceComponent$getContactSupportUIState$1.label = 1;
        Object objB2 = stringProvider.b(stringEnum, objArr, walletBalanceComponent$getContactSupportUIState$1);
        if (objB2 != coroutineSingletons) {
            imageUIState = imageUIState3;
            objB = objB2;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        walletBalanceComponent$getContactSupportUIState$1.L$0 = imageUIState;
        walletBalanceComponent$getContactSupportUIState$1.L$1 = chaloTextUIState2;
        walletBalanceComponent$getContactSupportUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.REQUEST_HISTORY, new Object[0], walletBalanceComponent$getContactSupportUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState2 = imageUIState;
            chaloTextUIState = chaloTextUIState2;
            return new ContactSupportUIState(imageUIState2, chaloTextUIState, new ContactSupportCtaUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().f), 9), UiEventHandler.Companion.a(new cp1(this, 1))), 1);
        }
        return coroutineSingletons;
    }

    public final void M0() {
        if (((WalletAccessState) this.m.a()).b == null) {
            E0(new do1(19));
        } else {
            E0(new do1(20));
            G0(WalletAccessIntent.CheckWalletStatus.f10791a);
        }
    }

    public final void N0(WalletBalanceIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof WalletBalanceIntent.ViewCreated;
        ContextScope contextScope = this.j;
        if (z) {
            WalletTypeIdentifier walletTypeIdentifier = ((WalletBalanceIntent.ViewCreated) intent).f10871a;
            E0(new n8(this, walletTypeIdentifier.d, 15));
            BuildersKt.d(contextScope, null, null, new WalletBalanceComponent$handleViewCreated$2(this, walletTypeIdentifier, null), 3);
            return;
        }
        if (intent instanceof WalletBalanceIntent.LoadWalletBalance) {
            M0();
            return;
        }
        boolean z2 = intent instanceof WalletBalanceIntent.AddMoneyClicked;
        ChaloNavigationManager chaloNavigationManager = this.w;
        if (z2) {
            AnalyticsContract.DefaultImpls.a(this.s, "wallet balance add money clicked", Source.WALLET_BALANCE_COMPONENT.getSourceName(), null, null, false, 28);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WalletLoadMoneyArgs(7), null, null, 6));
            return;
        }
        if (intent instanceof WalletBalanceIntent.SeeAllTransactionsClicked) {
            AnalyticsContract.DefaultImpls.a(this.s, "wallet balance see all transaction clicked", Source.WALLET_BALANCE_COMPONENT.getSourceName(), null, null, false, 28);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WalletAllTransactionsArgs(false), null, null, 6));
            return;
        }
        if (intent instanceof WalletBalanceIntent.TransactionClicked) {
            WalletTransactionUiModel walletTransactionUiModel = ((WalletBalanceIntent.TransactionClicked) intent).f10870a;
            String sourceName = Source.WALLET_BALANCE_COMPONENT.getSourceName();
            String str = walletTransactionUiModel.f10884a;
            String str2 = walletTransactionUiModel.c;
            WalletTransactionType walletTransactionType = walletTransactionUiModel.h;
            AnalyticsContract.DefaultImpls.a(this.s, "wallet all transaction event clicked", sourceName, MapsKt.i(new Pair("clicked transaction id", String.valueOf(str)), new Pair("wallet balance transaction title", walletTransactionUiModel.b), new Pair("wallet balance transaction date", walletTransactionUiModel.f), new Pair("wallet balance transaction type", walletTransactionType.name()), new Pair("wallet balance transaction status", walletTransactionUiModel.e), new Pair("wallet balance orderId", str2), new Pair("wallet balance time long", Long.valueOf(walletTransactionUiModel.g))), null, false, 24);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WalletTransactionSummaryArgs(walletTransactionUiModel.f10884a, str2, walletTransactionType.name()), null, null, 6));
            return;
        }
        if (intent instanceof WalletBalanceIntent.BannerTimerIntent) {
            r0(WalletBalanceSideEffect.ScrollBannerSideEffect.f10882a);
            return;
        }
        if (intent instanceof WalletBalanceIntent.BannerClickedIntent) {
            AnalyticsContract.DefaultImpls.a(this.s, "wallet banner clicked", "WalletBalance", null, null, false, 28);
            BuildersKt.d(contextScope, null, null, new WalletBalanceComponent$handleBannerClicked$1((WalletBalanceIntent.BannerClickedIntent) intent, this, null), 3);
            return;
        }
        if (intent instanceof WalletBalanceIntent.ScrollPromotionBanner) {
            int i = ((WalletBalanceIntent.ScrollPromotionBanner) intent).f10868a;
            if (((WalletBalanceDataState) this.f.getValue()).f.size() <= 0) {
                return;
            }
            E0(new dp1(true, i, 0));
            return;
        }
        if (intent.equals(WalletBalanceIntent.RequestHistoryButtonClicked.f10867a)) {
            AnalyticsContractImplKt.b(this.s, "wallet balance request history clicked", Source.WALLET_BALANCE_COMPONENT, null, false, 28);
            E0(new do1(13));
        } else {
            if (!intent.equals(WalletBalanceIntent.ContactSupportDialogOkayClicked.f10865a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new do1(14));
        }
    }

    public final ProductFlow O0() {
        ProductFlow next;
        ProductFlow.Companion companion = ProductFlow.INSTANCE;
        String str = this.p.c;
        companion.getClass();
        Intrinsics.i(str, "str");
        Iterator<ProductFlow> it = ProductFlow.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.name(), str));
        ProductFlow productFlow = next;
        return productFlow == null ? ProductFlow.WALLET_BALANCE : productFlow;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new WalletBalanceDataState(false, null, false, false, emptyList, emptyList, 0, 0, ProductFlow.WALLET_BALANCE, false, false, null, false, null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        N0(WalletBalanceIntent.LoadWalletBalance.f10866a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
    }
}
