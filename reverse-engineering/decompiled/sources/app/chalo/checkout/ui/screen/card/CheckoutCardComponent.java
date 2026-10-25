package app.chalo.checkout.ui.screen.card;

import androidx.compose.runtime.ComposerKt;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.CardFieldType;
import app.chalo.checkout.domain.ValidateCheckoutCardDataUseCase;
import app.chalo.checkout.ui.screen.card.CheckoutCardDataState;
import app.chalo.checkout.ui.screen.card.CheckoutCardDetails;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIColor;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
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
import app.chalo.uistate.textField.TextFieldWithErrorUISpec;
import app.chalo.uistate.textField.TextFieldWithErrorUiState;
import app.chalo.uistate.textField.UIImeAction;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ch;
import defpackage.ti;
import defpackage.tn;
import defpackage.un;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.crypto.signers.ISOTrailers;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewIntent;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardDataState;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewState;", "Lapp/chalo/checkout/ui/screen/card/CheckoutCardSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutCardComponent extends ChaloBaseStateMviComponent<CheckoutCardViewIntent, CheckoutCardDataState, CheckoutCardViewState, CheckoutCardSideEffect> {
    public final CheckoutPaymentDataResolver k;
    public final ValidateCheckoutCardDataUseCase l;
    public final StringProvider m;
    public final ICheckoutAnalyticsHelper n;
    public final CurrencyFeature o;
    public final ChaloNavigationManager p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1436a;

        static {
            int[] iArr = new int[CardFieldType.values().length];
            try {
                iArr[CardFieldType.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardFieldType.CARD_EXPIRY_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardFieldType.NEW_CARD_CVV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardFieldType.CARD_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1436a = iArr;
        }
    }

    public CheckoutCardComponent(ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, ValidateCheckoutCardDataUseCase validateCheckoutCardDataUseCase, StringProvider stringProvider, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CurrencyFeature currencyFeature, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = checkoutPaymentDataResolver;
        this.l = validateCheckoutCardDataUseCase;
        this.m = stringProvider;
        this.n = iCheckoutAnalyticsHelper;
        this.o = currencyFeature;
        this.p = chaloNavigationManager;
        N0(CheckoutCardViewIntent.ViewCreatedIntent.f1445a);
    }

    public static TextFieldWithErrorUISpec L0(Boolean bool, boolean z) {
        ChaloColorToken chaloColorToken;
        TextFieldWithErrorUISpec textFieldWithErrorUISpec = new TextFieldWithErrorUISpec((BorderUISpec) null, (ChaloPadding) null, 7);
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            chaloColorToken = ChaloColorToken.DarkRed.f9786a;
        } else {
            chaloColorToken = z ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.LightGray.f9814a;
        }
        BorderUISpec borderUISpecA = BorderUISpec.a(textFieldWithErrorUISpec.f10108a, chaloColorToken);
        ChaloPadding boxPadding = textFieldWithErrorUISpec.b;
        Intrinsics.i(boxPadding, "boxPadding");
        ChaloPadding errorTextPadding = textFieldWithErrorUISpec.c;
        Intrinsics.i(errorTextPadding, "errorTextPadding");
        return new TextFieldWithErrorUISpec(borderUISpecA, boxPadding, errorTextPadding);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Object p0(CheckoutCardDataState checkoutCardDataState, ContinuationImpl continuationImpl) {
        CheckoutCardComponent$convertToUiState$1 checkoutCardComponent$convertToUiState$1;
        CheckoutCardDataState checkoutCardDataState2;
        CheckoutCardUiSpec checkoutCardUiSpec;
        ToolbarUIState toolbarUIState;
        CheckoutCardDataState checkoutCardDataState3;
        CheckoutCardUiSpec checkoutCardUiSpec2;
        String str;
        CheckoutCardDetails checkoutCardDetails;
        ButtonUIState buttonUIState;
        if (continuationImpl instanceof CheckoutCardComponent$convertToUiState$1) {
            checkoutCardComponent$convertToUiState$1 = (CheckoutCardComponent$convertToUiState$1) continuationImpl;
            int i = checkoutCardComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$convertToUiState$1 = new CheckoutCardComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$convertToUiState$1 = new CheckoutCardComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj = checkoutCardComponent$convertToUiState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
            float f = ChaloThemeHelper.a().h;
            CheckoutCardUiSpec checkoutCardUiSpec3 = new CheckoutCardUiSpec(chaloPadding, new CardBottomCtaUiSpec(new ChaloPadding(f, f, f, f), ChaloThemeHelper.a().n));
            checkoutCardDataState2 = checkoutCardDataState;
            checkoutCardComponent$convertToUiState$1.L$0 = checkoutCardDataState2;
            checkoutCardComponent$convertToUiState$1.L$1 = checkoutCardUiSpec3;
            checkoutCardComponent$convertToUiState$1.label = 1;
            Object objM0 = M0(checkoutCardComponent$convertToUiState$1);
            if (objM0 != obj2) {
                checkoutCardUiSpec = checkoutCardUiSpec3;
                obj = objM0;
            }
            return obj2;
        }
        if (i2 == 1) {
            CheckoutCardUiSpec checkoutCardUiSpec4 = (CheckoutCardUiSpec) checkoutCardComponent$convertToUiState$1.L$1;
            CheckoutCardDataState checkoutCardDataState4 = (CheckoutCardDataState) checkoutCardComponent$convertToUiState$1.L$0;
            ResultKt.b(obj);
            checkoutCardUiSpec = checkoutCardUiSpec4;
            checkoutCardDataState2 = checkoutCardDataState4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toolbarUIState = (ToolbarUIState) checkoutCardComponent$convertToUiState$1.L$2;
            checkoutCardUiSpec2 = (CheckoutCardUiSpec) checkoutCardComponent$convertToUiState$1.L$1;
            checkoutCardDataState3 = (CheckoutCardDataState) checkoutCardComponent$convertToUiState$1.L$0;
            ResultKt.b(obj);
        }
        List list = (List) obj;
        str = checkoutCardDataState3.f1439a;
        checkoutCardDetails = checkoutCardDataState3.b;
        if (str != null) {
            buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.BodyLarge, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), false, UIShape.e, null, new ButtonUIColor(ChaloColorToken.OrangePrimary.f9835a, 2), UiEventHandler.Companion.a(new ti(11, this, checkoutCardDetails)), 0.0f, null, ComposerKt.compositionLocalMapKey);
        } else {
            buttonUIState = null;
        }
        return new CheckoutCardViewState(checkoutCardUiSpec2, toolbarUIState, list, buttonUIState);
        ToolbarUIState toolbarUIState2 = (ToolbarUIState) obj;
        checkoutCardComponent$convertToUiState$1.L$0 = checkoutCardDataState2;
        checkoutCardComponent$convertToUiState$1.L$1 = checkoutCardUiSpec;
        checkoutCardComponent$convertToUiState$1.L$2 = toolbarUIState2;
        checkoutCardComponent$convertToUiState$1.label = 2;
        Object objK0 = K0(checkoutCardComponent$convertToUiState$1);
        if (objK0 != obj2) {
            toolbarUIState = toolbarUIState2;
            obj = objK0;
            checkoutCardDataState3 = checkoutCardDataState2;
            checkoutCardUiSpec2 = checkoutCardUiSpec;
            List list2 = (List) obj;
            str = checkoutCardDataState3.f1439a;
            checkoutCardDetails = checkoutCardDataState3.b;
            if (str != null) {
                buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.BodyLarge, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), false, UIShape.e, null, new ButtonUIColor(ChaloColorToken.OrangePrimary.f9835a, 2), UiEventHandler.Companion.a(new ti(11, this, checkoutCardDetails)), 0.0f, null, ComposerKt.compositionLocalMapKey);
            } else {
                buttonUIState = null;
            }
            return new CheckoutCardViewState(checkoutCardUiSpec2, toolbarUIState, list2, buttonUIState);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G0(String str, Boolean bool, boolean z, ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getCardNumberTextFieldsDetails$1 checkoutCardComponent$getCardNumberTextFieldsDetails$1;
        UITextStyle uITextStyle;
        boolean z2;
        TextFieldEventHandler textFieldEventHandler;
        Object obj;
        Boolean bool2;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        Boolean bool3;
        boolean z3;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        if (continuationImpl instanceof CheckoutCardComponent$getCardNumberTextFieldsDetails$1) {
            checkoutCardComponent$getCardNumberTextFieldsDetails$1 = (CheckoutCardComponent$getCardNumberTextFieldsDetails$1) continuationImpl;
            int i = checkoutCardComponent$getCardNumberTextFieldsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getCardNumberTextFieldsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getCardNumberTextFieldsDetails$1 = new CheckoutCardComponent$getCardNumberTextFieldsDetails$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getCardNumberTextFieldsDetails$1 = new CheckoutCardComponent$getCardNumberTextFieldsDetails$1(this, continuationImpl);
        }
        Object obj2 = checkoutCardComponent$getCardNumberTextFieldsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$getCardNumberTextFieldsDetails$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(obj2);
            uITextStyle = UITextStyle.HeadlineMedium;
            final un unVar = new un(this, 0);
            final un unVar2 = new un(this, 1);
            TextFieldEventHandler textFieldEventHandler2 = new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$cardNumber$1
                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final void a(boolean z4) {
                    unVar2.invoke(Boolean.valueOf(z4));
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final String b(String value) {
                    Intrinsics.i(value, "value");
                    StringBuilder sb = new StringBuilder();
                    int length = value.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = value.charAt(i3);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    int length2 = string.length();
                    if (length2 > 16) {
                        length2 = 16;
                    }
                    String strSubstring = string.substring(0, length2);
                    Intrinsics.h(strSubstring, "substring(...)");
                    if (value.length() <= 19) {
                        unVar.invoke(strSubstring);
                    }
                    return strSubstring;
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final UITransformedText c(String value) {
                    Intrinsics.i(value, "value");
                    if (value.length() >= 16) {
                        value = StringsKt.c0(value, new IntRange(0, 15, 1));
                    }
                    int length = value.length();
                    String strA = "";
                    for (int i3 = 0; i3 < length; i3++) {
                        strA = strA + value.charAt(i3);
                        if (i3 % 4 == 3 && i3 != 15) {
                            strA = vo1.A(strA, " ");
                        }
                    }
                    return new UITransformedText(strA, new TextFieldEventHandlerHelper$cardNumber$1$visualTransformation$creditCardOffsetTranslator$1());
                }
            };
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$0 = str;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$1 = bool;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$2 = uITextStyle;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$3 = textFieldEventHandler2;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.Z$0 = z;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.label = 1;
            Object objB = stringProvider.b(StringEnum.CARD_NUMBER, new Object[0], checkoutCardComponent$getCardNumberTextFieldsDetails$1);
            if (objB != coroutineSingletons) {
                z2 = z;
                textFieldEventHandler = textFieldEventHandler2;
                obj = objB;
                bool2 = bool;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = checkoutCardComponent$getCardNumberTextFieldsDetails$1.Z$0;
            TextFieldEventHandler textFieldEventHandler3 = (TextFieldEventHandler) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$3;
            uITextStyle = (UITextStyle) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$2;
            Boolean bool4 = (Boolean) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$1;
            str2 = (String) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
            textFieldEventHandler = textFieldEventHandler3;
            obj = obj2;
            bool2 = bool4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = checkoutCardComponent$getCardNumberTextFieldsDetails$1.Z$0;
            textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$1;
            bool3 = (Boolean) checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        bool2 = bool3;
        textFieldUIState = textFieldUIState2;
        chaloTextUIState = chaloTextUIState2;
        z2 = z3;
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
        chaloTextUIState = null;
        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, uITextStyle, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, (z2 || str2.length() > 0) ? UITextStyle.BodySmall : UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176)), null, null, bool2 != null ? bool2.booleanValue() : false, new UIKeyboardOption(null, UIKeyboardType.Phone, new UIImeActionHandler(UIImeAction.Next, new tn(this, 1)), 1), 19, UIShape.e, new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303), ChaloThemeHelper.a().n, 6604);
        if (Intrinsics.d(bool2, Boolean.TRUE)) {
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$0 = bool2;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$1 = textFieldUIState;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$2 = null;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.L$3 = null;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.Z$0 = z2;
            checkoutCardComponent$getCardNumberTextFieldsDetails$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.CARD_NUMBER_ERROR, new Object[0], checkoutCardComponent$getCardNumberTextFieldsDetails$1);
            if (objB2 != coroutineSingletons) {
                bool3 = bool2;
                obj2 = objB2;
                z3 = z2;
                textFieldUIState2 = textFieldUIState;
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                bool2 = bool3;
                textFieldUIState = textFieldUIState2;
                chaloTextUIState = chaloTextUIState3;
                z2 = z3;
            }
            return coroutineSingletons;
        }
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(String str, Boolean bool, boolean z, ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getCvvTextFieldsDetails$1 checkoutCardComponent$getCvvTextFieldsDetails$1;
        UITextStyle uITextStyle;
        boolean z2;
        TextFieldEventHandler textFieldEventHandler;
        Object obj;
        Boolean bool2;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        Boolean bool3;
        boolean z3;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        if (continuationImpl instanceof CheckoutCardComponent$getCvvTextFieldsDetails$1) {
            checkoutCardComponent$getCvvTextFieldsDetails$1 = (CheckoutCardComponent$getCvvTextFieldsDetails$1) continuationImpl;
            int i = checkoutCardComponent$getCvvTextFieldsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getCvvTextFieldsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getCvvTextFieldsDetails$1 = new CheckoutCardComponent$getCvvTextFieldsDetails$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getCvvTextFieldsDetails$1 = new CheckoutCardComponent$getCvvTextFieldsDetails$1(this, continuationImpl);
        }
        Object obj2 = checkoutCardComponent$getCvvTextFieldsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$getCvvTextFieldsDetails$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(obj2);
            uITextStyle = UITextStyle.HeadlineMedium;
            final un unVar = new un(this, 4);
            final un unVar2 = new un(this, 5);
            TextFieldEventHandler textFieldEventHandler2 = new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$cvv$1
                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final void a(boolean z4) {
                    unVar2.invoke(Boolean.valueOf(z4));
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final String b(String value) {
                    Intrinsics.i(value, "value");
                    StringBuilder sb = new StringBuilder();
                    int length = value.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = value.charAt(i3);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    int length2 = string.length();
                    if (length2 > 4) {
                        length2 = 4;
                    }
                    String strSubstring = string.substring(0, length2);
                    Intrinsics.h(strSubstring, "substring(...)");
                    unVar.invoke(strSubstring);
                    return strSubstring;
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final UITransformedText c(String value) {
                    Intrinsics.i(value, "value");
                    int length = value.length();
                    String strA = "";
                    for (int i3 = 0; i3 < length; i3++) {
                        strA = vo1.A(strA, "•");
                    }
                    return new UITransformedText(strA, new TextFieldEventHandlerHelper$cvv$1$visualTransformation$cvvOffsetTranslator$1());
                }
            };
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$0 = str;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$1 = bool;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$2 = uITextStyle;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$3 = textFieldEventHandler2;
            checkoutCardComponent$getCvvTextFieldsDetails$1.Z$0 = z;
            checkoutCardComponent$getCvvTextFieldsDetails$1.label = 1;
            Object objB = stringProvider.b(StringEnum.CVV, new Object[0], checkoutCardComponent$getCvvTextFieldsDetails$1);
            if (objB != coroutineSingletons) {
                z2 = z;
                textFieldEventHandler = textFieldEventHandler2;
                obj = objB;
                bool2 = bool;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = checkoutCardComponent$getCvvTextFieldsDetails$1.Z$0;
            TextFieldEventHandler textFieldEventHandler3 = (TextFieldEventHandler) checkoutCardComponent$getCvvTextFieldsDetails$1.L$3;
            uITextStyle = (UITextStyle) checkoutCardComponent$getCvvTextFieldsDetails$1.L$2;
            Boolean bool4 = (Boolean) checkoutCardComponent$getCvvTextFieldsDetails$1.L$1;
            str2 = (String) checkoutCardComponent$getCvvTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
            textFieldEventHandler = textFieldEventHandler3;
            obj = obj2;
            bool2 = bool4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = checkoutCardComponent$getCvvTextFieldsDetails$1.Z$0;
            textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) checkoutCardComponent$getCvvTextFieldsDetails$1.L$1;
            bool3 = (Boolean) checkoutCardComponent$getCvvTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        bool2 = bool3;
        textFieldUIState = textFieldUIState2;
        chaloTextUIState = chaloTextUIState2;
        z2 = z3;
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
        chaloTextUIState = null;
        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, uITextStyle, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, (z2 || str2.length() > 0) ? UITextStyle.BodySmall : UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176)), null, null, bool2 != null ? bool2.booleanValue() : false, new UIKeyboardOption(null, UIKeyboardType.NumberPassword, new UIImeActionHandler(UIImeAction.Next, new tn(this, 3)), 1), 4, UIShape.e, new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303), ChaloThemeHelper.a().n, 6604);
        if (Intrinsics.d(bool2, Boolean.TRUE)) {
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$0 = bool2;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$1 = textFieldUIState;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$2 = null;
            checkoutCardComponent$getCvvTextFieldsDetails$1.L$3 = null;
            checkoutCardComponent$getCvvTextFieldsDetails$1.Z$0 = z2;
            checkoutCardComponent$getCvvTextFieldsDetails$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.CVV_ERROR, new Object[0], checkoutCardComponent$getCvvTextFieldsDetails$1);
            if (objB2 != coroutineSingletons) {
                bool3 = bool2;
                obj2 = objB2;
                z3 = z2;
                textFieldUIState2 = textFieldUIState;
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                bool2 = bool3;
                textFieldUIState = textFieldUIState2;
                chaloTextUIState = chaloTextUIState3;
                z2 = z3;
            }
            return coroutineSingletons;
        }
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I0(String str, Boolean bool, boolean z, ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getExpiryDateTextFieldsDetails$1 checkoutCardComponent$getExpiryDateTextFieldsDetails$1;
        UITextStyle uITextStyle;
        boolean z2;
        TextFieldEventHandler textFieldEventHandler;
        Object obj;
        Boolean bool2;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        Boolean bool3;
        boolean z3;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        if (continuationImpl instanceof CheckoutCardComponent$getExpiryDateTextFieldsDetails$1) {
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1 = (CheckoutCardComponent$getExpiryDateTextFieldsDetails$1) continuationImpl;
            int i = checkoutCardComponent$getExpiryDateTextFieldsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getExpiryDateTextFieldsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getExpiryDateTextFieldsDetails$1 = new CheckoutCardComponent$getExpiryDateTextFieldsDetails$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1 = new CheckoutCardComponent$getExpiryDateTextFieldsDetails$1(this, continuationImpl);
        }
        Object obj2 = checkoutCardComponent$getExpiryDateTextFieldsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$getExpiryDateTextFieldsDetails$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(obj2);
            uITextStyle = UITextStyle.HeadlineMedium;
            final un unVar = new un(this, 6);
            final un unVar2 = new un(this, 7);
            TextFieldEventHandler textFieldEventHandler2 = new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$expiryDate$1
                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final void a(boolean z4) {
                    unVar2.invoke(Boolean.valueOf(z4));
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final String b(String value) {
                    String strSubstring;
                    Intrinsics.i(value, "value");
                    StringBuilder sb = new StringBuilder();
                    int length = value.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = value.charAt(i3);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    int length2 = string.length();
                    if (length2 == 0) {
                        string = "";
                    } else if (length2 != 1) {
                        if (length2 != 2) {
                            String strSubstring2 = string.substring(0, 2);
                            Intrinsics.h(strSubstring2, "substring(...)");
                            Integer numQ0 = StringsKt.q0(strSubstring2);
                            if ((numQ0 != null ? numQ0.intValue() : 0) > 12) {
                                strSubstring = "12";
                            } else {
                                strSubstring = string.substring(0, 2);
                                Intrinsics.h(strSubstring, "substring(...)");
                            }
                            String strSubstring3 = string.substring(2, Math.min(4, length2));
                            Intrinsics.h(strSubstring3, "substring(...)");
                            string = vo1.n(strSubstring, "/", strSubstring3);
                        } else {
                            Integer numQ1 = StringsKt.q0(string);
                            if ((numQ1 != null ? numQ1.intValue() : 0) > 12) {
                                string = "0" + string.charAt(0) + "/" + string.charAt(1);
                            }
                        }
                    } else if (Integer.parseInt(string) > 1) {
                        string = "0".concat(string);
                    }
                    unVar.invoke(string);
                    return string;
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final /* bridge */ UITransformedText c(String str3) {
                    return TextFieldEventHandler.DefaultImpls.a(str3);
                }
            };
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$0 = str;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$1 = bool;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$2 = uITextStyle;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$3 = textFieldEventHandler2;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.Z$0 = z;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.label = 1;
            Object objB = stringProvider.b(StringEnum.EXPIRY_DATE, new Object[0], checkoutCardComponent$getExpiryDateTextFieldsDetails$1);
            if (objB != coroutineSingletons) {
                z2 = z;
                textFieldEventHandler = textFieldEventHandler2;
                obj = objB;
                bool2 = bool;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = checkoutCardComponent$getExpiryDateTextFieldsDetails$1.Z$0;
            TextFieldEventHandler textFieldEventHandler3 = (TextFieldEventHandler) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$3;
            uITextStyle = (UITextStyle) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$2;
            Boolean bool4 = (Boolean) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$1;
            str2 = (String) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
            textFieldEventHandler = textFieldEventHandler3;
            obj = obj2;
            bool2 = bool4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = checkoutCardComponent$getExpiryDateTextFieldsDetails$1.Z$0;
            textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$1;
            bool3 = (Boolean) checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        bool2 = bool3;
        textFieldUIState = textFieldUIState2;
        chaloTextUIState = chaloTextUIState2;
        z2 = z3;
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
        chaloTextUIState = null;
        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, uITextStyle, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, (z2 || str2.length() > 0) ? UITextStyle.BodySmall : UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176)), null, null, bool2 != null ? bool2.booleanValue() : false, new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Next, new tn(this, 0)), 1), 5, UIShape.e, new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303), ChaloThemeHelper.a().n, 6604);
        if (Intrinsics.d(bool2, Boolean.TRUE)) {
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$0 = bool2;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$1 = textFieldUIState;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$2 = null;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.L$3 = null;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.Z$0 = z2;
            checkoutCardComponent$getExpiryDateTextFieldsDetails$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.EXPIRY_ERROR, new Object[0], checkoutCardComponent$getExpiryDateTextFieldsDetails$1);
            if (objB2 != coroutineSingletons) {
                bool3 = bool2;
                obj2 = objB2;
                z3 = z2;
                textFieldUIState2 = textFieldUIState;
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                bool2 = bool3;
                textFieldUIState = textFieldUIState2;
                chaloTextUIState = chaloTextUIState3;
                z2 = z3;
            }
            return coroutineSingletons;
        }
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(String str, Boolean bool, boolean z, ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getHolderNameTextFieldsDetails$1 checkoutCardComponent$getHolderNameTextFieldsDetails$1;
        UITextStyle uITextStyle;
        boolean z2;
        TextFieldEventHandler textFieldEventHandler;
        Object obj;
        Boolean bool2;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState;
        Boolean bool3;
        boolean z3;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState2;
        if (continuationImpl instanceof CheckoutCardComponent$getHolderNameTextFieldsDetails$1) {
            checkoutCardComponent$getHolderNameTextFieldsDetails$1 = (CheckoutCardComponent$getHolderNameTextFieldsDetails$1) continuationImpl;
            int i = checkoutCardComponent$getHolderNameTextFieldsDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getHolderNameTextFieldsDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getHolderNameTextFieldsDetails$1 = new CheckoutCardComponent$getHolderNameTextFieldsDetails$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getHolderNameTextFieldsDetails$1 = new CheckoutCardComponent$getHolderNameTextFieldsDetails$1(this, continuationImpl);
        }
        Object obj2 = checkoutCardComponent$getHolderNameTextFieldsDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$getHolderNameTextFieldsDetails$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(obj2);
            uITextStyle = UITextStyle.HeadlineMedium;
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3A = TextFieldEventHandlerHelper.a(new un(this, 2), new un(this, 3));
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$0 = str;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$1 = bool;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$2 = uITextStyle;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$3 = textFieldEventHandlerHelper$basic$3A;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.Z$0 = z;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.label = 1;
            Object objB = stringProvider.b(StringEnum.CARD_NAME, new Object[0], checkoutCardComponent$getHolderNameTextFieldsDetails$1);
            if (objB != coroutineSingletons) {
                z2 = z;
                textFieldEventHandler = textFieldEventHandlerHelper$basic$3A;
                obj = objB;
                bool2 = bool;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = checkoutCardComponent$getHolderNameTextFieldsDetails$1.Z$0;
            TextFieldEventHandler textFieldEventHandler2 = (TextFieldEventHandler) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$3;
            uITextStyle = (UITextStyle) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$2;
            Boolean bool4 = (Boolean) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$1;
            str2 = (String) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
            textFieldEventHandler = textFieldEventHandler2;
            obj = obj2;
            bool2 = bool4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = checkoutCardComponent$getHolderNameTextFieldsDetails$1.Z$0;
            textFieldUIState2 = (BaseTextFieldUIState.TextFieldUIState) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$1;
            bool3 = (Boolean) checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$0;
            ResultKt.b(obj2);
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        bool2 = bool3;
        textFieldUIState = textFieldUIState2;
        chaloTextUIState = chaloTextUIState2;
        z2 = z3;
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
        chaloTextUIState = null;
        textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandler, uITextStyle, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, (z2 || str2.length() > 0) ? UITextStyle.BodySmall : UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176)), null, null, bool2 != null ? bool2.booleanValue() : false, new UIKeyboardOption(null, UIKeyboardType.Text, new UIImeActionHandler(UIImeAction.None, new tn(this, 2)), 1), 0, UIShape.e, new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303), ChaloThemeHelper.a().n, ISOTrailers.TRAILER_SHA512_224);
        if (Intrinsics.d(bool2, Boolean.TRUE)) {
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$0 = bool2;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$1 = textFieldUIState;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$2 = null;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.L$3 = null;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.Z$0 = z2;
            checkoutCardComponent$getHolderNameTextFieldsDetails$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.CARD_NAME_ERROR, new Object[0], checkoutCardComponent$getHolderNameTextFieldsDetails$1);
            if (objB2 != coroutineSingletons) {
                bool3 = bool2;
                obj2 = objB2;
                z3 = z2;
                textFieldUIState2 = textFieldUIState;
                TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) obj2, UITextStyle.BodySmall, ChaloColorToken.DarkRed.f9786a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                bool2 = bool3;
                textFieldUIState = textFieldUIState2;
                chaloTextUIState = chaloTextUIState3;
                z2 = z3;
            }
            return coroutineSingletons;
        }
        return new TextFieldWithErrorUiState(L0(bool2, z2), textFieldUIState, chaloTextUIState);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    /* JADX WARN: Code duplicated, block: B:46:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getPaymentCardFieldUiState$1 checkoutCardComponent$getPaymentCardFieldUiState$1;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr;
        CardFieldType cardFieldType;
        int i;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr2;
        CardFieldType cardFieldType2;
        int i2;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr3;
        CardFieldType cardFieldType3;
        boolean z;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr4;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr5;
        CardFieldType cardFieldType4;
        String str;
        Object objJ0;
        CardFieldType cardFieldType5;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr6;
        PaymentCardFieldUiState[] paymentCardFieldUiStateArr7;
        if (continuationImpl instanceof CheckoutCardComponent$getPaymentCardFieldUiState$1) {
            checkoutCardComponent$getPaymentCardFieldUiState$1 = (CheckoutCardComponent$getPaymentCardFieldUiState$1) continuationImpl;
            int i3 = checkoutCardComponent$getPaymentCardFieldUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getPaymentCardFieldUiState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getPaymentCardFieldUiState$1 = new CheckoutCardComponent$getPaymentCardFieldUiState$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getPaymentCardFieldUiState$1 = new CheckoutCardComponent$getPaymentCardFieldUiState$1(this, continuationImpl);
        }
        Object objG0 = checkoutCardComponent$getPaymentCardFieldUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = checkoutCardComponent$getPaymentCardFieldUiState$1.label;
        int i5 = 3;
        int i6 = 2;
        StateFlow stateFlow = this.f;
        if (i4 == 0) {
            ResultKt.b(objG0);
            paymentCardFieldUiStateArr = new PaymentCardFieldUiState[4];
            cardFieldType = CardFieldType.CARD_NUMBER;
            String str2 = ((CheckoutCardDataState) stateFlow.getValue()).b.b;
            Boolean bool = ((CheckoutCardDataState) stateFlow.getValue()).c;
            boolean z2 = ((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType;
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr;
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr;
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType;
            checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 0;
            checkoutCardComponent$getPaymentCardFieldUiState$1.label = 1;
            objG0 = G0(str2, bool, z2, checkoutCardComponent$getPaymentCardFieldUiState$1);
            if (objG0 != obj) {
                i = 0;
                paymentCardFieldUiStateArr2 = paymentCardFieldUiStateArr;
            }
            return obj;
        }
        if (i4 == 1) {
            i = checkoutCardComponent$getPaymentCardFieldUiState$1.I$0;
            cardFieldType = (CardFieldType) checkoutCardComponent$getPaymentCardFieldUiState$1.L$2;
            paymentCardFieldUiStateArr = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$1;
            paymentCardFieldUiStateArr2 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$0;
            ResultKt.b(objG0);
        } else {
            if (i4 == 2) {
                i2 = checkoutCardComponent$getPaymentCardFieldUiState$1.I$0;
                cardFieldType2 = (CardFieldType) checkoutCardComponent$getPaymentCardFieldUiState$1.L$2;
                paymentCardFieldUiStateArr3 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$1;
                paymentCardFieldUiStateArr2 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$0;
                ResultKt.b(objG0);
                paymentCardFieldUiStateArr3[i2] = new PaymentCardFieldUiState(cardFieldType2, (TextFieldWithErrorUiState) objG0);
                cardFieldType3 = CardFieldType.NEW_CARD_CVV;
                String str3 = ((CheckoutCardDataState) stateFlow.getValue()).b.f1440a;
                Boolean bool2 = ((CheckoutCardDataState) stateFlow.getValue()).e;
                if (((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType3) {
                    z = true;
                } else {
                    z = false;
                }
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr2;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr2;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType3;
                checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 2;
                checkoutCardComponent$getPaymentCardFieldUiState$1.label = 3;
                objG0 = H0(str3, bool2, z, checkoutCardComponent$getPaymentCardFieldUiState$1);
                if (objG0 != obj) {
                    paymentCardFieldUiStateArr4 = paymentCardFieldUiStateArr2;
                    paymentCardFieldUiStateArr5 = paymentCardFieldUiStateArr4;
                    paymentCardFieldUiStateArr4[i6] = new PaymentCardFieldUiState(cardFieldType3, (TextFieldWithErrorUiState) objG0);
                    cardFieldType4 = CardFieldType.CARD_NAME;
                    str = ((CheckoutCardDataState) stateFlow.getValue()).b.d;
                    if (str == null) {
                        str = "";
                    }
                    Boolean bool3 = ((CheckoutCardDataState) stateFlow.getValue()).f;
                    if (((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType4) {
                    }
                    checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr5;
                    checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr5;
                    checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType4;
                    checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 3;
                    checkoutCardComponent$getPaymentCardFieldUiState$1.label = 4;
                    objJ0 = J0(str, bool3, z, checkoutCardComponent$getPaymentCardFieldUiState$1);
                    if (objJ0 != obj) {
                        cardFieldType5 = cardFieldType4;
                        objG0 = objJ0;
                        paymentCardFieldUiStateArr6 = paymentCardFieldUiStateArr5;
                        paymentCardFieldUiStateArr7 = paymentCardFieldUiStateArr6;
                    }
                }
                return obj;
            }
            if (i4 == 3) {
                i6 = checkoutCardComponent$getPaymentCardFieldUiState$1.I$0;
                cardFieldType3 = (CardFieldType) checkoutCardComponent$getPaymentCardFieldUiState$1.L$2;
                paymentCardFieldUiStateArr4 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$1;
                paymentCardFieldUiStateArr5 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$0;
                ResultKt.b(objG0);
                paymentCardFieldUiStateArr4[i6] = new PaymentCardFieldUiState(cardFieldType3, (TextFieldWithErrorUiState) objG0);
                cardFieldType4 = CardFieldType.CARD_NAME;
                str = ((CheckoutCardDataState) stateFlow.getValue()).b.d;
                if (str == null) {
                    str = "";
                }
                Boolean bool4 = ((CheckoutCardDataState) stateFlow.getValue()).f;
                boolean z3 = ((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType4;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr5;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr5;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType4;
                checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 3;
                checkoutCardComponent$getPaymentCardFieldUiState$1.label = 4;
                objJ0 = J0(str, bool4, z3, checkoutCardComponent$getPaymentCardFieldUiState$1);
                if (objJ0 != obj) {
                    cardFieldType5 = cardFieldType4;
                    objG0 = objJ0;
                    paymentCardFieldUiStateArr6 = paymentCardFieldUiStateArr5;
                    paymentCardFieldUiStateArr7 = paymentCardFieldUiStateArr6;
                }
                return obj;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = checkoutCardComponent$getPaymentCardFieldUiState$1.I$0;
            cardFieldType5 = (CardFieldType) checkoutCardComponent$getPaymentCardFieldUiState$1.L$2;
            paymentCardFieldUiStateArr7 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$1;
            paymentCardFieldUiStateArr6 = (PaymentCardFieldUiState[]) checkoutCardComponent$getPaymentCardFieldUiState$1.L$0;
            ResultKt.b(objG0);
        }
        paymentCardFieldUiStateArr7[i5] = new PaymentCardFieldUiState(cardFieldType5, (TextFieldWithErrorUiState) objG0);
        return CollectionsKt.S(paymentCardFieldUiStateArr6);
        paymentCardFieldUiStateArr[i] = new PaymentCardFieldUiState(cardFieldType, (TextFieldWithErrorUiState) objG0);
        cardFieldType2 = CardFieldType.CARD_EXPIRY_DATE;
        String str4 = ((CheckoutCardDataState) stateFlow.getValue()).b.c;
        Boolean bool5 = ((CheckoutCardDataState) stateFlow.getValue()).d;
        boolean z4 = ((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType2;
        checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr2;
        checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr2;
        checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType2;
        checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 1;
        checkoutCardComponent$getPaymentCardFieldUiState$1.label = 2;
        objG0 = I0(str4, bool5, z4, checkoutCardComponent$getPaymentCardFieldUiState$1);
        if (objG0 != obj) {
            i2 = 1;
            paymentCardFieldUiStateArr3 = paymentCardFieldUiStateArr2;
            paymentCardFieldUiStateArr3[i2] = new PaymentCardFieldUiState(cardFieldType2, (TextFieldWithErrorUiState) objG0);
            cardFieldType3 = CardFieldType.NEW_CARD_CVV;
            String str5 = ((CheckoutCardDataState) stateFlow.getValue()).b.f1440a;
            Boolean bool6 = ((CheckoutCardDataState) stateFlow.getValue()).e;
            if (((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType3) {
                z = true;
            } else {
                z = false;
            }
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr2;
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr2;
            checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType3;
            checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 2;
            checkoutCardComponent$getPaymentCardFieldUiState$1.label = 3;
            objG0 = H0(str5, bool6, z, checkoutCardComponent$getPaymentCardFieldUiState$1);
            if (objG0 != obj) {
                paymentCardFieldUiStateArr4 = paymentCardFieldUiStateArr2;
                paymentCardFieldUiStateArr5 = paymentCardFieldUiStateArr4;
                paymentCardFieldUiStateArr4[i6] = new PaymentCardFieldUiState(cardFieldType3, (TextFieldWithErrorUiState) objG0);
                cardFieldType4 = CardFieldType.CARD_NAME;
                str = ((CheckoutCardDataState) stateFlow.getValue()).b.d;
                if (str == null) {
                    str = "";
                }
                Boolean bool7 = ((CheckoutCardDataState) stateFlow.getValue()).f;
                if (((CheckoutCardDataState) stateFlow.getValue()).g == cardFieldType4) {
                }
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$0 = paymentCardFieldUiStateArr5;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$1 = paymentCardFieldUiStateArr5;
                checkoutCardComponent$getPaymentCardFieldUiState$1.L$2 = cardFieldType4;
                checkoutCardComponent$getPaymentCardFieldUiState$1.I$0 = 3;
                checkoutCardComponent$getPaymentCardFieldUiState$1.label = 4;
                objJ0 = J0(str, bool7, z3, checkoutCardComponent$getPaymentCardFieldUiState$1);
                if (objJ0 != obj) {
                    cardFieldType5 = cardFieldType4;
                    objG0 = objJ0;
                    paymentCardFieldUiStateArr6 = paymentCardFieldUiStateArr5;
                    paymentCardFieldUiStateArr7 = paymentCardFieldUiStateArr6;
                    paymentCardFieldUiStateArr7[i5] = new PaymentCardFieldUiState(cardFieldType5, (TextFieldWithErrorUiState) objG0);
                    return CollectionsKt.S(paymentCardFieldUiStateArr6);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M0(ContinuationImpl continuationImpl) {
        CheckoutCardComponent$getToolbarUiState$1 checkoutCardComponent$getToolbarUiState$1;
        ToolbarUiSpecs toolbarUiSpecs;
        if (continuationImpl instanceof CheckoutCardComponent$getToolbarUiState$1) {
            checkoutCardComponent$getToolbarUiState$1 = (CheckoutCardComponent$getToolbarUiState$1) continuationImpl;
            int i = checkoutCardComponent$getToolbarUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutCardComponent$getToolbarUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutCardComponent$getToolbarUiState$1 = new CheckoutCardComponent$getToolbarUiState$1(this, continuationImpl);
            }
        } else {
            checkoutCardComponent$getToolbarUiState$1 = new CheckoutCardComponent$getToolbarUiState$1(this, continuationImpl);
        }
        Object obj = checkoutCardComponent$getToolbarUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutCardComponent$getToolbarUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ToolbarUiSpecs toolbarUiSpecs2 = new ToolbarUiSpecs(null, new ChaloPadding(0.0f, ChaloThemeHelper.a().f, 1), 0.0f, 29);
            checkoutCardComponent$getToolbarUiState$1.L$0 = toolbarUiSpecs2;
            checkoutCardComponent$getToolbarUiState$1.label = 1;
            Object objB = this.m.b(StringEnum.CARD_DETAILS_TITLE, new Object[0], checkoutCardComponent$getToolbarUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            toolbarUiSpecs = toolbarUiSpecs2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ToolbarUiSpecs toolbarUiSpecs3 = (ToolbarUiSpecs) checkoutCardComponent$getToolbarUiState$1.L$0;
            ResultKt.b(obj);
            toolbarUiSpecs = toolbarUiSpecs3;
        }
        return new ToolbarUIState(toolbarUiSpecs, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124), null, null, null, 0.0f, new DividerUIState(0.0f, null, null, 7), null, 188);
    }

    public final void N0(CheckoutCardViewIntent checkoutCardViewIntent) {
        C0(checkoutCardViewIntent);
        boolean z = checkoutCardViewIntent instanceof CheckoutCardViewIntent.ViewCreatedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new CheckoutCardComponent$handleViewCreatedIntent$1(this, null), 3);
            return;
        }
        if (!(checkoutCardViewIntent instanceof CheckoutCardViewIntent.CardFieldUpdated)) {
            if (!(checkoutCardViewIntent instanceof CheckoutCardViewIntent.ProceedButtonClicked)) {
                if (!(checkoutCardViewIntent instanceof CheckoutCardViewIntent.SetFieldInFocus)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new ch(checkoutCardViewIntent, 18));
                return;
            }
            CheckoutCardDetails checkoutCardDetails = ((CheckoutCardViewIntent.ProceedButtonClicked) checkoutCardViewIntent).f1443a;
            String str = checkoutCardDetails.f1440a;
            String str2 = checkoutCardDetails.b;
            String str3 = checkoutCardDetails.c;
            String str4 = checkoutCardDetails.d;
            if (str4 == null) {
                str4 = "";
            }
            BuildersKt.d(contextScope, null, null, new CheckoutCardComponent$handleProceedButtonClicked$1(this, new SelectedPaymentInstrumentData.CardData(str, str2, str3, str4), null), 3);
            return;
        }
        final CheckoutCardViewIntent.CardFieldUpdated cardFieldUpdated = (CheckoutCardViewIntent.CardFieldUpdated) checkoutCardViewIntent;
        int i = WhenMappings.f1436a[cardFieldUpdated.f1442a.ordinal()];
        if (i == 1) {
            final int i2 = 0;
            E0(new Function1() { // from class: vn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            CheckoutCardDataState it = (CheckoutCardDataState) obj;
                            Intrinsics.i(it, "it");
                            return CheckoutCardDataState.a(it, null, CheckoutCardDetails.a(it.b, null, cardFieldUpdated.b, null, null, 13), Boolean.FALSE, null, null, null, null, 121);
                        case 1:
                            CheckoutCardDataState it2 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it2, "it");
                            return CheckoutCardDataState.a(it2, null, CheckoutCardDetails.a(it2.b, null, null, cardFieldUpdated.b, null, 11), null, Boolean.FALSE, null, null, null, 117);
                        case 2:
                            CheckoutCardDataState it3 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it3, "it");
                            return CheckoutCardDataState.a(it3, null, CheckoutCardDetails.a(it3.b, cardFieldUpdated.b, null, null, null, 14), null, null, Boolean.FALSE, null, null, 109);
                        default:
                            CheckoutCardDataState it4 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it4, "it");
                            return CheckoutCardDataState.a(it4, null, CheckoutCardDetails.a(it4.b, null, null, null, cardFieldUpdated.b, 7), null, null, null, Boolean.FALSE, null, 93);
                    }
                }
            });
            return;
        }
        if (i == 2) {
            final int i3 = 1;
            E0(new Function1() { // from class: vn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i3) {
                        case 0:
                            CheckoutCardDataState it = (CheckoutCardDataState) obj;
                            Intrinsics.i(it, "it");
                            return CheckoutCardDataState.a(it, null, CheckoutCardDetails.a(it.b, null, cardFieldUpdated.b, null, null, 13), Boolean.FALSE, null, null, null, null, 121);
                        case 1:
                            CheckoutCardDataState it2 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it2, "it");
                            return CheckoutCardDataState.a(it2, null, CheckoutCardDetails.a(it2.b, null, null, cardFieldUpdated.b, null, 11), null, Boolean.FALSE, null, null, null, 117);
                        case 2:
                            CheckoutCardDataState it3 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it3, "it");
                            return CheckoutCardDataState.a(it3, null, CheckoutCardDetails.a(it3.b, cardFieldUpdated.b, null, null, null, 14), null, null, Boolean.FALSE, null, null, 109);
                        default:
                            CheckoutCardDataState it4 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it4, "it");
                            return CheckoutCardDataState.a(it4, null, CheckoutCardDetails.a(it4.b, null, null, null, cardFieldUpdated.b, 7), null, null, null, Boolean.FALSE, null, 93);
                    }
                }
            });
        } else if (i == 3) {
            final int i4 = 2;
            E0(new Function1() { // from class: vn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i4) {
                        case 0:
                            CheckoutCardDataState it = (CheckoutCardDataState) obj;
                            Intrinsics.i(it, "it");
                            return CheckoutCardDataState.a(it, null, CheckoutCardDetails.a(it.b, null, cardFieldUpdated.b, null, null, 13), Boolean.FALSE, null, null, null, null, 121);
                        case 1:
                            CheckoutCardDataState it2 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it2, "it");
                            return CheckoutCardDataState.a(it2, null, CheckoutCardDetails.a(it2.b, null, null, cardFieldUpdated.b, null, 11), null, Boolean.FALSE, null, null, null, 117);
                        case 2:
                            CheckoutCardDataState it3 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it3, "it");
                            return CheckoutCardDataState.a(it3, null, CheckoutCardDetails.a(it3.b, cardFieldUpdated.b, null, null, null, 14), null, null, Boolean.FALSE, null, null, 109);
                        default:
                            CheckoutCardDataState it4 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it4, "it");
                            return CheckoutCardDataState.a(it4, null, CheckoutCardDetails.a(it4.b, null, null, null, cardFieldUpdated.b, 7), null, null, null, Boolean.FALSE, null, 93);
                    }
                }
            });
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            final int i5 = 3;
            E0(new Function1() { // from class: vn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i5) {
                        case 0:
                            CheckoutCardDataState it = (CheckoutCardDataState) obj;
                            Intrinsics.i(it, "it");
                            return CheckoutCardDataState.a(it, null, CheckoutCardDetails.a(it.b, null, cardFieldUpdated.b, null, null, 13), Boolean.FALSE, null, null, null, null, 121);
                        case 1:
                            CheckoutCardDataState it2 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it2, "it");
                            return CheckoutCardDataState.a(it2, null, CheckoutCardDetails.a(it2.b, null, null, cardFieldUpdated.b, null, 11), null, Boolean.FALSE, null, null, null, 117);
                        case 2:
                            CheckoutCardDataState it3 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it3, "it");
                            return CheckoutCardDataState.a(it3, null, CheckoutCardDetails.a(it3.b, cardFieldUpdated.b, null, null, null, 14), null, null, Boolean.FALSE, null, null, 109);
                        default:
                            CheckoutCardDataState it4 = (CheckoutCardDataState) obj;
                            Intrinsics.i(it4, "it");
                            return CheckoutCardDataState.a(it4, null, CheckoutCardDetails.a(it4.b, null, null, null, cardFieldUpdated.b, 7), null, null, null, Boolean.FALSE, null, 93);
                    }
                }
            });
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CheckoutCardDataState(null, new CheckoutCardDetails("", "", "", null), null, null, null, null, null);
    }
}
