package app.chalo.checkout.ui.screen.checkout.phonepe;

import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.domain.phonepe.CreatePhonePeTransactionRequestUseCase;
import app.chalo.checkout.paymentprovider.phonepe.PhonePeStartTransactionResult;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.tr0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/phonepe/PhonePeCheckoutComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/checkout/ui/screen/checkout/phonepe/PhonePeCheckoutViewIntent;", "Lapp/chalo/checkout/ui/screen/checkout/phonepe/PhonePeCheckoutViewState;", "Lapp/chalo/checkout/ui/screen/checkout/phonepe/PhonePeCheckoutSideEffect;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhonePeCheckoutComponent extends ChaloBaseStateMviComponent<PhonePeCheckoutViewIntent, PhonePeCheckoutViewState, PhonePeCheckoutViewState, PhonePeCheckoutSideEffect> {
    public final CheckoutPaymentDataResolver k;
    public final CreatePhonePeTransactionRequestUseCase l;
    public final PhonepeSdk m;
    public final ChaloNavigationManager n;
    public final StringProvider o;
    public final KotlinToastManager p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1479a;

        static {
            int[] iArr = new int[PhonePeStartTransactionResult.values().length];
            try {
                iArr[PhonePeStartTransactionResult.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhonePeStartTransactionResult.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhonePeStartTransactionResult.SDK_NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhonePeStartTransactionResult.PRESENTATION_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhonePeStartTransactionResult.SDK_INIT_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PhonePeStartTransactionResult.SDK_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PhonePeStartTransactionResult.TRANSACTION_IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1479a = iArr;
        }
    }

    public PhonePeCheckoutComponent(CheckoutPhonePeArgs checkoutPhonePeArgs, ComponentContext componentContext, CheckoutPaymentDataResolver checkoutPaymentDataResolver, CreatePhonePeTransactionRequestUseCase createPhonePeTransactionRequestUseCase, PhonepeSdk phonepeSdk, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = checkoutPaymentDataResolver;
        this.l = createPhonePeTransactionRequestUseCase;
        this.m = phonepeSdk;
        this.n = chaloNavigationManager;
        this.o = stringProvider;
        this.p = kotlinToastManager;
        G0(PhonePeCheckoutViewIntent.InitiateCheckoutIntent.f1481a);
    }

    public final void F0() {
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.k;
        if (checkoutPaymentDataResolver.T()) {
            checkoutPaymentDataResolver.Z(false);
            if (((PaymentInfoState) checkoutPaymentDataResolver.P().getValue()).h == null) {
                checkoutPaymentDataResolver.U("");
            }
            q0(new tr0(this, 2));
        }
    }

    public final void G0(PhonePeCheckoutViewIntent phonePeCheckoutViewIntent) {
        C0(phonePeCheckoutViewIntent);
        boolean zEquals = phonePeCheckoutViewIntent.equals(PhonePeCheckoutViewIntent.InitiateCheckoutIntent.f1481a);
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.k;
        PhonepeSdk phonepeSdk = this.m;
        if (!zEquals) {
            if (!phonePeCheckoutViewIntent.equals(PhonePeCheckoutViewIntent.CheckoutBackPressed.f1480a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (checkoutPaymentDataResolver.T()) {
                phonepeSdk.c();
                checkoutPaymentDataResolver.Z(false);
            }
            q0(new tr0(this, 0));
            return;
        }
        if (checkoutPaymentDataResolver.T()) {
            if (phonepeSdk.b(new tr0(this, 1))) {
                return;
            }
            F0();
        } else {
            if (((PaymentInfoState) checkoutPaymentDataResolver.P().getValue()).h != null) {
                q0(new tr0(this, 2));
                return;
            }
            phonepeSdk.c();
            BuildersKt.d(this.j, null, null, new PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1(this, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PhonePeCheckoutViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PhonePeCheckoutViewState(false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new PhonePeCheckoutViewState(false);
    }
}
