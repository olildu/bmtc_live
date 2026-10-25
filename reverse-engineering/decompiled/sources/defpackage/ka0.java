package defpackage;

import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutDelegate;
import app.chalo.checkout.paymentprovider.inai.InaiSdkPaymentResult;
import app.chalo.checkout.paymentprovider.inai.InaiSdkPaymentStatus;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ka0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17480a;
    public final /* synthetic */ InaiCheckoutComponent b;

    public /* synthetic */ ka0(InaiCheckoutComponent inaiCheckoutComponent, int i) {
        this.f17480a = i;
        this.b = inaiCheckoutComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17480a) {
            case 0:
                gf.u(null, this.b.o);
                return Unit.f17538a;
            case 1:
                gf.u(null, this.b.o);
                return Unit.f17538a;
            case 2:
                gf.u(null, this.b.o);
                return Unit.f17538a;
            case 3:
                InaiCheckoutComponent inaiCheckoutComponent = this.b;
                inaiCheckoutComponent.o.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(inaiCheckoutComponent.k)));
                return Unit.f17538a;
            case 4:
                final InaiCheckoutComponent inaiCheckoutComponent2 = this.b;
                return new InaiSdkCheckoutDelegate() { // from class: app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent$inaiSdkCheckoutDelegate$2$1

                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final /* synthetic */ class WhenMappings {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f1472a;

                        static {
                            int[] iArr = new int[InaiSdkPaymentStatus.values().length];
                            try {
                                iArr[InaiSdkPaymentStatus.SUCCESS.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[InaiSdkPaymentStatus.FAILED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[InaiSdkPaymentStatus.CANCELLED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            f1472a = iArr;
                        }
                    }

                    @Override // app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutDelegate
                    public final void a(InaiSdkPaymentResult inaiSdkPaymentResult) {
                        LinkedHashMap linkedHashMap = inaiSdkPaymentResult.f1412a;
                        int i = WhenMappings.f1472a[inaiSdkPaymentResult.b.ordinal()];
                        InaiCheckoutComponent inaiCheckoutComponent3 = inaiCheckoutComponent2;
                        if (i == 1) {
                            inaiCheckoutComponent3.H0(new InaiCheckoutViewIntent.PaymentCompletedIntent.Success(linkedHashMap));
                        } else if (i == 2) {
                            inaiCheckoutComponent3.H0(new InaiCheckoutViewIntent.PaymentCompletedIntent.Failed(linkedHashMap));
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            inaiCheckoutComponent3.H0(new InaiCheckoutViewIntent.PaymentCompletedIntent.Cancelled(linkedHashMap));
                        }
                    }
                };
            default:
                InaiCheckoutComponent inaiCheckoutComponent3 = this.b;
                inaiCheckoutComponent3.o.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(inaiCheckoutComponent3.k)));
                return Unit.f17538a;
        }
    }
}
