package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent;", "", "InitializationIntent", "PositiveBtnClickedIntent", "ReportProblemIntent", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$PositiveBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassVerificationStatusIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassVerificationStatusIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassVerificationStatusArgs f8516a;

        static {
            SuperPassVerificationStatusArgs.Companion companion = SuperPassVerificationStatusArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassVerificationStatusArgs superPassVerificationStatusArgs) {
            this.f8516a = superPassVerificationStatusArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8516a, ((InitializationIntent) obj).f8516a);
        }

        public final int hashCode() {
            return this.f8516a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8516a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$PositiveBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositiveBtnClickedIntent extends SuperPassVerificationStatusIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PositiveBtnClickedIntent f8517a = new PositiveBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositiveBtnClickedIntent);
        }

        public final int hashCode() {
            return -161203582;
        }

        public final String toString() {
            return "PositiveBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent$ReportProblemIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemIntent extends SuperPassVerificationStatusIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemIntent f8518a = new ReportProblemIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReportProblemIntent);
        }

        public final int hashCode() {
            return 1603093061;
        }

        public final String toString() {
            return "ReportProblemIntent";
        }
    }
}
