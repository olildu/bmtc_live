package app.chalo.checkout.ui.screen.upi;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
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
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutUpiArgs;
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
import com.arkivanov.decompose.ComponentContext;
import defpackage.fi;
import defpackage.ti;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/CheckoutUpiAppsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsDataState;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewState;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutUpiAppsComponent extends ChaloBaseStateMviComponent<UpiAppsViewIntent, UpiAppsDataState, UpiAppsViewState, UpiAppsSideEffect> {
    public final CheckoutPaymentDataResolver k;
    public final CommonCheckoutItemUseCase l;
    public final ICheckoutAnalyticsHelper m;
    public final CurrencyFeature n;
    public final StringProvider o;
    public final ChaloNavigationManager p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1598a;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f1598a = iArr;
        }
    }

    public CheckoutUpiAppsComponent(CheckoutUpiArgs checkoutUpiArgs, ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, CommonCheckoutItemUseCase commonCheckoutItemUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CurrencyFeature currencyFeature, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = checkoutPaymentDataResolver;
        this.l = commonCheckoutItemUseCase;
        this.m = iCheckoutAnalyticsHelper;
        this.n = currencyFeature;
        this.o = stringProvider;
        this.p = chaloNavigationManager;
        H0(UpiAppsViewIntent.LoadUpiAppsListIntent.f1605a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(UpiAppsDataState upiAppsDataState, ContinuationImpl continuationImpl) {
        CheckoutUpiAppsComponent$convertToUiState$1 checkoutUpiAppsComponent$convertToUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ToolbarUIState toolbarUIState;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        CardLabelUiState cardLabelUiState;
        if (continuationImpl instanceof CheckoutUpiAppsComponent$convertToUiState$1) {
            checkoutUpiAppsComponent$convertToUiState$1 = (CheckoutUpiAppsComponent$convertToUiState$1) continuationImpl;
            int i = checkoutUpiAppsComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutUpiAppsComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutUpiAppsComponent$convertToUiState$1 = new CheckoutUpiAppsComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            checkoutUpiAppsComponent$convertToUiState$1 = new CheckoutUpiAppsComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objG0 = checkoutUpiAppsComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutUpiAppsComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objG0);
            String str = upiAppsDataState.f1601a;
            float f = 0.0f;
            if (str != null) {
                chaloTextUIState = null;
                toolbarUIState = new ToolbarUIState(new ToolbarUiSpecs(null, new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1), 0.0f, 29), new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, new DividerUIState(0.0f, null, null, 7), null, 188);
            } else {
                chaloTextUIState = null;
                toolbarUIState = null;
            }
            List list = upiAppsDataState.b;
            checkoutUpiAppsComponent$convertToUiState$1.L$0 = toolbarUIState;
            checkoutUpiAppsComponent$convertToUiState$1.label = 1;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                objG0 = G0(checkoutUpiAppsComponent$convertToUiState$1);
            } else {
                ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, ChaloThemeHelper.a().f, 6);
                ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
                float f2 = ChaloThemeHelper.a().h;
                PaymentCardUiSpec paymentCardUiSpec = new PaymentCardUiSpec(chaloPadding, chaloPadding2, new ChaloPadding(f2, f2, f2, f2), UIShape.e, 96);
                List list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem = (CheckoutPaymentItem.IndividualCheckoutItem) it.next();
                    ModeItemDetailsUiSpec modeItemDetailsUiSpec = new ModeItemDetailsUiSpec(individualCheckoutItem.getF1342a().c ? 1.0f : 0.5f, new ChaloPadding(ChaloThemeHelper.a().h, f, 2), 16258);
                    String str2 = individualCheckoutItem.getF1342a().b;
                    UITextStyle uITextStyle = UITextStyle.BodyLarge;
                    UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                    TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    String str3 = individualCheckoutItem.getF1342a().e;
                    TextUIState.ChaloTextUIState chaloTextUIState4 = str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : chaloTextUIState;
                    String str4 = individualCheckoutItem.getF1342a().f;
                    if (str4 != null) {
                        TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(StringsKt.u0(str4).toString(), UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        uIFontWeight = uIFontWeight;
                        chaloTextUIState2 = chaloTextUIState5;
                    } else {
                        chaloTextUIState2 = chaloTextUIState;
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
                    f = 0.0f;
                    arrayList.add(new IndividualModeUiState(new ModeItemDetailsUiState(modeItemDetailsUiSpec, chaloTextUIState3, chaloTextUIState4, chaloTextUIState2, cardLabelUiState, paymentLogo != null ? new CardIconUIState(paymentLogo) : null, individualCheckoutItem.getF1342a().c ? new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.UnselectedDot.f9866a, null, 4), 256), new DividerUIState(0.0f, null, null, 7), individualCheckoutItem.getF1342a().c ? UiEventHandler.Companion.a(new ti(15, this, individualCheckoutItem)) : null));
                    it = it;
                    chaloTextUIState = null;
                }
                objG0 = new UpiAppsScreenState.UpiApps(new PaymentCardUiState(paymentCardUiSpec, arrayList, 86));
            }
            if (objG0 == obj) {
                return obj;
            }
            toolbarUIState2 = toolbarUIState;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toolbarUIState2 = (ToolbarUIState) checkoutUpiAppsComponent$convertToUiState$1.L$0;
            ResultKt.b(objG0);
        }
        return new UpiAppsViewState(toolbarUIState2, (UpiAppsScreenState) objG0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G0(ContinuationImpl continuationImpl) {
        CheckoutUpiAppsComponent$getNoUpiAppsErrorUiState$1 checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1;
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs;
        if (continuationImpl instanceof CheckoutUpiAppsComponent$getNoUpiAppsErrorUiState$1) {
            checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1 = (CheckoutUpiAppsComponent$getNoUpiAppsErrorUiState$1) continuationImpl;
            int i = checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1 = new CheckoutUpiAppsComponent$getNoUpiAppsErrorUiState$1(this, continuationImpl);
            }
        } else {
            checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1 = new CheckoutUpiAppsComponent$getNoUpiAppsErrorUiState$1(this, continuationImpl);
        }
        Object obj = checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs2 = new NoUpiAppsErrorUiSpecs();
            checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.L$0 = noUpiAppsErrorUiSpecs2;
            checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.label = 1;
            Object objB = this.o.b(StringEnum.NO_UPI_OPTIONS_FOUND, new Object[0], checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            noUpiAppsErrorUiSpecs = noUpiAppsErrorUiSpecs2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noUpiAppsErrorUiSpecs = (NoUpiAppsErrorUiSpecs) checkoutUpiAppsComponent$getNoUpiAppsErrorUiState$1.L$0;
            ResultKt.b(obj);
        }
        return new UpiAppsScreenState.NoUpiApps(new NoUpiAppsErrorUiState(noUpiAppsErrorUiSpecs, null, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyLarge, ChaloColorToken.Gray42.f9797a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), new ImageUIState(IconType.UPI_EMPTY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254)));
    }

    public final void H0(UpiAppsViewIntent upiAppsViewIntent) {
        String str;
        C0(upiAppsViewIntent);
        if (!(upiAppsViewIntent instanceof UpiAppsViewIntent.UpiAppSelected)) {
            if (!(upiAppsViewIntent instanceof UpiAppsViewIntent.LoadUpiAppsListIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(this.j, null, null, new CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1(this, null), 3);
            return;
        }
        UpiAppsViewIntent.UpiAppSelected upiAppSelected = (UpiAppsViewIntent.UpiAppSelected) upiAppsViewIntent;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.k;
        switch (WhenMappings.f1598a[checkoutPaymentDataResolver.u().d.f5657a.ordinal()]) {
            case 1:
                str = CheckoutPaymentMethod.RazorPay.Upi.INSTANCE.b;
                break;
            case 2:
                str = CheckoutPaymentMethod.Inai.Upi.INSTANCE.b;
                break;
            case 3:
                str = CheckoutPaymentMethod.PhonePe.Upi.INSTANCE.b;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str2 = str;
        checkoutPaymentDataResolver.m0(str2);
        CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem = upiAppSelected.f1606a;
        PaymentUiItem paymentUiItem = uPIIntentPaymentItem.b;
        checkoutPaymentDataResolver.d0(paymentUiItem.b);
        this.m.k(paymentUiItem.b, str2, false, false, "upiScreen", null);
        checkoutPaymentDataResolver.t(new SelectedPaymentInstrumentData.UpiData.IntentFlow(uPIIntentPaymentItem.c));
        q0(new fi(this, 14));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new UpiAppsDataState(null, null);
    }
}
