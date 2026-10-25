package app.chalo.productpurchase.passpurchase.ui.passbookingsuccess;

import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "", "InitializationIntent", "SeeBookingDetailsIntent", "PositiveBtnClickedIntent", "NegativeBtnClickedIntent", "BackClickedIntent", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$BackClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$NegativeBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$PositiveBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$SeeBookingDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassBookingSuccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$BackClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClickedIntent extends SuperPassBookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f8436a = new BackClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClickedIntent);
        }

        public final int hashCode() {
            return -1920188283;
        }

        public final String toString() {
            return "BackClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassBookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassBookingSuccessArgs f8437a;

        static {
            SuperPassBookingSuccessArgs.Companion companion = SuperPassBookingSuccessArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassBookingSuccessArgs superPassBookingSuccessArgs) {
            this.f8437a = superPassBookingSuccessArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8437a, ((InitializationIntent) obj).f8437a);
        }

        public final int hashCode() {
            return this.f8437a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8437a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$NegativeBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NegativeBtnClickedIntent extends SuperPassBookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NegativeBtnClickedIntent f8438a = new NegativeBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NegativeBtnClickedIntent);
        }

        public final int hashCode() {
            return 434667091;
        }

        public final String toString() {
            return "NegativeBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$PositiveBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositiveBtnClickedIntent extends SuperPassBookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PositiveBtnClickedIntent f8439a = new PositiveBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveBtnClickedIntent);
        }

        public final int hashCode() {
            return -1427635177;
        }

        public final String toString() {
            return "PositiveBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent$SeeBookingDetailsIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeeBookingDetailsIntent extends SuperPassBookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeBookingDetailsIntent f8440a = new SeeBookingDetailsIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeBookingDetailsIntent);
        }

        public final int hashCode() {
            return -605927839;
        }

        public final String toString() {
            return "SeeBookingDetailsIntent";
        }
    }
}
