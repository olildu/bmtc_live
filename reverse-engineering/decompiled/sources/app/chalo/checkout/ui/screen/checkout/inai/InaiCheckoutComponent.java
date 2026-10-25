package app.chalo.checkout.ui.screen.checkout.inai;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.domain.CreateInaiPaymentDataUseCase;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutInaiArgs;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ka0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewState;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutSideEffect;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InaiCheckoutComponent extends ChaloBaseStateMviComponent<InaiCheckoutViewIntent, InaiCheckoutViewState, InaiCheckoutViewState, InaiCheckoutSideEffect> {
    public final CheckoutInaiArgs k;
    public final CheckoutPaymentDataResolver l;
    public final CreateInaiPaymentDataUseCase m;
    public final ICheckoutAnalyticsHelper n;
    public final ChaloNavigationManager o;
    public final StringProvider p;
    public final KotlinToastManager q;
    public final Lazy r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutComponent$Companion;", "", "", "PAYMENT_RESULT_TRANSACTION_ID_KEY", "Ljava/lang/String;", "PAYMENT_RESULT_CODE", "PAYMENT_INTERRUPTED_CODE", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1470a;

        static {
            int[] iArr = new int[ExitReasonType.values().length];
            try {
                iArr[ExitReasonType.PAYMENT_CANCELLED_BY_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExitReasonType.INAI_CHECKOUT_INSTANCE_CREATION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1470a = iArr;
        }
    }

    public InaiCheckoutComponent(CheckoutInaiArgs checkoutInaiArgs, ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, CreateInaiPaymentDataUseCase createInaiPaymentDataUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = checkoutInaiArgs;
        this.l = checkoutPaymentDataResolver;
        this.m = createInaiPaymentDataUseCase;
        this.n = iCheckoutAnalyticsHelper;
        this.o = chaloNavigationManager;
        this.p = stringProvider;
        this.q = kotlinToastManager;
        this.r = LazyKt.b(new ka0(this, 4));
        H0(InaiCheckoutViewIntent.InitialiseInaiIntent.f1474a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (r8 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent.F0(app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object G0(ExitReasonType exitReasonType, ContinuationImpl continuationImpl) {
        int i = WhenMappings.f1470a[exitReasonType.ordinal()];
        StringProvider stringProvider = this.p;
        if (i == 1) {
            return stringProvider.b(StringEnum.CHECKOUT_PAYMENT_CANCELLED, new Object[0], continuationImpl);
        }
        if (i == 2) {
            return stringProvider.b(StringEnum.RETRY_PAYMENT, new Object[0], continuationImpl);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void H0(InaiCheckoutViewIntent inaiCheckoutViewIntent) {
        String str;
        C0(inaiCheckoutViewIntent);
        boolean z = inaiCheckoutViewIntent instanceof InaiCheckoutViewIntent.InitialiseInaiIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new InaiCheckoutComponent$processIntent$1(this, null), 3);
            return;
        }
        if (!(inaiCheckoutViewIntent instanceof InaiCheckoutViewIntent.PaymentCompletedIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        InaiCheckoutViewIntent.PaymentCompletedIntent paymentCompletedIntent = (InaiCheckoutViewIntent.PaymentCompletedIntent) inaiCheckoutViewIntent;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.l;
        checkoutPaymentDataResolver.Z(false);
        boolean z2 = paymentCompletedIntent instanceof InaiCheckoutViewIntent.PaymentCompletedIntent.Success;
        ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = this.n;
        String str2 = "";
        if (z2) {
            Object obj = ((InaiCheckoutViewIntent.PaymentCompletedIntent.Success) paymentCompletedIntent).f1477a.get(FirebaseAnalytics.Param.TRANSACTION_ID);
            str = obj instanceof String ? (String) obj : null;
            str2 = str != null ? str : "";
            checkoutPaymentDataResolver.U(str2);
            iCheckoutAnalyticsHelper.j(str2);
            q0(new ka0(this, 0));
            return;
        }
        if (!(paymentCompletedIntent instanceof InaiCheckoutViewIntent.PaymentCompletedIntent.Failed)) {
            if (!(paymentCompletedIntent instanceof InaiCheckoutViewIntent.PaymentCompletedIntent.Cancelled)) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMap = ((InaiCheckoutViewIntent.PaymentCompletedIntent.Cancelled) paymentCompletedIntent).f1475a;
            Object obj2 = linkedHashMap.get(CLConstants.FIELD_CODE);
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            if (str3 == null) {
                str3 = "";
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            try {
                Object obj3 = linkedHashMap.get(CLConstants.FIELD_CODE);
                String str4 = obj3 instanceof String ? (String) obj3 : null;
                if (str4 == null) {
                    str4 = "";
                }
                Object obj4 = linkedHashMap.get(FirebaseAnalytics.Param.TRANSACTION_ID);
                String str5 = obj4 instanceof String ? (String) obj4 : null;
                if (str5 == null) {
                    str5 = "";
                }
                Object obj5 = linkedHashMap.get("message");
                String str6 = obj5 instanceof String ? (String) obj5 : null;
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap2.put("errorCode", str4);
                linkedHashMap2.put("transactionId", str5);
                linkedHashMap2.put("reason", str6);
            } catch (Exception unused) {
                linkedHashMap2.put("reason", linkedHashMap.toString());
            }
            iCheckoutAnalyticsHelper.i(linkedHashMap2);
            if (!str3.equals("PAYMENT_INTERRUPTED")) {
                BuildersKt.d(contextScope, null, null, new InaiCheckoutComponent$handlePaymentCompletedIntentIntent$4(this, null), 3);
                return;
            }
            Object obj6 = linkedHashMap.get(FirebaseAnalytics.Param.TRANSACTION_ID);
            String str7 = obj6 instanceof String ? (String) obj6 : null;
            checkoutPaymentDataResolver.U(str7 != null ? str7 : "");
            q0(new ka0(this, 2));
            return;
        }
        LinkedHashMap linkedHashMap3 = ((InaiCheckoutViewIntent.PaymentCompletedIntent.Failed) paymentCompletedIntent).f1476a;
        Object obj7 = linkedHashMap3.get(FirebaseAnalytics.Param.TRANSACTION_ID);
        checkoutPaymentDataResolver.U(obj7 instanceof String ? (String) obj7 : null);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        try {
            Object obj8 = linkedHashMap3.get(CLConstants.FIELD_CODE);
            String str8 = obj8 instanceof String ? (String) obj8 : null;
            if (str8 == null) {
                str8 = "";
            }
            Object obj9 = linkedHashMap3.get(FirebaseAnalytics.Param.TRANSACTION_ID);
            String str9 = obj9 instanceof String ? (String) obj9 : null;
            if (str9 == null) {
                str9 = "";
            }
            Object obj10 = linkedHashMap3.get("message");
            String str10 = obj10 instanceof String ? (String) obj10 : null;
            if (str10 == null) {
                str10 = "";
            }
            linkedHashMap4.put("errorCode", str8);
            linkedHashMap4.put("transactionId", str9);
            Object obj11 = linkedHashMap3.get("vendor_response");
            Map map = obj11 instanceof Map ? (Map) obj11 : null;
            Object obj12 = map != null ? map.get("response") : null;
            Map map2 = obj12 instanceof Map ? (Map) obj12 : null;
            Object obj13 = map2 != null ? map2.get("error") : null;
            Map map3 = obj13 instanceof Map ? (Map) obj13 : null;
            if (map3 != null) {
                if (map3.containsKey("message")) {
                    Object obj14 = map3.get("message");
                    String str11 = obj14 instanceof String ? (String) obj14 : null;
                    str10 = str11 == null ? "" : str11;
                }
                if (map3.containsKey("type")) {
                    Object obj15 = map3.get("type");
                    str = obj15 instanceof String ? (String) obj15 : null;
                    if (str != null) {
                        str2 = str;
                    }
                    linkedHashMap4.put("reason", str2);
                }
            }
            linkedHashMap4.put(InMobiNetworkValues.DESCRIPTION, str10);
        } catch (Exception unused2) {
            linkedHashMap4.put("reason", linkedHashMap3.toString());
        }
        iCheckoutAnalyticsHelper.l(linkedHashMap4);
        q0(new ka0(this, 1));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (InaiCheckoutViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new InaiCheckoutViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new InaiCheckoutViewState();
    }
}
