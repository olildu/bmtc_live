package app.chalo.core.navigation.checkout;

import app.chalo.checkout.shared.CheckoutSharedComponentViewModel;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.scenes.args.CheckoutArgs;
import app.chalo.scenes.args.CheckoutCardArgs;
import app.chalo.scenes.args.CheckoutInaiArgs;
import app.chalo.scenes.args.CheckoutNetBankingArgs;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.CheckoutPhonePeArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.scenes.args.CheckoutRazorpayArgs;
import app.chalo.scenes.args.CheckoutUpiArgs;
import app.chalo.scenes.args.CheckoutWalletArgs;
import app.chalo.scenes.args.CustomUrlCheckoutArgs;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.backhandler.BackHandlerOwner;
import defpackage.fi;
import java.util.Arrays;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/CheckoutArgs;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "Lorg/koin/core/component/KoinComponent;", "CheckoutChild", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutParentComponent extends DefaultParentComponent<CheckoutArgs, CheckoutChild> implements KoinComponent {
    public final CheckoutArgs d;
    public final ComponentContext e;
    public final Object f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "Lapp/chalo/navigation/child/ChildComponent;", "PaymentMain", "CheckoutCard", "InaiCheckout", "PhonePeCheckout", "RazorpayCheckout", "NetBanking", "PostPayment", "UpiApps", "CheckoutWallet", "CustomUrl", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CheckoutCard;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CheckoutWallet;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CustomUrl;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$InaiCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$NetBanking;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PaymentMain;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PhonePeCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PostPayment;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$RazorpayCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$UpiApps;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CheckoutChild implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CheckoutCard;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutCard extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutCardComponent f2159a;

            public CheckoutCard(CheckoutCardComponent checkoutCardComponent) {
                this.f2159a = checkoutCardComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2159a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckoutCard) && Intrinsics.d(this.f2159a, ((CheckoutCard) obj).f2159a);
            }

            public final int hashCode() {
                return this.f2159a.hashCode();
            }

            public final String toString() {
                return "CheckoutCard(component=" + this.f2159a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CheckoutWallet;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutWallet extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutWalletAppsComponent f2160a;

            public CheckoutWallet(CheckoutWalletAppsComponent checkoutWalletAppsComponent) {
                this.f2160a = checkoutWalletAppsComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2160a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CheckoutWallet) && Intrinsics.d(this.f2160a, ((CheckoutWallet) obj).f2160a);
            }

            public final int hashCode() {
                return this.f2160a.hashCode();
            }

            public final String toString() {
                return "CheckoutWallet(component=" + this.f2160a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$CustomUrl;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomUrl extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CustomUrlCheckoutComponent f2161a;

            public CustomUrl(CustomUrlCheckoutComponent customUrlCheckoutComponent) {
                this.f2161a = customUrlCheckoutComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2161a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomUrl) && Intrinsics.d(this.f2161a, ((CustomUrl) obj).f2161a);
            }

            public final int hashCode() {
                return this.f2161a.hashCode();
            }

            public final String toString() {
                return "CustomUrl(component=" + this.f2161a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$InaiCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InaiCheckout extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InaiCheckoutComponent f2162a;

            public InaiCheckout(InaiCheckoutComponent inaiCheckoutComponent) {
                this.f2162a = inaiCheckoutComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2162a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InaiCheckout) && Intrinsics.d(this.f2162a, ((InaiCheckout) obj).f2162a);
            }

            public final int hashCode() {
                return this.f2162a.hashCode();
            }

            public final String toString() {
                return "InaiCheckout(component=" + this.f2162a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$NetBanking;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NetBanking extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutNetBankingComponent f2163a;

            public NetBanking(CheckoutNetBankingComponent checkoutNetBankingComponent) {
                this.f2163a = checkoutNetBankingComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2163a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetBanking) && Intrinsics.d(this.f2163a, ((NetBanking) obj).f2163a);
            }

            public final int hashCode() {
                return this.f2163a.hashCode();
            }

            public final String toString() {
                return "NetBanking(component=" + this.f2163a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PaymentMain;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PaymentMain extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PaymentMainComponent f2164a;

            public PaymentMain(PaymentMainComponent paymentMainComponent) {
                this.f2164a = paymentMainComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2164a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaymentMain) && Intrinsics.d(this.f2164a, ((PaymentMain) obj).f2164a);
            }

            public final int hashCode() {
                return this.f2164a.hashCode();
            }

            public final String toString() {
                return "PaymentMain(component=" + this.f2164a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PhonePeCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PhonePeCheckout extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PhonePeCheckoutComponent f2165a;

            public PhonePeCheckout(PhonePeCheckoutComponent phonePeCheckoutComponent) {
                this.f2165a = phonePeCheckoutComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2165a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhonePeCheckout) && Intrinsics.d(this.f2165a, ((PhonePeCheckout) obj).f2165a);
            }

            public final int hashCode() {
                return this.f2165a.hashCode();
            }

            public final String toString() {
                return "PhonePeCheckout(component=" + this.f2165a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$PostPayment;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PostPayment extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutPostPaymentComponent f2166a;

            public PostPayment(CheckoutPostPaymentComponent checkoutPostPaymentComponent) {
                this.f2166a = checkoutPostPaymentComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2166a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PostPayment) && Intrinsics.d(this.f2166a, ((PostPayment) obj).f2166a);
            }

            public final int hashCode() {
                return this.f2166a.hashCode();
            }

            public final String toString() {
                return "PostPayment(component=" + this.f2166a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$RazorpayCheckout;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RazorpayCheckout extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutComponent f2167a;

            public RazorpayCheckout(CheckoutComponent checkoutComponent) {
                this.f2167a = checkoutComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2167a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RazorpayCheckout) && Intrinsics.d(this.f2167a, ((RazorpayCheckout) obj).f2167a);
            }

            public final int hashCode() {
                return this.f2167a.hashCode();
            }

            public final String toString() {
                return "RazorpayCheckout(component=" + this.f2167a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild$UpiApps;", "Lapp/chalo/core/navigation/checkout/CheckoutParentComponent$CheckoutChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpiApps extends CheckoutChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckoutUpiAppsComponent f2168a;

            public UpiApps(CheckoutUpiAppsComponent checkoutUpiAppsComponent) {
                this.f2168a = checkoutUpiAppsComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2168a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpiApps) && Intrinsics.d(this.f2168a, ((UpiApps) obj).f2168a);
            }

            public final int hashCode() {
                return this.f2168a.hashCode();
            }

            public final String toString() {
                return "UpiApps(component=" + this.f2168a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutParentComponent(CheckoutArgs args, ComponentContext componentContext) {
        super(args, componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.d = args;
        this.e = componentContext;
        final fi fiVar = new fi(this, 13);
        this.f = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<CheckoutSharedComponentViewModel>() { // from class: app.chalo.core.navigation.checkout.CheckoutParentComponent$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BackHandlerOwner backHandlerOwner = this.f2169a;
                boolean z = backHandlerOwner instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) backHandlerOwner).getF18811a() : GlobalContext.f18817a.a().c.d).a(Reflection.a(CheckoutSharedComponentViewModel.class), null, fiVar);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent, app.chalo.navigation.parent.ParentComponent
    public final boolean Y(SceneArgs args) {
        Intrinsics.i(args, "args");
        return args instanceof CheckoutArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return CheckoutArgs.INSTANCE.serializer();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        CheckoutArgs args = (CheckoutArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof CheckoutPaymentMainArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new CheckoutChild.PaymentMain((PaymentMainComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutCardArgs.INSTANCE)) {
            return new CheckoutChild.CheckoutCard((CheckoutCardComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutInaiArgs.INSTANCE)) {
            return new CheckoutChild.InaiCheckout((InaiCheckoutComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutPhonePeArgs.INSTANCE)) {
            return new CheckoutChild.PhonePeCheckout((PhonePeCheckoutComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutRazorpayArgs.INSTANCE)) {
            return new CheckoutChild.RazorpayCheckout((CheckoutComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutNetBankingArgs.INSTANCE)) {
            return new CheckoutChild.NetBanking((CheckoutNetBankingComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof CheckoutPostPaymentArgs) {
            return new CheckoutChild.PostPayment((CheckoutPostPaymentComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutUpiArgs.INSTANCE)) {
            return new CheckoutChild.UpiApps((CheckoutUpiAppsComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args.equals(CheckoutWalletArgs.INSTANCE)) {
            return new CheckoutChild.CheckoutWallet((CheckoutWalletAppsComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof CustomUrlCheckoutArgs) {
            return new CheckoutChild.CustomUrl((CustomUrlCheckoutComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CheckoutSharedComponentViewModel n() {
        return (CheckoutSharedComponentViewModel) this.f.getValue();
    }
}
