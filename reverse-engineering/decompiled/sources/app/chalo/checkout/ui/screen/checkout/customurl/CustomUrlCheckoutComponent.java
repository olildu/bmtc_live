package app.chalo.checkout.ui.screen.checkout.customurl;

import android.net.Uri;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.CustomUrlPaymentStatus;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutViewIntent;
import app.chalo.checkout.utility.InstalledUpiAppsHelper;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.checkout.utility.UpiAppResult;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.webview.WebViewUIStateFactory;
import app.chalo.uistate.webview.WebViewUIStateFactory$chromeClientEventHandler$4;
import app.chalo.uistate.webview.WebViewUIStateFactory$webViewClientEventHandler$5;
import com.arkivanov.decompose.ComponentContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.lu;
import defpackage.n4;
import defpackage.on;
import defpackage.qs;
import defpackage.ti;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutDataState;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutUiState;", "Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutSideEffect;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomUrlCheckoutComponent extends ChaloBaseStateMviComponent<CustomUrlCheckoutViewIntent, CustomUrlCheckoutDataState, CustomUrlCheckoutUiState, CustomUrlCheckoutSideEffect> {
    public final CustomUrlCheckoutArgs k;
    public final CheckoutPaymentDataResolver l;
    public final ICheckoutAnalyticsHelper m;
    public final CrashlyticsLogger n;
    public final InstalledUpiAppsHelperProvider o;
    public final StringProvider p;
    public final ChaloNavigationManager q;
    public final KotlinToastManager r;
    public boolean s;
    public Job t;
    public final WebViewUIStateFactory$chromeClientEventHandler$4 u;
    public final WebViewUIStateFactory$webViewClientEventHandler$5 v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/customurl/CustomUrlCheckoutComponent$Companion;", "", "", "QUERY_PARAM_STATUS", "Ljava/lang/String;", "PARAM_STATUS_SUCCESS", "PARAM_STATUS_FAILURE", "CUSTOM_URL_UNKNOWN_ERROR_WHILE_MAKING_PAYMENT", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CustomUrlCheckoutComponent(ComponentContext componentContext, CustomUrlCheckoutArgs customUrlCheckoutArgs, CheckoutPaymentDataResolver checkoutPaymentDataResolver, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, CrashlyticsLogger crashlyticsLogger, InstalledUpiAppsHelperProvider installedUpiAppsHelperProvider, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = customUrlCheckoutArgs;
        this.l = checkoutPaymentDataResolver;
        this.m = iCheckoutAnalyticsHelper;
        this.n = crashlyticsLogger;
        this.o = installedUpiAppsHelperProvider;
        this.p = stringProvider;
        this.q = chaloNavigationManager;
        this.r = kotlinToastManager;
        I0(new CustomUrlCheckoutViewIntent.InitialiseIntent(customUrlCheckoutArgs.c));
        final int i = 0;
        this.u = WebViewUIStateFactory.a(new Function1(this) { // from class: ku
            public final /* synthetic */ CustomUrlCheckoutComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String queryParameter;
                switch (i) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        CustomUrlCheckoutComponent customUrlCheckoutComponent = this.b;
                        if (iIntValue >= 80 && ((CustomUrlCheckoutDataState) customUrlCheckoutComponent.f.getValue()).d != iIntValue) {
                            customUrlCheckoutComponent.I0(new CustomUrlCheckoutViewIntent.OnPageProgressCompleted(iIntValue));
                        }
                        customUrlCheckoutComponent.E0(new mu(iIntValue, 0));
                        break;
                    case 1:
                        String str = (String) obj;
                        vo1.x("shouldOverrideUrlLoading: ", str, "message");
                        CustomUrlCheckoutComponent customUrlCheckoutComponent2 = this.b;
                        boolean z = false;
                        if (!customUrlCheckoutComponent2.s && str != null) {
                            try {
                                queryParameter = Uri.parse(str).getQueryParameter("status");
                            } catch (Exception unused) {
                                queryParameter = null;
                            }
                            if (Intrinsics.d(queryParameter, FirebaseAnalytics.Param.SUCCESS)) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Success.f1468a);
                            } else if (Intrinsics.d(queryParameter, "failure")) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Failed.f1467a);
                            } else {
                                InstalledUpiAppsHelper installedUpiAppsHelperB = customUrlCheckoutComponent2.o.b();
                                if (installedUpiAppsHelperB == null || !installedUpiAppsHelperB.e(str)) {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUrlOverride(str));
                                } else {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUpiIntentUriReceived(str));
                                }
                            }
                            z = true;
                            break;
                        }
                        return Boolean.valueOf(z);
                    default:
                        this.b.I0(CustomUrlCheckoutViewIntent.OnPageLoaded.f1463a);
                        break;
                }
                return Unit.f17538a;
            }
        });
        final int i2 = 1;
        final int i3 = 2;
        this.v = new WebViewUIStateFactory$webViewClientEventHandler$5(new Function1(this) { // from class: ku
            public final /* synthetic */ CustomUrlCheckoutComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String queryParameter;
                switch (i2) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        CustomUrlCheckoutComponent customUrlCheckoutComponent = this.b;
                        if (iIntValue >= 80 && ((CustomUrlCheckoutDataState) customUrlCheckoutComponent.f.getValue()).d != iIntValue) {
                            customUrlCheckoutComponent.I0(new CustomUrlCheckoutViewIntent.OnPageProgressCompleted(iIntValue));
                        }
                        customUrlCheckoutComponent.E0(new mu(iIntValue, 0));
                        break;
                    case 1:
                        String str = (String) obj;
                        vo1.x("shouldOverrideUrlLoading: ", str, "message");
                        CustomUrlCheckoutComponent customUrlCheckoutComponent2 = this.b;
                        boolean z = false;
                        if (!customUrlCheckoutComponent2.s && str != null) {
                            try {
                                queryParameter = Uri.parse(str).getQueryParameter("status");
                            } catch (Exception unused) {
                                queryParameter = null;
                            }
                            if (Intrinsics.d(queryParameter, FirebaseAnalytics.Param.SUCCESS)) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Success.f1468a);
                            } else if (Intrinsics.d(queryParameter, "failure")) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Failed.f1467a);
                            } else {
                                InstalledUpiAppsHelper installedUpiAppsHelperB = customUrlCheckoutComponent2.o.b();
                                if (installedUpiAppsHelperB == null || !installedUpiAppsHelperB.e(str)) {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUrlOverride(str));
                                } else {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUpiIntentUriReceived(str));
                                }
                            }
                            z = true;
                            break;
                        }
                        return Boolean.valueOf(z);
                    default:
                        this.b.I0(CustomUrlCheckoutViewIntent.OnPageLoaded.f1463a);
                        break;
                }
                return Unit.f17538a;
            }
        }, new on(17), new Function1(this) { // from class: ku
            public final /* synthetic */ CustomUrlCheckoutComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String queryParameter;
                switch (i3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        CustomUrlCheckoutComponent customUrlCheckoutComponent = this.b;
                        if (iIntValue >= 80 && ((CustomUrlCheckoutDataState) customUrlCheckoutComponent.f.getValue()).d != iIntValue) {
                            customUrlCheckoutComponent.I0(new CustomUrlCheckoutViewIntent.OnPageProgressCompleted(iIntValue));
                        }
                        customUrlCheckoutComponent.E0(new mu(iIntValue, 0));
                        break;
                    case 1:
                        String str = (String) obj;
                        vo1.x("shouldOverrideUrlLoading: ", str, "message");
                        CustomUrlCheckoutComponent customUrlCheckoutComponent2 = this.b;
                        boolean z = false;
                        if (!customUrlCheckoutComponent2.s && str != null) {
                            try {
                                queryParameter = Uri.parse(str).getQueryParameter("status");
                            } catch (Exception unused) {
                                queryParameter = null;
                            }
                            if (Intrinsics.d(queryParameter, FirebaseAnalytics.Param.SUCCESS)) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Success.f1468a);
                            } else if (Intrinsics.d(queryParameter, "failure")) {
                                customUrlCheckoutComponent2.s = true;
                                customUrlCheckoutComponent2.I0(CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Failed.f1467a);
                            } else {
                                InstalledUpiAppsHelper installedUpiAppsHelperB = customUrlCheckoutComponent2.o.b();
                                if (installedUpiAppsHelperB == null || !installedUpiAppsHelperB.e(str)) {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUrlOverride(str));
                                } else {
                                    customUrlCheckoutComponent2.I0(new CustomUrlCheckoutViewIntent.OnUpiIntentUriReceived(str));
                                }
                            }
                            z = true;
                            break;
                        }
                        return Boolean.valueOf(z);
                    default:
                        this.b.I0(CustomUrlCheckoutViewIntent.OnPageLoaded.f1463a);
                        break;
                }
                return Unit.f17538a;
            }
        }, new n4(this, 14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object F0(CustomUrlCheckoutComponent customUrlCheckoutComponent, CustomUrlCheckoutViewIntent.PaymentCompletedIntent paymentCompletedIntent, ContinuationImpl continuationImpl) {
        CustomUrlCheckoutComponent$handlePaymentCompletedIntent$1 customUrlCheckoutComponent$handlePaymentCompletedIntent$1;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = customUrlCheckoutComponent.m;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = customUrlCheckoutComponent.l;
        if (continuationImpl instanceof CustomUrlCheckoutComponent$handlePaymentCompletedIntent$1) {
            customUrlCheckoutComponent$handlePaymentCompletedIntent$1 = (CustomUrlCheckoutComponent$handlePaymentCompletedIntent$1) continuationImpl;
            int i = customUrlCheckoutComponent$handlePaymentCompletedIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                customUrlCheckoutComponent$handlePaymentCompletedIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                customUrlCheckoutComponent$handlePaymentCompletedIntent$1 = new CustomUrlCheckoutComponent$handlePaymentCompletedIntent$1(customUrlCheckoutComponent, continuationImpl);
            }
        } else {
            customUrlCheckoutComponent$handlePaymentCompletedIntent$1 = new CustomUrlCheckoutComponent$handlePaymentCompletedIntent$1(customUrlCheckoutComponent, continuationImpl);
        }
        Object objB = customUrlCheckoutComponent$handlePaymentCompletedIntent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = customUrlCheckoutComponent$handlePaymentCompletedIntent$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            checkoutPaymentDataResolver.Z(false);
            customUrlCheckoutComponent.E0(new qs(12));
            if (paymentCompletedIntent instanceof CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Success) {
                checkoutPaymentDataResolver.y(CustomUrlPaymentStatus.SUCCESS);
                iCheckoutAnalyticsHelper.j("");
                customUrlCheckoutComponent.q0(new lu(customUrlCheckoutComponent, 0));
            } else if (paymentCompletedIntent instanceof CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Failed) {
                checkoutPaymentDataResolver.y(CustomUrlPaymentStatus.FAILURE);
                iCheckoutAnalyticsHelper.l(MapsKt.d());
                customUrlCheckoutComponent.q0(new lu(customUrlCheckoutComponent, 3));
            } else {
                if (!(paymentCompletedIntent instanceof CustomUrlCheckoutViewIntent.PaymentCompletedIntent.Cancelled)) {
                    throw new NoWhenBranchMatchedException();
                }
                iCheckoutAnalyticsHelper.i(MapsKt.d());
                customUrlCheckoutComponent$handlePaymentCompletedIntent$1.L$0 = customUrlCheckoutComponent;
                customUrlCheckoutComponent$handlePaymentCompletedIntent$1.label = 1;
                objB = customUrlCheckoutComponent.p.b(StringEnum.CHECKOUT_PAYMENT_CANCELLED, new Object[0], customUrlCheckoutComponent$handlePaymentCompletedIntent$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        customUrlCheckoutComponent = (CustomUrlCheckoutComponent) customUrlCheckoutComponent$handlePaymentCompletedIntent$1.L$0;
        ResultKt.b(objB);
        customUrlCheckoutComponent.getClass();
        customUrlCheckoutComponent.q0(new ti(25, customUrlCheckoutComponent, (String) objB));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r2 == r4) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent.G0(app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(ContinuationImpl continuationImpl) {
        CustomUrlCheckoutComponent$getConfirmationDialogUiState$1 customUrlCheckoutComponent$getConfirmationDialogUiState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        boolean z;
        DialogueCtaUiState dialogueCtaUiState;
        Object objB;
        DialogueCtaUiState dialogueCtaUiState2;
        if (continuationImpl instanceof CustomUrlCheckoutComponent$getConfirmationDialogUiState$1) {
            customUrlCheckoutComponent$getConfirmationDialogUiState$1 = (CustomUrlCheckoutComponent$getConfirmationDialogUiState$1) continuationImpl;
            int i = customUrlCheckoutComponent$getConfirmationDialogUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                customUrlCheckoutComponent$getConfirmationDialogUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                customUrlCheckoutComponent$getConfirmationDialogUiState$1 = new CustomUrlCheckoutComponent$getConfirmationDialogUiState$1(this, continuationImpl);
            }
        } else {
            customUrlCheckoutComponent$getConfirmationDialogUiState$1 = new CustomUrlCheckoutComponent$getConfirmationDialogUiState$1(this, continuationImpl);
        }
        Object objB2 = customUrlCheckoutComponent$getConfirmationDialogUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = customUrlCheckoutComponent$getConfirmationDialogUiState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        StringProvider stringProvider = this.p;
        if (i2 == 0) {
            ResultKt.b(objB2);
            customUrlCheckoutComponent$getConfirmationDialogUiState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.ARE_YOU_SURE_YOU_WANT_TO_CANCEL, new Object[0], customUrlCheckoutComponent$getConfirmationDialogUiState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                chaloTextUIState = (TextUIState.ChaloTextUIState) customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$0;
                ResultKt.b(objB2);
                String upperCase = ((String) objB2).toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                z = false;
                dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState(upperCase, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new lu(this, 1)));
                customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$0 = chaloTextUIState;
                customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$1 = dialogueCtaUiState;
                customUrlCheckoutComponent$getConfirmationDialogUiState$1.label = 3;
                objB = stringProvider.b(StringEnum.NO, new Object[0], customUrlCheckoutComponent$getConfirmationDialogUiState$1);
                if (objB != coroutineSingletons) {
                    dialogueCtaUiState2 = dialogueCtaUiState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogueCtaUiState2 = (DialogueCtaUiState) customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState = chaloTextUIState2;
            objB = objB2;
            z = false;
        }
        return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new lu(this, 2))), 1), new DialogUIEventHandler(z, z, DialogDismissRequest.Companion.f9986a), 1);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$0 = chaloTextUIState3;
        customUrlCheckoutComponent$getConfirmationDialogUiState$1.label = 2;
        objB2 = stringProvider.b(StringEnum.YES, new Object[0], customUrlCheckoutComponent$getConfirmationDialogUiState$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIState3;
            String upperCase2 = ((String) objB2).toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase2, "toUpperCase(...)");
            z = false;
            dialogueCtaUiState = new DialogueCtaUiState(new TextUIState.ChaloTextUIState(upperCase2, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new lu(this, 1)));
            customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$0 = chaloTextUIState;
            customUrlCheckoutComponent$getConfirmationDialogUiState$1.L$1 = dialogueCtaUiState;
            customUrlCheckoutComponent$getConfirmationDialogUiState$1.label = 3;
            objB = stringProvider.b(StringEnum.NO, new Object[0], customUrlCheckoutComponent$getConfirmationDialogUiState$1);
            if (objB != coroutineSingletons) {
                dialogueCtaUiState2 = dialogueCtaUiState;
                return new ConfirmationDialogUiState(null, chaloTextUIState, new ConfirmationDialogActionCtaContainerUiState(dialogueCtaUiState2, new DialogueCtaUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new lu(this, 2))), 1), new DialogUIEventHandler(z, z, DialogDismissRequest.Companion.f9986a), 1);
            }
        }
        return coroutineSingletons;
    }

    public final void I0(CustomUrlCheckoutViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof CustomUrlCheckoutViewIntent.InitialiseIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new CustomUrlCheckoutComponent$processIntent$1(this, intent, null), 3);
            return;
        }
        if (intent instanceof CustomUrlCheckoutViewIntent.PaymentCompletedIntent) {
            BuildersKt.d(contextScope, null, null, new CustomUrlCheckoutComponent$processIntent$2(this, intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(CustomUrlCheckoutViewIntent.OnPageLoaded.f1463a);
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.m;
        if (zEquals) {
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "custom checkout url page loaded", null, 14);
            E0(new qs(13));
            return;
        }
        if (intent.equals(CustomUrlCheckoutViewIntent.WebViewCreated.f1469a)) {
            E0(new qs(14));
            return;
        }
        if (intent.equals(CustomUrlCheckoutViewIntent.CheckoutBackPressed.f1457a)) {
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "custom checkout url back pressed", null, 14);
            E0(new qs(15));
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "payment cancel dialog shown", null, 14);
            return;
        }
        if (intent.equals(CustomUrlCheckoutViewIntent.ConfirmCancelPayment.f1458a)) {
            E0(new qs(16));
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "payment cancel dialog yes clicked", null, 14);
            BuildersKt.d(contextScope, null, null, new CustomUrlCheckoutComponent$processIntent$7(this, null), 3);
            return;
        }
        if (intent.equals(CustomUrlCheckoutViewIntent.DismissCancelConfirmationDialog.f1459a)) {
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "payment cancel dialog no clicked", null, 14);
            E0(new qs(17));
            return;
        }
        boolean z2 = intent instanceof CustomUrlCheckoutViewIntent.OnErrorWhileMakingPayment;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.l;
        if (z2) {
            CustomUrlCheckoutViewIntent.OnErrorWhileMakingPayment onErrorWhileMakingPayment = (CustomUrlCheckoutViewIntent.OnErrorWhileMakingPayment) intent;
            int i = onErrorWhileMakingPayment.f1462a;
            String str = onErrorWhileMakingPayment.b;
            checkoutPaymentDataResolver.y(CustomUrlPaymentStatus.UNKNOWN);
            iCheckoutAnalyticsHelper.l(MapsKt.i(new Pair("errorCode", String.valueOf(i)), new Pair("errorMessage", str)));
            q0(new lu(this, 3));
            return;
        }
        if (intent instanceof CustomUrlCheckoutViewIntent.OnSslErrorReceived) {
            checkoutPaymentDataResolver.y(CustomUrlPaymentStatus.UNKNOWN);
            iCheckoutAnalyticsHelper.l(MapsKt.i(new Pair("errorCode", String.valueOf(0)), new Pair("errorMessage", null), new Pair("url", null)));
            q0(new lu(this, 3));
            return;
        }
        if (intent instanceof CustomUrlCheckoutViewIntent.OnUrlOverride) {
            iCheckoutAnalyticsHelper.b("custom checkout url override", MapsKt.h(new Pair("url", ((CustomUrlCheckoutViewIntent.OnUrlOverride) intent).f1466a)));
            return;
        }
        if (intent instanceof CustomUrlCheckoutViewIntent.OnUpiIntentUriReceived) {
            String str2 = ((CustomUrlCheckoutViewIntent.OnUpiIntentUriReceived) intent).f1465a;
            iCheckoutAnalyticsHelper.b("custom checkout url on upi uri received", MapsKt.h(new Pair("uri", str2)));
            Job job = this.t;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.t = BuildersKt.d(contextScope, null, null, new CustomUrlCheckoutComponent$handleUpiIntentUri$1(this, str2, null), 3);
            return;
        }
        if (intent instanceof CustomUrlCheckoutViewIntent.HandleNativeUpiAppResultIntent) {
            UpiAppResult upiAppResult = ((CustomUrlCheckoutViewIntent.HandleNativeUpiAppResultIntent) intent).f1460a;
            ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "custom checkout url upi app result", MapsKt.i(new Pair("resultStatus", String.valueOf(upiAppResult != null ? upiAppResult.f1631a : null)), new Pair("transaction id", String.valueOf(upiAppResult != null ? upiAppResult.c : null)), new Pair("transactionReference", String.valueOf(upiAppResult != null ? upiAppResult.d : null)), new Pair("resultCode", String.valueOf(upiAppResult != null ? upiAppResult.b : null)), new Pair("isOperationCancelled", String.valueOf(upiAppResult != null ? upiAppResult.e : null)), new Pair("response", String.valueOf(upiAppResult != null ? upiAppResult.f : null))), 12);
        } else {
            if (!(intent instanceof CustomUrlCheckoutViewIntent.OnPageProgressCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            this.n.g(new CrashlyticsLog("custom checkout url page progress value", String.valueOf(((CustomUrlCheckoutViewIntent.OnPageProgressCompleted) intent).f1464a)));
            E0(new qs(18));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return G0((CustomUrlCheckoutDataState) obj, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CustomUrlCheckoutDataState(0, null, false, false, false, false);
    }
}
