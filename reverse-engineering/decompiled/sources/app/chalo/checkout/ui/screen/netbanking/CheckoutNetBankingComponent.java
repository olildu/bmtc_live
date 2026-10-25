package app.chalo.checkout.ui.screen.netbanking;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.CheckoutPaymentMethod;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PaymentUiItem;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
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
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.searchbar.SearchBarUiSpecs;
import app.chalo.uistate.searchbar.SearchBarUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ch;
import defpackage.ti;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/CheckoutNetBankingComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsDataState;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewState;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutNetBankingComponent extends ChaloBaseStateMviComponent<NetBankingAppsViewIntent, NetBankingAppsDataState, NetBankingAppsViewState, NetBankingAppsSideEffect> {
    public final CheckoutPaymentDataResolver k;
    public final ICheckoutAnalyticsHelper l;
    public final CommonCheckoutItemUseCase m;
    public final ChaloNavigationManager n;
    public final StringProvider o;
    public final CurrencyFeature p;

    public CheckoutNetBankingComponent(ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CommonCheckoutItemUseCase commonCheckoutItemUseCase, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, CurrencyFeature currencyFeature) {
        super(componentContext);
        this.k = checkoutPaymentDataResolver;
        this.l = iCheckoutAnalyticsHelper;
        this.m = commonCheckoutItemUseCase;
        this.n = chaloNavigationManager;
        this.o = stringProvider;
        this.p = currencyFeature;
        H0(NetBankingAppsViewIntent.LoadNetBankingAppsListIntent.f1501a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(NetBankingAppsDataState netBankingAppsDataState, ContinuationImpl continuationImpl) {
        CheckoutNetBankingComponent$convertToUiState$1 checkoutNetBankingComponent$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        List list;
        TextUIState.ChaloTextUIState chaloTextUIState;
        CardLabelUiState cardLabelUiState;
        char c;
        float f;
        DividerUIState dividerUIState;
        if (continuationImpl instanceof CheckoutNetBankingComponent$convertToUiState$1) {
            checkoutNetBankingComponent$convertToUiState$1 = (CheckoutNetBankingComponent$convertToUiState$1) continuationImpl;
            int i = checkoutNetBankingComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutNetBankingComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutNetBankingComponent$convertToUiState$1 = new CheckoutNetBankingComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            checkoutNetBankingComponent$convertToUiState$1 = new CheckoutNetBankingComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objG0 = checkoutNetBankingComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutNetBankingComponent$convertToUiState$1.label;
        float f2 = 0.0f;
        PaymentCardUiState paymentCardUiState = null;
        if (i2 == 0) {
            ResultKt.b(objG0);
            String str = netBankingAppsDataState.c;
            List list2 = netBankingAppsDataState.d;
            if (!StringsKt.F(str)) {
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (StringsKt.m(((CheckoutPaymentItem.IndividualCheckoutItem) obj2).getF1342a().b, str, true)) {
                            arrayList.add(obj2);
                        }
                    }
                    list2 = arrayList;
                } else {
                    list2 = null;
                }
            }
            String str2 = netBankingAppsDataState.f1499a;
            toolbarUIState = str2 != null ? new ToolbarUIState(new ToolbarUiSpecs(null, new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1), 0.0f, 29), new TextUIState.ChaloTextUIState(str2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, new DividerUIState(0.0f, null, null, 7), null, 188) : null;
            checkoutNetBankingComponent$convertToUiState$1.L$0 = list2;
            checkoutNetBankingComponent$convertToUiState$1.L$1 = toolbarUIState;
            checkoutNetBankingComponent$convertToUiState$1.label = 1;
            objG0 = G0(str, checkoutNetBankingComponent$convertToUiState$1);
            if (objG0 == obj) {
                return obj;
            }
            list = list2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toolbarUIState = (ToolbarUIState) checkoutNetBankingComponent$convertToUiState$1.L$1;
            list = (List) checkoutNetBankingComponent$convertToUiState$1.L$0;
            ResultKt.b(objG0);
        }
        SearchBarUiState searchBarUiState = (SearchBarUiState) objG0;
        if (list != null) {
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, ChaloThemeHelper.a().f, 6);
            ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
            float f3 = ChaloThemeHelper.a().h;
            PaymentCardUiSpec paymentCardUiSpec = new PaymentCardUiSpec(chaloPadding, chaloPadding2, new ChaloPadding(f3, f3, f3, f3), UIShape.e, 96);
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem = (CheckoutPaymentItem.IndividualCheckoutItem) it.next();
                ModeItemDetailsUiSpec modeItemDetailsUiSpec = new ModeItemDetailsUiSpec(individualCheckoutItem.getF1342a().c ? 1.0f : 0.5f, new ChaloPadding(ChaloThemeHelper.a().h, f2, 2), 16258);
                String str3 = individualCheckoutItem.getF1342a().b;
                UITextStyle uITextStyle = UITextStyle.BodyLarge;
                UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                String str4 = individualCheckoutItem.getF1342a().e;
                TextUIState.ChaloTextUIState chaloTextUIState3 = str4 != null ? new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : paymentCardUiState;
                String str5 = individualCheckoutItem.getF1342a().f;
                if (str5 != null) {
                    TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(StringsKt.u0(str5).toString(), UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    uIFontWeight = uIFontWeight;
                    chaloTextUIState = chaloTextUIState4;
                } else {
                    chaloTextUIState = paymentCardUiState;
                }
                String str6 = individualCheckoutItem.getF1342a().d;
                if (str6 != null) {
                    float f4 = ChaloThemeHelper.a().f;
                    float f5 = ChaloThemeHelper.a().d;
                    cardLabelUiState = new CardLabelUiState(new CardLabelUiSpec(new ChaloPadding(f5, f4, f4, f5), UIShape.c), new TextUIState.ChaloTextUIState(str6, UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120));
                } else {
                    cardLabelUiState = null;
                }
                PaymentLogo paymentLogo = individualCheckoutItem.getF1342a().f1348a;
                paymentCardUiState = null;
                ModeItemDetailsUiState modeItemDetailsUiState = new ModeItemDetailsUiState(modeItemDetailsUiSpec, chaloTextUIState2, chaloTextUIState3, chaloTextUIState, cardLabelUiState, paymentLogo != null ? new CardIconUIState(paymentLogo) : null, individualCheckoutItem.getF1342a().c ? new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null, new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.UnselectedDot.f9866a, null, 4), 256);
                if (individualCheckoutItem.equals(CollectionsKt.P(list))) {
                    c = 7;
                    f = 0.0f;
                    dividerUIState = null;
                } else {
                    c = 7;
                    f = 0.0f;
                    dividerUIState = new DividerUIState(0.0f, null, null, 7);
                }
                arrayList2.add(new IndividualModeUiState(modeItemDetailsUiState, dividerUIState, individualCheckoutItem.getF1342a().c ? UiEventHandler.Companion.a(new ti(12, this, individualCheckoutItem)) : null));
                list = list;
                f2 = f;
            }
            paymentCardUiState = new PaymentCardUiState(paymentCardUiSpec, arrayList2, 118);
        }
        return new NetBankingAppsViewState(toolbarUIState, searchBarUiState, paymentCardUiState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G0(String str, ContinuationImpl continuationImpl) {
        CheckoutNetBankingComponent$getSearchBarTextFieldDetails$1 checkoutNetBankingComponent$getSearchBarTextFieldDetails$1;
        SearchBarUiSpecs searchBarUiSpecs;
        TextFieldEventHandler textFieldEventHandler;
        String str2;
        if (continuationImpl instanceof CheckoutNetBankingComponent$getSearchBarTextFieldDetails$1) {
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1 = (CheckoutNetBankingComponent$getSearchBarTextFieldDetails$1) continuationImpl;
            int i = checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutNetBankingComponent$getSearchBarTextFieldDetails$1 = new CheckoutNetBankingComponent$getSearchBarTextFieldDetails$1(this, continuationImpl);
            }
        } else {
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1 = new CheckoutNetBankingComponent$getSearchBarTextFieldDetails$1(this, continuationImpl);
        }
        Object obj = checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f = ChaloThemeHelper.a().e;
            float f2 = ChaloThemeHelper.a().g;
            SearchBarUiSpecs searchBarUiSpecs2 = new SearchBarUiSpecs(new ChaloPadding(f, f2, f2, f), 223);
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new ch(this, 19), null);
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$0 = searchBarUiSpecs2;
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$1 = str;
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$2 = textFieldEventHandlerHelper$basic$3B;
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.I$0 = 0;
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.I$1 = 0;
            checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.label = 1;
            Object objB = this.o.b(StringEnum.BANKING_HINT, new Object[0], checkoutNetBankingComponent$getSearchBarTextFieldDetails$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            searchBarUiSpecs = searchBarUiSpecs2;
            obj = objB;
            textFieldEventHandler = textFieldEventHandlerHelper$basic$3B;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextFieldEventHandler textFieldEventHandler2 = (TextFieldEventHandler) checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$2;
            String str3 = (String) checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$1;
            searchBarUiSpecs = (SearchBarUiSpecs) checkoutNetBankingComponent$getSearchBarTextFieldDetails$1.L$0;
            ResultKt.b(obj);
            textFieldEventHandler = textFieldEventHandler2;
            str2 = str3;
        }
        return new SearchBarUiState(searchBarUiSpecs, new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, null, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, null, 0, null, new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303), ChaloThemeHelper.a().n, 32700), 4);
    }

    public final void H0(NetBankingAppsViewIntent netBankingAppsViewIntent) {
        C0(netBankingAppsViewIntent);
        if (netBankingAppsViewIntent instanceof NetBankingAppsViewIntent.NetBankingItemSelected) {
            CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem netBankingPaymentItem = ((NetBankingAppsViewIntent.NetBankingItemSelected) netBankingAppsViewIntent).f1502a;
            PaymentUiItem paymentUiItem = netBankingPaymentItem.b;
            String str = paymentUiItem.b;
            CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.k;
            checkoutPaymentDataResolver.d0(str);
            this.l.k(paymentUiItem.b, CheckoutPaymentMethod.RazorPay.NetBanking.INSTANCE.b, false, false, "netbankingScreen", null);
            checkoutPaymentDataResolver.t(new SelectedPaymentInstrumentData.NetBankingData(netBankingPaymentItem.c));
            final int i = 1;
            q0(new Function0(this) { // from class: eo
                public final /* synthetic */ CheckoutNetBankingComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ChaloNavigationManager chaloNavigationManager;
                    switch (i) {
                        case 0:
                            chaloNavigationManager = this.b.n;
                            break;
                        default:
                            chaloNavigationManager = this.b.n;
                            break;
                    }
                    gf.u(null, chaloNavigationManager);
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (netBankingAppsViewIntent instanceof NetBankingAppsViewIntent.LoadNetBankingAppsListIntent) {
            BuildersKt.d(this.j, null, null, new CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1(this, null), 3);
        } else if (netBankingAppsViewIntent instanceof NetBankingAppsViewIntent.NavigateBack) {
            final int i2 = 0;
            q0(new Function0(this) { // from class: eo
                public final /* synthetic */ CheckoutNetBankingComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ChaloNavigationManager chaloNavigationManager;
                    switch (i2) {
                        case 0:
                            chaloNavigationManager = this.b.n;
                            break;
                        default:
                            chaloNavigationManager = this.b.n;
                            break;
                    }
                    gf.u(null, chaloNavigationManager);
                    return Unit.f17538a;
                }
            });
        } else {
            if (!(netBankingAppsViewIntent instanceof NetBankingAppsViewIntent.SearchTextEntered)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new ch(netBankingAppsViewIntent, 20));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new NetBankingAppsDataState(null, false, null, "");
    }
}
