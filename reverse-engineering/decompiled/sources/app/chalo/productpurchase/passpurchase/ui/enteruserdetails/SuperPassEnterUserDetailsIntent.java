package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.userprofile.Gender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "", "InitializationIntent", "NextBtnClickIntent", "FieldUpdatedIntent", "GenderSelectionDialogClickedIntent", "DobFieldClickedIntent", "PassStartTimeFieldClickedIntent", "DismissDialogIntent", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$DismissDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$DobFieldClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$FieldUpdatedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$GenderSelectionDialogClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$NextBtnClickIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$PassStartTimeFieldClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassEnterUserDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$DismissDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissDialogIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialogIntent f8414a = new DismissDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialogIntent);
        }

        public final int hashCode() {
            return -691088784;
        }

        public final String toString() {
            return "DismissDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$DobFieldClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DobFieldClickedIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DobFieldClickedIntent f8415a = new DobFieldClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DobFieldClickedIntent);
        }

        public final int hashCode() {
            return -1320597342;
        }

        public final String toString() {
            return "DobFieldClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$FieldUpdatedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FieldUpdatedIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8416a;
        public final Gender b;
        public final Long c;
        public final Long d;

        public FieldUpdatedIntent(String name, Gender gender, Long l, Long l2) {
            Intrinsics.i(name, "name");
            Intrinsics.i(gender, "gender");
            this.f8416a = name;
            this.b = gender;
            this.c = l;
            this.d = l2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FieldUpdatedIntent)) {
                return false;
            }
            FieldUpdatedIntent fieldUpdatedIntent = (FieldUpdatedIntent) obj;
            return Intrinsics.d(this.f8416a, fieldUpdatedIntent.f8416a) && this.b == fieldUpdatedIntent.b && Intrinsics.d(this.c, fieldUpdatedIntent.c) && Intrinsics.d(this.d, fieldUpdatedIntent.d);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f8416a.hashCode() * 31)) * 31;
            Long l = this.c;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.d;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            return "FieldUpdatedIntent(name=" + this.f8416a + ", gender=" + this.b + ", dobInMillis=" + this.c + ", passStartTime=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$GenderSelectionDialogClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderSelectionDialogClickedIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenderSelectionDialogClickedIntent f8417a = new GenderSelectionDialogClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GenderSelectionDialogClickedIntent);
        }

        public final int hashCode() {
            return -426319250;
        }

        public final String toString() {
            return "GenderSelectionDialogClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassPurchaseArgs.EnterUserDetailsArgs f8418a;

        static {
            SuperPassPurchaseArgs.EnterUserDetailsArgs.Companion companion = SuperPassPurchaseArgs.EnterUserDetailsArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassPurchaseArgs.EnterUserDetailsArgs args) {
            Intrinsics.i(args, "args");
            this.f8418a = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8418a, ((InitializationIntent) obj).f8418a);
        }

        public final int hashCode() {
            return this.f8418a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8418a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$NextBtnClickIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextBtnClickIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextBtnClickIntent f8419a = new NextBtnClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextBtnClickIntent);
        }

        public final int hashCode() {
            return 2028522265;
        }

        public final String toString() {
            return "NextBtnClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent$PassStartTimeFieldClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassStartTimeFieldClickedIntent extends SuperPassEnterUserDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassStartTimeFieldClickedIntent f8420a = new PassStartTimeFieldClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassStartTimeFieldClickedIntent);
        }

        public final int hashCode() {
            return 715378281;
        }

        public final String toString() {
            return "PassStartTimeFieldClickedIntent";
        }
    }
}
