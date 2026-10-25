package app.chalo.checkout.ui.screen.wallet;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase;
import app.chalo.checkout.ui.screen.payment.CardIconUIState;
import app.chalo.checkout.ui.screen.payment.CardLabelUiSpec;
import app.chalo.checkout.ui.screen.payment.CardLabelUiState;
import app.chalo.checkout.ui.screen.payment.IndividualModeUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiSpec;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiState;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
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
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import defpackage.fi;
import defpackage.ti;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/CheckoutWalletAppsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsDataState;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewState;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutWalletAppsComponent extends ChaloBaseStateMviComponent<WalletAppsViewIntent, WalletAppsDataState, WalletAppsViewState, WalletAppsSideEffect> {
    public final CheckoutPaymentDataResolver k;
    public final CommonCheckoutItemUseCase l;
    public final ICheckoutAnalyticsHelper m;
    public final CurrencyFeature n;
    public final UserProfileDetailsProvider o;
    public final StringProvider p;
    public final WalletRepository q;
    public final ChaloPayManager r;
    public final WalletResolver s;
    public final CoroutineContextProvider t;
    public final ChaloNavigationManager u;
    public final GetChaloPayCheckoutItemUseCase v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1608a;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f1608a = iArr;
        }
    }

    public CheckoutWalletAppsComponent(ComponentContext componentContext, CheckoutWalletArgs checkoutWalletArgs, CheckoutPaymentDataResolver checkoutPaymentDataResolver, CommonCheckoutItemUseCase commonCheckoutItemUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CurrencyFeature currencyFeature, UserProfileDetailsProvider userProfileDetailsProvider, StringProvider stringProvider, WalletRepository walletRepository, ChaloPayManager chaloPayManager, WalletResolver walletResolver, CoroutineContextProvider coroutineContextProvider, ChaloNavigationManager chaloNavigationManager, GetChaloPayCheckoutItemUseCase getChaloPayCheckoutItemUseCase) {
        super(componentContext);
        this.k = checkoutPaymentDataResolver;
        this.l = commonCheckoutItemUseCase;
        this.m = iCheckoutAnalyticsHelper;
        this.n = currencyFeature;
        this.o = userProfileDetailsProvider;
        this.p = stringProvider;
        this.q = walletRepository;
        this.r = chaloPayManager;
        this.s = walletResolver;
        this.t = coroutineContextProvider;
        this.u = chaloNavigationManager;
        this.v = getChaloPayCheckoutItemUseCase;
        H0(WalletAppsViewIntent.LoadWalletAppsListIntent.f1611a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r1.e(r9, r2, false, false) == r3) goto L40;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent.F0(app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r1.e(r9, r2, false, false) == r3) goto L39;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver r0 = r8.k
            app.chalo.walletframework.chalopay.ChaloPayManager r1 = r8.r
            boolean r2 = r9 instanceof app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent$checkIfSemiClosedIsPresentAndFetchState$1
            if (r2 == 0) goto L17
            r2 = r9
            app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent$checkIfSemiClosedIsPresentAndFetchState$1 r2 = (app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent$checkIfSemiClosedIsPresentAndFetchState$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent$checkIfSemiClosedIsPresentAndFetchState$1 r2 = new app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent$checkIfSemiClosedIsPresentAndFetchState$1
            r2.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3b
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            kotlin.ResultKt.b(r9)
            goto La0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.b(r9)
            goto L79
        L3b:
            kotlin.ResultKt.b(r9)
            app.chalo.checkout.data.model.app.PaymentMethodsAppModel r9 = r0.H()
            java.util.List r9 = r9.c
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r4 = r9 instanceof java.util.Collection
            if (r4 == 0) goto L54
            r4 = r9
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L54
            goto La3
        L54:
            java.util.Iterator r9 = r9.iterator()
        L58:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r9.next()
            app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel r4 = (app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel) r4
            app.chalo.checkout.data.model.app.CheckoutPaymentMethod r4 = r4.c
            app.chalo.checkout.data.model.app.CheckoutPaymentMethod$ChaloPay r7 = app.chalo.checkout.data.model.app.CheckoutPaymentMethod.ChaloPay.INSTANCE
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 == 0) goto L58
            r2.label = r6
            app.chalo.walletframework.wallet.domain.resolver.WalletResolver r8 = r8.s
            java.lang.Object r9 = r8.b(r2)
            if (r9 != r3) goto L79
            goto L9f
        L79:
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r9
            if (r9 != 0) goto L80
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L80:
            boolean r8 = r9.c
            if (r8 != 0) goto L87
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L87:
            app.chalo.features.checkout.CheckoutPaymentData r8 = r0.u()
            app.chalo.features.checkout.CheckoutOrderData r8 = r8.f2691a
            java.lang.String r8 = r8.c
            long r6 = java.lang.Long.parseLong(r8)
            r1.a(r6)
            r2.label = r5
            r8 = 0
            java.lang.Object r8 = r1.e(r9, r2, r8, r8)
            if (r8 != r3) goto La0
        L9f:
            return r3
        La0:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        La3:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent.G0(app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void H0(WalletAppsViewIntent walletAppsViewIntent) {
        C0(walletAppsViewIntent);
        if (!(walletAppsViewIntent instanceof WalletAppsViewIntent.WalletAppSelected)) {
            if (!(walletAppsViewIntent instanceof WalletAppsViewIntent.LoadWalletAppsListIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.d) {
                return;
            }
            this.d = true;
            BuildersKt.d(this.j, this.t.b(), null, new CheckoutWalletAppsComponent$handleLoadWalletAppsListIntent$1(this, null), 2);
            return;
        }
        CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem = ((WalletAppsViewIntent.WalletAppSelected) walletAppsViewIntent).f1612a;
        String lowerCase = individualCheckoutItem.getF1342a().b.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.k;
        checkoutPaymentDataResolver.d0(lowerCase);
        this.m.k(individualCheckoutItem.getF1342a().b, CheckoutPaymentMethod.RazorPay.Wallet.INSTANCE.b, false, false, "walletScreen", null);
        if (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) {
            switch (WhenMappings.f1608a[checkoutPaymentDataResolver.u().d.f5657a.ordinal()]) {
                case 1:
                    checkoutPaymentDataResolver.m0(((CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) individualCheckoutItem).c);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    checkoutPaymentDataResolver.t(new SelectedPaymentInstrumentData.WalletData(((CheckoutPaymentItem.IndividualCheckoutItem.WalletPaymentItem) individualCheckoutItem).b.b));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if ((individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ChaloPayItem) || (individualCheckoutItem instanceof CheckoutPaymentItem.IndividualCheckoutItem.ClosedLoopPayItem)) {
            checkoutPaymentDataResolver.l0(true);
        }
        q0(new fi(this, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        float f;
        PaymentCardUiState paymentCardUiState;
        PaymentCardUiState paymentCardUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        CardLabelUiState cardLabelUiState;
        char c;
        DividerUIState dividerUIState;
        WalletAppsDataState walletAppsDataState = (WalletAppsDataState) obj;
        String str = walletAppsDataState.f1609a;
        ToolbarUIState toolbarUIState = null;
        if (str != null) {
            ToolbarUiSpecs toolbarUiSpecs = new ToolbarUiSpecs(null, new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1), 0.0f, 29);
            paymentCardUiState = null;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
            f = 0.0f;
            toolbarUIState = new ToolbarUIState(toolbarUiSpecs, chaloTextUIState2, null, null, null, 0.0f, new DividerUIState(0.0f, null, null, 7), null, 188);
        } else {
            f = 0.0f;
            paymentCardUiState = null;
        }
        List list = walletAppsDataState.b;
        if (list != null) {
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, ChaloThemeHelper.a().f, 6);
            ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
            float f2 = ChaloThemeHelper.a().h;
            PaymentCardUiSpec paymentCardUiSpec = new PaymentCardUiSpec(chaloPadding, chaloPadding2, new ChaloPadding(f2, f2, f2, f2), UIShape.e, 96);
            List<CheckoutPaymentItem.IndividualCheckoutItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem : list2) {
                ModeItemDetailsUiSpec modeItemDetailsUiSpec = new ModeItemDetailsUiSpec(individualCheckoutItem.getF1342a().c ? 1.0f : 0.5f, new ChaloPadding(ChaloThemeHelper.a().h, f, 2), 16258);
                String str2 = individualCheckoutItem.getF1342a().b;
                UITextStyle uITextStyle = UITextStyle.BodyLarge;
                UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                String str3 = individualCheckoutItem.getF1342a().e;
                TextUIState.ChaloTextUIState chaloTextUIState4 = str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : paymentCardUiState;
                String str4 = individualCheckoutItem.getF1342a().f;
                if (str4 != null) {
                    TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(StringsKt.u0(str4).toString(), UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    uIFontWeight = uIFontWeight;
                    chaloTextUIState = chaloTextUIState5;
                } else {
                    chaloTextUIState = paymentCardUiState;
                }
                String str5 = individualCheckoutItem.getF1342a().d;
                if (str5 != null) {
                    float f3 = ChaloThemeHelper.a().f;
                    float f4 = ChaloThemeHelper.a().d;
                    cardLabelUiState = new CardLabelUiState(new CardLabelUiSpec(new ChaloPadding(f4, f3, f3, f4), UIShape.c), new TextUIState.ChaloTextUIState(str5, UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120));
                } else {
                    cardLabelUiState = null;
                }
                PaymentLogo paymentLogo = individualCheckoutItem.getF1342a().f1348a;
                List list3 = list;
                ModeItemDetailsUiState modeItemDetailsUiState = new ModeItemDetailsUiState(modeItemDetailsUiSpec, chaloTextUIState3, chaloTextUIState4, chaloTextUIState, cardLabelUiState, paymentLogo != null ? new CardIconUIState(paymentLogo) : null, individualCheckoutItem.getF1342a().c ? new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.UnselectedDot.f9866a, null, 4), 256);
                if (individualCheckoutItem.equals(CollectionsKt.P(list3))) {
                    f = 0.0f;
                    c = 7;
                    dividerUIState = null;
                } else {
                    f = 0.0f;
                    c = 7;
                    dividerUIState = new DividerUIState(0.0f, null, null, 7);
                }
                arrayList.add(new IndividualModeUiState(modeItemDetailsUiState, dividerUIState, individualCheckoutItem.getF1342a().c ? UiEventHandler.Companion.a(new ti(16, this, individualCheckoutItem)) : null));
                paymentCardUiState = null;
                list = list3;
            }
            paymentCardUiState2 = new PaymentCardUiState(paymentCardUiSpec, arrayList, 118);
        } else {
            paymentCardUiState2 = paymentCardUiState;
        }
        return new WalletAppsViewState(toolbarUIState, paymentCardUiState2);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new WalletAppsDataState(null, null);
    }
}
